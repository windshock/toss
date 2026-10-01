package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.view.KeyEvent;
import im.toss.devtool.runtime.ui.scheme.history.Hilt_SchemeHistoryActivity$5;
import im.toss.features.useronboarding.visitor.data.mock.PassportMockDataRepository$;
import im.toss.global.features.leave.test.Hilt_GlobalLeaveTestActivity$4;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.EngineConfig1;
import o.s3c;
import o.s5a;
import o.setApTextSize;
import org.jetbrains.annotations.NotNull;

@Singleton
/* loaded from: classes.dex */
public final class getDjangoNearestImageSize {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final onExtraCallback Companion;
    public static final int IAuthTabCallback;
    private static final String IAuthTabCallbackStub;
    private static char IAuthTabCallback_Parcel;
    private static int ICustomTabsCallback;
    private static char access100;
    private static final String asBinder;
    private static final String asInterface;
    private static int extraCallback;
    private static char extraCallbackWithResult;
    private static char[] getInterfaceDescriptor;
    private static char[] onActivityLayout;
    private static final byte[] onActivityResized;
    private static final String onExtraCallback;
    private static final String onExtraCallbackWithResult;
    private static final int onMessageChannelReady;
    private static int onMinimized;
    private static final String onNavigationEvent;
    private static long onPostMessage;
    private static final String onTransact;
    private static final String onWarmupCompleted;
    private static char readTypedObject;
    private static int writeTypedObject;
    private final Context IAuthTabCallbackDefault;
    private final zzad IAuthTabCallbackStubProxy;
    private final Lazy access000;

    static {
        byte[] bArr = new byte[1337];
        System.arraycopy("Yx\u009e\u0092î\u0005íþ\u0001\u00001µ\nô\u0002ð\u0003ôüðFÆúò\u0007.æÚò\u0007\u0019Ùôû\u001bØ\u0007ýè\u0006õüïüó\fîù\u001e×\u000fêù\u001céý\nà&Úý\u001aÚùð\bûíî\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øôýì äûî\tì.Öí\nî\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùî\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüýì\u001bàõ\rö\u0010âøúýì$áç\"èð\u0006ÿè+Úô\u0006ãî\u0005íþ\u0001\u00001³\bÿéDâÐ\fæ\bðöýì.Úêÿþòü\n\u0019Ð\fæ\bðöî\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõ\u0001ç1Ï\u0006ú\u001aÏþý\u0015Úý\u0004ö\u0002\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000býì äûî\tì-Øúòø\bî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûýì*Ô\u0006ìø\tü\u001cÎö\u001cæ÷\u0003ýì\"çä\n÷ó\u0003$Í\få\tö\u0002\u001fÝùöþ\råê\u0010\u0006éú&Ö\u0005úè$äî\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007óô\u0006ìø\tü\rèÿðó\u0006÷\u0003\u0012èîú÷î\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@æÏþøøñò\u000b\u0004æ\u0010.½\u0006î\u00024äÈ\u0010ùð÷\u0006õüýì\"çä\n÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöýì\u001bÝ\u0004÷û\u0003ü\u0013âò\u0002î\u0007î\u0005íþ\u0001\u00001³\bÿéDÓèÿé\bíÿþñ\f\råê\u0010ýì\u001bçñ\bÿø\u000fÙ\u0004õø\u0004ðöýì*Üøý\râøúöõ\nîÿî\u0005íþ\u0001\u00001Æïüõ\nòõAæÏüõ\nèÿýì\u001cæ\u0002ê\bü\u000fÙ\búüî\bò\u0006ùíýì\u0018éö\u0005ðó\u001eàõ\rö\u0010âøúî\u0005íþ\u0001\u00001³\bÿéDÜÙö\u0006õü$Ê\fòõä\nñ(Ïþý\u0015Úý\u0004ö\u0002ýì\u001cëìþþû!Ï\u0004\u0001ê\u0006õüð÷\u0003\u0002ê\u0006\u0000\u0002ò\u0002î\u0007ýì%Ð\u0003ø\u0017îì\u0017æ÷\u0003ñõüýì\"Ù\u0006öþøÿî ãì\u000e\tÚ\u000eè\n\u0013çé\u0003î\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@Åí\få\u0011úñ\u00022åÍ\få\u0011úñ\u0002\bíÿþñ\f\u0011Ú\nùõðöýì\"çä(áç1Ï\u0006úî\u0005íþ\u0001\u00001Æïüõ\nòõAÖæ\u0002ê\bü\u000fÙ\búüî\bò\u0006ùíýì\u001cÚý\u0004ö\u0002ýì+Ðõ\u000eñ\u0002\fîì\u0017æ÷\u0003ñõü\büî\u0005íþ\u0001\u00001¼\u0003üö\u0003.èÇ\föõ\u0016Ý\fùóýì\"ßö\u0013âþò\u0003\u0003ýì+Úÿø\u001cÖ\u0002êî\u0005íþ\u0001\u00001´ü\u0006ø9ÕÖ\u0004\u0006ü\tððò\u000bïýøÿ\u0002è\u001fà$Õø\tèö\u0005úè$äýì#Øü\u0002\u0012Ù\bíû\u001aæ÷\u0003ñõüýì-Îûþ\u0002ÿîýì(Öø\büð&Ùê\u0006õü\u001eáç æ÷\u0003ñõüî\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ý\u0007ñ\u0001\u0013ãÿéùþ\b\rÞ\u0006ýî\u0005íþ\u0001\u00001²\t\u0000øýìAäÈ\u0003\nî\u0005þúñ\u0002\u0014Þñú\u0019èÿéýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü#Òø&Ðþõ\u0000ýì\u001cëìþþû%Üê\u001aåê\u0010î\u0005íþ\u0001\u00001µ\nèÿAèÎ\u0005íþ\u0001\u0000\u001cÖ\u0002ê\fùê\nîýì\"ßòûþø\bíÿþñ\f\råê\u0010\u001fÎ\u0005\fÚ\u000eè\nýì(Ù\u0000\u0019Òø\u001fèï\u0003éþû\bòõ\u001bçñ\bÿø\u000bæ÷\u0003\u0013ßøûþñüöðî\u0005íþ\u0001\u00001Æïüõ\nòõAÖæ\u0002ê\bü\u000fÙ\búüî\bò\u0006ùíJÚÜöð\u0000øöü\u001cÚý\u0004ö\u0002ýì\u001fÙ\bíû\tü\fÚ\u000eè\n\u001cÊþ\fè\u0006õüýì\u001cëìþþû#Úú\u0000ç\u0004ó+Úô\u0006ãìûÿîýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü\u0015Ö\u0004\u0006öü-Îûþ\u0002ÿîúø\u0000\u0007ðþê\u0010\u0013ãì\u000e\tÚ\u000eè\nýì\"ßö\u0000÷ó\u0003\"Õþö\u0002\fìôø\u0007õðö".getBytes("ISO-8859-1"), 0, bArr, 0, 1337);
        onActivityResized = bArr;
        onMessageChannelReady = 201;
        onTransact();
        ICustomTabsCallback = 0;
        onMinimized = 1;
        writeTypedObject = 0;
        extraCallback = 1;
        onExtraCallback();
        Object[] objArr = new Object[1];
        c(new int[]{0, 3, 0, 2}, true, new byte[]{1, 0, 1}, objArr);
        asBinder = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        d(new char[]{25143, 16045, 51962, 57827, 29380, 15987, 49291, 14832, 17753, 65405, 32043, 59703, 7988, 20940}, 14 - KeyEvent.getDeadChar(0, 0), objArr2);
        asInterface = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        d(new char[]{2823, 21365, 52600, 29378, 41457, 43471, 19270, 11157, 9418, 51613, 2577, 7718}, 11 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr3);
        IAuthTabCallbackStub = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        d(new char[]{17753, 65405, 11318, 23755}, Color.green(0) + 4, objArr4);
        onTransact = ((String) objArr4[0]).intern();
        Object[] objArr5 = new Object[1];
        c(new int[]{3, 12, 0, 0}, false, new byte[]{1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1}, objArr5);
        onWarmupCompleted = ((String) objArr5[0]).intern();
        Object[] objArr6 = new Object[1];
        c(new int[]{15, 10, 82, 3}, true, null, objArr6);
        onExtraCallbackWithResult = ((String) objArr6[0]).intern();
        Object[] objArr7 = new Object[1];
        d(new char[]{9631, 156, 9410, 15609, 16771, 26647, 11216, 15170, 9631, 156, 26855, 59417}, Color.green(0) + 12, objArr7);
        onNavigationEvent = ((String) objArr7[0]).intern();
        Object[] objArr8 = new Object[1];
        d(new char[]{'`', 47173, 19270, 11157, 13489, 29012, 55276, 9373, 64567, 14740}, (-16777206) - Color.rgb(0, 0, 0), objArr8);
        onExtraCallback = ((String) objArr8[0]).intern();
        Companion = new onExtraCallback(null);
        IAuthTabCallback = 8;
        int i = ICustomTabsCallback + 1;
        onMinimized = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~(i7 | i5);
        int i9 = ~(i6 | i5);
        int i10 = ~i6;
        int i11 = ~i5;
        int i12 = i8 | i9 | (~(i10 | i11 | i2));
        int i13 = i8 | (~(i7 | i6)) | i9;
        int i14 = (~(i5 | i2)) | (~(i10 | i5)) | (~(i7 | i11 | i6));
        int i15 = i2 + i6 + i + (1880080305 * i4) + (458392769 * i3);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i2) - 2147483648) + (1582236324 * i6) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i) + (1711276032 * i4) + ((-973078528) * i3) + (68288512 * i16);
        int i18 = ((i2 * 319678698) - 2002258816) + (i6 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i * 319678491) + (i4 * (-161570901)) + (i3 * (-1160779685)) + (i16 * (-1109000192));
        return i17 + ((i18 * i18) * (-1432485888)) != 1 ? onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr);
    }

    private static final SharedPreferences onExtraCallbackWithResult(getDjangoNearestImageSize getdjangonearestimagesize) throws Throwable {
        checkVideoPermission checkvideopermission = new checkVideoPermission(getdjangonearestimagesize);
        try {
            byte[] bArr = onActivityResized;
            Object[] objArr = new Object[1];
            a(bArr[34], (short) (bArr[1] - 1), bArr[9], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[1038], (short) (onMessageChannelReady | 258), bArr[39], objArr2);
            int iIntValue = (((Integer) cls.getMethod((String) objArr2[0], null).invoke(null, null)).intValue() >> 16) + 164;
            Object[] objArr3 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[157], (short) 481, bArr[39], objArr4);
            String str = (String) objArr4[0];
            Object[] objArr5 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr5);
            int iIntValue2 = 216 - ((Integer) cls2.getMethod(str, Class.forName((String) objArr5[0])).invoke(null, "")).intValue();
            Object[] objArr6 = {0, 0};
            char c = 708;
            Object[] objArr7 = new Object[1];
            a(bArr[708], (short) 496, bArr[9], objArr7);
            Class<?> cls3 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr[65], (short) 512, bArr[290], objArr8);
            Object[] objArr9 = new Object[1];
            b(iIntValue, iIntValue2, (char) (((Integer) cls3.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr6)).intValue() + 58703), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[45], (short) 295, bArr[39], objArr11);
            String str3 = (String) objArr11[0];
            Object[] objArr12 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr12);
            int iIntValue3 = ((Integer) cls4.getMethod(str3, Class.forName((String) objArr12[0]), Integer.TYPE).invoke(null, "", 0)).intValue() + 1;
            Object[] objArr13 = new Object[1];
            a(bArr[50], (short) 309, bArr[9], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a(bArr[708], (short) 522, bArr[39], objArr14);
            int iIntValue4 = 88 - ((((Integer) cls5.getMethod((String) objArr14[0], Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6);
            Object[] objArr15 = new Object[1];
            a(bArr[34], (short) (bArr[1] - 1), bArr[9], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            byte b = bArr[65];
            Object[] objArr16 = new Object[1];
            a(b, (short) (b | 530), bArr[39], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue3, iIntValue4, (char) ((((Integer) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 16) + 64758), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s = (short) 247;
            Object[] objArr19 = new Object[1];
            a(bArr[157], s, bArr[95], objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            byte b2 = bArr[14];
            Object[] objArr20 = new Object[1];
            a(b2, (short) (b2 | 260), bArr[416], objArr20);
            String str4 = (String) objArr20[0];
            Object[] objArr21 = new Object[1];
            a(bArr[157], s, bArr[95], objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            for (int i = 0; i < objArr22.length; i++) {
                Object[] objArr23 = {objArr22[i]};
                byte[] bArr2 = onActivityResized;
                short s2 = (short) 266;
                Object[] objArr24 = new Object[1];
                a(bArr2[c], s2, bArr2[95], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a(bArr2[102], (short) 282, bArr2[245], objArr25);
                String str5 = (String) objArr25[0];
                Object[] objArr26 = new Object[1];
                a(bArr2[157], s, bArr2[95], objArr26);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                c = 708;
                Object[] objArr27 = new Object[1];
                a(bArr2[708], s2, bArr2[95], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(bArr2[5], (short) 288, bArr2[65], objArr28);
                iArr[i] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
            }
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                switch (checkvideopermission.onExtraCallbackWithResult(iArr[i2])) {
                    case -19:
                        i3 = 47;
                        i2 = i3;
                    case -18:
                        checkvideopermission.onExtraCallbackWithResult(18);
                        i3 = checkvideopermission.onWarmupCompleted != 60 ? 1 : 37;
                        i2 = i3;
                    case -17:
                        i3 = 48;
                        i2 = i3;
                    case -16:
                        i2 = 50;
                    case -15:
                        checkvideopermission.onExtraCallbackWithResult(30);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i3 = 36;
                        }
                        i2 = i3;
                    case -14:
                        i2 = 14;
                    case -13:
                        i3 = 26;
                        i2 = i3;
                    case -12:
                        checkvideopermission.onExtraCallbackWithResult(30);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i3 = 25;
                        }
                        i2 = i3;
                    case -11:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        extraCallback = checkvideopermission.onWarmupCompleted;
                        i2 = i3;
                    case -10:
                        checkvideopermission.IAuthTabCallback = writeTypedObject;
                        checkvideopermission.onExtraCallbackWithResult(9);
                        i2 = i3;
                    case -9:
                        checkvideopermission.onExtraCallbackWithResult(8);
                        return (SharedPreferences) checkvideopermission.asInterface;
                    case -8:
                        i2 = 27;
                    case -7:
                        i2 = 16;
                    case -6:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj2 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        Object[] objArr29 = {obj2, Integer.valueOf(checkvideopermission.onWarmupCompleted)};
                        byte[] bArr3 = onActivityResized;
                        Object[] objArr30 = new Object[1];
                        a(bArr3[1038], (short) 553, bArr3[9], objArr30);
                        Class<?> cls10 = Class.forName((String) objArr30[0]);
                        byte b3 = bArr3[290];
                        Object[] objArr31 = new Object[1];
                        a(b3, (short) (b3 | 558), bArr3[39], objArr31);
                        String str6 = (String) objArr31[0];
                        Object[] objArr32 = new Object[1];
                        a(bArr3[157], s, bArr3[95], objArr32);
                        checkvideopermission.asBinder = cls10.getMethod(str6, Class.forName((String) objArr32[0]), Integer.TYPE).invoke(obj, objArr29);
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i2 = i3;
                    case -5:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj3 = checkvideopermission.asInterface;
                        byte[] bArr4 = onActivityResized;
                        Object[] objArr33 = new Object[1];
                        a(bArr4[157], s, bArr4[95], objArr33);
                        Class<?> cls11 = Class.forName((String) objArr33[0]);
                        Object[] objArr34 = new Object[1];
                        a(bArr4[16], (short) 548, bArr4[65], objArr34);
                        checkvideopermission.asBinder = cls11.getMethod((String) objArr34[0], null).invoke(obj3, null);
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i2 = i3;
                    case -4:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        int[] iArr2 = (int[]) checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        boolean z = checkvideopermission.onWarmupCompleted != 0;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object[] objArr35 = new Object[1];
                        c(iArr2, z, (byte[]) checkvideopermission.asInterface, objArr35);
                        checkvideopermission.asBinder = (String) objArr35[0];
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i2 = i3;
                    case -3:
                        checkvideopermission.asBinder = new int[]{25, 18, 184, 7};
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i2 = i3;
                    case -2:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((getDjangoNearestImageSize) checkvideopermission.asInterface).IAuthTabCallbackDefault;
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i2 = i3;
                    case -1:
                        i2 = 11;
                    default:
                        i2 = i3;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0476 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0465 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onExtraCallbackWithResult(java.lang.Object[] r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDjangoNearestImageSize.onExtraCallbackWithResult(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03ec A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03df A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ android.content.SharedPreferences onNavigationEvent(o.getDjangoNearestImageSize r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1044
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDjangoNearestImageSize.onNavigationEvent(o.getDjangoNearestImageSize):android.content.SharedPreferences");
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05e5 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object onNavigationEvent(java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDjangoNearestImageSize.onNavigationEvent(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:184:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03e0 A[Catch: all -> 0x0592, TryCatch #9 {all -> 0x0592, blocks: (B:45:0x03c8, B:67:0x0426, B:55:0x03da, B:57:0x03e0, B:58:0x03e1, B:61:0x03ea, B:66:0x040c, B:68:0x042b, B:73:0x044d, B:74:0x0468, B:79:0x0485, B:80:0x04a0, B:85:0x04c2, B:86:0x04de, B:87:0x04fa, B:88:0x0546, B:90:0x055a, B:91:0x0576), top: B:249:0x03c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03e1 A[Catch: all -> 0x0592, TryCatch #9 {all -> 0x0592, blocks: (B:45:0x03c8, B:67:0x0426, B:55:0x03da, B:57:0x03e0, B:58:0x03e1, B:61:0x03ea, B:66:0x040c, B:68:0x042b, B:73:0x044d, B:74:0x0468, B:79:0x0485, B:80:0x04a0, B:85:0x04c2, B:86:0x04de, B:87:0x04fa, B:88:0x0546, B:90:0x055a, B:91:0x0576), top: B:249:0x03c8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String IAuthTabCallback() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDjangoNearestImageSize.IAuthTabCallback():java.lang.String");
    }

    public final void onExtraCallback(boolean z) throws Throwable {
        checkVideoPermission checkvideopermission = new checkVideoPermission(this, z ? 1 : 0);
        try {
            byte[] bArr = onActivityResized;
            Object[] objArr = new Object[1];
            a(bArr[34], (short) (bArr[1] - 1), bArr[9], objArr);
            char c = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[854], (short) 944, bArr[39], objArr2);
            int i = (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 134;
            Object[] objArr3 = new Object[1];
            a(bArr[245], (short) 832, bArr[9], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[95], (short) 855, bArr[39], objArr4);
            int i2 = 2640 - (((Float) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
            Object[] objArr5 = {"", "", 0, 0};
            Object[] objArr6 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            byte b = bArr[102];
            Object[] objArr7 = new Object[1];
            a(b, (short) (b | 907), bArr[65], objArr7);
            String str = (String) objArr7[0];
            Object[] objArr8 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr8);
            Object[] objArr9 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr9);
            Class<?>[] clsArr = {Class.forName((String) objArr8[0]), Class.forName((String) objArr9[0]), Integer.TYPE, Integer.TYPE};
            Object[] objArr10 = new Object[1];
            b(i, i2, (char) ((Integer) cls3.getMethod(str, clsArr).invoke(null, objArr5)).intValue(), objArr10);
            String str2 = (String) objArr10[0];
            char c2 = 708;
            Object[] objArr11 = new Object[1];
            a(bArr[708], (short) 496, bArr[9], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            Object[] objArr12 = new Object[1];
            a(bArr[65], (short) 512, bArr[290], objArr12);
            int iIntValue = 1 - ((Integer) cls4.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            byte b2 = bArr[416];
            Object[] objArr13 = new Object[1];
            a(b2, (short) (b2 | 193), bArr[9], objArr13);
            Class<?> cls5 = Class.forName((String) objArr13[0]);
            Object[] objArr14 = new Object[1];
            a(bArr[50], (short) 1294, bArr[157], objArr14);
            int iIntValue2 = 88 - ((Integer) cls5.getMethod((String) objArr14[0], Integer.TYPE).invoke(null, 0)).intValue();
            Object[] objArr15 = new Object[1];
            a(bArr[34], (short) (bArr[1] - 1), bArr[9], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            byte b3 = bArr[1038];
            Object[] objArr16 = new Object[1];
            a(b3, (short) (b3 | 1291), bArr[39], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue, iIntValue2, (char) (64758 - (((Integer) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 16)), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s = (short) 247;
            Object[] objArr19 = new Object[1];
            a(bArr[157], s, bArr[95], objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            byte b4 = bArr[14];
            Object[] objArr20 = new Object[1];
            a(b4, (short) (b4 | 260), bArr[416], objArr20);
            String str3 = (String) objArr20[0];
            Object[] objArr21 = new Object[1];
            a(bArr[157], s, bArr[95], objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str3, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            int i3 = 0;
            while (i3 < objArr22.length) {
                Object[] objArr23 = {objArr22[i3]};
                byte[] bArr2 = onActivityResized;
                short s2 = (short) 266;
                Object[] objArr24 = new Object[1];
                a(bArr2[c2], s2, bArr2[95], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[c]);
                Object[] objArr25 = new Object[1];
                a(bArr2[102], (short) 282, bArr2[245], objArr25);
                String str4 = (String) objArr25[c];
                Object[] objArr26 = new Object[1];
                a(bArr2[157], s, bArr2[95], objArr26);
                Object objInvoke = cls8.getMethod(str4, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a(bArr2[708], s2, bArr2[95], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(bArr2[5], (short) 288, bArr2[65], objArr28);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c2 = 708;
                c = 0;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                switch (checkvideopermission.onExtraCallbackWithResult(iArr[i4])) {
                    case -22:
                        i4 = 1;
                    case -21:
                        i4 = 39;
                    case -20:
                        checkvideopermission.onExtraCallbackWithResult(30);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i5 = 38;
                        }
                        i4 = i5;
                    case -19:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        extraCallback = checkvideopermission.onWarmupCompleted;
                        i4 = i5;
                    case -18:
                        checkvideopermission.IAuthTabCallback = writeTypedObject;
                        checkvideopermission.onExtraCallbackWithResult(9);
                        i4 = i5;
                    case -17:
                        i5 = 17;
                        i4 = i5;
                    case -16:
                        i5 = 28;
                        i4 = i5;
                    case -15:
                        checkvideopermission.onExtraCallbackWithResult(16);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i5 = 27;
                        }
                        i4 = i5;
                    case -14:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        writeTypedObject = checkvideopermission.onWarmupCompleted;
                        i4 = i5;
                    case -13:
                        checkvideopermission.IAuthTabCallback = extraCallback;
                        checkvideopermission.onExtraCallbackWithResult(9);
                        i4 = i5;
                    case -12:
                        return;
                    case -11:
                        i5 = 29;
                        i4 = i5;
                    case -10:
                        i5 = 19;
                        i4 = i5;
                    case -9:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj = checkvideopermission.asInterface;
                        byte[] bArr3 = onActivityResized;
                        Object[] objArr29 = new Object[1];
                        a(bArr3[397], (short) 1172, bArr3[9], objArr29);
                        Class<?> cls10 = Class.forName((String) objArr29[0]);
                        Object[] objArr30 = new Object[1];
                        a(bArr3[14], (short) (onMessageChannelReady | 1060), bArr3[9], objArr30);
                        cls10.getMethod((String) objArr30[0], null).invoke(obj, null);
                        i4 = i5;
                    case -8:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj2 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj3 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        Object[] objArr31 = {obj3, Boolean.valueOf(checkvideopermission.onWarmupCompleted != 0)};
                        byte[] bArr4 = onActivityResized;
                        Object[] objArr32 = new Object[1];
                        a(bArr4[397], (short) 1172, bArr4[9], objArr32);
                        Class<?> cls11 = Class.forName((String) objArr32[0]);
                        Object[] objArr33 = new Object[1];
                        a(bArr4[24], (short) 1285, bArr4[50], objArr33);
                        String str5 = (String) objArr33[0];
                        Object[] objArr34 = new Object[1];
                        a(bArr4[157], s, bArr4[95], objArr34);
                        checkvideopermission.asBinder = cls11.getMethod(str5, Class.forName((String) objArr34[0]), Boolean.TYPE).invoke(obj2, objArr31);
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -7:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj4 = checkvideopermission.asInterface;
                        byte[] bArr5 = onActivityResized;
                        Object[] objArr35 = new Object[1];
                        a(bArr5[157], s, bArr5[95], objArr35);
                        Class<?> cls12 = Class.forName((String) objArr35[0]);
                        Object[] objArr36 = new Object[1];
                        a(bArr5[16], (short) 548, bArr5[65], objArr36);
                        checkvideopermission.asBinder = cls12.getMethod((String) objArr36[0], null).invoke(obj4, null);
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -6:
                        checkvideopermission.IAuthTabCallback = 2;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        char[] cArr = (char[]) checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        Object[] objArr37 = new Object[1];
                        d(cArr, checkvideopermission.onWarmupCompleted, objArr37);
                        checkvideopermission.asBinder = (String) objArr37[0];
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -5:
                        Object[] objArr38 = new Object[1];
                        a(r4[34], (short) (onActivityResized[1] - 1), r4[9], objArr38);
                        Class<?> cls13 = Class.forName((String) objArr38[0]);
                        Object[] objArr39 = new Object[1];
                        a(r4[685], (short) 342, r4[39], objArr39);
                        checkvideopermission.IAuthTabCallback = ((Integer) cls13.getMethod((String) objArr39[0], null).invoke(null, null)).intValue();
                        checkvideopermission.onExtraCallbackWithResult(9);
                        i4 = i5;
                    case -4:
                        checkvideopermission.asBinder = new char[]{25143, 16045, 51962, 57827, 29380, 15987, 49291, 14832, 17753, 65405, 32043, 59703, 7988, 20940};
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -3:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj5 = checkvideopermission.asInterface;
                        byte[] bArr6 = onActivityResized;
                        Object[] objArr40 = new Object[1];
                        a(bArr6[48], (short) 772, bArr6[9], objArr40);
                        Class<?> cls14 = Class.forName((String) objArr40[0]);
                        byte b5 = bArr6[8];
                        Object[] objArr41 = new Object[1];
                        a(b5, (short) (b5 | 1168), bArr6[102], objArr41);
                        checkvideopermission.asBinder = cls14.getMethod((String) objArr41[0], null).invoke(obj5, null);
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -2:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((getDjangoNearestImageSize) checkvideopermission.asInterface).asInterface();
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -1:
                        i4 = 14;
                    default:
                        i4 = i5;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public final void onExtraCallbackWithResult(@NotNull urlEncode urlencode) throws Throwable {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        int iIntValue;
        int i4;
        Object objOnExtraCallbackWithResult;
        Integer num;
        char c3;
        char c4;
        Object obj;
        Object[] objArr;
        Method method;
        checkVideoPermission checkvideopermission = new checkVideoPermission(this, urlencode);
        try {
            byte[] bArr = onActivityResized;
            Object[] objArr2 = new Object[1];
            a(bArr[34], (short) (bArr[1] - 1), bArr[9], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            Object[] objArr3 = new Object[1];
            a(bArr[157], (short) 1066, bArr[39], objArr3);
            int iIntValue2 = 303 - (((Integer) cls.getMethod((String) objArr3[0], null).invoke(null, null)).intValue() >> 8);
            Object[] objArr4 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            a(bArr[45], (short) 295, bArr[39], objArr5);
            String str = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr6);
            int iIntValue3 = 2153 - ((Integer) cls2.getMethod(str, Class.forName((String) objArr6[0]), Integer.TYPE).invoke(null, "", 0)).intValue();
            Object[] objArr7 = {'0'};
            Object[] objArr8 = new Object[1];
            a(bArr[61], (short) 1081, bArr[9], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            byte b = bArr[39];
            a(b, (short) 1109, b, new Object[1]);
            Object[] objArr9 = new Object[1];
            b(iIntValue2, iIntValue3, (char) (((Character) cls3.getMethod((String) r15[0], Character.TYPE).invoke(null, objArr7)).charValue() - '0'), objArr9);
            String str2 = (String) objArr9[0];
            Object[] objArr10 = new Object[1];
            a(bArr[708], (short) 496, bArr[9], objArr10);
            Class<?> cls4 = Class.forName((String) objArr10[0]);
            byte b2 = bArr[104];
            Object[] objArr11 = new Object[1];
            a(b2, (short) (b2 | 1101), bArr[290], objArr11);
            int iIntValue4 = 1 - ((Integer) cls4.getMethod((String) objArr11[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, 0, 0, 0)).intValue();
            short s = (short) 309;
            Object[] objArr12 = new Object[1];
            a(bArr[50], s, bArr[9], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            byte b3 = bArr[12];
            Object[] objArr13 = new Object[1];
            a(b3, (short) (b3 | 1125), bArr[39], objArr13);
            String str3 = (String) objArr13[0];
            short s2 = (short) 247;
            Object[] objArr14 = new Object[1];
            a(bArr[157], s2, bArr[95], objArr14);
            int iIntValue5 = 87 - ((Integer) cls5.getMethod(str3, Class.forName((String) objArr14[0])).invoke(null, "")).intValue();
            Object[] objArr15 = new Object[1];
            a(bArr[494], (short) 377, bArr[9], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[1038], (short) 1147, bArr[14], objArr16);
            char c5 = (char) ((((Long) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).longValue() > (-1L) ? 1 : (((Long) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).longValue() == (-1L) ? 0 : -1)) + 64757);
            Object[] objArr17 = new Object[1];
            b(iIntValue4, iIntValue5, c5, objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            Object[] objArr19 = new Object[1];
            a(bArr[157], s2, bArr[95], objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            byte b4 = bArr[14];
            Object[] objArr20 = new Object[1];
            a(b4, (short) (b4 | 260), bArr[416], objArr20);
            String str4 = (String) objArr20[0];
            Object[] objArr21 = new Object[1];
            a(bArr[157], s2, bArr[95], objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr21[0])).invoke(str2, objArr18);
            int[] iArr = new int[objArr22.length];
            int i5 = 0;
            while (i5 < objArr22.length) {
                Object[] objArr23 = {objArr22[i5]};
                byte[] bArr2 = onActivityResized;
                short s3 = (short) 266;
                Object[] objArr24 = new Object[1];
                a(bArr2[708], s3, bArr2[95], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[0]);
                Object[] objArr25 = new Object[1];
                a(bArr2[102], (short) 282, bArr2[245], objArr25);
                String str5 = (String) objArr25[0];
                Object[] objArr26 = objArr22;
                Object[] objArr27 = new Object[1];
                a(bArr2[157], s2, bArr2[95], objArr27);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr27[0])).invoke(null, objArr23);
                Object[] objArr28 = new Object[1];
                a(bArr2[708], s3, bArr2[95], objArr28);
                Class<?> cls9 = Class.forName((String) objArr28[0]);
                Object[] objArr29 = new Object[1];
                a(bArr2[5], (short) 288, bArr2[65], objArr29);
                iArr[i5] = ((Integer) cls9.getMethod((String) objArr29[0], null).invoke(objInvoke, null)).intValue();
                i5++;
                objArr22 = objArr26;
            }
            int i6 = 0;
            while (true) {
                int i7 = i6 + 1;
                switch (checkvideopermission.onExtraCallbackWithResult(iArr[i6])) {
                    case -40:
                        i7 = 66;
                    case -39:
                        i6 = 87;
                    case -38:
                        checkvideopermission.onExtraCallbackWithResult(30);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i7 = 86;
                        }
                    case -37:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        extraCallback = checkvideopermission.onWarmupCompleted;
                    case -36:
                        i = writeTypedObject;
                        checkvideopermission.IAuthTabCallback = i;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -35:
                        i6 = 1;
                    case -34:
                        i6 = 77;
                    case -33:
                        checkvideopermission.onExtraCallbackWithResult(16);
                        i6 = checkvideopermission.onWarmupCompleted == 0 ? 76 : i7;
                    case -32:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        writeTypedObject = checkvideopermission.onWarmupCompleted;
                    case -31:
                        i = extraCallback;
                        checkvideopermission.IAuthTabCallback = i;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -30:
                        return;
                    case -29:
                        i6 = 68;
                    case -28:
                        i6 = 78;
                    case -27:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj2 = checkvideopermission.asInterface;
                        byte[] bArr3 = onActivityResized;
                        Object[] objArr30 = new Object[1];
                        a(bArr3[397], (short) 1172, bArr3[9], objArr30);
                        Class<?> cls10 = Class.forName((String) objArr30[0]);
                        Object[] objArr31 = new Object[1];
                        a(bArr3[14], (short) (onMessageChannelReady | 1060), bArr3[9], objArr31);
                        cls10.getMethod((String) objArr31[0], null).invoke(obj2, null);
                    case -26:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((urlEncode) checkvideopermission.asInterface).onWarmupCompleted();
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -25:
                        byte[] bArr4 = onActivityResized;
                        Object[] objArr32 = new Object[1];
                        a(bArr4[50], s, bArr4[9], objArr32);
                        Class<?> cls11 = Class.forName((String) objArr32[0]);
                        Object[] objArr33 = new Object[1];
                        a(bArr4[708], (short) 326, bArr4[39], objArr33);
                        checkvideopermission.onExtraCallback = ((Long) cls11.getMethod((String) objArr33[0], null).invoke(null, null)).longValue();
                        checkvideopermission.onExtraCallbackWithResult(117);
                    case -24:
                        i2 = 4;
                        checkvideopermission.asBinder = new char[]{9631, 156, 9410, 15609, 16771, 26647, 11216, 15170, 9631, 156, 26855, 59417};
                        checkvideopermission.onExtraCallbackWithResult(i2);
                    case -23:
                        i2 = 4;
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((urlEncode) checkvideopermission.asInterface).IAuthTabCallbackDefault();
                        checkvideopermission.onExtraCallbackWithResult(i2);
                    case -22:
                        i3 = 4;
                        c = 2;
                        c2 = 3;
                        checkvideopermission.asBinder = new byte[]{1, 0, 1};
                        checkvideopermission.onExtraCallbackWithResult(i3);
                    case -21:
                        i3 = 4;
                        c = 2;
                        c2 = 3;
                        checkvideopermission.asBinder = new int[]{0, 3, 0, 2};
                        checkvideopermission.onExtraCallbackWithResult(i3);
                    case -20:
                        checkvideopermission.IAuthTabCallback = 1;
                        c = 2;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        c2 = 3;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((urlEncode) checkvideopermission.asInterface).onExtraCallback();
                        i3 = 4;
                        checkvideopermission.onExtraCallbackWithResult(i3);
                    case -19:
                        Object[] objArr34 = new Object[1];
                        a(r2[34], (short) (onActivityResized[1] - 1), r2[9], objArr34);
                        Class<?> cls12 = Class.forName((String) objArr34[0]);
                        Object[] objArr35 = new Object[1];
                        a(r2[416], (short) (onMessageChannelReady | 1040), r2[39], objArr35);
                        iIntValue = ((Integer) cls12.getMethod((String) objArr35[0], null).invoke(null, null)).intValue();
                        checkvideopermission.IAuthTabCallback = iIntValue;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -18:
                        i4 = 4;
                        checkvideopermission.asBinder = new char[]{'`', 47173, 19270, 11157, 13489, 29012, 55276, 9373, 64567, 14740};
                        checkvideopermission.onExtraCallbackWithResult(i4);
                    case -17:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        objOnExtraCallbackWithResult = ((urlEncode) checkvideopermission.asInterface).onExtraCallbackWithResult();
                        checkvideopermission.asBinder = objOnExtraCallbackWithResult;
                        i4 = 4;
                        checkvideopermission.onExtraCallbackWithResult(i4);
                    case -16:
                        byte[] bArr5 = onActivityResized;
                        Object[] objArr36 = new Object[1];
                        a(bArr5[34], (short) (bArr5[1] - 1), bArr5[9], objArr36);
                        Class<?> cls13 = Class.forName((String) objArr36[0]);
                        byte b5 = bArr5[65];
                        Object[] objArr37 = new Object[1];
                        a(b5, (short) (b5 | 530), bArr5[39], objArr37);
                        num = (Integer) cls13.getMethod((String) objArr37[0], null).invoke(null, null);
                        iIntValue = num.intValue();
                        checkvideopermission.IAuthTabCallback = iIntValue;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -15:
                        i4 = 4;
                        checkvideopermission.asBinder = new char[]{2823, 21365, 52600, 29378, 41457, 43471, 19270, 11157, 9418, 51613, 2577, 7718};
                        checkvideopermission.onExtraCallbackWithResult(i4);
                    case -14:
                        i4 = 4;
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((urlEncode) checkvideopermission.asInterface).onNavigationEvent();
                        checkvideopermission.onExtraCallbackWithResult(i4);
                    case -13:
                        checkvideopermission.IAuthTabCallback = 2;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        char[] cArr = (char[]) checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        Object[] objArr38 = new Object[1];
                        d(cArr, checkvideopermission.onWarmupCompleted, objArr38);
                        checkvideopermission.asBinder = (String) objArr38[0];
                        i4 = 4;
                        checkvideopermission.onExtraCallbackWithResult(i4);
                    case -12:
                        Object[] objArr39 = new Object[1];
                        a(r2[34], (short) (onActivityResized[1] - 1), r2[9], objArr39);
                        Class<?> cls14 = Class.forName((String) objArr39[0]);
                        Object[] objArr40 = new Object[1];
                        a(r2[1038], (short) 1219, r2[39], objArr40);
                        num = (Integer) cls14.getMethod((String) objArr40[0], null).invoke(null, null);
                        iIntValue = num.intValue();
                        checkvideopermission.IAuthTabCallback = iIntValue;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -11:
                        i4 = 4;
                        checkvideopermission.asBinder = new char[]{17753, 65405, 11318, 23755};
                        checkvideopermission.onExtraCallbackWithResult(i4);
                    case -10:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj3 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj4 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object[] objArr41 = {obj4, checkvideopermission.asInterface};
                        byte[] bArr6 = onActivityResized;
                        Object[] objArr42 = new Object[1];
                        a(bArr6[397], (short) 1172, bArr6[9], objArr42);
                        Class<?> cls15 = Class.forName((String) objArr42[0]);
                        Object[] objArr43 = new Object[1];
                        a(bArr6[39], (short) 1211, bArr6[50], objArr43);
                        String str6 = (String) objArr43[0];
                        Object[] objArr44 = new Object[1];
                        a(bArr6[157], s2, bArr6[95], objArr44);
                        Object[] objArr45 = new Object[1];
                        a(bArr6[157], s2, bArr6[95], objArr45);
                        objOnExtraCallbackWithResult = cls15.getMethod(str6, Class.forName((String) objArr44[0]), Class.forName((String) objArr45[0])).invoke(obj3, objArr41);
                        checkvideopermission.asBinder = objOnExtraCallbackWithResult;
                        i4 = 4;
                        checkvideopermission.onExtraCallbackWithResult(i4);
                    case -9:
                        checkvideopermission.IAuthTabCallback = 1;
                        c3 = 2;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        c4 = 3;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((urlEncode) checkvideopermission.asInterface).IAuthTabCallback();
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -8:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        obj = checkvideopermission.asInterface;
                        byte[] bArr7 = onActivityResized;
                        Object[] objArr46 = new Object[1];
                        a(bArr7[157], s2, bArr7[95], objArr46);
                        Class<?> cls16 = Class.forName((String) objArr46[0]);
                        Object[] objArr47 = new Object[1];
                        a(bArr7[16], (short) 548, bArr7[65], objArr47);
                        objArr = null;
                        method = cls16.getMethod((String) objArr47[0], null);
                        checkvideopermission.asBinder = method.invoke(obj, objArr);
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -7:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        int[] iArr2 = (int[]) checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        boolean z = checkvideopermission.onWarmupCompleted != 0;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object[] objArr48 = new Object[1];
                        c(iArr2, z, (byte[]) checkvideopermission.asInterface, objArr48);
                        checkvideopermission.asBinder = (String) objArr48[0];
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -6:
                        checkvideopermission.asBinder = new int[]{15, 10, 82, 3};
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -5:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        obj = checkvideopermission.asInterface;
                        byte[] bArr8 = onActivityResized;
                        Object[] objArr49 = new Object[1];
                        a(bArr8[48], (short) 772, bArr8[9], objArr49);
                        Class<?> cls17 = Class.forName((String) objArr49[0]);
                        byte b6 = bArr8[8];
                        Object[] objArr50 = new Object[1];
                        a(b6, (short) (b6 | 1168), bArr8[102], objArr50);
                        objArr = null;
                        method = cls17.getMethod((String) objArr50[0], null);
                        checkvideopermission.asBinder = method.invoke(obj, objArr);
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -4:
                        c3 = 2;
                        c4 = 3;
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((getDjangoNearestImageSize) checkvideopermission.asInterface).asInterface();
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -3:
                        c3 = 2;
                        checkvideopermission.IAuthTabCallback = 2;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        c4 = 3;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj5 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Intrinsics.checkNotNullParameter(obj5, (String) checkvideopermission.asInterface);
                    case -2:
                        checkvideopermission.asBinder = "";
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -1:
                        i6 = 63;
                    default:
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onNavigationEvent() throws Throwable {
        int iBooleanValue;
        checkVideoPermission checkvideopermission = new checkVideoPermission(this);
        try {
            byte[] bArr = onActivityResized;
            Object[] objArr = new Object[1];
            a(bArr[34], (short) (bArr[1] - 1), bArr[9], objArr);
            char c = 0;
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(bArr[708], (short) 647, bArr[39], objArr2);
            int i = 260 - (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() > 0.0f ? 1 : (((Float) cls.getMethod((String) objArr2[0], null).invoke(null, null)).floatValue() == 0.0f ? 0 : -1));
            Object[] objArr3 = new Object[1];
            a(bArr[494], (short) 417, bArr[9], objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            byte b = bArr[14];
            Object[] objArr4 = new Object[1];
            a(b, (short) (b | 661), bArr[9], objArr4);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr4[0], Integer.TYPE).invoke(null, 0)).intValue() + 1650;
            Object[] objArr5 = {0};
            Object[] objArr6 = new Object[1];
            a(bArr[50], (short) 309, bArr[9], objArr6);
            Class<?> cls3 = Class.forName((String) objArr6[0]);
            Object[] objArr7 = new Object[1];
            a(bArr[708], (short) 522, bArr[39], objArr7);
            Object[] objArr8 = new Object[1];
            b(i, iIntValue, (char) ((((Integer) cls3.getMethod((String) objArr7[0], Integer.TYPE).invoke(null, objArr5)).intValue() + 20) >> 6), objArr8);
            String str = (String) objArr8[0];
            Object[] objArr9 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr9);
            Class<?> cls4 = Class.forName((String) objArr9[0]);
            Object[] objArr10 = new Object[1];
            a(bArr[119], (short) 85, bArr[39], objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr11);
            int iIntValue2 = ((Integer) cls4.getMethod(str2, Class.forName((String) objArr11[0]), Integer.TYPE).invoke(null, "", 0)).intValue() + 1;
            Object[] objArr12 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr12);
            Class<?> cls5 = Class.forName((String) objArr12[0]);
            byte b2 = bArr[102];
            Object[] objArr13 = new Object[1];
            a(b2, (short) (b2 | 907), bArr[65], objArr13);
            String str3 = (String) objArr13[0];
            Object[] objArr14 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr14);
            int iIntValue3 = 87 - ((Integer) cls5.getMethod(str3, Class.forName((String) objArr14[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue();
            Object[] objArr15 = new Object[1];
            a(bArr[34], (short) (bArr[1] - 1), bArr[9], objArr15);
            Class<?> cls6 = Class.forName((String) objArr15[0]);
            byte b3 = bArr[104];
            Object[] objArr16 = new Object[1];
            a(b3, (short) (b3 | 901), bArr[39], objArr16);
            Object[] objArr17 = new Object[1];
            b(iIntValue2, iIntValue3, (char) (64758 - (((Integer) cls6.getMethod((String) objArr16[0], null).invoke(null, null)).intValue() >> 16)), objArr17);
            Object[] objArr18 = {(String) objArr17[0]};
            short s = (short) 247;
            Object[] objArr19 = new Object[1];
            a(bArr[157], s, bArr[95], objArr19);
            Class<?> cls7 = Class.forName((String) objArr19[0]);
            byte b4 = bArr[14];
            Object[] objArr20 = new Object[1];
            a(b4, (short) (b4 | 260), bArr[416], objArr20);
            String str4 = (String) objArr20[0];
            Object[] objArr21 = new Object[1];
            a(bArr[157], s, bArr[95], objArr21);
            Object[] objArr22 = (Object[]) cls7.getMethod(str4, Class.forName((String) objArr21[0])).invoke(str, objArr18);
            int[] iArr = new int[objArr22.length];
            int i2 = 0;
            while (i2 < objArr22.length) {
                Object[] objArr23 = {objArr22[i2]};
                byte[] bArr2 = onActivityResized;
                short s2 = (short) 266;
                Object[] objArr24 = new Object[1];
                a(bArr2[708], s2, bArr2[95], objArr24);
                Class<?> cls8 = Class.forName((String) objArr24[c]);
                Object[] objArr25 = new Object[1];
                a(bArr2[102], (short) 282, bArr2[245], objArr25);
                String str5 = (String) objArr25[c];
                Object[] objArr26 = new Object[1];
                a(bArr2[157], s, bArr2[95], objArr26);
                Object objInvoke = cls8.getMethod(str5, Class.forName((String) objArr26[0])).invoke(null, objArr23);
                Object[] objArr27 = new Object[1];
                a(bArr2[708], s2, bArr2[95], objArr27);
                Class<?> cls9 = Class.forName((String) objArr27[0]);
                Object[] objArr28 = new Object[1];
                a(bArr2[5], (short) 288, bArr2[65], objArr28);
                iArr[i2] = ((Integer) cls9.getMethod((String) objArr28[0], null).invoke(objInvoke, null)).intValue();
                i2++;
                c = 0;
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int i5 = 21;
                switch (checkvideopermission.onExtraCallbackWithResult(iArr[i3])) {
                    case -37:
                        i4 = 69;
                    case -36:
                        checkvideopermission.onExtraCallbackWithResult(18);
                        int i6 = checkvideopermission.onWarmupCompleted;
                        i4 = (i6 == 54 || i6 != 64) ? 38 : 21;
                        break;
                    case -35:
                        i4 = 64;
                    case -34:
                        checkvideopermission.onExtraCallbackWithResult(18);
                        i4 = checkvideopermission.onWarmupCompleted != 0 ? 7 : 47;
                    case -33:
                        i4 = 59;
                    case -32:
                        checkvideopermission.onExtraCallbackWithResult(18);
                        int i7 = checkvideopermission.onWarmupCompleted;
                        if (i7 != 32 && i7 == 51) {
                            i5 = 19;
                        }
                        i3 = i5;
                        break;
                    case -31:
                        i3 = i5;
                    case -30:
                        i4 = 19;
                    case -29:
                        checkvideopermission.onExtraCallbackWithResult(16);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i4 = 58;
                        }
                    case -28:
                        i3 = 65;
                    case -27:
                        i4 = 67;
                    case -26:
                        checkvideopermission.onExtraCallbackWithResult(30);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i4 = 46;
                        }
                    case -25:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        extraCallback = checkvideopermission.onWarmupCompleted;
                    case -24:
                        iBooleanValue = writeTypedObject;
                        checkvideopermission.IAuthTabCallback = iBooleanValue;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -23:
                        i3 = 27;
                    case -22:
                        i3 = 37;
                    case -21:
                        checkvideopermission.onExtraCallbackWithResult(16);
                        i3 = checkvideopermission.onWarmupCompleted == 0 ? 36 : i4;
                    case -20:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        writeTypedObject = checkvideopermission.onWarmupCompleted;
                    case -19:
                        iBooleanValue = extraCallback;
                        checkvideopermission.IAuthTabCallback = iBooleanValue;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -18:
                        i3 = 1;
                    case -17:
                        i3 = 29;
                    case -16:
                        checkvideopermission.onExtraCallbackWithResult(99);
                        return checkvideopermission.onWarmupCompleted != 0;
                    case -15:
                        i3 = 60;
                    case -14:
                        i3 = 62;
                    case -13:
                        checkvideopermission.onExtraCallbackWithResult(16);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i3 = 18;
                        }
                    case -12:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj2 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        Object[] objArr29 = {obj2, Boolean.valueOf(checkvideopermission.onWarmupCompleted != 0)};
                        byte[] bArr3 = onActivityResized;
                        Object[] objArr30 = new Object[1];
                        a(bArr3[48], (short) 772, bArr3[9], objArr30);
                        Class<?> cls10 = Class.forName((String) objArr30[0]);
                        byte b5 = bArr3[24];
                        Object[] objArr31 = new Object[1];
                        a(b5, (short) (b5 | 928), bArr3[39], objArr31);
                        String str6 = (String) objArr31[0];
                        Object[] objArr32 = new Object[1];
                        a(bArr3[157], s, bArr3[95], objArr32);
                        iBooleanValue = ((Boolean) cls10.getMethod(str6, Class.forName((String) objArr32[0]), Boolean.TYPE).invoke(obj, objArr29)).booleanValue();
                        checkvideopermission.IAuthTabCallback = iBooleanValue;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -11:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj3 = checkvideopermission.asInterface;
                        byte[] bArr4 = onActivityResized;
                        Object[] objArr33 = new Object[1];
                        a(bArr4[157], s, bArr4[95], objArr33);
                        Class<?> cls11 = Class.forName((String) objArr33[0]);
                        Object[] objArr34 = new Object[1];
                        a(bArr4[16], (short) 548, bArr4[65], objArr34);
                        checkvideopermission.asBinder = cls11.getMethod((String) objArr34[0], null).invoke(obj3, null);
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -10:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        int[] iArr2 = (int[]) checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        boolean z = checkvideopermission.onWarmupCompleted != 0;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object[] objArr35 = new Object[1];
                        c(iArr2, z, (byte[]) checkvideopermission.asInterface, objArr35);
                        checkvideopermission.asBinder = (String) objArr35[0];
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -9:
                        checkvideopermission.asBinder = new byte[]{1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1};
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -8:
                        checkvideopermission.asBinder = new int[]{3, 12, 0, 0};
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -7:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((getDjangoNearestImageSize) checkvideopermission.asInterface).asInterface();
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -6:
                        i3 = 70;
                    case -5:
                        i3 = 72;
                    case -4:
                        checkvideopermission.onExtraCallbackWithResult(16);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i3 = 6;
                        }
                    case -3:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.IAuthTabCallback = ((zzad) checkvideopermission.asInterface).ITrustedWebActivityService_Parcel() ? 1 : 0;
                        checkvideopermission.onExtraCallbackWithResult(9);
                    case -2:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((getDjangoNearestImageSize) checkvideopermission.asInterface).IAuthTabCallbackStubProxy;
                        checkvideopermission.onExtraCallbackWithResult(4);
                    case -1:
                        i3 = 23;
                    default:
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x0718 A[Catch: all -> 0x071a, TryCatch #32 {all -> 0x071a, blocks: (B:139:0x0700, B:147:0x0711, B:149:0x0718, B:150:0x0719, B:158:0x0732), top: B:418:0x0700 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0719 A[Catch: all -> 0x071a, TRY_LEAVE, TryCatch #32 {all -> 0x071a, blocks: (B:139:0x0700, B:147:0x0711, B:149:0x0718, B:150:0x0719, B:158:0x0732), top: B:418:0x0700 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07e5 A[Catch: all -> 0x08a6, TryCatch #2 {all -> 0x08a6, blocks: (B:173:0x07d0, B:190:0x0804, B:181:0x07de, B:183:0x07e5, B:184:0x07e6, B:189:0x0802, B:194:0x0812, B:196:0x087f, B:198:0x0886, B:200:0x088d, B:201:0x088e, B:202:0x088f, B:195:0x082d), top: B:362:0x07d0, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x07e6 A[Catch: all -> 0x08a6, TRY_LEAVE, TryCatch #2 {all -> 0x08a6, blocks: (B:173:0x07d0, B:190:0x0804, B:181:0x07de, B:183:0x07e5, B:184:0x07e6, B:189:0x0802, B:194:0x0812, B:196:0x087f, B:198:0x0886, B:200:0x088d, B:201:0x088e, B:202:0x088f, B:195:0x082d), top: B:362:0x07d0, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x094f A[Catch: all -> 0x0a82, TryCatch #14 {all -> 0x0a82, blocks: (B:223:0x0935, B:233:0x0948, B:235:0x094f, B:236:0x0950, B:240:0x0966, B:246:0x0a06, B:243:0x09dc, B:245:0x09f2, B:247:0x0a0a, B:248:0x0a28, B:253:0x0a63), top: B:384:0x0935 }] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0950 A[Catch: all -> 0x0a82, TryCatch #14 {all -> 0x0a82, blocks: (B:223:0x0935, B:233:0x0948, B:235:0x094f, B:236:0x0950, B:240:0x0966, B:246:0x0a06, B:243:0x09dc, B:245:0x09f2, B:247:0x0a0a, B:248:0x0a28, B:253:0x0a63), top: B:384:0x0935 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0d07  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0d0e  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0d21 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o.urlEncode onWarmupCompleted() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDjangoNearestImageSize.onWarmupCompleted():o.urlEncode");
    }

    public final void onWarmupCompleted(boolean z) throws Throwable {
        Object obj;
        Object[] objArr;
        Method method;
        int i;
        char c;
        checkVideoPermission checkvideopermission = new checkVideoPermission(this, z ? 1 : 0);
        try {
            char c2 = 0;
            byte[] bArr = onActivityResized;
            Object[] objArr2 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            byte b = bArr[102];
            Object[] objArr3 = new Object[1];
            a(b, (short) (b | 907), bArr[65], objArr3);
            String str = (String) objArr3[0];
            Object[] objArr4 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr4);
            int iIntValue = ((Integer) cls.getMethod(str, Class.forName((String) objArr4[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue() + 185;
            Object[] objArr5 = new Object[1];
            a(bArr[34], (short) (bArr[1] - 1), bArr[9], objArr5);
            Class<?> cls2 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[685], (short) 342, bArr[39], objArr6);
            int iIntValue2 = (((Integer) cls2.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 24) + 2456;
            Object[] objArr7 = {0L};
            Object[] objArr8 = new Object[1];
            a(bArr[48], (short) 1010, bArr[9], objArr8);
            Class<?> cls3 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            a(bArr[416], (short) 1265, bArr[39], objArr9);
            Object[] objArr10 = new Object[1];
            b(iIntValue, iIntValue2, (char) ((Integer) cls3.getMethod((String) objArr9[0], Long.TYPE).invoke(null, objArr7)).intValue(), objArr10);
            String str2 = (String) objArr10[0];
            Object[] objArr11 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr11);
            Class<?> cls4 = Class.forName((String) objArr11[0]);
            byte b2 = bArr[65];
            Object[] objArr12 = new Object[1];
            a(b2, (short) (b2 | 359), bArr[119], objArr12);
            String str3 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr13);
            int i2 = -((Integer) cls4.getMethod(str3, Class.forName((String) objArr13[0]), Character.TYPE, Integer.TYPE).invoke(null, "", '0', 0)).intValue();
            Object[] objArr14 = new Object[1];
            a(bArr[494], (short) 417, bArr[9], objArr14);
            Class<?> cls5 = Class.forName((String) objArr14[0]);
            byte b3 = bArr[9];
            Object[] objArr15 = new Object[1];
            a(b3, (short) (b3 | 830), bArr[290], objArr15);
            int iIntValue3 = ((Integer) cls5.getMethod((String) objArr15[0], Integer.TYPE).invoke(null, 0)).intValue() + 88;
            Object[] objArr16 = {"", "", 0, 0};
            Object[] objArr17 = new Object[1];
            a(bArr[494], bArr[322], bArr[9], objArr17);
            Class<?> cls6 = Class.forName((String) objArr17[0]);
            byte b4 = bArr[102];
            Object[] objArr18 = new Object[1];
            a(b4, (short) (b4 | 907), bArr[65], objArr18);
            String str4 = (String) objArr18[0];
            Object[] objArr19 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr19);
            Object[] objArr20 = new Object[1];
            a(bArr[494], (short) (-bArr[2]), bArr[95], objArr20);
            Class<?>[] clsArr = {Class.forName((String) objArr19[0]), Class.forName((String) objArr20[0]), Integer.TYPE, Integer.TYPE};
            Object[] objArr21 = new Object[1];
            b(i2, iIntValue3, (char) (((Integer) cls6.getMethod(str4, clsArr).invoke(null, objArr16)).intValue() + 64758), objArr21);
            Object[] objArr22 = {(String) objArr21[0]};
            short s = (short) 247;
            Object[] objArr23 = new Object[1];
            a(bArr[157], s, bArr[95], objArr23);
            Class<?> cls7 = Class.forName((String) objArr23[0]);
            byte b5 = bArr[14];
            Object[] objArr24 = new Object[1];
            a(b5, (short) (b5 | 260), bArr[416], objArr24);
            String str5 = (String) objArr24[0];
            Object[] objArr25 = new Object[1];
            a(bArr[157], s, bArr[95], objArr25);
            Object[] objArr26 = (Object[]) cls7.getMethod(str5, Class.forName((String) objArr25[0])).invoke(str2, objArr22);
            int[] iArr = new int[objArr26.length];
            int i3 = 0;
            while (i3 < objArr26.length) {
                Object[] objArr27 = {objArr26[i3]};
                byte[] bArr2 = onActivityResized;
                short s2 = (short) 266;
                Object[] objArr28 = new Object[1];
                a(bArr2[708], s2, bArr2[95], objArr28);
                Class<?> cls8 = Class.forName((String) objArr28[c2]);
                Object[] objArr29 = new Object[1];
                a(bArr2[102], (short) 282, bArr2[245], objArr29);
                String str6 = (String) objArr29[c2];
                Object[] objArr30 = new Object[1];
                a(bArr2[157], s, bArr2[95], objArr30);
                Object objInvoke = cls8.getMethod(str6, Class.forName((String) objArr30[0])).invoke(null, objArr27);
                Object[] objArr31 = new Object[1];
                a(bArr2[708], s2, bArr2[95], objArr31);
                Class<?> cls9 = Class.forName((String) objArr31[0]);
                Object[] objArr32 = new Object[1];
                a(bArr2[5], (short) 288, bArr2[65], objArr32);
                iArr[i3] = ((Integer) cls9.getMethod((String) objArr32[0], null).invoke(objInvoke, null)).intValue();
                i3++;
                c2 = 0;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                switch (checkvideopermission.onExtraCallbackWithResult(iArr[i4])) {
                    case -24:
                        i4 = 50;
                    case -23:
                        checkvideopermission.onExtraCallbackWithResult(18);
                        i5 = checkvideopermission.onWarmupCompleted != 76 ? 38 : 1;
                        i4 = i5;
                    case -22:
                        i5 = 51;
                        i4 = i5;
                    case -21:
                        i5 = 53;
                        i4 = i5;
                    case -20:
                        checkvideopermission.onExtraCallbackWithResult(16);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i5 = 37;
                        }
                        i4 = i5;
                    case -19:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        writeTypedObject = checkvideopermission.onWarmupCompleted;
                        i4 = i5;
                    case -18:
                        checkvideopermission.IAuthTabCallback = extraCallback;
                        checkvideopermission.onExtraCallbackWithResult(9);
                        i4 = i5;
                    case -17:
                        i5 = 17;
                        i4 = i5;
                    case -16:
                        i5 = 27;
                        i4 = i5;
                    case -15:
                        checkvideopermission.onExtraCallbackWithResult(30);
                        if (checkvideopermission.onWarmupCompleted == 0) {
                            i5 = 26;
                        }
                        i4 = i5;
                    case -14:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(14);
                        extraCallback = checkvideopermission.onWarmupCompleted;
                        i4 = i5;
                    case -13:
                        checkvideopermission.IAuthTabCallback = writeTypedObject;
                        checkvideopermission.onExtraCallbackWithResult(9);
                        i4 = i5;
                    case -12:
                        return;
                    case -11:
                        i5 = 28;
                        i4 = i5;
                    case -10:
                        i5 = 19;
                        i4 = i5;
                    case -9:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj2 = checkvideopermission.asInterface;
                        byte[] bArr3 = onActivityResized;
                        Object[] objArr33 = new Object[1];
                        a(bArr3[397], (short) 1172, bArr3[9], objArr33);
                        Class<?> cls10 = Class.forName((String) objArr33[0]);
                        Object[] objArr34 = new Object[1];
                        a(bArr3[14], (short) (onMessageChannelReady | 1060), bArr3[9], objArr34);
                        cls10.getMethod((String) objArr34[0], null).invoke(obj2, null);
                        i4 = i5;
                    case -8:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj3 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object obj4 = checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        Object[] objArr35 = {obj4, Boolean.valueOf(checkvideopermission.onWarmupCompleted != 0)};
                        byte[] bArr4 = onActivityResized;
                        Object[] objArr36 = new Object[1];
                        a(bArr4[397], (short) 1172, bArr4[9], objArr36);
                        Class<?> cls11 = Class.forName((String) objArr36[0]);
                        Object[] objArr37 = new Object[1];
                        a(bArr4[24], (short) 1285, bArr4[50], objArr37);
                        String str7 = (String) objArr37[0];
                        Object[] objArr38 = new Object[1];
                        a(bArr4[157], s, bArr4[95], objArr38);
                        checkvideopermission.asBinder = cls11.getMethod(str7, Class.forName((String) objArr38[0]), Boolean.TYPE).invoke(obj3, objArr35);
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -7:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        obj = checkvideopermission.asInterface;
                        byte[] bArr5 = onActivityResized;
                        Object[] objArr39 = new Object[1];
                        a(bArr5[157], s, bArr5[95], objArr39);
                        Class<?> cls12 = Class.forName((String) objArr39[0]);
                        Object[] objArr40 = new Object[1];
                        a(bArr5[16], (short) 548, bArr5[65], objArr40);
                        objArr = null;
                        method = cls12.getMethod((String) objArr40[0], null);
                        checkvideopermission.asBinder = method.invoke(obj, objArr);
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -6:
                        checkvideopermission.IAuthTabCallback = 3;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        int[] iArr2 = (int[]) checkvideopermission.asInterface;
                        checkvideopermission.onExtraCallbackWithResult(14);
                        boolean z2 = checkvideopermission.onWarmupCompleted != 0;
                        checkvideopermission.onExtraCallbackWithResult(3);
                        Object[] objArr41 = new Object[1];
                        c(iArr2, z2, (byte[]) checkvideopermission.asInterface, objArr41);
                        checkvideopermission.asBinder = (String) objArr41[0];
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -5:
                        i = 4;
                        c = 3;
                        checkvideopermission.asBinder = new byte[]{1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1};
                        checkvideopermission.onExtraCallbackWithResult(i);
                        i4 = i5;
                    case -4:
                        c = 3;
                        checkvideopermission.asBinder = new int[]{3, 12, 0, 0};
                        i = 4;
                        checkvideopermission.onExtraCallbackWithResult(i);
                        i4 = i5;
                    case -3:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        obj = checkvideopermission.asInterface;
                        byte[] bArr6 = onActivityResized;
                        Object[] objArr42 = new Object[1];
                        a(bArr6[48], (short) 772, bArr6[9], objArr42);
                        Class<?> cls13 = Class.forName((String) objArr42[0]);
                        byte b6 = bArr6[8];
                        Object[] objArr43 = new Object[1];
                        a(b6, (short) (b6 | 1168), bArr6[102], objArr43);
                        objArr = null;
                        method = cls13.getMethod((String) objArr43[0], null);
                        checkvideopermission.asBinder = method.invoke(obj, objArr);
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -2:
                        checkvideopermission.IAuthTabCallback = 1;
                        checkvideopermission.onExtraCallbackWithResult(2);
                        checkvideopermission.onExtraCallbackWithResult(3);
                        checkvideopermission.asBinder = ((getDjangoNearestImageSize) checkvideopermission.asInterface).asInterface();
                        checkvideopermission.onExtraCallbackWithResult(4);
                        i4 = i5;
                    case -1:
                        i4 = 13;
                    default:
                        i4 = i5;
                }
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Inject
    public getDjangoNearestImageSize(@NotNull Context context, @NotNull zzad zzadVar) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(zzadVar, "");
        this.IAuthTabCallbackDefault = context;
        this.IAuthTabCallbackStubProxy = zzadVar;
        this.access000 = LazyKt.onExtraCallbackWithResult(new PassportMockDataRepository$.ExternalSyntheticLambda0(this));
    }

    private static void b(int i, int i2, char c, Object[] objArr) {
        TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
        long[] jArr = new long[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            int i3 = timelineExternalSyntheticLambda1.IAuthTabCallback;
            jArr[i3] = s5a.onExtraCallbackWithResult.b(getPageByNodeId.c(onActivityLayout[i2 + i3]), i3, onPostMessage, c);
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        char[] cArr = new char[i];
        timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
        while (timelineExternalSyntheticLambda1.IAuthTabCallback < i) {
            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
            HttpDataSourceInvalidResponseCodeException.a(timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr);
    }

    public static final class onExtraCallback {
        public /* synthetic */ onExtraCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private onExtraCallback() {
        }
    }

    private static void d(char[] cArr, int i, Object[] objArr) {
        int i2 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i3 = $10 + 121;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
            cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                int i7 = $11 + 85;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                char c = cArr3[1];
                char c2 = cArr3[0];
                char C = AppNode5.C(c, (c2 + i5) ^ ((c2 << 4) + ((char) (readTypedObject ^ 1094535280733222934L))), c2 >>> 5, extraCallbackWithResult);
                cArr3[1] = C;
                cArr3[0] = AppNode5.C(cArr3[0], (C + i5) ^ ((C << 4) + ((char) (IAuthTabCallback_Parcel ^ 1094535280733222934L))), C >>> 5, access100);
                i5 -= 40503;
            }
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr3[1];
            s3c.asBinder.B(defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void c(int[] iArr, boolean z, byte[] bArr, Object[] objArr) {
        int i = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = getInterfaceDescriptor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = $10 + 5;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            for (int i8 = 0; i8 < length; i8++) {
                cArr2[i8] = EngineConfig1.onNavigationEvent.AnonymousClass4.t(cArr[i8]);
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i9 = $10 + 47;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                        throw null;
                    }
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = Hilt_GlobalLeaveTestActivity$4.p(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                } else {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = getExternalTransactionToken.q(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent], c);
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Hilt_SchemeHistoryActivity$5.w(trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i10 = $10 + 109;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i12 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i12, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i12);
        }
        if (!(!z)) {
            int i13 = $11 + 121;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr6 = new char[i3];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                int i15 = $11 + 49;
                $10 = i15 % 128;
                int i16 = i15 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        String str = new String(cArr3);
        int i17 = $10 + 65;
        $11 = i17 % 128;
        int i18 = i17 % 2;
        objArr[0] = str;
    }

    private final SharedPreferences asInterface() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return (SharedPreferences) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, -139757178, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, 139757178);
    }

    public final boolean onExtraCallbackWithResult() {
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return ((Boolean) onExtraCallback(setApTextSize.onNavigationEvent.4.onNavigationEvent(), new Object[]{this}, 1710769063, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, -1710769062)).booleanValue();
    }

    static void onExtraCallback() {
        getInterfaceDescriptor = new char[]{27260, 27170, 27195, 27256, 27168, 27175, 27177, 27179, 27180, 27175, 27177, 27183, 27177, 27174, 27178, 27275, 27275, 27381, 27385, 27272, 27389, 27384, 27391, 27385, 27273, 27492, 27497, 27494, 27493, 27493, 27479, 27494, 27479, 27490, 27479, 27474, 27481, 27501, 27477, 27497, 27499, 27481, 27490};
        IAuthTabCallback_Parcel = (char) 10377;
        access100 = (char) 32003;
        readTypedObject = (char) 26814;
        extraCallbackWithResult = (char) 8111;
    }

    static void onTransact() {
        char[] cArr = new char[2775];
        ByteBuffer.wrap("íù*}bÈ»-ó\u0098\b\u0001@v\u0098ÐÑ9é¿&\b~i¶ØÏZ\u0007¨\\\u0011\u0094`¬àåS=°z\u0019²\u0099Êè\u0003Q[¢\u0090 ¨\u0095àì9XqÝ\u008e5Æ\u0090\u001eåW~oÈ¤-ü\u00875\u0000Mi\u0085ËÂ8\u001a½S\u0011kp£ÙøT0¨I\u0011\u0081mÙà\u0016I.\u00adg\u0004¿\u0080÷é\fMD¥\u009d Õ\u0095íð*YbÞ»(ó\u008d\u000bã@`\u0098ÒÑ0é\u0099&\u001f~h¶ÑÏ%\u0007¾\\\b\u0094m¬Íå@=©z\r²gÊà\u0003V[¬\u0090\u0018¨\u0081àõ9O\u0011\u000eRé\u0095mÝØ\u0004=L\u0088·\u0011ÿf'Àn)V¯\u0099\u0018Á~\tÖpP¸¹ã\u0018+h\u0013ñZA\u0082 Å\u0016\r\u008fuø¼Aä²/0\u0017\u0099_û\u0086HÎÎ1 y\u0080¡õèoÐØ\u001b:C\u0088\u008a\u0011òl:À}3¥°ì\u0019Ôu\u001cÈGQ\u008f¥ö\u001c>hfî©A\u0091 Ø\u0016\u0000\u008aHø³Aûµ\"-j\u0098Rý\u0095QÝÐ\u00049L\u009d´öÿp'Ùn=V\u0097\u0099\u0010Áy\tÝp0¸°ã\u0019+}\u0013ÐZP\u0082¹Å\u001d\rquð¼Fä»/\b\u0017\u008d_å\u0086@Î¶1$y\u0098¡þè]ÐÐ\u001b%C\u009f\u008bèòq:Å}:¥\u0088ì\rÔa\u001cÀG)\u008f\u00adö\u0003>`fÉ©M\u0091¬Ø\u0000\u0000iHí³Mû \"\tj\u008dRí\u0095@Ý©\u0004.L\u0084´àÿI'În$\b¶Ï2\u0087\u0087^b\u0016×íN¥9}\u009f4v\fðÃG\u009b!S\u008b*\u000fâø¹Bq7I®\u0000\u001fØÿ\u009fVWÖ/§æ\u0002¾âuoMÆ\u0005¥Ü\u0017\u0094\u008ek|#ßû®²/\u008a\u009dA\u007f\u0019ÖÐ[¨'`\u0084'wÿî¶R\u008e?F\u0096\u001d\u0012Õû¬_d(<±ó\u0007Ëá\u0082BZÏ\u0012ºé\u0000¡÷xn0Ú\b¢Ï\u0017\u0087\u0090^x\u0016ßîª¥0}\u00874~\fÊÃQ\u009b'S\u009e*jâð¹Gq>I\u008a\u0000\u0017Øç\u009f^W*/·æ\u0007¾þuJMÓ\u0005§Ü\u0000\u0094ïko#Øû¦²\u0017\u008a\u0092Ax\u0019ßÑ¶¨2`\u009a'\u007fÿÈ¶P\u008e'F\u0082\u001dhÕï¬Fd\"<\u008eó\u000fËæ\u0082BZ-\u0012¯é\u0006¡âxL0Ï\bºÏ\u001f\u0087ö^q\u0016Çî¾¥\b}\u008f4z\fÊÄ·\u009b0S\u009a*\u007fâÖ¹Wq'I\u009e\u0000nØï\u009fYW#/\u0097æ\u000e¾ýu_M6\u0005´Ü\u0007\u0094þkJ#Ûû§²\u0000\u008aíAo\u0019ÆÑ¢¨\u0002`\u008f'xÿÄ··\u008e.F\u009a\u001djíù*}bÈ»-ó\u0098\b\u0001@v\u0098ÐÑ9é¿&\b~q¶ÀÏ@\u0007©\\\t\u0094x¬ÿåU=°z\u0019²\u009aÊè\u0003M[¸\u0090!¨\u0093àð9GqÔ\u008e(Æ\u0091\u001eìW`oÉ¤%ü\u00985\u0001Mu\u0085ÌÂ8\u001a¡S\u0015km£ØøA0µI\u000e\u0081xÙÿ\u0016].°g\u0019¿\u009d÷÷\fPD¹\u009d5Õ\u0088íñ*EbØ»(ó\u0091\u000bå@y\u0098ÈÑ1é\u0085&\u001a~h¶ÏÏ-\u0007 \\\t\u0094m¬Ãå@=©z\u0005²xÊá\u0003U[¤\u0090\u0018¨\u0081àõ9Eq¸\u008e!Æ\u0096\u001eìWXoß¤=ü\u00904ùM~\u0085ÕÂ0\u001a\u0099S\u0015kh£Ñø&0¾I\b\u0081qÙÆ\u0016\\.¨g\u0011¿f÷ÿ\fHD¯\u009d\u0005Õ\u0080íé*Nb » ó\u0097\u000bå@X\u0098ÁÑ<é\u0090!à~|¶ÈÏ1\u0007\u0086\\\u0019\u0094h¬Èå%= z\t²mÊÇ\u0003@[°\u0090\u000e¨xàá9Vqª\u008e\u0018Æ\u0098\u001e÷WPo¹¤=ü\u00934ðM@\u0085ØÂ(\u001a\u0091Ræk}£Èø(0\u0081I\u0000\u0081pÙÊ\u00168.¸g\u0013¿p÷Ù\f^D³\u009d\u0010Õ`íô*Hb±»\u0006ó\u0094\u000bè@Q\u0098¦Ñ5é\u0088!ñ~G¶ÜÏ(\u0007\u008e_ç\u0094`¬Éå/=\u0085z\u0000²iÊÊ\u00038[¿\u0090\u0017¨pàÇ9_q¨\u008e\rÆg\u001eàWRo°¤\u0019ü\u009f4öMP\u0085£Â \u001a\u0089RêkX£Áø70\u008fHø\u0081xÙÝ\u00160.\u0085g\u001d¿h÷Î\f,D \u009d\u0016ÕeíØ*]b·»\u0010óy\u000bÿ@P\u0098°Ñ\u0007é\u009f!è~M¶§Ï \u0007\u0089_ï\u0094A¬Àå)=\u008fuâ²`ÊÉ\u0003/[\u0083\u0090\u0000¨iàÏ9,q \u008e\u0017Æe\u001eØWAoµ¤\u000büx4áM]\u0085°Â\u0005\u001a\u009bRèkJ£¸ø!0\u0097Hå\u0081XÙÁ\u00160.\u008cfø¿a÷Ð\f-D\u0098\u009d\u0001ÕwíÏ*8b¹»\u0014óp\u000bÅ@^\u0098¨Ñ\rég!à~I¶¯Ï\u0000\u0007\u0080_÷\u0094O¬¸å==\u0097uð²YÊØ\u00036[\u0090\u0093ù¨xà×90q\u0099\u008e\u0018Æp\u001eÐW9o¸¤\u0010üp4ÙMX\u0085±Â\u0010\u001aaRýkH£\u00adø\u00050\u0080Hö\u0081DÙ¸\u00169.\u0096fð¿Y÷Ø\f2D\u0090\u009cåÕyíÈ*1b\u0080»\u001bóh\u000bÑ@ \u0098´Ñ\béq!À~U¶¨Ï\u0011\u0007`_õ\u0094H¬±å\u0001=\u009cuè²IÊ§\u0003 [\u0089\u0093é¨EàÀ91q\u0088\u0089øÆa\u001eÑW-o\u0098¤\u0001üq4ÎM8\u0085¹Â\u0011\u001apRÙkY£·ø\u00100aHú\u0081HÙ±\u0016\u0001.\u009ffè¿Q÷¡\f8D\u0088\u009céÕCíÀ*)b\u0089ºáó`\u000bÑ@$\u0098\u0098Ñ\u0001éq!É~8¶¡Ï\u0017\u0007d_Ø\u0094A¬·å\u0004íù*}bÈ»-ó\u0098\b\u0001@v\u0098ÐÑ é´&\b~q¶ÇÏ@\u0007±\\\u0005\u0094x¬áåP=°z\u0002²\u009cÊè\u0003Q[¡\u0090 ¨\u0089àê9XqÁ\u008e7Æ\u0090\u001eùW{oÈ¤*ü\u00855\u0000Mp\u0085ÄÂ8\u001aºS\u0016kp£ÙøT0¨I\u0011\u0081mÙà\u0016I.\u00adg\u0004¿\u0080÷é\fOD¸\u009d8Õ\u009cíð*YbÝ»4ó\u0090\u000bå@`\u0098ÉÑ.é\u0098&\u0001~u¶ÍÏ8\u0007º\\\u0010\u0094p¬Ùå]=¶z\u0010²bÊù\u0003H[ª\u0090\u0002¨\u0080àé9Mq§\u008e Æ\u0089\u001eêWXoÁ¤7ü\u00904ùM{\u0085ÈÂ*\u001a\u0083S\u0000kr£Äø80ºI\u001d\u0081pÙÙ\u0016].°g\u0010¿y÷ý\fQD°\u009d\u0019Õ\u009díò*Pb¹»?ó\u0088\u000bë@D\u0098ÀÑ)é\u008d!â~`¶ÕÏ0\u0007\u0099\\\u001e\u0094h¬Ñå%=»z\b²kÊÅ\u0003@[µ\u0090\u0005¨xàá9Uq¤\u008e\u0018Æ\u009a\u001eòWPo¹¤=ü\u00974ðMY\u0085ÚÂ(\u001a\u0091Rçk`£Éø+0\u0098I\u001b\u0081vÙÐ\u0016#.¿g\b¿q÷Å\fUD¨\u009d\u0011Õfíü*Hb±»\u0006ó\u009d\u000bè@Q\u0098§Ñ é\u0092!ä~X¶ÁÏ6\u0007\u008e_ø\u0094}¬Èå1=\u0086z\u0000²iÊÎ\u0003'[ \u0090\u0013¨hàØ9Aqµ\u008e\u0004Æx\u001eýWUo°¤\u0019ü\u009d4÷MP\u0085¹Â:\u001a\u0088RñkG£Àø)0\u008bHø\u0081zÙÓ\u00160.\u0083g\u001a¿h÷Ñ\f&D¸\u009d\bÕqíÆ*Yb¨»\u0011óf\u000bú@H\u0098«Ñ\u0007é\u0080!ó~K¶¸Ï!\u0007\u0096_ê\u0094X¬Ýå(=\u0091uæ²`ÊÉ\u0003.[\u0083\u0090\u0000¨vàÌ98q¡\u008e\u0016Æd\u001eØWAo±¤\u0010üy4úMH\u0085±Â\u0006\u001a\u0095RèkN£¤ø 0\u0089Hï\u0081DÙÀ\u00163.\u0085fø¿t÷Ô\f0D\u0085\u009d\u001dÕhíÑ*%b¿»\bóq\u000bÂ@@\u0098©Ñ\u000béx!ú~S¶°Ï\f\u0007\u009d_è\u0094Q¬§å==\u0088uñ²GÊÞ\u0003([\u0091\u0093ç¨\u007fàÈ91q\u0086\u008e\u0015Æh\u001eÎW$o ¤\tüo4ØMA\u0085·Â\b\u001axRúkR£°ø\u00190\u009dH÷\u0081PÙ¹\u0016:.\u0088fë¿B÷À\f)D\u008f\u009cçÕ`íÕ*0b\u0099»\u001eóh\u000bÑ@'\u0098¹Ñ\béd!Æ~@¶µÏ\u0005\u0007x_ý\u0094]¬°å\u0019=\u009fuò²PÊ¥\u0003=[\u0088\u0093ñ¨Eàß9(q\u0091\u0089âÆ`\u001eÉW/o\u0083¤\u0000ü|4ÏM8\u0085½Â\u001d\u001apRÙk_£¼ø\u00100cHõ\u0081HÙ¤\u0016\u0004.\u0080fõ¿M÷¸\f!D\u0095\u009cïÕXíÁ*2b\u0090ºùó{\u000bÈ@*\u0098\u0083Ñ\u0000é|!È~8¶¡Ï\u0017\u0007e_Ø\u0094A¬°å\f=xuá²PÊ\u00ad\u0003\u0018[\u0081\u0093÷¨Kà¸94q\u0097\u0089ðÆE\u001eÕW(o\u0091§àü~4ÈM$\u0085\u0082Â\u0000\u001auRÍk8£¡ø\u00150oHØ\u0081AÙ²\u0016\u0010.lfø¿H÷±\f\u0000D\u009f\u009cèÕNí§* b\u0092ºîóX\u000bÔ@3\u0098\u0090Ðìét!È~1¶\u0080Ï\u0018\u0007h_Ñ\u0094 ¬¹å\b=iuØ²ZÊ¨\u0003\u0011[`\u0093ú¨Hà®9\u0000q\u0080\u0089õÆO\u001e¸W:o\u0088§ñü@4ÝM(\u0085\u008bÝø\u001aaRÐk+£\u0098ø\u00010pHÄ\u00818Ù´\u0016\u001d.pfÅ¿]÷¨\f\u000eDl\u009càÕVí¥*\u0018b\u009dº÷óP\u000b¹@8\u0098\u009dÐðéE!Ù~(¶\u0091Îá\u0007|_È\u00941¬\u0081å\u001d=huÑ²!Ê¾\u0003\b[q\u0093Á¨^à¨9\u0011qa\u0089ÿÆH\u001e¥W\u0004o\u0080§öüE4¸M=\u0085\u0097Ýð\u001aYRÙk0£\u0090ûç0\u007fHÈ\u0081-Ù\u0087\u0016\u0000.ifÉ¿!÷ \f\tDi\u009cÂÕ@í©*\tbcºàóI\u000b©@\f\u0098\u0080ÐýéM!¸~5¶\u0096Îð\u0007M_ß\u0094(¬\u0091äæ=zuÈ²1Ê\u0081\u0003\u001f[h\u0093Å¨ à 9\u0015qn\u0089ØÆ]\u001e·W\u0010oy§ùüP4°M\u0005\u0085\u0099Ýè\u001aQR¡k5£\u0088ûñ0BHÜ\u0081(Ù\u0091\u0011â.}fÈ¿1÷\u0082\f\u001dDh\u009cÑÕ!í¿*\bbeºÁó@\u000bµ@\r\u0098xÐýéV!°~\u0005¶\u009fÎè\u0007Q_¡\u00948¬\u0088äï=GuÀ²5Ê\u008f\u0002ø[a\u0093Ò¨.à\u00989\u0001qr\u0089ÏÆ8\u001e¡W\u0012oh§ØüA4²M\b\u0085xÝá\u001aQR¯k\u0018£\u0095ûò0PH¥\u0081=Ù\u0088\u0011î.LfÀ¿6÷\u0085\u000føD}\u009c×Õ0í\u0099*\u0019bpºÐó%\u000b¹@\b\u0098qÐÂéY!¨~\u0011¶bÎú\u0007H_±\u0094\u0002¬\u009bäè=Qu¢²;Ê\u0088\u0002ñ[A\u0093ß¨(à\u008b8åq`\u0089ÕÆ-\u001e\u0098W\u001dov§Ðü%4¿M\b\u0085qÝÁ\u001aXR¨k\r£aûà0IHª\u0081\fÙ\u0080\u0011é.Jf\u00ad¿ ÷\u0089\u000fëDD\u009cÀÕ)í\u0089%ìb`ºÓó0\u000b\u0087@\u001d\u0098hÐÑé#!½~\b¶jÎØ\u0007A_°\u0094\u000b¬xäá=Su®²\u0018Ê\u0095\u0002ó[P\u0093¹¨;à\u00978ðqM\u0089ÔÆ(\u001e\u0091Vão\u007f§Èü14\u0083M\u0018\u0085hÝÎ\u001a$R k\t£kûÁ0@Hµ\u0081\u0005Ùx\u0011á.Sf©¿\u0018÷\u0081\u000fóDJ\u009c¸Õ>í\u0094%ðbYºÛó3\u000b\u0090Cå\u0098uÐÈé1!\u0083~\u001bíù*}bÈ»-ó\u0098\b\u0001@v\u0098ÐÑ9é¿&\b~q¶ÀÏ@\u0007©\\\t\u0094x¬áåR=°z\u0005²\u0080Êé\u0003K[¸\u0090!¨\u009càð9EqÕ\u008e(Æ\u0091\u001eíW`oÉ¤-ü\u00845\u0000Mi\u0085ÍÂ%\u001a S\u0015ke£ØøA0µI\u000e\u0081xÙá\u0016U.¯g\u0018¿\u0081÷õ\fHD¸\u009d!Õ\u0095íé*XbÞ»4ó\u0090\u000bù@}\u0098ÒÑ0é\u0085&\u0015~h¶ÑÏ%\u0007»\\\b\u0094o¬Çå@=·z\u000f²xÊý\u0003T[¬\u0090\u0018¨\u0081àõ9Dq¸\u008e;Æ\u0088\u001eñWEoÚ¤(ü\u00914åMu\u0085ÈÂ-\u001a\u0084S\u001dkh£Éø&0 I\t\u0081nÙÄ\u0016@.µg\t¿x÷á\fVD\u00ad\u009d\u0018Õ\u0081íö*Nb¸»!ó\u0096\u000bï@X\u0098ÁÑ6é\u008f!ø~a¶ÖÏ(\u0007\u0098\\\u001d\u0094t¬Îå8=¾z\u0012²pÊÙ\u0003^[±\u0090\u0010¨gàÿ9Hq\u00ad\u008e\u0007Æ\u0080\u001eéWNo¢¤ ü\u00894îMC\u0085ÀÂ)\u001a\u008eRìk`£Õø00\u0099I\u001b\u0081hÙÑ\u0016,. g\u0015¿e÷Ø\fAD½\u009d\u0010Õyíý*Tb°»\u0019ó\u009d\u000bõ@P\u0098¥Ñ5é\u0088!ñ~E¶ÞÏ(\u0007\u0091_æ\u0094u¬Èå1=\u0087z\u001c²hÊÑ\u0003'[½\u0090\b¨qàÇ9^q¨\u008e\rÆd\u001eÿWHo±¤\u0007ü\u009f4èMI\u0085¢Â \u001a\u0089RïkG£Àø)0\u008fHà\u0081`ÙÖ\u0016,.\u0098g\u0001¿w÷É\f8D½\u009d\u001dÕpíÙ*_b±»\u0010óy\u000bÿ@R\u0098°Ñ\u0005é\u009c!ð~P¶¹Ï?\u0007\u0093_ð\u0094E¬Üå1=\u0090uù²\u007fÊÓ;òüv´Ãm&%\u0093Þ\n\u0096}NÛ\u00072?´ð\u0003¨z`Ë\u0019KÑ¢\u008a\u0002Bszö3Cëº¬\td\u008b\u001câÕ@\u008d³F6~\u009f6áïS§ÊX7\u0010\u009bÈî\u0081w¹Ør;*\u008eã\u0017\u009bwSÛ\u0014)Ì±\u0085\u0003½zuÆ.Kæ¢\u009f\u0006Wo\u000fëÀ^ø®±\u0013i\u008a!þÚF\u0092³K*\u0003\u009e;åüS´Êm>%\u0084Ýó\u0096jNÞ\u0007#?\u0093ð\u0015¨\u007f`Û\u00192Ñ¶\u008a\u001aB{zÎ3^ë£¬\u001adn\u001cñÕC\u008d¢F\u0013~\u00916ãïZ§®X0\u0010\u0083Èà\u0081S¹Êr>*\u0082âó\u009bjSÞ\u0014/Ì\u0093\u0085\u0016½\u007fuÎ.3æ´\u009f\u001aW{\u000fÎÀTø£±\u001ain!þÚC\u0092¤K\f\u0003\u008b;þüD´³m*%\u009dÝç\u0096SNÊ\u0007=?\u0086÷ó¨j`Ý\u0019%Ñ\u0093\u008a\nB}zÅ33ëª¬\u001ddd\u001cÓÕV\u008d¾F\u0007~s6öï]§»X\u000e\u0010\u0094Èã\u0081Z¹\u00adr3*\u0083âä\u009bLSË\u0014>Ì\u0084\u0084ó½juÝ.\"æ\u0093\u009f\nW}\u000fÁÀ3øª±\u001di`!ÓÚJ\u0092½K\u000f\u0003s;öüC´ºm\r%\u008bÝþ\u0096FN®\u0007+?\u009e÷æ¨M`Ë\u0019>Ñ\u0086\u0089ìBkzÂ3%ë\u0086¬\u000bdb\u001cÄÕ/\u008d«F\u0002~d6ÎïK§¢X\u0004\u0010mÈë\u0081^¹¦r\u000b*\u008bââ\u009bDS¬\u0014+Ì\u009e\u0084æ½JuË.\"æ\u0084\u009eìWk\u000fÂÀ$ø\u008b±\u000biz!ÆÚ3\u0092ªK\u001c\u0003b;ÓüV´¾m\u0001%sÝê\u0096\\N¢íù*}bÈ».ó\u0087\b\u0000@i\u0098ÎÑ8é¡&\u0017~p¶ÅÏ@\u0007©\\\b\u0094x¬áåQ=°z\u0019²\u009aÊè\u0003J[¤\u0090 ¨\u0089àë9XqÁ\u008e<Æ\u0090\u001eæW\u007foÈ¤1ü\u008d5\u0000Mi\u0085ÍÂ$\u001a S\tkm£Åø@0²I\b\u0081xÙá\u0016U.®g\u0018¿\u009a÷ñ\fPD¢\u009d:Õ\u0088íñ*Ebß»(ó\u0091\u000bì@`\u0098ÖÑ/é\u0098&\u0001~u¶ÈÏ8\u0007¡\\\u0015\u0094l¬ØåA=µz\t²xÊû\u0003U[°\u0090\u0019¨\u009dàò9Pq¢\u008e9Æ\u0088\u001eêWBoÀ¤)ü\u008d4çM`\u0085ÉÂ$\u001a\u0098S\u001ekw£Ðø90½I\u0013\u0081pÙÙ\u0016].´g\u0010¿y÷ý\f\\D°\u009d\rÕ\u009bíè*Qb¥»5ó\u0088\u000bê@A\u0098ÀÑ2é\u008a!ø~a¶ÕÏ/\u0007\u0098\\\u0001\u0094|¬Ðå&=¿z\b²qÊÆ\u0003\\[¨\u0090\u0011¨eàü9Hq±\u008e\u0006Æ\u009d\u001eèWNo¤¤ ü\u00894îMF\u0085ÀÂ)\u001a\u008bRøka£Üø00\u0086I\u001f\u0081hÙÑ\u0016&.¿g\b¿q÷Å\f\\D¨\u009d\u0011Õfíø*Hb«»\u0005ó\u0080\u000bé@N\u0098¡Ñ é\u0095!í~L¶ÀÏ)\u0007\u008d_ç\u0094`¬Éå$=\u0098z\u001e²wÊÐ\u00039[¾\u0090\u0012¨pàÙ9]q´\u008e\u0010Æy\u001eþWSo°¤\u0019ü\u009e4üMP\u0085¡Â \u001a\u0092RðkY£Þø=0\u0090Hã\u0081`ÙÉ\u0016/.\u0084g\u0000¿i÷Ï\f%D \u009d\u0015ÕmíÍ*@b¶»\u0005óx\u000bý@W\u0098°Ñ\u0019é\u009f!ö~P¶¥Ï9\u0007\u0088_ñ\u0094G¬ßå(=\u0091uç²xÊÈ\u00031[\u0087\u0090\u0019¨hàÑ9'q¹\u008e\bÆq\u001eÇWZo¨¤\rüf4üMH\u0085\u00adÂ\u0006\u001a\u0080RõkO£¸ø!0\u0097Hë\u0081XÙÝ\u00161.\u0090fù¿\u007f÷Ü\f0D\u0099\u009d\u001fÕ}íÐ*9b¸»\u0014óp\u000bÙ@X\u0098´íù*}bÈ»-ó\u0098\b\u0001@v\u0098ÐÑ9é¿&\b~q¶ÀÏ@\u0007µ\\\u0005\u0094x¬áåQ=°z\u0019²\u009aÊè\u0003Q[£\u0090 ¨\u0095àî9EqÀ\u008e)Æ\u0084\u001eøWaoÝ¤0ü\u00995\u001dMt\u0085ÐÂ&\u001a¸S\bkm£Çø@0²I\u0010\u0081yÙý\u0016U.°g\u0003¿\u0080÷é\fMD¦\u009d Õ\u0089íí*GbÀ»5ó\u008e\u000bæ@`\u0098ÑÑ.é\u0098&\u0001~u¶ÈÏ8\u0007½\\\u0011\u0094p¬Ùå]=±z\u0010²yÊý\u0003R[°\u0090\u0019¨\u009dàó9Pq¹\u008e=Æ\u0093\u001eðWYoÝ¤<ü\u00904åM|\u0085ÈÂ-\u001a\u0086S\u001fkh£Éø&0 I\t\u0081mÙÍ\u0016@.·g\u000f¿x÷ý\fWD°\u009d\u0019Õ\u009eíô*Pb¹»>ó\u0095\u000bð@Y\u0098ÞÑ6é\u0090!å~`¶ÉÏ.\u0007\u0098\\\u0001\u0094w¬Ðå9=¸z\b²nÊÄ\u0003@[©\u0090\t¨xàá9Rq°\u008e\u0019Æ\u009b\u001eèWMo¦¤=ü\u00884ñML\u0085ÀÂ)\u001a\u0085Røka£Õø,0\u0098I\u0001\u0081vÙÏ\u00168.½g\u0016¿h÷Ø\fAD¶\u009d\bÕxíý*Vb©»\u0018ó\u0081\u000bö@Híù*}bÈ»-ó\u0098\b\u0001@v\u0098ÐÑ9é¿&\b~q¶ÀÏ@\u0007µ\\\f\u0094b¬àåI=©z\u0018²\u009dÊö\u0003J[¸\u0090!¨\u0092àð9YqÛ\u008e(Æ\u008d\u001eæW}oÈ¤1ü\u008c5\u0000Mi\u0085ÅÂ8\u001a¡S\u0015kl£ØøY0¨I\n\u0081xÙá\u0016U.\u00adg\u0018¿\u009b÷è\fQD¥\u009d>Õ\u0088íñ*Ebß»(ó\u008d\u000bä@~\u0098ÈÑ.é\u0082&\u0000~i¶ÍÏ \u0007 \\\u0017\u0094o¬Øå]=·z\u0010²yÊý\u0003Q[°\u0090\u0019¨\u009dàò9Pq¹\u008e=Æ\u0093\u001eðWYoÝ¤3ü\u00904ùM}\u0085ÜÂ0\u001a\u0085S\u001eks£Ðø%0½I\b\u0081nÙÌ\u0016@.±g\u000e¿x÷á\fUD¥\u009d\u0018Õ\u009díñ*Pb¹»>ó\u0094\u000bð@Y\u0098ÞÑ5é\u0090!ù~~¶ÖÏ0\u0007\u0099\\\u001e\u0094v".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2775);
        onActivityLayout = cArr;
        onPostMessage = -9140410729900004788L;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.getDjangoNearestImageSize.onActivityResized
            int r7 = r7 + 4
            int r6 = r6 + 3
            int r8 = r8 + 97
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r8
            r3 = r2
            r8 = r7
            goto L26
        L11:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-5)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.getDjangoNearestImageSize.a(byte, short, int, java.lang.Object[]):void");
    }
}
