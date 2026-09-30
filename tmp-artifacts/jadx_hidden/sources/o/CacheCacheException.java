package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import o.CacheKeyFactoryExternalSyntheticLambda0;

/* loaded from: classes.dex */
public class CacheCacheException {
    public static long IAuthTabCallback = 0;
    public static long IAuthTabCallbackDefault = 0;
    public static long IAuthTabCallbackStub = 0;
    private static char IAuthTabCallbackStubProxy = 0;
    private static char IAuthTabCallback_Parcel = 0;
    private static int ICustomTabsCallback = 0;
    private static char access000 = 0;
    private static final Object access100;
    public static List<Object[]> asBinder = null;
    public static Object[] asInterface = null;
    private static int extraCallback = 0;
    private static int extraCallbackWithResult = 0;
    private static char getInterfaceDescriptor = 0;
    private static int onActivityLayout = 0;
    private static int onActivityResized = 1;
    public static Object[] onExtraCallback = null;
    public static long onExtraCallbackWithResult = 0;
    private static int onMessageChannelReady = 1;
    private static int onMinimized = 0;
    public static long onNavigationEvent = 0;
    private static int onPostMessage = 1;
    public static Object[] onTransact;
    public static long onWarmupCompleted;
    private static char readTypedObject;
    private static long writeTypedObject;

    public interface onExtraCallbackWithResult {
        void onWarmupCompleted(Object[] objArr);
    }

    private static void onNavigationEvent(String str, int i, boolean z, int i2, int i3, Object[] objArr) {
        char[] charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = charArray;
        UtilExternalSyntheticLambda2 utilExternalSyntheticLambda2 = new UtilExternalSyntheticLambda2();
        char[] cArr2 = new char[i3];
        utilExternalSyntheticLambda2.IAuthTabCallback = 0;
        while (utilExternalSyntheticLambda2.IAuthTabCallback < i3) {
            utilExternalSyntheticLambda2.onNavigationEvent = cArr[utilExternalSyntheticLambda2.IAuthTabCallback];
            cArr2[utilExternalSyntheticLambda2.IAuthTabCallback] = (char) (utilExternalSyntheticLambda2.onNavigationEvent + i);
            int i4 = utilExternalSyntheticLambda2.IAuthTabCallback;
            cArr2[i4] = (char) (cArr2[i4] - ((int) (extraCallbackWithResult - 8081524258474968927L)));
            utilExternalSyntheticLambda2.IAuthTabCallback++;
        }
        if (i2 > 0) {
            utilExternalSyntheticLambda2.onExtraCallbackWithResult = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - utilExternalSyntheticLambda2.onExtraCallbackWithResult, utilExternalSyntheticLambda2.onExtraCallbackWithResult);
            System.arraycopy(cArr3, utilExternalSyntheticLambda2.onExtraCallbackWithResult, cArr2, 0, i3 - utilExternalSyntheticLambda2.onExtraCallbackWithResult);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            utilExternalSyntheticLambda2.IAuthTabCallback = 0;
            while (utilExternalSyntheticLambda2.IAuthTabCallback < i3) {
                cArr4[utilExternalSyntheticLambda2.IAuthTabCallback] = cArr2[(i3 - utilExternalSyntheticLambda2.IAuthTabCallback) - 1];
                utilExternalSyntheticLambda2.IAuthTabCallback++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    static /* synthetic */ int IAuthTabCallback(int i, String[][] strArr) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 117;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int iOnExtraCallback = onExtraCallback(i, strArr);
        int i5 = ICustomTabsCallback + 113;
        onPostMessage = i5 % 128;
        if (i5 % 2 != 0) {
            return iOnExtraCallback;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ int onExtraCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 33;
        onPostMessage = i4 % 128;
        int i5 = i4 % 2;
        int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i, i2);
        int i6 = onPostMessage + 57;
        ICustomTabsCallback = i6 % 128;
        int i7 = i6 % 2;
        return iOnExtraCallbackWithResult;
    }

    static /* synthetic */ Object onExtraCallback() {
        int i = 2 % 2;
        int i2 = ICustomTabsCallback + 63;
        int i3 = i2 % 128;
        onPostMessage = i3;
        int i4 = i2 % 2;
        Object obj = access100;
        int i5 = i3 + 51;
        ICustomTabsCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return obj;
        }
        throw new NullPointerException();
    }

    static {
        onWarmupCompleted();
        onNavigationEvent();
        IAuthTabCallback = -1L;
        onExtraCallbackWithResult = 0L;
        onExtraCallback = null;
        onWarmupCompleted = -1L;
        onNavigationEvent = 0L;
        onTransact = null;
        asBinder = null;
        IAuthTabCallbackDefault = -1L;
        IAuthTabCallbackStub = 0L;
        asInterface = null;
        access100 = new Object();
        int i = onActivityResized + 113;
        onMinimized = i % 128;
        int i2 = i % 2;
    }

    private static void onWarmupCompleted(String str, int i, Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = onActivityLayout + 97;
        onMessageChannelReady = i3 % 128;
        int i4 = i3 % 2;
        char[] charArray = str == null ? str : str.toCharArray();
        AssetDataSourceAssetDataSourceException assetDataSourceAssetDataSourceException = new AssetDataSourceAssetDataSourceException();
        char[] cArr = new char[charArray.length];
        assetDataSourceAssetDataSourceException.onExtraCallback = 0;
        char[] cArr2 = new char[2];
        while (assetDataSourceAssetDataSourceException.onExtraCallback < charArray.length) {
            cArr2[0] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback];
            cArr2[1] = charArray[assetDataSourceAssetDataSourceException.onExtraCallback + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = onMessageChannelReady + 85;
                onActivityLayout = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i5) ^ ((c2 << 4) + ((char) (access000 - 3974139103868117988L)))) ^ ((c2 >>> 5) + ((char) (IAuthTabCallback_Parcel - 3974139103868117988L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - (((c3 >>> 5) + ((char) (IAuthTabCallbackStubProxy - 3974139103868117988L))) ^ ((c3 + i5) ^ ((c3 << 4) + ((char) (getInterfaceDescriptor - 3974139103868117988L))))));
                i5 -= 40503;
            }
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback] = cArr2[0];
            cArr[assetDataSourceAssetDataSourceException.onExtraCallback + 1] = cArr2[1];
            assetDataSourceAssetDataSourceException.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr, 0, i);
    }

    private static void onExtraCallback(String str, char c, String str2, int i, String str3, Object[] objArr) {
        char[] charArray;
        char[] charArray2;
        int i2 = 2 % 2;
        int i3 = onMessageChannelReady + 101;
        onActivityLayout = i3 % 128;
        int i4 = i3 % 2;
        if (str3 == null) {
            charArray = str3;
        } else {
            charArray = str3.toCharArray();
            int i5 = onActivityLayout + 57;
            onMessageChannelReady = i5 % 128;
            int i6 = i5 % 2;
        }
        char[] cArr = charArray;
        char[] charArray3 = str2 == null ? str2 : str2.toCharArray();
        if (str != null) {
            charArray2 = str.toCharArray();
            int i7 = onMessageChannelReady + 37;
            onActivityLayout = i7 % 128;
            int i8 = i7 % 2;
        } else {
            charArray2 = str;
        }
        NetworkTypeObserverReceiverExternalSyntheticLambda0 networkTypeObserverReceiverExternalSyntheticLambda0 = new NetworkTypeObserverReceiverExternalSyntheticLambda0();
        int length = charArray3.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        System.arraycopy(charArray3, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray2.length;
        char[] cArr4 = new char[length3];
        networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent = 0;
        while (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent < length3) {
            int i9 = onActivityLayout + 109;
            onMessageChannelReady = i9 % 128;
            int i10 = i9 % 2;
            int i11 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 2) % 4;
            int i12 = (networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent + 3) % 4;
            networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted = (char) (((cArr2[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent % 4] * 32718) + cArr3[i11]) % 65535);
            cArr3[i12] = (char) (((cArr2[i12] * 32718) + cArr3[i11]) / 65535);
            cArr2[i12] = networkTypeObserverReceiverExternalSyntheticLambda0.onWarmupCompleted;
            cArr4[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent] = (char) ((((cArr2[i12] ^ r3[networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent]) ^ (writeTypedObject ^ 5161337353776785399L)) ^ ((int) (extraCallback ^ 5161337353776785399L))) ^ ((char) (readTypedObject ^ 5161337353776785399L)));
            networkTypeObserverReceiverExternalSyntheticLambda0.onNavigationEvent++;
        }
        objArr[0] = new String(cArr4);
    }

    protected static class IAuthTabCallback extends Thread {
        private static int IAuthTabCallback_Parcel = 0;
        private static int access000 = 1;
        private static int access100 = 1;
        private static int getInterfaceDescriptor;
        private final int IAuthTabCallback;
        private final boolean IAuthTabCallbackStub;
        private final boolean[] onExtraCallback;
        private final int onExtraCallbackWithResult;
        private final int onNavigationEvent;
        private final onExtraCallbackWithResult onWarmupCompleted;
        private static char[] asBinder = {33969, 33970, 33992, 33988, 33971, 33990, 33993, 33975, 33978, 33989, 33983, 33924, 33979, 33987, 33959, 33963, 33947, 33960, 33967, 33973, 33943, 33954, 33958, 33945, 33953, 33949, 33961, 33977, 33981, 33986};
        private static int onTransact = 1131447382;
        private static boolean IAuthTabCallbackDefault = true;
        private static boolean asInterface = true;

        private static void onWarmupCompleted(int i, String str, int[] iArr, String str2, Object[] objArr) throws UnsupportedEncodingException {
            Object charArray;
            int length;
            char[] cArr;
            char[] cArr2;
            int i2;
            String str3 = str2;
            int i3 = 2 % 2;
            int i4 = access000 + 95;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            byte[] bytes = str3;
            if (str3 != null) {
                bytes = str3.getBytes("ISO-8859-1");
            }
            byte[] bArr = bytes;
            if (str == null) {
                charArray = str;
            } else {
                int i6 = IAuthTabCallback_Parcel + 57;
                access000 = i6 % 128;
                if (i6 % 2 == 0) {
                    throw new ArithmeticException();
                }
                charArray = str.toCharArray();
            }
            char[] cArr3 = (char[]) charArray;
            UtilExternalSyntheticLambda1 utilExternalSyntheticLambda1 = new UtilExternalSyntheticLambda1();
            char[] cArr4 = asBinder;
            if (cArr4 == null) {
                cArr2 = cArr4;
            } else {
                int i7 = IAuthTabCallback_Parcel + 93;
                access000 = i7 % 128;
                if (i7 % 2 != 0) {
                    length = cArr4.length;
                    cArr = new char[length];
                } else {
                    length = cArr4.length;
                    cArr = new char[length];
                }
                int i8 = 0;
                while (i8 < length) {
                    cArr[i8] = (char) (cArr4[i8] - 3038365681431118716L);
                    i8++;
                    int i9 = IAuthTabCallback_Parcel + 41;
                    access000 = i9 % 128;
                    int i10 = i9 % 2;
                }
                cArr2 = cArr;
            }
            int i11 = (int) (onTransact - 3038365681431118716L);
            if (asInterface) {
                utilExternalSyntheticLambda1.onNavigationEvent = bArr.length;
                char[] cArr5 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
                utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
                while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                    cArr5[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[bArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] + i] - i11);
                    utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            if (!IAuthTabCallbackDefault) {
                utilExternalSyntheticLambda1.onNavigationEvent = iArr.length;
                char[] cArr6 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
                utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
                int i12 = IAuthTabCallback_Parcel + 85;
                access000 = i12 % 128;
                if (i12 % 2 == 0) {
                    int i13 = 4 / 3;
                }
                while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                    cArr6[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[iArr[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i] - i11);
                    utilExternalSyntheticLambda1.onExtraCallbackWithResult++;
                }
                objArr[0] = new String(cArr6);
                return;
            }
            utilExternalSyntheticLambda1.onNavigationEvent = cArr3.length;
            char[] cArr7 = new char[utilExternalSyntheticLambda1.onNavigationEvent];
            utilExternalSyntheticLambda1.onExtraCallbackWithResult = 0;
            while (utilExternalSyntheticLambda1.onExtraCallbackWithResult < utilExternalSyntheticLambda1.onNavigationEvent) {
                int i14 = access000 + 93;
                IAuthTabCallback_Parcel = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = utilExternalSyntheticLambda1.onExtraCallbackWithResult;
                    int i16 = utilExternalSyntheticLambda1.onNavigationEvent;
                    int i17 = utilExternalSyntheticLambda1.onExtraCallbackWithResult;
                    cArr7[i15] = (char) (cArr2[cArr3[0] << i] * i11);
                    i2 = utilExternalSyntheticLambda1.onExtraCallbackWithResult;
                } else {
                    cArr7[utilExternalSyntheticLambda1.onExtraCallbackWithResult] = (char) (cArr2[cArr3[(utilExternalSyntheticLambda1.onNavigationEvent - 1) - utilExternalSyntheticLambda1.onExtraCallbackWithResult] - i] - i11);
                    i2 = utilExternalSyntheticLambda1.onExtraCallbackWithResult + 1;
                }
                utilExternalSyntheticLambda1.onExtraCallbackWithResult = i2;
            }
            objArr[0] = new String(cArr7);
        }

        IAuthTabCallback(onExtraCallbackWithResult onextracallbackwithresult, int i, int i2, int i3, boolean[] zArr, boolean z) {
            this.onWarmupCompleted = onextracallbackwithresult;
            this.onNavigationEvent = i;
            this.onExtraCallbackWithResult = i2;
            this.IAuthTabCallback = i3;
            this.onExtraCallback = zArr;
            this.IAuthTabCallbackStub = z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            ExoPlayerImplExternalSyntheticLambda27 exoPlayerImplExternalSyntheticLambda27OnNavigationEvent;
            String[] strArr;
            ExoPlayerImplExternalSyntheticLambda27 exoPlayerImplExternalSyntheticLambda27;
            char c;
            int i = 2 % 2;
            int i2 = access100 + 27;
            getInterfaceDescriptor = i2 % 128;
            if (i2 % 2 != 0) {
                throw new ArithmeticException();
            }
            int i3 = this.onNavigationEvent;
            if (this.IAuthTabCallbackStub) {
                exoPlayerImplExternalSyntheticLambda27OnNavigationEvent = ExoPlayerBuilderExternalSyntheticLambda23.onNavigationEvent();
                int i4 = access100 + 87;
                getInterfaceDescriptor = i4 % 128;
                int i5 = i4 % 2;
            } else {
                exoPlayerImplExternalSyntheticLambda27OnNavigationEvent = null;
            }
            if ((this.onExtraCallbackWithResult & 262144) == 0) {
                int i6 = HttpDataSourceExternalSyntheticLambda0.IAuthTabCallback;
                int i7 = (i6 ^ 71) + ((i6 & 71) << 1);
                HttpDataSourceExternalSyntheticLambda0.onExtraCallbackWithResult = i7 % 128;
                if (i7 % 2 == 0) {
                    HttpDataSourceExternalSyntheticLambda0.read();
                    Process.getStartUptimeMillis();
                    throw new ArithmeticException();
                }
                long j = HttpDataSourceExternalSyntheticLambda0.read();
                long j2 = -211918980;
                long j3 = (784 * j2) + ((-782) * j);
                long j4 = -783;
                long j5 = -1;
                long j6 = j2 ^ j5;
                long jMyTid = Process.myTid() ^ j5;
                long j7 = (((j3 + ((j ^ j5) * j4)) + (j4 * (((j6 | jMyTid) | j) ^ j5))) + (783 * ((j5 ^ (jMyTid | j)) | j6))) - 789331621;
                int iMyUid = Process.myUid();
                int i8 = (((int) (j7 >> 32)) & (446684102 + (((~((-439130285) | iMyUid)) | (~((~iMyUid) | 998096126))) * (-318)) + (((~(997047484 | iMyUid)) | 1048642) * (-318)) + (((~(iMyUid | (-997047485))) | (-440178927)) * 318))) | (((int) j7) & ((((~((~r4) | (-1381041153))) * 130) - 622298829) + (((~(((int) Runtime.getRuntime().maxMemory()) | (-1381041153))) | 294993) * 130)));
                int i9 = this.onNavigationEvent;
                int i10 = (i8 | (-i8)) >> 31;
                int i11 = (i10 & (i9 ^ 278)) | ((~i10) & i9);
                int i12 = i9 ^ i3;
                int i13 = (i12 | (-i12)) >> 31;
                i3 = (i3 & i13) | (i11 & (~i13));
            }
            if ((this.onExtraCallbackWithResult & 131072) == 0) {
                int i14 = getInterfaceDescriptor + 97;
                access100 = i14 % 128;
                int i15 = i14 % 2;
                int i16 = ExoPlayerBuilderExternalSyntheticLambda5.onNavigationEvent + 57;
                ExoPlayerBuilderExternalSyntheticLambda5.IAuthTabCallback = i16 % 128;
                if (i16 % 2 == 0) {
                    ExoPlayerBuilderExternalSyntheticLambda5.read();
                    System.identityHashCode(this);
                    throw new ArithmeticException();
                }
                long j8 = ExoPlayerBuilderExternalSyntheticLambda5.read();
                long j9 = 119961934;
                long j10 = 46;
                long j11 = -1;
                long j12 = j8 ^ j11;
                long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                long j13 = elapsedCpuTime ^ j11;
                long j14 = (j10 * j9) + (j10 * j8) + ((-90) * (j9 | ((j12 | j13) ^ j11))) + ((-45) * (((j12 | elapsedCpuTime) ^ j11) | ((j9 | j8) ^ j11))) + (45 * (j12 | ((elapsedCpuTime | (j9 ^ j11)) ^ j11) | ((j13 | j9) ^ j11))) + 259330352;
                int iIdentityHashCode = System.identityHashCode(this);
                int i17 = ((int) (j14 >> 32)) & (698667490 + (((~((~iIdentityHashCode) | (-1434518085))) | (~((-711327753) | iIdentityHashCode))) * (-302)) + ((~((-1434518085) | iIdentityHashCode)) * (-604)) + (((~(iIdentityHashCode | (-2145845837))) | 567296) * 302));
                int iIdentityHashCode2 = System.identityHashCode(this);
                int i18 = i17 | (((int) j14) & ((-1689040204) + (((~((-307647489) | iIdentityHashCode2)) | (~((-1744873899) | iIdentityHashCode2))) * 69) + (((~(iIdentityHashCode2 | 310268929)) | (~(1747495339 | iIdentityHashCode2)) | (-2055142828)) * (-69)) + 180879429));
                int i19 = this.onNavigationEvent;
                int i20 = (i18 | (-i18)) >> 31;
                int i21 = (i20 & (i19 ^ 249)) | ((~i20) & i19);
                int i22 = i19 ^ i3;
                int i23 = (i22 | (-i22)) >> 31;
                i3 = (i3 & i23) | (i21 & (~i23));
            }
            int iOnNavigationEvent = onNavigationEvent(this.onNavigationEvent, this.onExtraCallbackWithResult);
            int i24 = this.onNavigationEvent;
            int i25 = i24 ^ i3;
            int i26 = (i25 | (-i25)) >> 31;
            int i27 = (iOnNavigationEvent & (~i26)) | (i3 & i26);
            int iOnExtraCallback = onExtraCallback(i24);
            int i28 = this.onNavigationEvent ^ i27;
            int i29 = (i28 | (-i28)) >> 31;
            int i30 = (i27 & i29) | (iOnExtraCallback & (~i29));
            if ((this.onExtraCallbackWithResult & 1048576) == 0) {
                ArrayList arrayList = new ArrayList();
                int iOnExtraCallbackWithResult = DefaultSuitableOutputCheckerImplApi35ExternalSyntheticLambda7.onExtraCallbackWithResult(arrayList);
                int i31 = this.onNavigationEvent;
                int i32 = i31 ^ iOnExtraCallbackWithResult;
                int i33 = (iOnExtraCallbackWithResult | (-iOnExtraCallbackWithResult)) >> 31;
                int i34 = (i33 & i32) | ((~i33) & i31);
                String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
                Object[] objArr = new Object[2];
                int i35 = i31 ^ i30;
                int i36 = ((i35 | (-i35)) >> 31) & 1;
                int i37 = (~(((-i36) | i36) >> 31)) & 1;
                objArr[i36] = strArr2;
                objArr[i37] = null;
                strArr = (String[]) objArr[0];
                int i38 = this.onNavigationEvent ^ i30;
                int i39 = (i38 | (-i38)) >> 31;
                i30 = (i30 & i39) | (i34 & (~i39));
            } else {
                strArr = null;
            }
            int iOnExtraCallback2 = CacheCacheException.onExtraCallback(this.onNavigationEvent, this.onExtraCallbackWithResult);
            int i40 = this.onNavigationEvent;
            int i41 = i40 ^ i30;
            int i42 = (i41 | (-i41)) >> 31;
            int i43 = (i30 & i42) | (iOnExtraCallback2 & (~i42));
            if ((this.onExtraCallbackWithResult & 67108864) == 0) {
                String[][] strArr3 = new String[1][];
                int iIAuthTabCallback = CacheCacheException.IAuthTabCallback(i40, strArr3);
                int i44 = this.onNavigationEvent;
                String[] strArr4 = strArr3[0];
                Object[] objArr2 = new Object[2];
                int i45 = i44 ^ i43;
                int i46 = ((i45 | (-i45)) >> 31) & 1;
                int i47 = (~(((-i46) | i46) >> 31)) & 1;
                objArr2[i46] = strArr4;
                objArr2[i47] = strArr;
                strArr = (String[]) objArr2[0];
                int i48 = i44 ^ i43;
                int i49 = (i48 | (-i48)) >> 31;
                i43 = (i43 & i49) | (iIAuthTabCallback & (~i49));
            }
            if ((this.onExtraCallbackWithResult & 134217728) != 0) {
                exoPlayerImplExternalSyntheticLambda27 = exoPlayerImplExternalSyntheticLambda27OnNavigationEvent;
            } else {
                int i50 = getInterfaceDescriptor + 63;
                access100 = i50 % 128;
                int i51 = i50 % 2;
                int i52 = buildCacheKey.onExtraCallbackWithResult;
                int i53 = (i52 & 65) + (i52 | 65);
                buildCacheKey.IAuthTabCallback = i53 % 128;
                int i54 = i53 % 2;
                long j15 = buildCacheKey.read();
                long j16 = 100583631;
                long j17 = 52;
                long j18 = -1;
                long jIdentityHashCode = System.identityHashCode(this) ^ j18;
                long j19 = jIdentityHashCode | j16;
                exoPlayerImplExternalSyntheticLambda27 = exoPlayerImplExternalSyntheticLambda27OnNavigationEvent;
                long j20 = j15 ^ j18;
                long j21 = j16 ^ j18;
                long j22 = ((((((-51) * j16) + (53 * j15)) + (((j19 | j15) ^ j18) * j17)) + ((-52) * ((((j20 | jIdentityHashCode) ^ j18) | ((j20 | j16) ^ j18)) | (j19 ^ j18)))) + (j17 * (((j21 | j15) ^ j18) | ((j21 | jIdentityHashCode) ^ j18)))) - 2020301363;
                int iMyPid = Process.myPid();
                int i55 = (-1391350662) + (((~((-904713514) | iMyPid)) | 541087016 | (~(532512897 | iMyPid))) * (-754));
                int i56 = ~((-541087017) | iMyPid);
                int i57 = ~iMyPid;
                int i58 = ((int) (j22 >> 32)) & (i55 + ((i56 | (~(1073599913 | i57))) * (-754)) + ((i57 | (-904713514)) * 754));
                int i59 = ~System.identityHashCode(this);
                int i60 = ~((-1835593780) | i59);
                int i61 = i58 | (((int) j22) & (1803447661 + ((398367369 | i60) * 764) + (((~(i59 | 398367369)) | (-2147416764)) * (-1528)) + (((-2060872379) | i60) * 764)));
                int i62 = buildCacheKey.onExtraCallbackWithResult + 25;
                buildCacheKey.IAuthTabCallback = i62 % 128;
                if (i62 % 2 == 0) {
                    throw new ArithmeticException();
                }
                int i63 = this.onNavigationEvent;
                int i64 = i61 ^ 1;
                int i65 = (i64 | (-i64)) >> 31;
                int i66 = (i65 & i63) | ((i63 ^ 285) & (~i65));
                int i67 = i63 ^ i43;
                int i68 = (i67 | (-i67)) >> 31;
                i43 = (i43 & i68) | (i66 & (~i68));
            }
            RunnableFutureTask runnableFutureTaskOnNavigationEvent = exoPlayerImplExternalSyntheticLambda27 != null ? exoPlayerImplExternalSyntheticLambda27.onNavigationEvent() : null;
            if (runnableFutureTaskOnNavigationEvent != null && runnableFutureTaskOnNavigationEvent.onExtraCallbackWithResult() != null) {
                int i69 = getInterfaceDescriptor + 31;
                access100 = i69 % 128;
                int i70 = i69 % 2;
                String strOnExtraCallbackWithResult = runnableFutureTaskOnNavigationEvent.onExtraCallbackWithResult();
                Object[] objArr3 = new Object[1];
                onWarmupCompleted(127 - TextUtils.indexOf("", "", 0), null, null, "\u0085\u0084\u0082\u0083\u0082\u0081", objArr3);
                String[] strArrSplit = strOnExtraCallbackWithResult.split((String) objArr3[0]);
                String str = null;
                int i71 = 0;
                for (String str2 : strArrSplit) {
                    int i72 = getInterfaceDescriptor + 15;
                    access100 = i72 % 128;
                    int i73 = i72 % 2;
                    int iOnExtraCallbackWithResult2 = ExoPlayerBuilderExternalSyntheticLambda6.onExtraCallbackWithResult(str2, 3, 2251799813685247L, 227189787, CacheKeyFactoryExternalSyntheticLambda0.access100, CacheKeyFactoryExternalSyntheticLambda0.getInterfaceDescriptor, CacheKeyFactoryExternalSyntheticLambda0.access000);
                    i71 |= iOnExtraCallbackWithResult2;
                    Object[] objArr4 = new Object[2];
                    int i74 = ((iOnExtraCallbackWithResult2 | (-iOnExtraCallbackWithResult2)) >> 31) & 1;
                    int i75 = (~(((-i74) | i74) >> 31)) & 1;
                    objArr4[i74] = str;
                    objArr4[i75] = str2;
                    str = (String) objArr4[0];
                }
                int i76 = ((-i71) | i71) >> 31;
                int i77 = ((i43 ^ 288) & i76) | ((~i76) & i43);
                int i78 = this.onNavigationEvent;
                String[] strArr5 = str != null ? new String[]{str} : null;
                Object[] objArr5 = new Object[2];
                int i79 = i78 ^ i43;
                int i80 = ((i79 | (-i79)) >> 31) & 1;
                int i81 = (~(((-i80) | i80) >> 31)) & 1;
                objArr5[i80] = strArr5;
                objArr5[i81] = strArr;
                strArr = (String[]) objArr5[0];
                int i82 = i78 ^ i43;
                int i83 = (i82 | (-i82)) >> 31;
                i43 = (i43 & i83) | (i77 & (~i83));
            }
            if (exoPlayerImplExternalSyntheticLambda27 == null || (!exoPlayerImplExternalSyntheticLambda27.onExtraCallbackWithResult())) {
                c = 2;
            } else {
                int i84 = access100 + 95;
                getInterfaceDescriptor = i84 % 128;
                c = 2;
                int i85 = i84 % 2;
                ExoPlayerBuilderExternalSyntheticLambda23.onExtraCallback(exoPlayerImplExternalSyntheticLambda27);
            }
            Object[] objArr6 = new Object[4];
            objArr6[1] = new int[1];
            objArr6[c] = new int[]{i43};
            objArr6[3] = new int[]{i};
            int i86 = this.onNavigationEvent;
            int i87 = this.IAuthTabCallback;
            int i88 = i86 ^ i43;
            objArr6[0] = strArr;
            int iIdentityHashCode3 = System.identityHashCode(this);
            int i89 = i87 + 689079152 + (((-272097875) | iIdentityHashCode3) * (-627)) + (((~((-789060910) | iIdentityHashCode3)) | 272099935) * (-627)) + (((~(iIdentityHashCode3 | 272099935)) | (~((~iIdentityHashCode3) | 789060909))) * 627) + (((i88 | (-i88)) >> 31) & 16);
            int i90 = (i89 << 13) ^ i89;
            int i91 = i90 ^ (i90 >>> 17);
            ((int[]) objArr6[1])[0] = i91 ^ (i91 << 5);
            onExtraCallbackWithResult(objArr6);
        }

        private static int onExtraCallback(int i) throws Throwable {
            int i2 = 2 % 2;
            try {
                String strOnExtraCallbackWithResult = null;
                if (Build.VERSION.SDK_INT < 26) {
                    Object[] objArr = new Object[1];
                    onWarmupCompleted(128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), null, null, "\u0087\u0086", objArr);
                    strOnExtraCallbackWithResult = RawResourceDataSourceRawResourceDataSourceException.onExtraCallbackWithResult((String) objArr[0], -1L);
                }
                CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallback[] iAuthTabCallbackArr = {CacheKeyFactoryExternalSyntheticLambda0.onExtraCallback, CacheKeyFactoryExternalSyntheticLambda0.onNavigationEvent, CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallbackStub};
                for (int i3 = 0; i3 < 3; i3++) {
                    int i4 = access100 + 19;
                    getInterfaceDescriptor = i4 % 128;
                    int i5 = i4 % 2;
                    CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback = iAuthTabCallbackArr[i3];
                    int iOnExtraCallbackWithResult = ExoPlayerBuilderExternalSyntheticLambda6.onExtraCallbackWithResult(strOnExtraCallbackWithResult, iAuthTabCallback.IAuthTabCallback, iAuthTabCallback.onExtraCallbackWithResult, iAuthTabCallback.asBinder, iAuthTabCallback.onWarmupCompleted, iAuthTabCallback.onNavigationEvent, iAuthTabCallback.onExtraCallback);
                    if (iOnExtraCallbackWithResult != 0) {
                        int i6 = getInterfaceDescriptor + 11;
                        access100 = i6 % 128;
                        int i7 = i6 % 2;
                        return i ^ iOnExtraCallbackWithResult;
                    }
                }
            } catch (Exception unused) {
            }
            return i;
        }

        private static int onNavigationEvent(int i, int i2) throws Throwable {
            boolean z;
            CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback;
            int i3 = 2 % 2;
            int i4 = -1;
            if (Build.VERSION.SDK_INT >= 30) {
                int i5 = access100 + 21;
                getInterfaceDescriptor = i5 % 128;
                int i6 = i5 % 2;
                Object[] objArr = new Object[1];
                onWarmupCompleted(127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), null, null, "\u009b\u0091\u009a\u0095\u0099\u0098\u0095\u0097\u0094\u0096\u0096\u0095\u0094\u0093\u0092\u0091\u0090\u008f\u008c\u0084\u008a\u008b\u0087\u0087\u008b\u008e\u0083\u008d\u0086\u008c\u0089\u008b\u008a\u0083\u0089\u0084\u0088", objArr);
                if (createDataSource.onExtraCallbackWithResult((String) objArr[0]) == -1) {
                    int i7 = access100 + 87;
                    getInterfaceDescriptor = i7 % 128;
                    if (i7 % 2 == 0) {
                        return i;
                    }
                    throw new ArithmeticException();
                }
            }
            if ((i2 & 4) == 0) {
                z = false;
            } else {
                int i8 = getInterfaceDescriptor + 99;
                int i9 = i8 % 128;
                access100 = i9;
                int i10 = i8 % 2;
                int i11 = i9 + 9;
                getInterfaceDescriptor = i11 % 128;
                int i12 = i11 % 2;
                z = true;
            }
            boolean z2 = (i2 & 256) != 0;
            boolean z3 = (i2 & 8) != 0;
            CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallback[] iAuthTabCallbackArr = new CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallback[3];
            if (z) {
                int i13 = getInterfaceDescriptor + 121;
                access100 = i13 % 128;
                int i14 = i13 % 2;
                iAuthTabCallback = null;
            } else {
                iAuthTabCallback = CacheKeyFactoryExternalSyntheticLambda0.onExtraCallbackWithResult;
            }
            iAuthTabCallbackArr[0] = iAuthTabCallback;
            iAuthTabCallbackArr[1] = z2 ^ true ? CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallback : null;
            iAuthTabCallbackArr[2] = z3 ? null : CacheKeyFactoryExternalSyntheticLambda0.onWarmupCompleted;
            List<List<String>> listOnExtraCallback = ExoPlayerBuilderExternalSyntheticLambda4.onExtraCallback();
            List<String> list = listOnExtraCallback.get(0);
            List<String> list2 = listOnExtraCallback.get(1);
            for (String str : list) {
                if (!str.isEmpty()) {
                    Object[] objArr2 = new Object[1];
                    onWarmupCompleted(127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, null, "\u008c\u008d\u009e\u009d\u008a\u008a\u009d\u008c\u008e\u008a\u009c", objArr2);
                    if (str.startsWith((String) objArr2[0])) {
                        continue;
                    } else {
                        Object[] objArr3 = new Object[1];
                        onWarmupCompleted((ViewConfiguration.getScrollDefaultDelay() >> 16) + 127, null, null, "\u008c\u0089\u008b\u008a\u0083\u0089\u0084\u0088\u008c\u008e\u008a\u009c", objArr3);
                        if (str.startsWith((String) objArr3[0])) {
                            continue;
                        } else {
                            for (int i15 = 0; i15 < 3; i15++) {
                                CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallback iAuthTabCallback2 = iAuthTabCallbackArr[i15];
                                if (iAuthTabCallback2 != null) {
                                    int i16 = access100 + 45;
                                    getInterfaceDescriptor = i16 % 128;
                                    if (i16 % 2 != 0) {
                                        iAuthTabCallback2.onWarmupCompleted(str);
                                        throw new NullPointerException();
                                    }
                                    int iOnWarmupCompleted = iAuthTabCallback2.onWarmupCompleted(str);
                                    if (iOnWarmupCompleted != 0) {
                                        return i ^ iOnWarmupCompleted;
                                    }
                                }
                            }
                        }
                    }
                }
                i4 = -1;
            }
            if (!z) {
                for (String str2 : list2) {
                    int i17 = ExoPlayerBuilderExternalSyntheticLambda17.onExtraCallback;
                    int i18 = (i17 & 43) + (i17 | 43);
                    ExoPlayerBuilderExternalSyntheticLambda17.onWarmupCompleted = i18 % 128;
                    int i19 = i18 % 2;
                    long j = ExoPlayerBuilderExternalSyntheticLambda17.read(str2, 42);
                    long j2 = -58248182;
                    long j3 = i4;
                    long j4 = j2 ^ j3;
                    long j5 = i;
                    long j6 = (284 * j2) + ((-282) * j) + ((-283) * (((j4 | j) ^ j3) | ((j4 | j5) ^ j3)));
                    long j7 = 283;
                    long j8 = j ^ j3;
                    long j9 = ((j6 + (((j2 | j8) ^ j3) * j7)) + (j7 * (((j4 | j8) | j5) ^ j3))) - 292569822;
                    int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
                    int i20 = ((int) (j9 >> 32)) & (1214684217 + (((~((~iElapsedRealtime) | 1200250008)) | (-1657490877)) * (-235)) + (((~(1200250008 | iElapsedRealtime)) | (-1657490877)) * (-470)) + (((~(iElapsedRealtime | (-541131045))) | 83890176) * 235));
                    int i21 = ~i;
                    int i22 = i20 | (((int) j9) & ((((-472667344) + (((~((-165755499) | i21)) | 1602981908) * (-933))) + (((~(i21 | 1602981908)) | (-1609284223)) * 933)) - 1807431452));
                    int i23 = ExoPlayerBuilderExternalSyntheticLambda17.onExtraCallback;
                    int i24 = (i23 & 95) + (i23 | 95);
                    ExoPlayerBuilderExternalSyntheticLambda17.onWarmupCompleted = i24 % 128;
                    int i25 = i24 % 2;
                    for (int i26 : CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallbackDefault) {
                        if (i22 == i26) {
                            return i ^ 230;
                        }
                    }
                    i4 = -1;
                }
            }
            return i;
        }

        private void onExtraCallbackWithResult(Object[] objArr) {
            synchronized (CacheCacheException.onExtraCallback()) {
                boolean[] zArr = this.onExtraCallback;
                zArr[2] = true;
                boolean z = this.onNavigationEvent != ((int[]) objArr[2])[0];
                zArr[3] = z;
                if (!zArr[1] && (z || zArr[0])) {
                    this.onWarmupCompleted.onWarmupCompleted(objArr);
                }
            }
        }
    }

    public static Object[] onExtraCallback(int i, int i2, final onExtraCallbackWithResult onextracallbackwithresult, int i3, boolean z, boolean z2) {
        boolean[] zArr = {false, false, false, false};
        if (onextracallbackwithresult != null) {
            IAuthTabCallback iAuthTabCallback = new IAuthTabCallback(new onExtraCallbackWithResult() { // from class: o.CacheCacheException.1
                private static int onExtraCallbackWithResult = 0;
                private static int onWarmupCompleted = 1;

                @Override // o.CacheCacheException.onExtraCallbackWithResult
                public final void onWarmupCompleted(Object[] objArr) {
                    int i4 = 2 % 2;
                    int i5 = onExtraCallbackWithResult + 69;
                    onWarmupCompleted = i5 % 128;
                    if (i5 % 2 != 0) {
                        onextracallbackwithresult.onWarmupCompleted(objArr);
                    } else {
                        onextracallbackwithresult.onWarmupCompleted(objArr);
                        throw new NullPointerException();
                    }
                }
            }, i, i2, i3, zArr, z2);
            if (z) {
                iAuthTabCallback.run();
            } else {
                iAuthTabCallback.start();
            }
        }
        int iOnNavigationEvent = onNavigationEvent(i);
        int i4 = i ^ iOnNavigationEvent;
        int i5 = (i4 | (-i4)) >> 31;
        int iOnExtraCallbackWithResult = (iOnNavigationEvent & i5) | (onExtraCallbackWithResult(i) & (~i5));
        int i6 = i ^ iOnExtraCallbackWithResult;
        int i7 = (i6 | (-i6)) >> 31;
        int iOnExtraCallback = (iOnExtraCallbackWithResult & i7) | (onExtraCallback(i) & (~i7));
        int i8 = i ^ iOnExtraCallback;
        int i9 = (i8 | (-i8)) >> 31;
        int iAsInterface = (iOnExtraCallback & i9) | (asInterface(i) & (~i9));
        int i10 = i ^ iAsInterface;
        int i11 = (i10 | (-i10)) >> 31;
        int iOnNavigationEvent2 = (iAsInterface & i11) | (onNavigationEvent(i, i2) & (~i11));
        int i12 = i ^ iOnNavigationEvent2;
        int i13 = (i12 | (-i12)) >> 31;
        int iIAuthTabCallback = (iOnNavigationEvent2 & i13) | (IAuthTabCallback(i) & (~i13));
        int i14 = i ^ iIAuthTabCallback;
        int i15 = (i14 | (-i14)) >> 31;
        int iOnWarmupCompleted = (iIAuthTabCallback & i15) | (onWarmupCompleted(i, i2) & (~i15));
        new DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda2();
        int i16 = i ^ iOnWarmupCompleted;
        int i17 = (i16 | (-i16)) >> 31;
        int iOnExtraCallback2 = (iOnWarmupCompleted & i17) | (DefaultSuitableOutputCheckerImplApi23ExternalSyntheticLambda2.onExtraCallback(i) & (~i17));
        int i18 = i ^ iOnExtraCallback2;
        int i19 = (i18 | (-i18)) >> 31;
        int i20 = (iOnExtraCallback2 & i19) | (((int[]) IAuthTabCallback(i, i2, i3)[2])[0] & (~i19));
        int i21 = i ^ i20;
        int i22 = (i21 | (-i21)) >> 31;
        int iAsBinder = (i20 & i22) | (asBinder(i) & (~i22));
        int i23 = i ^ iAsBinder;
        int i24 = (i23 | (-i23)) >> 31;
        int iOnTransact = (iAsBinder & i24) | (onTransact(i, i2) & (~i24));
        int i25 = i ^ iOnTransact;
        int i26 = (i25 | (-i25)) >> 31;
        int iIAuthTabCallback2 = (iOnTransact & i26) | (IAuthTabCallback(i, i2) & (~i26));
        int i27 = i ^ iIAuthTabCallback2;
        int i28 = (i27 | (-i27)) >> 31;
        int iOnTransact2 = (iIAuthTabCallback2 & i28) | (onTransact(i) & (~i28));
        int i29 = i ^ iOnTransact2;
        int i30 = (i29 | (-i29)) >> 31;
        int iIAuthTabCallbackStub = (iOnTransact2 & i30) | (IAuthTabCallbackStub(i) & (~i30));
        int i31 = i ^ iIAuthTabCallbackStub;
        int i32 = (i31 | (-i31)) >> 31;
        int iAsInterface2 = (iIAuthTabCallbackStub & i32) | (asInterface(i, i2) & (~i32));
        int i33 = i ^ iAsInterface2;
        int i34 = (i33 | (-i33)) >> 31;
        int iAsBinder2 = (iAsInterface2 & i34) | (asBinder(i, i2) & (~i34));
        String[][] strArr = new String[1][];
        int iOnExtraCallbackWithResult2 = onExtraCallbackWithResult(i, i2, strArr);
        String[] strArr2 = strArr[0];
        Object[] objArr = new Object[2];
        int i35 = i ^ iAsBinder2;
        int i36 = (i35 | (-i35)) >> 31;
        int i37 = ~i36;
        int i38 = i36 & 1;
        int i39 = (~(((-i38) | i38) >> 31)) & 1;
        objArr[i38] = strArr2;
        objArr[i39] = null;
        int i40 = (iOnExtraCallbackWithResult2 & i37) | (iAsBinder2 & i36);
        Object[] objArr2 = {(String[]) objArr[0], new int[1], new int[]{i40}, new int[]{i}};
        int i41 = i ^ i40;
        int iMyUid = Process.myUid();
        int i42 = ~iMyUid;
        int i43 = i3 + 74496696 + (((~((-760715740) | i42)) | 300445105) * 519) + (((~(i42 | (-739741771))) | (~(1040186875 | iMyUid))) * (-519)) + (((~(iMyUid | 300445105)) | 760715739) * 519) + (((i41 | (-i41)) >> 31) & 16);
        int i44 = (i43 << 13) ^ i43;
        int i45 = i44 ^ (i44 >>> 17);
        ((int[]) objArr2[1])[0] = i45 ^ (i45 << 5);
        synchronized (access100) {
            zArr[0] = true;
            boolean z3 = ((int[]) objArr2[3])[0] != ((int[]) objArr2[2])[0];
            zArr[1] = z3;
            if (!zArr[3] && ((z3 || zArr[2]) && onextracallbackwithresult != null)) {
                onextracallbackwithresult.onWarmupCompleted(objArr2);
            }
        }
        return objArr2;
    }

    private static int onNavigationEvent(int i, int i2) {
        int i3 = 2;
        int i4 = 2 % 2;
        if ((i2 & 2048) != 0) {
            return i;
        }
        int i5 = onPostMessage + 89;
        ICustomTabsCallback = i5 % 128;
        int i6 = i5 % 2;
        int i7 = 0;
        while (i7 < CacheKeyFactoryExternalSyntheticLambda0.asInterface.length) {
            int i8 = ICustomTabsCallback + 63;
            onPostMessage = i8 % 128;
            if (i8 % i3 == 0) {
                String str = CacheKeyFactoryExternalSyntheticLambda0.asInterface[i7];
                int i9 = ResolvingDataSourceResolver.onExtraCallback;
                int i10 = (i9 ^ 107) + ((i9 & 107) << 1);
                ResolvingDataSourceResolver.onWarmupCompleted = i10 % 128;
                int i11 = i10 % 2;
                ResolvingDataSourceResolver.read(str);
                int i12 = ResolvingDataSourceResolver.onWarmupCompleted;
                int i13 = (i12 ^ 61) + ((i12 & 61) << 1);
                ResolvingDataSourceResolver.onExtraCallback = i13 % 128;
                int i14 = i13 % 2;
                throw new NullPointerException();
            }
            String str2 = CacheKeyFactoryExternalSyntheticLambda0.asInterface[i7];
            int i15 = ResolvingDataSourceResolver.onExtraCallback;
            int i16 = (i15 ^ 107) + ((i15 & 107) << 1);
            ResolvingDataSourceResolver.onWarmupCompleted = i16 % 128;
            int i17 = i16 % i3;
            long j = ResolvingDataSourceResolver.read(str2);
            long j2 = 136242270;
            long j3 = -167;
            long j4 = (j3 * j2) + (j3 * j);
            long j5 = 168;
            long j6 = -1;
            long j7 = j2 ^ j6;
            long j8 = j ^ j6;
            long j9 = j7 | j8;
            int i18 = i7;
            long j10 = i;
            long j11 = j10 ^ j6;
            long j12 = j4 + (((j9 ^ j6) | ((j8 | j11) ^ j6)) * j5) + (((j9 | j10) ^ j6) * j5) + (j5 * (((j10 | (j2 | j8)) ^ j6) | ((j7 | j11) ^ j6) | ((j | j7) ^ j6))) + 1550472971;
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i19 = ((int) (j12 >> 32)) & (5980984 + (((~((-1812844504) | startElapsedRealtime)) | 1044896381) * (-465)) + (((-1812844504) | (~(1044896381 | startElapsedRealtime))) * 930) + ((startElapsedRealtime | (-1074267523)) * 465));
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i20 = i19 | (((int) j12) & (((((155275413 | r4) | (~((-795594912) | iUptimeMillis))) * (-338)) - 493744369) + (((~(iUptimeMillis | (-640319499))) | (~(795594911 | (~iUptimeMillis)))) * 338)));
            int i21 = ResolvingDataSourceResolver.onWarmupCompleted;
            int i22 = (i21 ^ 61) + ((i21 & 61) << 1);
            ResolvingDataSourceResolver.onExtraCallback = i22 % 128;
            int i23 = i22 % 2;
            if (i20 != 0) {
                return i ^ (i18 + 90);
            }
            i7 = i18 + 1;
            i3 = 2;
        }
        return i;
    }

    private static int onWarmupCompleted(int i, int i2) {
        int i3 = 2 % 2;
        if ((i2 & 64) == 0) {
            int i4 = 1;
            Object[] objArr = new Object[1];
            onWarmupCompleted("s\u0bbcⱸ뵁ᗢ쉔敭忭흞픂㝃玖䢧趷", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13, objArr);
            char c = 0;
            String strRun = ResolvingDataSource.run((String) objArr[0]);
            if (strRun == null) {
                return i;
            }
            Object[] objArr2 = new Object[1];
            onWarmupCompleted("靏궟쵊吴ᥫ뷱น뢕궽∎\ude16ᢄ", 10 - ImageFormat.getBitsPerPixel(0), objArr2);
            if (RawResourceDataSource.onWarmupCompleted(strRun, new String[]{(String) objArr2[0]}) == 1) {
                return i;
            }
            int i5 = 0;
            while (i5 < CacheKeyFactoryExternalSyntheticLambda0.asBinder.length) {
                StringBuilder sb = new StringBuilder();
                sb.append(CacheKeyFactoryExternalSyntheticLambda0.asBinder[i5]);
                Object[] objArr3 = new Object[i4];
                onWarmupCompleted("\uf7fc鷘", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + i4, objArr3);
                sb.append((String) objArr3[c]);
                String string = sb.toString();
                int i6 = onAudioFocusChange.onNavigationEvent;
                int i7 = (i6 ^ 41) + ((i6 & 41) << i4);
                onAudioFocusChange.onExtraCallback = i7 % 128;
                int i8 = i7 % 2;
                long j = onAudioFocusChange.read(string);
                long j2 = -310956640;
                long j3 = 520;
                long j4 = -1;
                long j5 = j2 ^ j4;
                long j6 = j ^ j4;
                long j7 = i;
                long j8 = j7 ^ j4;
                long j9 = ((-519) * j2) + (521 * j) + (((((j5 | j6) | j8) ^ j4) | ((j | j7) ^ j4)) * j3);
                long j10 = (j7 | j2) ^ j4;
                long j11 = j9 + ((-1040) * (((j6 | j8) ^ j4) | j10)) + (j3 * (j10 | ((j5 | j8) ^ j4) | ((j6 | j2) ^ j4))) + 873005544;
                int i9 = ~i;
                int i10 = (((int) (j11 >> 32)) & ((-958963704) + (((~((-1653616881) | i9)) | 537919632) * (-108)) + (((~(1204124004 | i)) | 88426756 | (~((-1204124005) | i9))) * 54) + ((i | 88426756) * 54))) | (((int) j11) & ((-201348357) + (((~((-548863088) | i)) | 1447100944) * (-502)) + ((~(i9 | (-538988554))) * (-502)) + (((~(1986089497 | i)) | (-548863088)) * 502)));
                int i11 = onAudioFocusChange.onNavigationEvent;
                int i12 = (i11 & 109) + (i11 | 109);
                onAudioFocusChange.onExtraCallback = i12 % 128;
                int i13 = i12 % 2;
                if (i10 != 0) {
                    int i14 = onPostMessage + 69;
                    ICustomTabsCallback = i14 % 128;
                    int i15 = i14 % 2;
                    return i ^ (i5 + 110);
                }
                i5++;
                c = 0;
                i4 = 1;
            }
            return i;
        }
        int i16 = onPostMessage + 119;
        ICustomTabsCallback = i16 % 128;
        if (i16 % 2 == 0) {
            return i;
        }
        throw new NullPointerException();
    }

    private static int IAuthTabCallback(int i) throws NumberFormatException {
        int i2 = 2 % 2;
        try {
            Object[] objArr = new Object[1];
            onWarmupCompleted("s\u0bbcⱸ뵁ᗢ쉔敭忭흞픂㝃玖䢧趷", 13 - ((Process.getThreadPriority(0) + 20) >> 6), objArr);
            String strRun = ResolvingDataSource.run((String) objArr[0]);
            if (strRun != null) {
                Object[] objArr2 = new Object[1];
                onWarmupCompleted("靏궟쵊吴ᥫ뷱น뢕궽∎\ude16ᢄ", 11 - ((Process.getThreadPriority(0) + 20) >> 6), objArr2);
                if (RawResourceDataSource.onWarmupCompleted(strRun, new String[]{(String) objArr2[0]}) == 0) {
                    return i;
                }
            }
            Object[] objArr3 = new Object[1];
            onWarmupCompleted("詋啨颪螪㻅ුធ╰㻅ුㆎ㐛鸳殓蹦\ue042炑옵", TextUtils.lastIndexOf("", '0', 0, 0) + 19, objArr3);
            String strRun2 = ResolvingDataSource.run((String) objArr3[0]);
            if (strRun2 != null) {
                Object[] objArr4 = new Object[1];
                onWarmupCompleted("\ue057鿈짱써詋啨ឬ讷", (ViewConfiguration.getJumpTapTimeout() >> 16) + 7, objArr4);
                if (strRun2.equals((String) objArr4[0])) {
                    Object[] objArr5 = new Object[1];
                    onWarmupCompleted("攼뿁蔞둰帨ႆﱢἽ㤥潩禫Ԅs\u0bbc痢牼\ud93a⣝瀄젢╻\u0b58飼벎", TextUtils.getCapsMode("", 0, 0) + 23, objArr5);
                    String strRun3 = ResolvingDataSource.run((String) objArr5[0]);
                    if (strRun3 != null) {
                        int i3 = ICustomTabsCallback + 19;
                        onPostMessage = i3 % 128;
                        if (i3 % 2 != 0) {
                            int i4 = Integer.parseInt(strRun3);
                            if (i4 != 0) {
                                int i5 = onPostMessage + 13;
                                ICustomTabsCallback = i5 % 128;
                                return i ^ (i5 % 2 != 0 ? i4 << 31007 : i4 + 170);
                            }
                        } else {
                            Integer.parseInt(strRun3);
                            throw new NullPointerException();
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0545  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int onExtraCallbackWithResult(int r34) {
        /*
            Method dump skipped, instructions count: 1437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CacheCacheException.onExtraCallbackWithResult(int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0246  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int onExtraCallback(int r31) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CacheCacheException.onExtraCallback(int):int");
    }

    private static int onExtraCallbackWithResult(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 43;
        int i5 = i4 % 128;
        onPostMessage = i5;
        if (i4 % 2 == 0) {
            throw new ArithmeticException();
        }
        if ((i2 & 8388608) != 0) {
            int i6 = i5 + 65;
            ICustomTabsCallback = i6 % 128;
            int i7 = i6 % 2;
            if ((i2 & 16777216) == 0) {
                int i8 = ExoPlayerBuilderExternalSyntheticLambda0.onExtraCallbackWithResult;
                int i9 = (i8 & 115) + (i8 | 115);
                ExoPlayerBuilderExternalSyntheticLambda0.IAuthTabCallback = i9 % 128;
                int i10 = i9 % 2;
                long j = ExoPlayerBuilderExternalSyntheticLambda0.read();
                long j2 = 224821369;
                long j3 = -496;
                long j4 = (j3 * j2) + (j3 * j);
                long j5 = 497;
                long j6 = -1;
                long j7 = j2 ^ j6;
                long j8 = j ^ j6;
                long j9 = j7 | j8;
                long j10 = i;
                long j11 = j10 ^ j6;
                long j12 = (((j4 + ((j9 ^ j6) * j5)) + ((((j9 | j10) ^ j6) | (((j8 | j11) | j2) ^ j6)) * j5)) + (j5 * (((j10 | (j8 | j2)) ^ j6) | (((j7 | j11) ^ j6) | ((j7 | j) ^ j6))))) - 1544436319;
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i11 = (((int) (j12 >> 32)) & (((((~((-1503940475) | r3)) | (~((-66714064) | iFreeMemory))) * 959) - 1581920973) + (((~(iFreeMemory | (-1503940475))) | (~((~iFreeMemory) | (-66714064)))) * 959))) | (((int) j12) & ((((1380467009 | r3) * (-196)) - 186159591) + (((~(((int) SystemClock.elapsedRealtime()) | (-28412479))) | (-1408879488)) * 196)));
                int i12 = ExoPlayerBuilderExternalSyntheticLambda0.onExtraCallbackWithResult + 13;
                ExoPlayerBuilderExternalSyntheticLambda0.IAuthTabCallback = i12 % 128;
                if (i12 % 2 == 0) {
                    throw new NullPointerException();
                }
                if (i11 != 0) {
                    return i ^ 283;
                }
                int i13 = ICustomTabsCallback + 49;
                onPostMessage = i13 % 128;
                int i14 = i13 % 2;
                return i;
            }
        }
        return i;
    }

    private static int onNavigationEvent(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 57;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ExoPlayerBuilderExternalSyntheticLambda15.IAuthTabCallback;
        int i6 = (i5 ^ 61) + ((i5 & 61) << 1);
        ExoPlayerBuilderExternalSyntheticLambda15.onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        long j = ExoPlayerBuilderExternalSyntheticLambda15.read();
        long j2 = 483513031;
        long j3 = ((-947) * j2) + (949 * j);
        long j4 = -948;
        long j5 = -1;
        long j6 = j2 ^ j5;
        long j7 = j ^ j5;
        long j8 = i;
        long j9 = (((j3 + ((j6 | ((j7 | j8) ^ j5)) * j4)) + (j4 * (j5 ^ ((j6 | j7) | (j8 ^ j5))))) + (948 * (j7 | j2))) - 1178425787;
        int i8 = ((int) (j9 >> 32)) & ((((~((-1916099021) | i)) | 268500992) * (-283)) + 113595818 + ((~((-1647598029) | i)) * 283));
        int i9 = (int) j9;
        int i10 = (-505551845) + (((~((-890087882) | i)) | (-1967653005)) * (-318));
        int i11 = ~((-1967653005) | i);
        int i12 = ~i;
        int i13 = i8 | (i9 & (i10 + ((i11 | (~(i12 | 1968024013))) * 318) + (((~((-1077936133) | i12)) | (~(1968024013 | i))) * 318)));
        int i14 = ExoPlayerBuilderExternalSyntheticLambda15.IAuthTabCallback;
        int i15 = (i14 ^ 119) + ((i14 & 119) << 1);
        ExoPlayerBuilderExternalSyntheticLambda15.onExtraCallback = i15 % 128;
        int i16 = i15 % 2;
        if (i13 == 0) {
            return i;
        }
        int i17 = onPostMessage + 103;
        ICustomTabsCallback = i17 % 128;
        return i17 % 2 == 0 ? i ^ 271 : i ^ 10349;
    }

    private static int onWarmupCompleted(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 101;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        int i5 = buildRawResourceUri.onExtraCallbackWithResult;
        int i6 = ((i5 | 91) << 1) - (i5 ^ 91);
        buildRawResourceUri.onExtraCallback = i6 % 128;
        int i7 = i6 % 2;
        long j = buildRawResourceUri.read();
        long j2 = 888289218;
        long j3 = -1;
        long j4 = j2 ^ j3;
        long j5 = j ^ j3;
        long startUptimeMillis = (((int) Process.getStartUptimeMillis()) ^ j3) | j4;
        long j6 = (483 * j2) + (242 * j) + ((-241) * (((j4 | j5) ^ j3) | (startUptimeMillis ^ j3))) + ((-482) * (j2 | j)) + (241 * (((startUptimeMillis | j) ^ j3) | ((j5 | j2) ^ j3))) + 1155499450;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i8 = ((int) (j6 >> 32)) & (72695561 + (((~((-85764569) | iUptimeMillis)) | (-1522990980)) * (-465)) + (((-85764569) | (~((-1522990980) | iUptimeMillis))) * 930) + ((iUptimeMillis | (-305537)) * 465));
        int i9 = ~i;
        int i10 = i8 | (((int) j6) & ((-82365451) + (((~(i9 | (-1346411241))) | 4233920) * (-160)) + (((~(i9 | 90815169)) | (-1346411241)) * 160)));
        int i11 = buildRawResourceUri.onExtraCallbackWithResult;
        int i12 = ((i11 | 45) << 1) - (i11 ^ 45);
        buildRawResourceUri.onExtraCallback = i12 % 128;
        if (i12 % 2 != 0) {
            throw new NullPointerException();
        }
        if (i10 == 0) {
            return i;
        }
        int i13 = onPostMessage + 13;
        ICustomTabsCallback = i13 % 128;
        return i13 % 2 == 0 ? i ^ 264 : i ^ 30210;
    }

    private static int asBinder(int i) {
        int i2 = 2 % 2;
        int i3 = ExoPlayerBuilderExternalSyntheticLambda3.onWarmupCompleted + 51;
        ExoPlayerBuilderExternalSyntheticLambda3.onNavigationEvent = i3 % 128;
        if (i3 % 2 != 0) {
            ExoPlayerBuilderExternalSyntheticLambda3.read(2);
            throw new NullPointerException();
        }
        long j = ExoPlayerBuilderExternalSyntheticLambda3.read(2);
        long j2 = 963173673;
        long j3 = -964;
        long j4 = ((-963) * j2) + j3 + (965 * j);
        long j5 = -1;
        long j6 = j ^ j5;
        long startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        long j7 = j4 + (((j2 ^ j5) | ((j6 | startElapsedRealtime) ^ j5)) * j3) + (j3 * ((((startElapsedRealtime ^ j5) | j6) ^ j5) | ((j6 | j2) ^ j5))) + 578830390;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i4 = ~elapsedCpuTime;
        int i5 = ((int) (j7 >> 32)) & ((-879235630) + (((~(i4 | 1335769978)) | 101456432) * 220) + (((~(i4 | 1309555250)) | 127671160) * (-440)) + ((elapsedCpuTime | 1335769978) * 220));
        int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
        if ((i5 | (((int) j7) & ((-563059769) + (((~(234344807 | elapsedCpuTime2)) | 95584322) * (-502)) + ((~((~elapsedCpuTime2) | (-1107297281))) * (-502)) + (((~(elapsedCpuTime2 | 1202881602)) | 234344807) * 502)))) != 2) {
            return i;
        }
        int i6 = ICustomTabsCallback;
        int i7 = i6 + 63;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2;
        int i9 = i ^ 270;
        int i10 = i6 + 61;
        onPostMessage = i10 % 128;
        int i11 = i10 % 2;
        return i9;
    }

    private static int IAuthTabCallbackDefault(int i) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 47;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ExoPlayerBuilderExternalSyntheticLambda2.onExtraCallbackWithResult + 115;
        ExoPlayerBuilderExternalSyntheticLambda2.onNavigationEvent = i5 % 128;
        int i6 = i5 % 2;
        long j = ExoPlayerBuilderExternalSyntheticLambda2.read();
        long j2 = -37108388;
        long j3 = ((-665) * j2) + (334 * j);
        long j4 = -1;
        long j5 = j2 ^ j4;
        long j6 = 333;
        long j7 = i;
        long j8 = j7 ^ j4;
        long j9 = (((j3 + ((-333) * j5)) + ((((j5 | j8) ^ j4) | ((j | j7) ^ j4)) * j6)) + (j6 * (((j | j8) ^ j4) | ((j5 | j7) ^ j4)))) - 1808550187;
        int iMyPid = Process.myPid();
        int i7 = ((int) (j9 >> 32)) & ((((~((-804758915) | iMyPid)) | 172295554) * (-566)) + 172262166 + ((~(iMyPid | (-632463361))) * 566));
        int i8 = ~new Random().nextInt();
        int i9 = i7 | (((int) j9) & (1236458239 + (((-1075980306) | i8) * 494) + (((~(i8 | 1033749026)) | (-1361717778)) * 494)));
        int i10 = ExoPlayerBuilderExternalSyntheticLambda2.onExtraCallbackWithResult + 31;
        ExoPlayerBuilderExternalSyntheticLambda2.onNavigationEvent = i10 % 128;
        int i11 = i10 % 2;
        if (i9 == 0) {
            return i;
        }
        int i12 = i ^ 281;
        int i13 = onPostMessage + 59;
        ICustomTabsCallback = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    private static int IAuthTabCallback(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = onMetadata.onWarmupCompleted + 39;
        onMetadata.IAuthTabCallback = i4 % 128;
        if (i4 % 2 == 0) {
            onMetadata.read();
            new Random().nextInt();
            throw new ArithmeticException();
        }
        long j = onMetadata.read();
        long j2 = 1004265557;
        long j3 = -783;
        long j4 = -1;
        long j5 = (784 * j2) + ((-782) * j) + ((j ^ j4) * j3);
        long j6 = j2 ^ j4;
        long jMaxMemory = ((int) Runtime.getRuntime().maxMemory()) ^ j4;
        long j7 = ((j5 + (j3 * (((j6 | jMaxMemory) | j) ^ j4))) + (783 * (((j | jMaxMemory) ^ j4) | j6))) - 1113126933;
        int i5 = ~(791478203 | i);
        int i6 = ~i;
        int i7 = (((int) (j7 >> 32)) & ((-1503808102) + ((i5 | (~((-2066262682) | i6))) * (-1808)) + (((~(2133655483 | i)) | (~((-724085402) | i6))) * 904) + (((~(2066262681 | i)) | 1342177280 | (~((-791478204) | i6))) * 904))) | (((int) j7) & (((((~(2130698235 | i6)) | (~((-1781683795) | i))) * 988) - 1229820403) + (((~((-1781683795) | i6)) | (~(1786240851 | i)) | 344457384) * 988)));
        int i8 = onMetadata.IAuthTabCallback;
        int i9 = (i8 & 57) + (i8 | 57);
        onMetadata.onWarmupCompleted = i9 % 128;
        if (i9 % 2 != 0) {
            throw new ArithmeticException();
        }
        if (i7 != 0) {
            int i10 = ICustomTabsCallback;
            int i11 = i10 + 119;
            onPostMessage = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i ^ 272;
            int i14 = i10 + 57;
            onPostMessage = i14 % 128;
            int i15 = i14 % 2;
            return i13;
        }
        if ((i2 & 65536) != 0) {
            int i16 = onPostMessage + 17;
            ICustomTabsCallback = i16 % 128;
            int i17 = i16 % 2;
            int i18 = onMetadata.onWarmupCompleted;
            int i19 = (i18 ^ 5) + ((i18 & 5) << 1);
            onMetadata.IAuthTabCallback = i19 % 128;
            if (i19 % 2 == 0) {
                onMetadata.run();
                throw new ArithmeticException();
            }
            long jRun = onMetadata.run();
            long j8 = 896580702;
            long j9 = (1773 * j8) + ((-885) * jRun);
            long j10 = 886;
            long j11 = jRun ^ j4;
            long jMyTid = Process.myTid();
            long j12 = jMyTid ^ j4;
            long j13 = j12 | j8;
            long j14 = j9 + (((((j8 ^ j4) | j11) ^ j4) | ((j11 | jMyTid) ^ j4) | ((j13 | jRun) ^ j4)) * j10) + ((-1772) * (((j12 | jRun) ^ j4) | j8)) + (j10 * (j13 ^ j4)) + 466039818;
            int iNextInt = new Random().nextInt();
            int i20 = ~iNextInt;
            int i21 = ((int) (j14 >> 32)) & (845032202 + (((~((-733061111) | i20)) | (-2124679775)) * (-328)) + (((-2124679775) | iNextInt) * 164) + (((~(iNextInt | 733061110)) | (-2142609407) | (~(i20 | (-715131479)))) * 164));
            int i22 = (-487151779) + (((~(1066815397 | i6)) | (~((-932448037) | i))) * 520);
            int i23 = ~(932448036 | i6);
            int i24 = ~((-504778374) | i);
            return i ^ ((i21 | (((int) j14) & ((i22 + ((i23 | i24) * (-1040))) + ((((~(504778373 | i6)) | 134367361) | i24) * 520)))) * 274);
        }
        int i25 = ICustomTabsCallback + 7;
        onPostMessage = i25 % 128;
        if (i25 % 2 != 0) {
            return i;
        }
        throw new NullPointerException();
    }

    private static int onTransact(int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 117;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        onExtraCallback("㡁헣ﺝ⯫ꆭ\ue8b1\uf3dd䌲䆑ꗔ側ꦭ\udf6e습\uf8f6⯷ȷ", (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 61722), "ↅ䝠ᩚ揱", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1514627105, "\u0000\u0000\u0000\u0000", objArr);
        String strIntern = ((String) objArr[0]).intern();
        long[] jArr = CacheKeyFactoryExternalSyntheticLambda0.access100;
        int i5 = ResolvingDataSourceFactory.onExtraCallback;
        int i6 = ((i5 | 61) << 1) - (i5 ^ 61);
        ResolvingDataSourceFactory.onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            ResolvingDataSourceFactory.read(strIntern, 3, 2251799813685247L, jArr);
            Process.getStartUptimeMillis();
            throw new NullPointerException();
        }
        long j = ResolvingDataSourceFactory.read(strIntern, 3, 2251799813685247L, jArr);
        long j2 = -1549549899;
        long j3 = -751;
        long j4 = -1;
        long j5 = j2 ^ j4;
        long j6 = j ^ j4;
        long jNextInt = new Random().nextInt(682578442);
        long j7 = (j3 * j2) + (j3 * j) + (1504 * (((j5 | j6) ^ j4) | ((j5 | jNextInt) ^ j4)));
        long j8 = j5 | j;
        long j9 = ((j7 + ((-1504) * ((jNextInt | j8) ^ j4))) + (752 * (((j6 | j2) ^ j4) | (j8 ^ j4)))) - 373025700;
        int i7 = ~i;
        int i8 = (((int) (j9 >> 32)) & ((-1788177110) + ((303240 | i7) * (-192)) + (((~((-731077394) | i7)) | 705845777) * (-384)) + (((~((-705845778) | i)) | (~((-25231617) | i7)) | (~(731380633 | i))) * 192))) | (((int) j9) & ((((-1754753727) + (((~(i7 | (-1615880241))) | 178653830) * (-828))) + ((i7 | (-1615880241)) * (-828))) - 2080957632));
        if (i8 != -1) {
            return i8 <= 0 ? i : i ^ 275;
        }
        int i9 = ICustomTabsCallback + 5;
        onPostMessage = i9 % 128;
        int i10 = i9 % 2;
        return i ^ 277;
    }

    private static int IAuthTabCallbackStub(int i) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 39;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = new Object[1];
        onExtraCallback("ᾥ眧\uef1d촌ᓏ邗\ueec5閥覎癬䳲", (char) TextUtils.getOffsetAfter("", 0), "ഓ颶\ue6f4鬇", (-191318515) + TextUtils.getTrimmedLength(""), "\u0000\u0000\u0000\u0000", objArr);
        String str = (String) objArr[0];
        int i5 = onAudioFocusChange.onNavigationEvent;
        int i6 = (i5 ^ 15) + ((i5 & 15) << 1);
        onAudioFocusChange.onExtraCallback = i6 % 128;
        if (i6 % 2 != 0) {
            onAudioFocusChange.run(str);
            throw new ArithmeticException();
        }
        long jRun = onAudioFocusChange.run(str);
        long j = 195191397;
        long j2 = -1;
        long j3 = j ^ j2;
        long j4 = i;
        long j5 = ((j4 ^ j2) | j3) ^ j2;
        long j6 = 338;
        long j7 = ((-337) * j) + (339 * jRun) + ((-338) * (j5 | (((jRun ^ j2) | j) ^ j2) | ((j | j4) ^ j2))) + (((j3 | jRun) ^ j2) * j6) + (j6 * (((j4 | (jRun | j)) ^ j2) | j5)) + 192055067;
        int i7 = ~(1984652879 | i);
        int i8 = ~i;
        int i9 = ((int) (j7 >> 32)) & (1700937558 + (((-1984579080) | i) * (-50)) + ((i7 | (~((-1111491075) | i8))) * 50) + (((~((-1984579080) | i8)) | (~(873161805 | i8)) | 1111491074) * 50));
        int iMyUid = Process.myUid();
        int i10 = i9 | (((int) j7) & ((-501357939) + (((~((-375116213) | iMyUid)) | 307876000) * 336) + (((~((-1812342623) | iMyUid)) | 1745102410) * (-168)) + (((~((~iMyUid) | (-1812342623))) | (-375116213)) * 168)));
        int i11 = onAudioFocusChange.onExtraCallback;
        int i12 = (i11 ^ 63) + ((i11 & 63) << 1);
        onAudioFocusChange.onNavigationEvent = i12 % 128;
        int i13 = i12 % 2;
        if (i10 == 0) {
            return i;
        }
        int i14 = ICustomTabsCallback + 13;
        onPostMessage = i14 % 128;
        return i14 % 2 != 0 ? i ^ 276 : i ^ 25886;
    }

    private static int asBinder(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback;
        int i5 = i4 + 57;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            throw new NullPointerException();
        }
        if ((i2 & 2097152) != 0) {
            int i6 = i4 + 75;
            onPostMessage = i6 % 128;
            int i7 = i6 % 2;
            return i;
        }
        int i8 = ExoPlayerBuilderExternalSyntheticLambda12.onExtraCallbackWithResult;
        int i9 = (i8 & 47) + (i8 | 47);
        ExoPlayerBuilderExternalSyntheticLambda12.onExtraCallback = i9 % 128;
        if (i9 % 2 != 0) {
            ExoPlayerBuilderExternalSyntheticLambda12.read();
            Process.myTid();
            throw new ArithmeticException();
        }
        long j = ExoPlayerBuilderExternalSyntheticLambda12.read();
        long j2 = 1125136047;
        long jMyUid = Process.myUid();
        long j3 = -1;
        long j4 = j ^ j3;
        long j5 = 676;
        long j6 = jMyUid ^ j3;
        long j7 = (((((677 * j2) + ((-675) * j)) + ((-676) * ((j2 | jMyUid) | j4))) + ((((j4 | j2) ^ j3) | ((j6 | j2) ^ j3)) * j5)) + (j5 * ((j3 ^ ((j | j2) | jMyUid)) | ((((j2 ^ j3) | j4) ^ j3) | ((j4 | j6) ^ j3))))) - 1490243644;
        int i10 = 1704617878 + (((~((-1198546003) | i)) | 1113607170) * 305);
        int i11 = ~i;
        int i12 = (((int) (j7 >> 32)) & (i10 + (((~((-1198546003) | i11)) | 1659194882) * 305))) | (((int) j7) & ((-635053777) + (((~((-2107243682) | i11)) | (~((-750497205) | i))) * (-370)) + (((~(i11 | (-750497205))) | (~((-2107243682) | i)) | (-2109472182)) * (-370)) + 1179340532));
        int i13 = ExoPlayerBuilderExternalSyntheticLambda12.onExtraCallbackWithResult + 95;
        ExoPlayerBuilderExternalSyntheticLambda12.onExtraCallback = i13 % 128;
        if (i13 % 2 == 0) {
            return (i12 * 279) ^ i;
        }
        throw new NullPointerException();
    }

    private static int onExtraCallbackWithResult(int i, int i2, String[][] strArr) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback;
        int i5 = i4 + 13;
        onPostMessage = i5 % 128;
        if (i5 % 2 == 0) {
            throw new NullPointerException();
        }
        if ((i2 & 1073741824) != 0) {
            int i6 = i4 + 43;
            onPostMessage = i6 % 128;
            if (i6 % 2 != 0) {
                return i;
            }
            throw new ArithmeticException();
        }
        int i7 = ExoPlayerBuilderExternalSyntheticLambda8.onWarmupCompleted + 23;
        ExoPlayerBuilderExternalSyntheticLambda8.onNavigationEvent = i7 % 128;
        int i8 = i7 % 2;
        long j = ExoPlayerBuilderExternalSyntheticLambda8.read(strArr);
        long j2 = 845468217;
        long j3 = ((-244) * j2) + (246 * j);
        long j4 = -245;
        long j5 = -1;
        long j6 = j ^ j5;
        long j7 = i;
        long j8 = j3 + (((((j7 ^ j5) | j6) ^ j5) | ((j6 | j2) ^ j5)) * j4);
        long j9 = (j6 | j7) ^ j5;
        long j10 = ((j8 + (j4 * j9)) + (245 * (j9 | j2))) - 933747381;
        int i9 = ~i;
        int i10 = (((int) (j10 >> 32)) & ((-1453938172) + (((~(356541483 | i9)) | 1793767894) * 519) + (((~(2146106879 | i9)) | (~((-352338986) | i))) * (-519)) + (((~(1793767894 | i)) | (-356541484)) * 519))) | (((int) j10) & (875178901 + (((~(i9 | (-664726530))) | 638216192) * (-160)) + (((~(i9 | 772499880)) | (-664726530)) * 160)));
        int i11 = ExoPlayerBuilderExternalSyntheticLambda8.onWarmupCompleted + 123;
        ExoPlayerBuilderExternalSyntheticLambda8.onNavigationEvent = i11 % 128;
        int i12 = i11 % 2;
        return i ^ (i10 * 286);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00e9, code lost:
    
        if ((r24 & 268435456) == 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int IAuthTabCallbackDefault(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CacheCacheException.IAuthTabCallbackDefault(int, int):int");
    }

    private static int onNavigationEvent(int i, byte[] bArr) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 125;
        ICustomTabsCallback = i3 % 128;
        int i4 = i3 % 2;
        int i5 = ExoPlayerImplExternalSyntheticLambda13.IAuthTabCallback + 85;
        ExoPlayerImplExternalSyntheticLambda13.onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            ExoPlayerImplExternalSyntheticLambda13.read(bArr);
            throw new NullPointerException();
        }
        long j = ExoPlayerImplExternalSyntheticLambda13.read(bArr);
        long j2 = -258572075;
        long j3 = -496;
        long j4 = (j3 * j2) + (j3 * j);
        long j5 = 497;
        long j6 = -1;
        long j7 = j2 ^ j6;
        long j8 = j ^ j6;
        long j9 = j7 | j8;
        long j10 = i;
        long j11 = j10 ^ j6;
        long j12 = j4 + ((j9 ^ j6) * j5) + ((((j9 | j10) ^ j6) | (((j8 | j11) | j2) ^ j6)) * j5) + (j5 * (((j10 | (j8 | j2)) ^ j6) | ((j7 | j11) ^ j6) | ((j7 | j) ^ j6))) + 1174992679;
        if (((((int) (j12 >> 32)) & (1342575546 + ((~((-136320273) | i)) * 623) + (((~i) | 570490880) * (-623)) + (((~(1645955746 | i)) | 136320272 | (~((-1211785139) | i))) * 623))) | (((int) j12) & (((((-2078277376) | r3) * (-970)) - 688842811) + (((~((~Process.myTid()) | (-1766313560))) | 311963816) * 970)))) != 1) {
            return i;
        }
        int i6 = ICustomTabsCallback;
        int i7 = i6 + 1;
        onPostMessage = i7 % 128;
        int i8 = i7 % 2 != 0 ? i ^ 313 : i ^ 17852;
        int i9 = i6 + 19;
        onPostMessage = i9 % 128;
        if (i9 % 2 != 0) {
            return i8;
        }
        throw new NullPointerException();
    }

    private static int asInterface(int i) {
        int i2 = 2 % 2;
        Object[] objArr = new Object[1];
        onWarmupCompleted("鴵Ᏺ諘汭\u0b58\ue24d㓌\uf08e남⚺熲㺘貏뙏唁宠น뢕\uf236髩숟隫贤\uebb4", 23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
        String str = (String) objArr[0];
        int i3 = HttpDataSourceCleartextNotPermittedException.IAuthTabCallback;
        int i4 = (i3 ^ 25) + ((i3 & 25) << 1);
        HttpDataSourceCleartextNotPermittedException.onExtraCallback = i4 % 128;
        int i5 = i4 % 2;
        long j = HttpDataSourceCleartextNotPermittedException.read(str);
        long j2 = -208103300;
        long j3 = ((-589) * j2) + (591 * j);
        long j4 = 590;
        long j5 = -1;
        long j6 = j ^ j5;
        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
        long j7 = jElapsedRealtime ^ j5;
        long j8 = ((j6 | j7) ^ j5) | ((j6 | j2) ^ j5) | ((j7 | j2) ^ j5);
        long j9 = j2 ^ j5;
        long j10 = (((j3 + (((((j9 | j) | jElapsedRealtime) ^ j5) | j8) * j4)) + ((-1180) * j8)) + (j4 * (((j9 | j7) ^ j5) | ((j7 | j) ^ j5)))) - 191741521;
        int iMyPid = Process.myPid();
        int i6 = ~i;
        int i7 = (((int) (j10 >> 32)) & ((-818884594) + (((~iMyPid) | (-1978620237)) * 1324) + (((~(iMyPid | (-887509261))) | (~((-1970231625) | iMyPid))) * (-1324)) + 2019254232)) | (((int) j10) & (1798504686 + (((-1856721096) | i) * (-859)) + (((~((-1856721096) | i6)) | (~((-285256473) | i))) * 859) + (((~((-419494686) | i6)) | 134238213) * 859)));
        int i8 = HttpDataSourceCleartextNotPermittedException.IAuthTabCallback + 111;
        HttpDataSourceCleartextNotPermittedException.onExtraCallback = i8 % 128;
        if (i8 % 2 != 0) {
            throw new NullPointerException();
        }
        Object[] objArr2 = new Object[1];
        onExtraCallback("댺萢\udc47ꪋ랞\uebb2ໍ\udddd仚噜고呌읏\uf774☍ᤛ\uedcd", (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43663), "譖ᚍ軰⊪", Color.rgb(0, 0, 0) - 250180213, "\u0000\u0000\u0000\u0000", objArr2);
        String str2 = (String) objArr2[0];
        int i9 = HttpDataSourceCleartextNotPermittedException.IAuthTabCallback;
        int i10 = (i9 ^ 25) + ((i9 & 25) << 1);
        HttpDataSourceCleartextNotPermittedException.onExtraCallback = i10 % 128;
        int i11 = i10 % 2;
        long j11 = HttpDataSourceCleartextNotPermittedException.read(str2);
        long j12 = 1106624571;
        long j13 = j11 ^ j5;
        long j14 = (i | j11) ^ j5;
        long j15 = ((((((-391) * j12) + ((-195) * j11)) + ((-196) * (((j13 | j12) ^ j5) | j14))) + (392 * (j11 | j12))) + (196 * (j14 | (((j12 ^ j5) | j13) ^ j5)))) - 1506469392;
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        int i12 = ((int) (j15 >> 32)) & ((-305910422) + (((~((-836664890) | elapsedCpuTime)) | 2021075995) * (-668)) + (((-836664890) | (~(2021075995 | elapsedCpuTime))) * 1336) + ((elapsedCpuTime | (-25711137)) * 668));
        int iNextInt = new Random().nextInt();
        int i13 = ~(1235071838 | (~iNextInt));
        int i14 = i12 | (((int) j15) & (((1100026132 | i13 | (~((-1235071839) | iNextInt))) * (-338)) + 1004418749 + (((~(iNextInt | (-135045707))) | i13) * 338)));
        int i15 = HttpDataSourceCleartextNotPermittedException.IAuthTabCallback + 111;
        HttpDataSourceCleartextNotPermittedException.onExtraCallback = i15 % 128;
        if (i15 % 2 != 0) {
            throw new NullPointerException();
        }
        Object[] objArr3 = new Object[1];
        onWarmupCompleted("ꄞ龠＾ﻚ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4, objArr3);
        String str3 = (String) objArr3[0];
        int i16 = HttpDataSourceCleartextNotPermittedException.IAuthTabCallback;
        int i17 = (i16 ^ 25) + ((i16 & 25) << 1);
        HttpDataSourceCleartextNotPermittedException.onExtraCallback = i17 % 128;
        int i18 = i17 % 2;
        long j16 = HttpDataSourceCleartextNotPermittedException.read(str3);
        long j17 = 1355895799;
        long j18 = -445;
        long j19 = (j18 * j17) + (j18 * j16);
        long j20 = 446;
        long j21 = j17 ^ j5;
        long j22 = j16 ^ j5;
        long j23 = (j21 | j22) ^ j5;
        long jMyUid = Process.myUid();
        long j24 = (((j19 + ((j23 | ((j22 | (jMyUid ^ j5)) ^ j5)) * j20)) + ((((jMyUid | (j22 | j17)) ^ j5) | ((j16 | j21) ^ j5)) * j20)) + (j20 * j23)) - 1755740620;
        int iUptimeMillis = (int) SystemClock.uptimeMillis();
        int i19 = ((int) (j24 >> 32)) & ((-1281342551) + (((~((-424602745) | iUptimeMillis)) | (-1861829156)) * (-465)) + (((-424602745) | (~((-1861829156) | iUptimeMillis))) * 930) + ((iUptimeMillis | (-138952737)) * 465));
        int iNextInt2 = new Random().nextInt();
        int i20 = ~iNextInt2;
        int i21 = i19 | (((int) j24) & ((-213767141) + (((~(728120727 | i20)) | (~((-2228358) | iNextInt2)) | (~((-16786689) | iNextInt2))) * 765) + (((~(725892370 | i20)) | (-728120728)) * 1530) + (((~(iNextInt2 | 725892370)) | (~(i20 | (-16786689)))) * 765)));
        int i22 = HttpDataSourceCleartextNotPermittedException.IAuthTabCallback + 111;
        HttpDataSourceCleartextNotPermittedException.onExtraCallback = i22 % 128;
        if (i22 % 2 != 0) {
            throw new NullPointerException();
        }
        if (i7 <= 0) {
            return i;
        }
        if (i14 > 0 && i14 - 3 < i7) {
            int i23 = ICustomTabsCallback + 111;
            onPostMessage = i23 % 128;
            int i24 = i23 % 2;
            return i ^ 247;
        }
        if (i21 <= 0) {
            return i;
        }
        int i25 = onPostMessage + 75;
        ICustomTabsCallback = i25 % 128;
        if (i25 % 2 == 0) {
            if (i21 + 100 >= i7) {
                return i;
            }
        } else if (i21 - 39 >= i7) {
            return i;
        }
        return i ^ 248;
    }

    private static int onTransact(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = ICustomTabsCallback + 77;
        int i5 = i4 % 128;
        onPostMessage = i5;
        if (i4 % 2 == 0 ? (i2 & 23687) == 0 : (i2 & 4096) == 0) {
            int i6 = i5 + 37;
            ICustomTabsCallback = i6 % 128;
            if (i6 % 2 == 0) {
                return i;
            }
            throw new ArithmeticException();
        }
        int i7 = HttpDataSourceInvalidResponseCodeException.IAuthTabCallback;
        int i8 = (i7 & 39) + (i7 | 39);
        HttpDataSourceInvalidResponseCodeException.onExtraCallbackWithResult = i8 % 128;
        int i9 = i8 % 2;
        long j = HttpDataSourceInvalidResponseCodeException.read();
        long j2 = -34818085;
        long j3 = (491 * j2) + ((-489) * j);
        long j4 = -1;
        long j5 = j2 ^ j4;
        long j6 = j ^ j4;
        long jNextInt = new Random().nextInt();
        long j7 = 490;
        long j8 = (((j3 + ((-490) * ((j5 | j6) | (jNextInt ^ j4)))) + ((((j6 | jNextInt) ^ j4) | ((j6 | j2) ^ j4)) * j7)) + (j7 * j5)) - 1536108045;
        int i10 = ((int) (j8 >> 32)) & (((((~((-1784192790) | r1)) | 1783666197) * (-241)) - 109574417) + (((~((~((int) SystemClock.elapsedRealtime())) | (-526593))) | (-2130632576)) * 241));
        int iMyPid = Process.myPid();
        int i11 = ~iMyPid;
        int i12 = i10 | (((int) j8) & (1471277649 + ((iMyPid | 335544596) * 988) + (((~(1057379252 | i11)) | 1078526977) * (-1976)) + (((~(iMyPid | (-1800361634))) | 335544596 | (~(1800361633 | i11))) * 988)));
        int i13 = HttpDataSourceInvalidResponseCodeException.IAuthTabCallback;
        int i14 = ((i13 | 49) << 1) - (i13 ^ 49);
        HttpDataSourceInvalidResponseCodeException.onExtraCallbackWithResult = i14 % 128;
        if (i14 % 2 == 0) {
            throw new NullPointerException();
        }
        int i15 = i ^ (i12 * 265);
        int i16 = ICustomTabsCallback + 37;
        onPostMessage = i16 % 128;
        if (i16 % 2 != 0) {
            return i15;
        }
        throw new ArithmeticException();
    }

    private static int onExtraCallback(int i, String[][] strArr) {
        int i2 = 2 % 2;
        int i3 = ICustomTabsCallback + 51;
        onPostMessage = i3 % 128;
        int i4 = i3 % 2;
        int i5 = UdpDataSourceUdpDataSourceException.onNavigationEvent;
        int i6 = ((i5 | 55) << 1) - (i5 ^ 55);
        UdpDataSourceUdpDataSourceException.onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        long j = UdpDataSourceUdpDataSourceException.read(strArr);
        long j2 = -28500200;
        long j3 = -964;
        long j4 = ((-963) * j2) + j3 + (965 * j);
        long j5 = -1;
        long j6 = j ^ j5;
        long j7 = i;
        long j8 = ((j4 + (((j2 ^ j5) | ((j6 | j7) ^ j5)) * j3)) + (j3 * (((j6 | j2) ^ j5) | (((j7 ^ j5) | j6) ^ j5)))) - 99660218;
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        int i8 = ((int) (j8 >> 32)) & ((-818884594) + (((~startElapsedRealtime) | (-2146785792)) * 1324) + (((~(startElapsedRealtime | (-778393976))) | (~((-2079346910) | startElapsedRealtime))) * (-1324)) + 1332149660);
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        int i9 = ~iFreeMemory;
        int i10 = i8 | (((int) j8) & (1453938690 + (((~(14978002 | i9)) | (-1422248408)) * 519) + (((~(i9 | (-1409368070))) | (~((-12880339) | iFreeMemory))) * (-519)) + (((~(iFreeMemory | (-1422248408))) | (-14978003)) * 519)));
        int i11 = UdpDataSourceUdpDataSourceException.onNavigationEvent;
        int i12 = (i11 ^ 125) + ((i11 & 125) << 1);
        UdpDataSourceUdpDataSourceException.onWarmupCompleted = i12 % 128;
        int i13 = i12 % 2;
        int i14 = i ^ (284 * i10);
        int i15 = onPostMessage + 39;
        ICustomTabsCallback = i15 % 128;
        if (i15 % 2 == 0) {
            return i14;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b7, code lost:
    
        if (r1 != r23) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0185, code lost:
    
        if (r1 == r23) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x024e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int IAuthTabCallbackStub(int r23, int r24) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.CacheCacheException.IAuthTabCallbackStub(int, int):int");
    }

    private static int asInterface(int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        if (Build.VERSION.SDK_INT < 21) {
            return i;
        }
        int i5 = ICustomTabsCallback + 33;
        int i6 = i5 % 128;
        onPostMessage = i6;
        int i7 = i5 % 2;
        if ((i2 & 33554432) != 0) {
            return i;
        }
        int i8 = i6 + 35;
        ICustomTabsCallback = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = FileDataSourceFileDataSourceException.onExtraCallback;
            int i10 = (i9 & 125) + (i9 | 125);
            FileDataSourceFileDataSourceException.IAuthTabCallback = i10 % 128;
            if (i10 % 2 != 0) {
                FileDataSourceFileDataSourceException.read();
                Process.myTid();
                throw new ArithmeticException();
            }
            long j = FileDataSourceFileDataSourceException.read();
            long j2 = 54377387;
            long j3 = -1;
            long j4 = j ^ j3;
            long j5 = (int) Runtime.getRuntime().totalMemory();
            long j6 = j2 | j5;
            long j7 = ((((((-1335) * j2) + ((-667) * j)) + ((-668) * (j4 | (j6 ^ j3)))) + (1336 * (((j5 | j4) ^ j3) | j2))) + (668 * (j6 | j4))) - 1738185787;
            int i11 = (-1115135670) + ((~((-32949085) | i)) * 216);
            int i12 = ~i;
            int i13 = ((int) (j7 >> 32)) & (i11 + (((-27263237) | i12) * (-216)) + (((~((-32949085) | i12)) | 1470175495) * 216));
            int iMyTid = Process.myTid();
            int i14 = ~iMyTid;
            int i15 = i13 | (((int) j7) & (1788176917 + ((138496068 | i14) * (-192)) + (((~((-1628582282) | i14)) | 1090662536) * (-384)) + (((~(iMyTid | 1767078349)) | (~(i14 | (-537919746))) | (~((-1090662537) | iMyTid))) * 192)));
            int i16 = FileDataSourceFileDataSourceException.IAuthTabCallback + 41;
            FileDataSourceFileDataSourceException.onExtraCallback = i16 % 128;
            if (i16 % 2 == 0) {
                throw new NullPointerException();
            }
            i3 = i15 * 273;
        } else {
            int i17 = FileDataSourceFileDataSourceException.onExtraCallback;
            int i18 = (i17 & 125) + (i17 | 125);
            FileDataSourceFileDataSourceException.IAuthTabCallback = i18 % 128;
            if (i18 % 2 != 0) {
                FileDataSourceFileDataSourceException.read();
                throw new ArithmeticException();
            }
            long j8 = FileDataSourceFileDataSourceException.read();
            long j9 = -1259360066;
            long jMyUid = Process.myUid();
            long j10 = -1;
            long j11 = jMyUid ^ j10;
            long j12 = j8 ^ j10;
            long j13 = (((((758 * j9) + ((-756) * j8)) + ((-757) * (j9 | j11))) + (1514 * (((j12 | j9) | jMyUid) ^ j10))) + (757 * ((((j8 | j9) | jMyUid) ^ j10) | ((((j9 ^ j10) | j12) ^ j10) | ((j12 | j11) ^ j10))))) - 424448334;
            int i19 = ~((-1101480459) | i);
            int i20 = ((int) (j13 >> 32)) & ((-1439267481) + ((16843264 | i19) * (-814)) + ((i19 | (~((~i) | 1756260426)) | 671623232) * 407) + (((~(1101480458 | i)) | 671623232 | (~((-1756260427) | i))) * 407));
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i21 = i20 | (((int) j13) & (((~((~startElapsedRealtime) | (-1427114006))) * 130) + 1436102443 + (((~(startElapsedRealtime | (-1427114006))) | 4464704) * 130)));
            int i22 = FileDataSourceFileDataSourceException.IAuthTabCallback + 41;
            FileDataSourceFileDataSourceException.onExtraCallback = i22 % 128;
            if (i22 % 2 == 0) {
                throw new NullPointerException();
            }
            i3 = 8369 << i21;
        }
        return i ^ i3;
    }

    public static void onExtraCallback(Context context, int i, onNavigationEvent onnavigationevent) {
        int i2 = 2 % 2;
        int i3 = onPostMessage + 63;
        ICustomTabsCallback = i3 % 128;
        onExtraCallback(context, i, i3 % 2 != 0 ? 1 : 0, onnavigationevent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object[] IAuthTabCallback(int i, int i2, int i3) throws Throwable {
        int i4 = 2 % 2;
        int i5 = ICustomTabsCallback + 45;
        onPostMessage = i5 % 128;
        int i6 = i5 % 2;
        int iOnWarmupCompleted = onWarmupCompleted(i);
        int i7 = i ^ iOnWarmupCompleted;
        int i8 = (i7 | (-i7)) >> 31;
        int iIAuthTabCallbackDefault = (iOnWarmupCompleted & i8) | (IAuthTabCallbackDefault(i) & (~i8));
        int i9 = i ^ iIAuthTabCallbackDefault;
        int i10 = (i9 | (-i9)) >> 31;
        int iIAuthTabCallbackStub = (iIAuthTabCallbackDefault & i10) | (IAuthTabCallbackStub(i, i2) & (~i10));
        int i11 = i ^ iIAuthTabCallbackStub;
        int i12 = (i11 | (-i11)) >> 31;
        int iIAuthTabCallbackDefault2 = (iIAuthTabCallbackStub & i12) | (IAuthTabCallbackDefault(i, i2) & (~i12));
        byte[] bArr = new byte[16];
        int iOnNavigationEvent = onNavigationEvent(i, bArr);
        String[] strArr = new String[1];
        int i13 = onPostMessage + 17;
        ICustomTabsCallback = i13 % 128;
        int i14 = i13 % 2;
        try {
            Object[] objArr = {bArr, 0};
            Object[] objArr2 = new Object[1];
            onNavigationEvent("\u0005\uffd8ￚ\t\u0017\u0005￦ￒ\u0010\r\u0018\u0019ￒ\b\r\u0013\u0016\b\u0012", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 162, true, Gravity.getAbsoluteGravity(0, 0) + 1, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 19, objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            onNavigationEvent("￬\r\u000b\u0002\u0007\u0000\ufffe\u0007￼\b�\ufffe￭\b", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 172, false, Color.green(0) + 6, 14 - Drawable.resolveOpacity(0, 0), objArr3);
            strArr[0] = cls.getMethod((String) objArr3[0], byte[].class, Integer.TYPE).invoke(null, objArr);
            Object[] objArr4 = new Object[2];
            int i15 = i ^ iIAuthTabCallbackDefault2;
            int i16 = (i15 | (-i15)) >> 31;
            int i17 = ~i16;
            int i18 = i16 & 1;
            int i19 = (~(((-i18) | i18) >> 31)) & 1;
            objArr4[i18] = strArr;
            objArr4[i19] = null;
            int i20 = (iIAuthTabCallbackDefault2 & i16) | (iOnNavigationEvent & i17);
            Object[] objArr5 = {(String[]) objArr4[0], new int[1], new int[]{i20}, new int[]{i}};
            int i21 = i ^ i20;
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i22 = ~iElapsedRealtime;
            int i23 = ~(20171313 | i22);
            int i24 = i3 + 2034259036 + ((1040987466 | i23) * (-712)) + (((~(iElapsedRealtime | 1061158779)) | (~(i22 | (-1040987467)))) * (-712)) + (((-1040989532) | i23) * 712) + (16 & ((i21 | (-i21)) >> 31));
            int i25 = i24 ^ (i24 << 13);
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr5[1])[0] = i26 ^ (i26 << 5);
            return objArr5;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void onExtraCallback(Context context, int i, int i2, final onNavigationEvent onnavigationevent) {
        int i3 = 2 % 2;
        onExtraCallback(i, i2, new onExtraCallbackWithResult() { // from class: o.CacheCacheException.4
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            @Override // o.CacheCacheException.onExtraCallbackWithResult
            public final void onWarmupCompleted(Object[] objArr) {
                int i4 = 2 % 2;
                int i5 = IAuthTabCallback + 27;
                int i6 = i5 % 128;
                onExtraCallbackWithResult = i6;
                if (i5 % 2 == 0) {
                    throw new ArithmeticException();
                }
                onNavigationEvent onnavigationevent2 = onnavigationevent;
                if (onnavigationevent2 != null) {
                    int i7 = (i6 & 53) + (i6 | 53);
                    IAuthTabCallback = i7 % 128;
                    if (i7 % 2 != 0) {
                        onnavigationevent2.onRootDetectionResultReceived(((int[]) objArr[3])[0], ((int[]) objArr[2])[0]);
                        throw new NullPointerException();
                    }
                    onnavigationevent2.onRootDetectionResultReceived(((int[]) objArr[3])[0], ((int[]) objArr[2])[0]);
                    int i8 = IAuthTabCallback + 103;
                    onExtraCallbackWithResult = i8 % 128;
                    int i9 = i8 % 2;
                }
                int i10 = IAuthTabCallback;
                int i11 = ((i10 | 7) << 1) - (i10 ^ 7);
                onExtraCallbackWithResult = i11 % 128;
                if (i11 % 2 == 0) {
                    throw new ArithmeticException();
                }
            }
        }, 0, false, false);
        int i4 = ICustomTabsCallback + 15;
        onPostMessage = i4 % 128;
        if (i4 % 2 == 0) {
            throw new ArithmeticException();
        }
    }

    static void onNavigationEvent() {
        getInterfaceDescriptor = (char) 30779;
        IAuthTabCallbackStubProxy = (char) 2437;
        access000 = (char) 5029;
        IAuthTabCallback_Parcel = (char) 61573;
        writeTypedObject = 5161337353776785399L;
        extraCallback = 835839991;
        readTypedObject = (char) 22179;
    }

    static void onWarmupCompleted() {
        extraCallbackWithResult = -837138523;
    }
}
