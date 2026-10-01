package o;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public class CacheKeyFactoryExternalSyntheticLambda0 {
    static final IAuthTabCallback IAuthTabCallback;
    static final int[] IAuthTabCallbackDefault;
    static final IAuthTabCallback IAuthTabCallbackStub;
    private static final int[] IAuthTabCallbackStubProxy;
    private static final long[] IAuthTabCallback_Parcel;
    private static final int[] ICustomTabsCallback;
    private static int[] ICustomTabsCallbackDefault = null;
    private static char[] ICustomTabsCallbackStub = null;
    private static int ICustomTabsCallbackStubProxy = 0;
    static final int[] access000;
    static final long[] access100;
    static final String[] asBinder;
    static final String[] asInterface;
    private static final int[] extraCallback;
    private static final long[] extraCallbackWithResult;
    static final int[] getInterfaceDescriptor;
    private static int mayLaunchUrl = 1;
    private static final long[] onActivityLayout;
    private static final long[] onActivityResized;
    static final IAuthTabCallback onExtraCallback;
    static final IAuthTabCallback onExtraCallbackWithResult;
    private static final long[] onMessageChannelReady;
    private static final int[] onMinimized;
    static final IAuthTabCallback onNavigationEvent;
    private static final int[] onPostMessage;
    private static int onRelationshipValidationResult = 1;
    static final String[] onTransact;
    private static int onUnminimized;
    static final IAuthTabCallback onWarmupCompleted;
    private static final int[] readTypedObject;
    private static final long[] writeTypedObject;

    private static void IAuthTabCallback(int[] iArr, int i, Object[] objArr) {
        int i2;
        int i3 = 2 % 2;
        UtilExternalSyntheticLambda3 utilExternalSyntheticLambda3 = new UtilExternalSyntheticLambda3();
        char[] cArr = new char[4];
        boolean z = true;
        char[] cArr2 = new char[iArr.length << 1];
        int[] iArr2 = ICustomTabsCallbackDefault;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i4 = 0;
            while (i4 < length) {
                boolean z2 = z;
                int i5 = mayLaunchUrl + 5;
                onUnminimized = i5 % 128;
                if (i5 % 2 == 0) {
                    iArr3[i4] = (int) (iArr2[i4] ^ (-2238453702121083934L));
                    i4++;
                } else {
                    iArr3[i4] = (int) (iArr2[i4] / (-2238453702121083934L));
                    i4 = 0;
                }
                z = z2;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = ICustomTabsCallbackDefault;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i6 = 0;
            while (i6 < length3) {
                iArr6[i6] = (int) (iArr5[i6] ^ (-2238453702121083934L));
                i6++;
                length2 = length2;
            }
            int i7 = onUnminimized + 81;
            mayLaunchUrl = i7 % 128;
            int i8 = i7 % 2;
            iArr5 = iArr6;
            i2 = length2;
        } else {
            i2 = length2;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, i2);
        utilExternalSyntheticLambda3.onExtraCallback = 0;
        while (utilExternalSyntheticLambda3.onExtraCallback < iArr.length) {
            cArr[0] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback] >> 16);
            cArr[1] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback];
            cArr[2] = (char) (iArr[utilExternalSyntheticLambda3.onExtraCallback + 1] >> 16);
            cArr[3] = (char) iArr[utilExternalSyntheticLambda3.onExtraCallback + 1];
            utilExternalSyntheticLambda3.IAuthTabCallback = (cArr[0] << 16) + cArr[1];
            utilExternalSyntheticLambda3.onNavigationEvent = (cArr[2] << 16) + cArr[3];
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            for (int i9 = 0; i9 < 16; i9++) {
                utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[i9];
                utilExternalSyntheticLambda3.onNavigationEvent = UtilExternalSyntheticLambda3.onNavigationEvent(utilExternalSyntheticLambda3.IAuthTabCallback) ^ utilExternalSyntheticLambda3.onNavigationEvent;
                int i10 = utilExternalSyntheticLambda3.IAuthTabCallback;
                utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
                utilExternalSyntheticLambda3.onNavigationEvent = i10;
            }
            int i11 = utilExternalSyntheticLambda3.IAuthTabCallback;
            utilExternalSyntheticLambda3.IAuthTabCallback = utilExternalSyntheticLambda3.onNavigationEvent;
            utilExternalSyntheticLambda3.onNavigationEvent = i11;
            utilExternalSyntheticLambda3.onNavigationEvent ^= iArr4[16];
            utilExternalSyntheticLambda3.IAuthTabCallback ^= iArr4[17];
            int i12 = utilExternalSyntheticLambda3.IAuthTabCallback;
            int i13 = utilExternalSyntheticLambda3.onNavigationEvent;
            cArr[0] = (char) (utilExternalSyntheticLambda3.IAuthTabCallback >>> 16);
            cArr[1] = (char) utilExternalSyntheticLambda3.IAuthTabCallback;
            cArr[2] = (char) (utilExternalSyntheticLambda3.onNavigationEvent >>> 16);
            cArr[3] = (char) utilExternalSyntheticLambda3.onNavigationEvent;
            UtilExternalSyntheticLambda3.onWarmupCompleted(iArr4);
            cArr2[utilExternalSyntheticLambda3.onExtraCallback << 1] = cArr[0];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 1] = cArr[1];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 2] = cArr[2];
            cArr2[(utilExternalSyntheticLambda3.onExtraCallback << 1) + 3] = cArr[3];
            utilExternalSyntheticLambda3.onExtraCallback += 2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    static {
        onExtraCallback();
        long[] jArr = {5346983579176056341L, 2009081199365669074L, 5956613504184305173L, 8899588629242527954L, 375079373922271629L, 1599531319238017234L, 5109561905117738517L, 2755552837602328786L};
        IAuthTabCallback_Parcel = jArr;
        int[] iArr = {-273860068, 339572797, -1684213439, 1249966598, -191670736, 583241201, -1846283800, 1304743133};
        IAuthTabCallbackStubProxy = iArr;
        int[] iArr2 = {23, 24, 20, 26, 17, 21, 15, 24};
        extraCallback = iArr2;
        onExtraCallback = new IAuthTabCallback(20, jArr, iArr, iArr2, 5, Long.MAX_VALUE, -1686173447);
        long[] jArr2 = {-8080523676569222304L, 6247535792709053186L, -7821137391702040246L, -3922916112654851522L, 8839175558035598718L, -2890535829032981914L, 4113801434712603158L, 5835755100867204884L, -6516425789167677188L, -5081681132732212005L, -5851047865948135426L};
        writeTypedObject = jArr2;
        IAuthTabCallback = new IAuthTabCallback(20, jArr2);
        long[] jArr3 = {4085212954298587426L, 3012439845812021669L, 5769587637170450507L, 2969396325011468692L, 7867099544161923476L, 1598132056504805899L};
        extraCallbackWithResult = jArr3;
        int[] iArr3 = {2078356807, -1414155931, -1327823789, 1046215711, -1584490626, 397552996};
        ICustomTabsCallback = iArr3;
        int[] iArr4 = {30, 26, 24, 23, 20, 20};
        readTypedObject = iArr4;
        onNavigationEvent = new IAuthTabCallback(40, jArr3, iArr3, iArr4, 5, Long.MAX_VALUE, 1085933881);
        long[] jArr4 = {2018191094461008829L, -3135287916255501627L, -6543530224906774004L, 6873030840008565331L, 3232606552312898193L, 6330987359265341719L, -2089447385997043574L, 2671274289665632426L};
        onActivityLayout = jArr4;
        onExtraCallbackWithResult = new IAuthTabCallback(40, jArr4);
        long[] jArr5 = {2414330307756640011L, -3593916909785094185L, 7092956718875610598L, -5964681408332242700L, 8518732971232906945L, -3109682652025013662L};
        onActivityResized = jArr5;
        onWarmupCompleted = new IAuthTabCallback(60, jArr5);
        Object[] objArr = new Object[1];
        IAuthTabCallback(new int[]{0, 12, 0, 1}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001", false, objArr);
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        IAuthTabCallback(new int[]{-542703810, 838173676, -1977213513, 1753736688, -1195834152, 1768686578, -196763863, -1746119694}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16, objArr2);
        String str2 = (String) objArr2[0];
        Object[] objArr3 = new Object[1];
        IAuthTabCallback(new int[]{-542703810, 838173676, -1977213513, 1753736688, -1195834152, 1768686578, -1118250468, 660879963, -2023747385, -1048442861}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16, objArr3);
        String str3 = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        IAuthTabCallback(new int[]{-1767765370, -1241403712, 1574128484, 1446660283}, TextUtils.getTrimmedLength("") + 6, objArr4);
        String str4 = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        IAuthTabCallback(new int[]{12, 12, 1, 0}, "\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true, objArr5);
        String str5 = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        IAuthTabCallback(new int[]{-857864850, 638959094, 2137111347, 719093778, -196763863, -1746119694, -106342900, -822420298, -2023747385, -1048442861}, (KeyEvent.getMaxKeyCode() >> 16) + 17, objArr6);
        String str6 = (String) objArr6[0];
        Object[] objArr7 = new Object[1];
        IAuthTabCallback(new int[]{24, 21, 0, 0}, "\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000", false, objArr7);
        String str7 = (String) objArr7[0];
        Object[] objArr8 = new Object[1];
        IAuthTabCallback(new int[]{-857864850, 638959094, 2137111347, 719093778, 1014351033, 34206198, -196763863, -1746119694}, 16 - View.getDefaultSize(0, 0), objArr8);
        String str8 = (String) objArr8[0];
        Object[] objArr9 = new Object[1];
        IAuthTabCallback(new int[]{-857864850, 638959094, 2137111347, 719093778, -1166153552, 347014068, 1887838874, 1547470867, -2006046696, 1835528284, -1271190653, -788738453, -2023747385, -1048442861}, 26 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr9);
        String str9 = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        IAuthTabCallback(new int[]{45, 13, 0, 8}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000", true, objArr10);
        String str10 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        IAuthTabCallback(new int[]{58, 9, 0, 1}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", true, objArr11);
        String str11 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        IAuthTabCallback(new int[]{67, 8, 125, 0}, "\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001", false, objArr12);
        asBinder = new String[]{str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, (String) objArr12[0]};
        Object[] objArr13 = new Object[1];
        IAuthTabCallback(new int[]{75, 7, 65, 3}, "\u0001\u0001\u0000\u0000\u0000\u0000\u0000", false, objArr13);
        String str12 = (String) objArr13[0];
        Object[] objArr14 = new Object[1];
        IAuthTabCallback(new int[]{-857864850, 638959094, 2137111347, 719093778, 1538664854, -682849195}, KeyEvent.normalizeMetaState(0) + 11, objArr14);
        String str13 = (String) objArr14[0];
        Object[] objArr15 = new Object[1];
        IAuthTabCallback(new int[]{82, 12, 0, 5}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000", true, objArr15);
        String str14 = (String) objArr15[0];
        Object[] objArr16 = new Object[1];
        IAuthTabCallback(new int[]{94, 12, 28, 10}, "\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", true, objArr16);
        String str15 = (String) objArr16[0];
        Object[] objArr17 = new Object[1];
        IAuthTabCallback(new int[]{1113701169, 1709379725, 831241558, 890982012, 1538664854, -682849195}, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 11, objArr17);
        String str16 = (String) objArr17[0];
        Object[] objArr18 = new Object[1];
        IAuthTabCallback(new int[]{106, 5, 0, 0}, "\u0000\u0001\u0001\u0001\u0000", true, objArr18);
        String str17 = (String) objArr18[0];
        Object[] objArr19 = new Object[1];
        IAuthTabCallback(new int[]{-266132919, 1722297925}, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3, objArr19);
        asInterface = new String[]{str12, str13, str14, str15, str16, str17, (String) objArr19[0]};
        long[] jArr6 = {216413717};
        onMessageChannelReady = jArr6;
        int[] iArr5 = {-1546688059};
        onMinimized = iArr5;
        int[] iArr6 = {8};
        onPostMessage = iArr6;
        IAuthTabCallbackStub = new IAuthTabCallback(150, jArr6, iArr5, iArr6, 5, 1073741823L, -1543356417);
        Object[] objArr20 = new Object[1];
        IAuthTabCallback(new int[]{2147353479, -1138049729, -1487360465, -498349724}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 7, objArr20);
        String str18 = (String) objArr20[0];
        Object[] objArr21 = new Object[1];
        IAuthTabCallback(new int[]{111, 6, 191, 0}, "\u0000\u0001\u0000\u0001\u0001\u0001", false, objArr21);
        String str19 = (String) objArr21[0];
        Object[] objArr22 = new Object[1];
        IAuthTabCallback(new int[]{117, 7, 0, 0}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001", true, objArr22);
        String str20 = (String) objArr22[0];
        Object[] objArr23 = new Object[1];
        IAuthTabCallback(new int[]{2041179050, -669815253, -1909848966, -1733623745, 895129485, 479030269}, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr23);
        String str21 = (String) objArr23[0];
        Object[] objArr24 = new Object[1];
        IAuthTabCallback(new int[]{124, 6, 0, 2}, "\u0000\u0001\u0000\u0001\u0001\u0001", true, objArr24);
        String str22 = (String) objArr24[0];
        Object[] objArr25 = new Object[1];
        IAuthTabCallback(new int[]{871698359, 105247757, -1231693521, -371311157, 446614400, 951939048, 654882525, 1446501162}, 12 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr25);
        String str23 = (String) objArr25[0];
        Object[] objArr26 = new Object[1];
        IAuthTabCallback(new int[]{130, 5, 0, 4}, "\u0001\u0001\u0001\u0000\u0001", true, objArr26);
        String str24 = (String) objArr26[0];
        Object[] objArr27 = new Object[1];
        IAuthTabCallback(new int[]{1957437309, 247426864, -259292086, 661326839}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, objArr27);
        String str25 = (String) objArr27[0];
        Object[] objArr28 = new Object[1];
        IAuthTabCallback(new int[]{135, 2, 0, 0}, "\u0001\u0000", false, objArr28);
        String str26 = (String) objArr28[0];
        Object[] objArr29 = new Object[1];
        IAuthTabCallback(new int[]{1588399397, -966067513, 2019671855, -1833475188, -1077977126, 845011791, -344593819, 75180198}, 16 - TextUtils.indexOf("", "", 0), objArr29);
        String str27 = (String) objArr29[0];
        Object[] objArr30 = new Object[1];
        IAuthTabCallback(new int[]{137, 10, 0, 4}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000", false, objArr30);
        String str28 = (String) objArr30[0];
        Object[] objArr31 = new Object[1];
        IAuthTabCallback(new int[]{-484441248, -1562588317, -832930366, 1533159026}, 8 - View.getDefaultSize(0, 0), objArr31);
        String str29 = (String) objArr31[0];
        Object[] objArr32 = new Object[1];
        IAuthTabCallback(new int[]{1605876306, 648948272, 1842313633, 932377593, 1479458627, 2082913166}, 12 - TextUtils.getCapsMode("", 0, 0), objArr32);
        String str30 = (String) objArr32[0];
        Object[] objArr33 = new Object[1];
        IAuthTabCallback(new int[]{147, 14, 156, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000", true, objArr33);
        String str31 = (String) objArr33[0];
        Object[] objArr34 = new Object[1];
        IAuthTabCallback(new int[]{1944115882, -827592430, 1390078792, -879397956}, TextUtils.indexOf("", "", 0, 0) + 7, objArr34);
        String str32 = (String) objArr34[0];
        Object[] objArr35 = new Object[1];
        IAuthTabCallback(new int[]{1445978957, 1411391926, -1863174535, -1707105326}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 7, objArr35);
        String str33 = (String) objArr35[0];
        Object[] objArr36 = new Object[1];
        IAuthTabCallback(new int[]{161, 7, 0, 0}, "\u0001\u0000\u0001\u0001\u0001\u0001\u0000", false, objArr36);
        String str34 = (String) objArr36[0];
        Object[] objArr37 = new Object[1];
        IAuthTabCallback(new int[]{1310325198, 1766787486}, (-16777214) - Color.rgb(0, 0, 0), objArr37);
        String str35 = (String) objArr37[0];
        Object[] objArr38 = new Object[1];
        IAuthTabCallback(new int[]{168, 20, 94, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000", false, objArr38);
        String str36 = (String) objArr38[0];
        Object[] objArr39 = new Object[1];
        IAuthTabCallback(new int[]{-132139900, -1022960913, -510704237, 1749832548}, 6 - View.combineMeasuredStates(0, 0), objArr39);
        String str37 = (String) objArr39[0];
        Object[] objArr40 = new Object[1];
        IAuthTabCallback(new int[]{188, 2, 0, 0}, "\u0001\u0000", true, objArr40);
        String str38 = (String) objArr40[0];
        Object[] objArr41 = new Object[1];
        IAuthTabCallback(new int[]{166557970, 1037670372, 1894757859, -868014971, -1546381746, -1351001888, 632032677, 1820083482}, 16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr41);
        String str39 = (String) objArr41[0];
        Object[] objArr42 = new Object[1];
        IAuthTabCallback(new int[]{240458847, 1400329465, -940161547, -1761776828, -1378904215, -978500628}, '9' - AndroidCharacter.getMirror('0'), objArr42);
        String str40 = (String) objArr42[0];
        Object[] objArr43 = new Object[1];
        IAuthTabCallback(new int[]{190, 10, 98, 6}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000", false, objArr43);
        String str41 = (String) objArr43[0];
        Object[] objArr44 = new Object[1];
        IAuthTabCallback(new int[]{200, 11, 196, 6}, null, true, objArr44);
        String str42 = (String) objArr44[0];
        Object[] objArr45 = new Object[1];
        IAuthTabCallback(new int[]{211, 11, 0, 0}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001", false, objArr45);
        String str43 = (String) objArr45[0];
        Object[] objArr46 = new Object[1];
        IAuthTabCallback(new int[]{-462874356, -530444949, -1148178138, -1258756449, 1180602299, 1695103672, 394903322, -2048217080}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 14, objArr46);
        String str44 = (String) objArr46[0];
        Object[] objArr47 = new Object[1];
        IAuthTabCallback(new int[]{-462874356, -530444949, -665991987, 2002671451, 1186095638, -1313204583, -456209813, -1372000403}, 14 - View.combineMeasuredStates(0, 0), objArr47);
        onTransact = new String[]{str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str38, str39, str40, str41, str42, str43, str44, (String) objArr47[0]};
        IAuthTabCallbackDefault = new int[]{199529862, 458658411};
        access100 = new long[]{624887784092251L};
        getInterfaceDescriptor = new int[]{-617838362};
        access000 = new int[]{17};
        int i = onRelationshipValidationResult + 11;
        ICustomTabsCallbackStubProxy = i % 128;
        int i2 = i % 2;
    }

    private static void IAuthTabCallback(int[] iArr, String str, boolean z, Object[] objArr) throws UnsupportedEncodingException {
        char[] cArr;
        char[] cArr2;
        int length;
        char[] cArr3;
        String str2 = str;
        int i = 2 % 2;
        byte[] bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = bytes;
        UtilExternalSyntheticLambda0 utilExternalSyntheticLambda0 = new UtilExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr4 = ICustomTabsCallbackStub;
        if (cArr4 != null) {
            int i6 = mayLaunchUrl + 57;
            onUnminimized = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr4.length;
                cArr3 = new char[length];
            } else {
                length = cArr4.length;
                cArr3 = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                cArr3[i7] = (char) (cArr4[i7] - 4301814714517170301L);
            }
            cArr4 = cArr3;
        }
        char[] cArr5 = new char[i3];
        System.arraycopy(cArr4, i2, cArr5, 0, i3);
        if (bArr != null) {
            int i8 = onUnminimized + 101;
            mayLaunchUrl = i8 % 128;
            if (i8 % 2 == 0) {
                cArr2 = new char[i3];
                utilExternalSyntheticLambda0.onNavigationEvent = 1;
            } else {
                cArr2 = new char[i3];
                utilExternalSyntheticLambda0.onNavigationEvent = 0;
            }
            char c = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i9 = mayLaunchUrl + 125;
                onUnminimized = i9 % 128;
                if (i9 % 2 == 0 ? bArr[utilExternalSyntheticLambda0.onNavigationEvent] == 1 : bArr[utilExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i10 = onUnminimized + 9;
                    mayLaunchUrl = i10 % 128;
                    if (i10 % 2 != 0) {
                        cArr2[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (((cArr5[utilExternalSyntheticLambda0.onNavigationEvent] << 1) + 1) - c);
                    } else {
                        cArr2[utilExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArr5[utilExternalSyntheticLambda0.onNavigationEvent] >> 3) * c);
                    }
                } else {
                    cArr2[utilExternalSyntheticLambda0.onNavigationEvent] = (char) ((cArr5[utilExternalSyntheticLambda0.onNavigationEvent] << 1) - c);
                }
                c = cArr2[utilExternalSyntheticLambda0.onNavigationEvent];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr5 = cArr2;
        }
        if (i5 > 0) {
            char[] cArr6 = new char[i3];
            System.arraycopy(cArr5, 0, cArr6, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr6, 0, cArr5, i11, i5);
            System.arraycopy(cArr6, i5, cArr5, 0, i11);
        }
        if (z) {
            int i12 = mayLaunchUrl + 9;
            onUnminimized = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr7 = new char[i3];
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr7[utilExternalSyntheticLambda0.onNavigationEvent] = cArr5[(i3 - utilExternalSyntheticLambda0.onNavigationEvent) - 1];
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr = cArr7;
        } else {
            cArr = cArr5;
        }
        if (i4 > 0) {
            utilExternalSyntheticLambda0.onNavigationEvent = 0;
            while (utilExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr[utilExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr[utilExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                utilExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr);
    }

    static void onExtraCallback() {
        ICustomTabsCallbackStub = new char[]{10388, 10412, 10438, 10463, 10471, 10471, 10437, 10442, 10474, 10470, 10463, 10467, 10389, 10444, 10473, 10467, 10438, 10444, 10471, 10474, 10481, 10484, 10484, 10447, 10388, 10446, 10483, 10483, 10480, 10473, 10470, 10443, 10437, 10466, 10472, 10443, 10439, 10464, 10466, 10471, 10476, 10471, 10464, 10466, 10439, 10388, 10443, 10470, 10473, 10480, 10483, 10483, 10446, 10412, 10443, 10472, 10466, 10474, 10388, 10412, 10443, 10472, 10466, 10437, 10445, 10479, 10481, 10451, 10571, 10606, 10572, 10562, 10591, 10597, 10568, 10455, 10538, 10535, 10508, 10511, 10548, 10548, 10423, 10480, 10483, 10483, 10446, 10443, 10472, 10466, 10471, 10446, 10443, 10470, 10428, 10502, 10476, 10471, 10498, 10501, 10508, 10511, 10511, 10474, 10471, 10500, 10420, 10472, 10466, 10471, 10446, 10509, 10661, 10669, 10664, 10663, 10662, 10415, 10472, 10472, 10473, 10481, 10478, 10469, 10415, 10467, 10470, 10471, 10468, 10468, 10420, 10478, 10478, 10473, 10473, 10417, 10477, 10415, 10438, 10445, 10471, 10468, 10474, 10472, 10474, 10471, 10465, 10497, 10633, 10628, 10628, 10628, 10621, 10625, 10629, 10630, 10626, 10621, 10627, 10633, 10634, 10422, 10479, 10475, 10471, 10475, 10473, 10441, 10469, 10574, 10565, 10564, 10574, 10564, 10566, 10571, 10569, 10569, 10558, 10560, 10568, 10564, 10562, 10561, 10559, 10561, 10564, 10572, 10423, 10481, 10464, 10569, 10567, 10569, 10573, 10542, 10548, 10578, 10568, 10561, 10675, 10662, 10660, 10658, 10675, 10677, 10615, 10662, 10677, 10678, 10672, 10423, 10478, 10479, 10477, 10472, 10470, 10462, 10465, 10472, 10471, 10471};
        ICustomTabsCallbackDefault = new int[]{5579634, -2071522404, 591809507, -1856118792, 1359707425, 944249360, -2022508238, -1524662938, 1602389400, 1349005350, 1293230649, -2104034390, -1269034501, -771135238, -1771369932, -1523029752, 343747162, 1373433913};
    }

    static class IAuthTabCallback {
        private static int asInterface = 0;
        private static int onTransact = 1;
        int IAuthTabCallback;
        private int IAuthTabCallbackDefault;
        int asBinder;
        int[] onExtraCallback;
        long onExtraCallbackWithResult;
        int[] onNavigationEvent;
        long[] onWarmupCompleted;

        IAuthTabCallback(int i, long[] jArr, int[] iArr, int[] iArr2, int i2, long j, int i3) {
            this.IAuthTabCallbackDefault = i;
            this.onWarmupCompleted = jArr;
            this.onNavigationEvent = iArr;
            this.onExtraCallback = iArr2;
            this.IAuthTabCallback = i2;
            this.onExtraCallbackWithResult = j;
            this.asBinder = i3;
        }

        IAuthTabCallback(int i, long[] jArr) {
            this(i, jArr, null, null, 0, 0L, 0);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int onWarmupCompleted(java.lang.String r12) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o.CacheKeyFactoryExternalSyntheticLambda0.IAuthTabCallback.onWarmupCompleted(java.lang.String):int");
        }
    }
}
