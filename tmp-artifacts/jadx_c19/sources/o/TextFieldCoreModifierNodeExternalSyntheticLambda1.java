package o;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import io.opentelemetry.exporter.otlp.logs.OtlpGrpcLogRecordExporterBuilder$;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class TextFieldCoreModifierNodeExternalSyntheticLambda1 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final String[] IAuthTabCallback;
    private static char IAuthTabCallbackDefault = 0;
    private static char IAuthTabCallbackStub = 0;
    private static int IAuthTabCallback_Parcel = 1;
    private static int asBinder = 0;
    private static int asInterface = 0;
    private static final byte[] onExtraCallback;
    private static char onExtraCallbackWithResult = 0;
    private static char onNavigationEvent = 0;
    private static int onTransact = 1;
    private static final Pattern onWarmupCompleted;

    private static int IAuthTabCallback(int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel;
        int i5 = i4 + 3;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        if (i2 == 66) {
            return 1;
        }
        int i7 = i4 + 27;
        int i8 = i7 % 128;
        asBinder = i8;
        int i9 = i7 % 2;
        if (i2 == 77) {
            return 2;
        }
        if (i2 == 88) {
            return 4;
        }
        int i10 = i8 + 29;
        IAuthTabCallback_Parcel = i10 % 128;
        int i11 = i10 % 2;
        if (i2 == 100) {
            return 8;
        }
        if (i2 == 110) {
            return 16;
        }
        if (i2 != 122) {
            return i2 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static /* synthetic */ Object IAuthTabCallback(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i5;
        int i9 = ~i6;
        int i10 = ~i3;
        int i11 = (~(i9 | i10)) | i8;
        int i12 = ~(i6 | i5);
        int i13 = i3 | i12;
        int i14 = (~(i3 | i5)) | (~(i8 | i9 | i10)) | i12 | (~(i6 | i3));
        int i15 = i6 + i5 + i2 + (1272450877 * i4) + ((-51365948) * i7);
        int i16 = i15 * i15;
        int i17 = ((-261444822) * i6) + 922746880 + ((-1437248296) * i5) + ((-1175803474) * i11) + (i13 * 587901737) + (587901737 * i14) + ((-849346560) * i2) + ((-1881145344) * i4) + ((-578813952) * i7) + ((-124846080) * i16);
        int i18 = (i6 * 1187242746) + 1002376400 + (i5 * 1187242392) + (i11 * (-354)) + (i13 * 177) + (i14 * 177) + (i2 * 1187242569) + (i4 * (-1484311963)) + (i7 * 1141305060) + (i16 * 516358144);
        int i19 = i17 + (i18 * i18 * (-861863936));
        if (i19 == 1) {
            return onExtraCallbackWithResult(objArr);
        }
        if (i19 != 2) {
            return i19 != 3 ? i19 != 4 ? IAuthTabCallback(objArr) : onWarmupCompleted(objArr) : onExtraCallback(objArr);
        }
        String str = (String) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i20 = 2 % 2;
        int i21 = IAuthTabCallback_Parcel + 113;
        asBinder = i21 % 128;
        int i22 = i21 % 2;
        if (strArr.length < 3) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
        } else {
            Matcher matcher = onWarmupCompleted.matcher(strArr[1]);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                Integer numOnExtraCallbackWithResult = onExtraCallbackWithResult(strGroup);
                if (numOnExtraCallbackWithResult == null) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown Dolby Vision profile string: " + strGroup);
                } else {
                    String str2 = strArr[2];
                    Integer numOnNavigationEvent = onNavigationEvent(str2);
                    if (numOnNavigationEvent != null) {
                        return new Pair(numOnExtraCallbackWithResult, numOnNavigationEvent);
                    }
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown Dolby Vision level string: " + str2);
                    int i23 = IAuthTabCallback_Parcel + 111;
                    asBinder = i23 % 128;
                    int i24 = i23 % 2;
                }
            } else {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed Dolby Vision codec string: " + str);
            }
        }
        return null;
    }

    private static int IAuthTabCallbackDefault(int i2) {
        int i3 = 2 % 2;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        int i4 = IAuthTabCallback_Parcel + 109;
        int i5 = i4 % 128;
        asBinder = i5;
        int i6 = i4 % 2;
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 8;
        }
        int i7 = i5 + 89;
        IAuthTabCallback_Parcel = i7 % 128;
        if (i7 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    private static int asInterface(int i2) {
        int i3 = 2 % 2;
        if (i2 == 10) {
            return 1;
        }
        int i4 = asBinder;
        int i5 = i4 + 115;
        int i6 = i5 % 128;
        IAuthTabCallback_Parcel = i6;
        if (i5 % 2 != 0 ? i2 == 11 : i2 == 112) {
            return 2;
        }
        if (i2 == 20) {
            int i7 = i4 + 71;
            IAuthTabCallback_Parcel = i7 % 128;
            if (i7 % 2 != 0) {
                return 4;
            }
            throw null;
        }
        if (i2 == 21) {
            return 8;
        }
        if (i2 == 30) {
            return 16;
        }
        if (i2 == 31) {
            return 32;
        }
        if (i2 == 40) {
            return 64;
        }
        if (i2 == 41) {
            return 128;
        }
        if (i2 == 50) {
            return 256;
        }
        if (i2 == 51) {
            return 512;
        }
        int i8 = i6 + 75;
        int i9 = i8 % 128;
        asBinder = i9;
        if (i8 % 2 == 0) {
            switch (i2) {
                case 60:
                    return 2048;
                case 61:
                    return 4096;
                case 62:
                    return 8192;
            }
        }
        int i10 = 45 / 0;
        switch (i2) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
        }
        int i11 = i9 + 53;
        IAuthTabCallback_Parcel = i11 % 128;
        if (i11 % 2 != 0) {
            return -1;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4 == 2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r4 == 3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        if (r4 == 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        r2 = r2 + 85;
        o.TextFieldCoreModifierNodeExternalSyntheticLambda1.asBinder = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r2 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        r4 = 74 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003b, code lost:
    
        return 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        return 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003f, code lost:
    
        return 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0040, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r4 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r4 != 0) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 91;
        r2 = r1 % 128;
        o.TextFieldCoreModifierNodeExternalSyntheticLambda1.IAuthTabCallback_Parcel = r2;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r4 == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int onExtraCallback(int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder;
        int i5 = i4 + 17;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 16 / 0;
        }
    }

    private static int onExtraCallbackWithResult(int i2) {
        int i3 = 2 % 2;
        int i4 = asBinder;
        int i5 = i4 + 53;
        int i6 = i5 % 128;
        IAuthTabCallback_Parcel = i6;
        Object obj = null;
        if (i5 % 2 == 0) {
            throw null;
        }
        switch (i2) {
            case 0:
                return 1;
            case 1:
                int i7 = i4 + 87;
                IAuthTabCallback_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    return 2;
                }
                obj.hashCode();
                throw null;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                int i8 = i6 + 31;
                asBinder = i8 % 128;
                if (i8 % 2 == 0) {
                    return 512;
                }
                throw null;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                int i9 = i6 + 47;
                asBinder = i9 % 128;
                if (i9 % 2 == 0) {
                    return 4194304;
                }
                throw null;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int onNavigationEvent(int i2) {
        int i3;
        int i4 = 2 % 2;
        if (i2 == 17) {
            return 17;
        }
        int i5 = IAuthTabCallback_Parcel + 63;
        int i6 = i5 % 128;
        asBinder = i6;
        int i7 = i5 % 2;
        if (i2 == 20) {
            return 20;
        }
        if (i2 == 23) {
            return 23;
        }
        if (i2 == 29) {
            return 29;
        }
        int i8 = i6 + 123;
        int i9 = i8 % 128;
        IAuthTabCallback_Parcel = i9;
        if (i8 % 2 != 0) {
            i3 = 39;
            if (i2 != 39) {
            }
            return i3;
        }
        if (i2 == 109) {
            return 65;
        }
        i3 = 42;
        if (i2 != 42) {
            switch (i2) {
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                default:
                    int i10 = i9 + 51;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    return -1;
            }
        }
        return i3;
    }

    private static int onNavigationEvent(int i2, int i3) {
        int i4 = 2 % 2;
        if (i2 == 0) {
            if (i3 != 0) {
                return -1;
            }
            int i5 = asBinder + 5;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return 257;
        }
        if (i2 != 1) {
            int i7 = asBinder + 45;
            IAuthTabCallback_Parcel = i7 % 128;
            int i8 = i7 % 2;
            if (i2 != 2) {
                return -1;
            }
            if (i3 == 1) {
                return 1026;
            }
            return i3 == 2 ? 1028 : -1;
        }
        if (i3 == 0) {
            int i9 = IAuthTabCallback_Parcel + 43;
            asBinder = i9 % 128;
            int i10 = i9 % 2;
            return 513;
        }
        if (i3 != 1) {
            return -1;
        }
        int i11 = IAuthTabCallback_Parcel + 113;
        asBinder = i11 % 128;
        if (i11 % 2 == 0) {
            return 514;
        }
        throw null;
    }

    private static int onWarmupCompleted(int i2) {
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel;
        int i5 = i4 + 51;
        int i6 = i5 % 128;
        asBinder = i6;
        Object obj = null;
        if (i5 % 2 != 0) {
            throw null;
        }
        switch (i2) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                int i7 = i4 + 79;
                asBinder = i7 % 128;
                int i8 = i7 % 2;
                return 16;
            default:
                switch (i2) {
                    case 20:
                        int i9 = i6 + 111;
                        IAuthTabCallback_Parcel = i9 % 128;
                        if (i9 % 2 != 0) {
                            return 32;
                        }
                        obj.hashCode();
                        throw null;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i2) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                                return 1024;
                            default:
                                switch (i2) {
                                    case 40:
                                        int i10 = i4 + 115;
                                        asBinder = i10 % 128;
                                        int i11 = i10 % 2;
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i2) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    static {
        onExtraCallbackWithResult();
        onExtraCallback = new byte[]{0, 0, 0, 1};
        IAuthTabCallback = new String[]{"", "A", "B", "C"};
        onWarmupCompleted = Pattern.compile("^\\D?(\\d+)$");
        int i2 = onTransact + 49;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
    }

    public static Pair<Integer, Integer> onNavigationEvent(byte[] bArr) {
        int i2 = 2 % 2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(9);
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(20);
        Pair<Integer, Integer> pairCreate = Pair.create(Integer.valueOf(textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsCallbackDefault()), Integer.valueOf(iOnMinimized));
        int i3 = asBinder + 49;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return pairCreate;
    }

    public static List<byte[]> onExtraCallback(boolean z) {
        byte[] bArr;
        int i2 = 2 % 2;
        int i3 = asBinder;
        int i4 = i3 + 81;
        IAuthTabCallback_Parcel = i4 % 128;
        int i5 = i4 % 2;
        if (z) {
            int i6 = i3 + 33;
            IAuthTabCallback_Parcel = i6 % 128;
            int i7 = i6 % 2;
            bArr = new byte[]{1};
        } else {
            bArr = new byte[]{0};
            int i8 = i3 + 111;
            IAuthTabCallback_Parcel = i8 % 128;
            int i9 = i8 % 2;
        }
        return Collections.singletonList(bArr);
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4;
        int i5 = 2;
        int i6 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i7 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i8 = $11 + 103;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i10 = $10 + 103;
            $11 = i10 % 128;
            int i11 = 58224;
            if (i10 % i5 == 0) {
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent % i7];
                i3 = 1;
            } else {
                cArr3[i7] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i3 = i7;
            }
            while (i3 < 16) {
                int i12 = $11 + 97;
                $10 = i12 % 128;
                int i13 = i12 % i5;
                char c = cArr3[1];
                char c2 = cArr3[i7];
                int i14 = (c2 + i11) ^ ((c2 << 4) + ((char) (IAuthTabCallbackDefault ^ 1094535280733222934L)));
                int i15 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(IAuthTabCallbackStub);
                    objArr2[i5] = Integer.valueOf(i15);
                    objArr2[1] = Integer.valueOf(i14);
                    objArr2[i7] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char c3 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int iLastIndexOf = 9 - TextUtils.lastIndexOf("", '0', i7, i7);
                        int offsetAfter = 12434 - TextUtils.getOffsetAfter("", i7);
                        Class[] clsArr = new Class[4];
                        clsArr[i7] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[i5] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(c3, iLastIndexOf, offsetAfter, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda12 = defaultGainProviderExternalSyntheticLambda1;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i7]), Integer.valueOf((cCharValue + i11) ^ ((cCharValue << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - Process.getGidForName("")), 10 - (ViewConfiguration.getWindowTouchSlop() >> 8), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12434, -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i11 -= 40503;
                    i3++;
                    defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda12;
                    i5 = 2;
                    i7 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda13 = defaultGainProviderExternalSyntheticLambda1;
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent] = cArr3[0];
            cArr2[defaultGainProviderExternalSyntheticLambda13.onNavigationEvent + 1] = cArr3[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda13, defaultGainProviderExternalSyntheticLambda13};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                i4 = 2;
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getTouchSlop() >> 8) + 16014), (-16777202) - Color.rgb(0, 0, 0), ExpandableListView.getPackedPositionType(0L) + 19901, -1250968944, false, "B", new Class[]{Object.class, Object.class});
            } else {
                i4 = 2;
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            defaultGainProviderExternalSyntheticLambda1 = defaultGainProviderExternalSyntheticLambda13;
            i5 = i4;
            i7 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    public static String onWarmupCompleted(byte[] bArr) {
        int i2 = 2 % 2;
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(bArr);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsService();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(4);
        int iOnMinimized = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        int iOnMinimized2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onMinimized();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(1);
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsService();
        textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsService();
        String strOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted(4);
        if (strOnWarmupCompleted.equals("mp4a")) {
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.ICustomTabsService();
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(2);
            TextFieldDecoratorModifierNodeExternalSyntheticLambda21 textFieldDecoratorModifierNodeExternalSyntheticLambda21 = new TextFieldDecoratorModifierNodeExternalSyntheticLambda21();
            textFieldDecoratorModifierNodeExternalSyntheticLambda21.onWarmupCompleted(textFieldDecoratorModifierNodeExternalSyntheticLambda20);
            int iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(5);
            if (iOnNavigationEvent == 31) {
                int i3 = asBinder + 83;
                IAuthTabCallback_Parcel = i3 % 128;
                int i4 = i3 % 2;
                iOnNavigationEvent = textFieldDecoratorModifierNodeExternalSyntheticLambda21.onNavigationEvent(6) + 32;
            }
            strOnWarmupCompleted = strOnWarmupCompleted + ".40." + iOnNavigationEvent;
        }
        String strOnWarmupCompleted2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("iamf.%03X.%03X.%s", new Object[]{Integer.valueOf(iOnMinimized), Integer.valueOf(iOnMinimized2), strOnWarmupCompleted});
        int i5 = IAuthTabCallback_Parcel + 53;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return strOnWarmupCompleted2;
    }

    public static boolean onExtraCallbackWithResult(List<byte[]> list) {
        int i2 = 2 % 2;
        int i3 = asBinder + 125;
        IAuthTabCallback_Parcel = i3 % 128;
        if (i3 % 2 != 0 ? list.size() == 1 : list.size() == 0) {
            int i4 = asBinder + 115;
            IAuthTabCallback_Parcel = i4 % 128;
            int i5 = i4 % 2;
            if (list.get(0).length == 1 && list.get(0)[0] == 1) {
                return true;
            }
        }
        int i6 = IAuthTabCallback_Parcel + 87;
        asBinder = i6 % 128;
        if (i6 % 2 == 0) {
            return false;
        }
        throw null;
    }

    public static ImmutableList<byte[]> onWarmupCompleted(byte b, byte b2, byte b3, byte b4) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 57;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        ImmutableList<byte[]> immutableListOf = ImmutableList.of(new byte[]{1, 1, b, 2, 1, b2, 3, 1, b3, 4, 1, b4});
        int i5 = asBinder + 53;
        IAuthTabCallback_Parcel = i5 % 128;
        if (i5 % 2 != 0) {
            return immutableListOf;
        }
        throw null;
    }

    public static String onWarmupCompleted(int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = asBinder + 97;
        IAuthTabCallback_Parcel = i6 % 128;
        int i7 = i6 % 2;
        String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        int i8 = asBinder + 33;
        IAuthTabCallback_Parcel = i8 % 128;
        int i9 = i8 % 2;
        return str;
    }

    public static String onExtraCallbackWithResult(int i2, boolean z, int i3, int i4, int[] iArr, int i5) {
        int i6 = 2 % 2;
        int i7 = IAuthTabCallback_Parcel + 117;
        asBinder = i7 % 128;
        int i8 = i7 % 2;
        StringBuilder sb = new StringBuilder(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted("hvc1.%s%d.%X.%c%d", new Object[]{IAuthTabCallback[i2], Integer.valueOf(i3), Integer.valueOf(i4), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i5)}));
        int length = iArr.length;
        while (length > 0) {
            int i9 = IAuthTabCallback_Parcel;
            int i10 = i9 + 47;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            if (iArr[length - 1] != 0) {
                break;
            }
            int i12 = i9 + 3;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            length--;
        }
        for (int i14 = 0; i14 < length; i14++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair<Integer, Integer> IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        char c = 2;
        int i2 = 2 % 2;
        int i3 = asBinder + 61;
        IAuthTabCallback_Parcel = i3 % 128;
        int i4 = i3 % 2;
        String str = basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub;
        if (str == null) {
            int i5 = IAuthTabCallback_Parcel + 103;
            int i6 = i5 % 128;
            asBinder = i6;
            int i7 = i5 % 2;
            int i8 = i6 + 87;
            IAuthTabCallback_Parcel = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            throw null;
        }
        String[] strArrSplit = str.split("\\.");
        if ("video/dolby-vision".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            int i9 = asBinder + 19;
            IAuthTabCallback_Parcel = i9 % 128;
            int i10 = i9 % 2;
            return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit}, 1214340072, -1214340070, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
        }
        String str2 = strArrSplit[0];
        switch (str2.hashCode()) {
            case 2986313:
                if (!str2.equals("ac-4")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case 3004662:
                if (str2.equals("av01")) {
                    c = 1;
                    break;
                }
                break;
            case 3006243:
                if (!str2.equals("avc1")) {
                }
                break;
            case 3006244:
                if (str2.equals("avc2")) {
                    int i11 = IAuthTabCallback_Parcel + 123;
                    asBinder = i11 % 128;
                    if (i11 % 2 == 0) {
                        c = 3;
                        break;
                    }
                }
                break;
            case 3199032:
                if (str2.equals("hev1")) {
                    c = 4;
                    break;
                }
                break;
            case 3214780:
                if (str2.equals("hvc1")) {
                    int i12 = IAuthTabCallback_Parcel + 69;
                    asBinder = i12 % 128;
                    int i13 = i12 % 2;
                    c = 5;
                    break;
                }
                break;
            case 3224753:
                if (!(!str2.equals("iamf"))) {
                    c = 6;
                    break;
                }
                break;
            case 3356560:
                if (str2.equals("mp4a")) {
                    c = 7;
                    break;
                }
                break;
            case 3475740:
                if (str2.equals("s263")) {
                    c = '\b';
                    break;
                }
                break;
            case 3624515:
                if (!(!str2.equals("vp09"))) {
                    c = '\t';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit);
            case 1:
                return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit, basicTextContextMenuProviderKtExternalSyntheticLambda4.onTransact}, -251035179, 251035179, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            case 2:
            case 3:
                return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit}, -2067831708, 2067831711, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            case 4:
            case 5:
                return onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit, basicTextContextMenuProviderKtExternalSyntheticLambda4.onTransact);
            case 6:
                return asBinder(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit);
            case 7:
                return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit}, 396479074, -396479070, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            case '\b':
                return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit}, 2136318528, -2136318527, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
            case '\t':
                return IAuthTabCallbackStub(basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub, strArrSplit);
            default:
                return null;
        }
    }

    public static Pair<Integer, Integer> onExtraCallback(String str, String[] strArr, @Nullable TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        int i4 = IAuthTabCallback_Parcel + 77;
        asBinder = i4 % 128;
        if (i4 % 2 == 0 ? strArr.length < 4 : strArr.length < 2) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        Matcher matcher = onWarmupCompleted.matcher(strArr[1]);
        if (!matcher.matches()) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String strGroup = matcher.group(1);
        Object[] objArr = new Object[1];
        a(new char[]{20318, 22407}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
        if (((String) objArr[0]).intern().equals(strGroup)) {
            i2 = 1;
        } else {
            int i5 = IAuthTabCallback_Parcel + 121;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr2 = new Object[1];
            a(new char[]{13803, 3505}, 1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
            if (((String) objArr2[0]).intern().equals(strGroup)) {
                int i7 = IAuthTabCallback_Parcel + 39;
                asBinder = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                if (textToolbarHelperApi28ExternalSyntheticLambda1 == null || textToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallbackStub != 6) {
                    int i8 = IAuthTabCallback_Parcel + 5;
                    asBinder = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = 5 / 5;
                    }
                } else {
                    int i10 = IAuthTabCallback_Parcel + 41;
                    asBinder = i10 % 128;
                    i2 = i10 % 2 != 0 ? 18475 : 4096;
                }
            } else {
                if (!"6".equals(strGroup)) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown HEVC profile string: " + strGroup);
                    return null;
                }
                i2 = 6;
            }
        }
        String str2 = strArr[3];
        Integer numIAuthTabCallback = IAuthTabCallback(str2);
        if (numIAuthTabCallback == null) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown HEVC level string: " + str2);
            return null;
        }
        return new Pair<>(Integer.valueOf(i2), numIAuthTabCallback);
    }

    public static byte[] IAuthTabCallback(byte[] bArr, int i2, int i3) {
        byte[] bArr2;
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback_Parcel + 77;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            byte[] bArr3 = onExtraCallback;
            bArr2 = new byte[bArr3.length / i3];
            System.arraycopy(bArr3, 0, bArr2, 1, bArr3.length);
            System.arraycopy(bArr, i2, bArr2, bArr3.length, i3);
        } else {
            byte[] bArr4 = onExtraCallback;
            bArr2 = new byte[bArr4.length + i3];
            System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
            System.arraycopy(bArr, i2, bArr2, bArr4.length, i3);
        }
        int i6 = asBinder + 117;
        IAuthTabCallback_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            return bArr2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) throws NumberFormatException {
        String str = (String) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i2 = 2 % 2;
        Pair pair = new Pair(1, 1);
        if (strArr.length < 3) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            int i3 = IAuthTabCallback_Parcel + 91;
            asBinder = i3 % 128;
            int i4 = i3 % 2;
            return pair;
        }
        try {
            Pair pair2 = new Pair(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
            int i5 = asBinder + 93;
            IAuthTabCallback_Parcel = i5 % 128;
            int i6 = i5 % 2;
            return pair2;
        } catch (NumberFormatException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws NumberFormatException {
        int i2;
        int i3;
        String str = (String) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i4 = 2 % 2;
        if (strArr.length < 2) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                int i5 = asBinder + 9;
                IAuthTabCallback_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    i2 = Integer.parseInt(strArr[1].substring(1, 5), 98);
                    i3 = Integer.parseInt(strArr[0].substring(3), 106);
                } else {
                    int i6 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                    i3 = Integer.parseInt(strArr[1].substring(4), 16);
                    i2 = i6;
                }
            } else {
                if (strArr.length < 3) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int i7 = asBinder + 119;
                IAuthTabCallback_Parcel = i7 % 128;
                int i8 = i7 % 2;
                i2 = Integer.parseInt(strArr[1]);
                i3 = Integer.parseInt(strArr[2]);
                int i9 = asBinder + 107;
                IAuthTabCallback_Parcel = i9 % 128;
                int i10 = i9 % 2;
            }
            int iIAuthTabCallback = IAuthTabCallback(i2);
            if (iIAuthTabCallback == -1) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown AVC profile: " + i2);
                return null;
            }
            int iOnWarmupCompleted = onWarmupCompleted(i3);
            if (iOnWarmupCompleted != -1) {
                return new Pair(Integer.valueOf(iIAuthTabCallback), Integer.valueOf(iOnWarmupCompleted));
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown AVC level: " + i3);
            return null;
        } catch (NumberFormatException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    private static Pair<Integer, Integer> IAuthTabCallbackStub(String str, String[] strArr) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 91;
        asBinder = i3 % 128;
        if (i3 % 2 == 0 ? strArr.length < 3 : strArr.length < 5) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int i4 = Integer.parseInt(strArr[1]);
            int i5 = Integer.parseInt(strArr[2]);
            int iIAuthTabCallbackDefault = IAuthTabCallbackDefault(i4);
            if (iIAuthTabCallbackDefault == -1) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown VP9 profile: " + i4);
                int i6 = asBinder + 115;
                IAuthTabCallback_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 46 / 0;
                }
                return null;
            }
            int iAsInterface = asInterface(i5);
            if (iAsInterface == -1) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown VP9 level: " + i5);
                return null;
            }
            return new Pair<>(Integer.valueOf(iIAuthTabCallbackDefault), Integer.valueOf(iAsInterface));
        } catch (NumberFormatException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws NumberFormatException {
        int i2;
        String str = (String) objArr[0];
        int i3 = 1;
        String[] strArr = (String[]) objArr[1];
        TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1 = (TextToolbarHelperApi28ExternalSyntheticLambda1) objArr[2];
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback_Parcel + 49;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (strArr.length < 4) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int i7 = Integer.parseInt(strArr[1]);
            int i8 = Integer.parseInt(strArr[2].substring(0, 2));
            int i9 = Integer.parseInt(strArr[3]);
            if (i7 != 0) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown AV1 profile: " + i7);
                int i10 = IAuthTabCallback_Parcel + 49;
                asBinder = i10 % 128;
                if (i10 % 2 == 0) {
                    return null;
                }
                throw null;
            }
            if (i9 != 8) {
                int i11 = asBinder + 91;
                IAuthTabCallback_Parcel = i11 % 128;
                if (i11 % 2 != 0 ? i9 != 10 : i9 != 53) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown AV1 bit depth: " + i9);
                    return null;
                }
            }
            if (i9 != 8) {
                int i12 = asBinder + 31;
                IAuthTabCallback_Parcel = i12 % 128;
                if (i12 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
                i3 = (textToolbarHelperApi28ExternalSyntheticLambda1 == null || !(textToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallbackDefault != null || (i2 = textToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallbackStub) == 7 || i2 == 6)) ? 2 : 4096;
            }
            int iOnExtraCallbackWithResult = onExtraCallbackWithResult(i8);
            if (iOnExtraCallbackWithResult != -1) {
                return new Pair(Integer.valueOf(i3), Integer.valueOf(iOnExtraCallbackWithResult));
            }
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown AV1 level: " + i8);
            return null;
        } catch (NumberFormatException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r9 != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        int iOnNavigationEvent;
        String str = (String) objArr[0];
        String[] strArr = (String[]) objArr[1];
        int i2 = 2 % 2;
        if (strArr.length != 3) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if (!(true ^ "audio/mp4a-latm".equals(AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onNavigationEvent(Integer.parseInt(strArr[1], 16))))) {
                int i3 = asBinder + 27;
                IAuthTabCallback_Parcel = i3 % 128;
                if (i3 % 2 == 0) {
                    iOnNavigationEvent = onNavigationEvent(Integer.parseInt(strArr[5]));
                    if (iOnNavigationEvent != -1) {
                        return new Pair(Integer.valueOf(iOnNavigationEvent), 0);
                    }
                } else {
                    iOnNavigationEvent = onNavigationEvent(Integer.parseInt(strArr[2]));
                }
            }
        } catch (NumberFormatException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed MP4A codec string: " + str);
        }
        int i4 = asBinder + 15;
        IAuthTabCallback_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static Pair<Integer, Integer> IAuthTabCallback(String str, String[] strArr) throws NumberFormatException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 109;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0 ? strArr.length != 4 : strArr.length != 2) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
        try {
            int i4 = Integer.parseInt(strArr[1]);
            int i5 = Integer.parseInt(strArr[2]);
            int i6 = Integer.parseInt(strArr[3]);
            int iOnNavigationEvent = onNavigationEvent(i4, i5);
            if (iOnNavigationEvent == -1) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown AC-4 profile: " + i4 + "." + i5);
                int i7 = IAuthTabCallback_Parcel + 121;
                asBinder = i7 % 128;
                if (i7 % 2 == 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int iOnExtraCallback = onExtraCallback(i6);
            if (iOnExtraCallback == -1) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Unknown AC-4 level: " + i6);
                return null;
            }
            return new Pair<>(Integer.valueOf(iOnNavigationEvent), Integer.valueOf(iOnExtraCallback));
        } catch (NumberFormatException unused) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed AC-4 codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Pair<Integer, Integer> asBinder(String str, String[] strArr) throws NumberFormatException {
        char c;
        int i2 = 2;
        int i3 = 2 % 2;
        if (strArr.length < 4) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring malformed IAMF codec string: " + str);
            return null;
        }
        try {
            int i4 = Integer.parseInt(strArr[1]);
            String str2 = strArr[3];
            switch (str2.hashCode()) {
                case 2464863:
                    if (!str2.equals("Opus")) {
                        c = 65535;
                        break;
                    } else {
                        int i5 = IAuthTabCallback_Parcel + 61;
                        asBinder = i5 % 128;
                        if (i5 % 2 == 0) {
                            c = 0;
                            break;
                        } else {
                            c = 1;
                            break;
                        }
                    }
                case 3114792:
                    if (!(!str2.equals("fLaC"))) {
                    }
                    break;
                case 3238865:
                    if (str2.equals("ipcm")) {
                        int i6 = asBinder + 47;
                        IAuthTabCallback_Parcel = i6 % 128;
                        int i7 = i6 % 2;
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3356560:
                    if (str2.equals("mp4a")) {
                        int i8 = asBinder + 83;
                        IAuthTabCallback_Parcel = i8 % 128;
                        if (i8 % 2 != 0) {
                            c = 3;
                            break;
                        } else {
                            c = 2;
                            break;
                        }
                    }
                    break;
            }
            if (c == 0) {
                i2 = 1;
            } else if (c == 1) {
                i2 = 4;
            } else if (c == 2) {
                i2 = 8;
            } else if (c != 3) {
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("CodecSpecificDataUtil", "Ignoring unknown codec identifier for IAMF auxiliary profile: " + strArr[3]);
                return null;
            }
            return new Pair<>(Integer.valueOf((1 << (i4 + 16)) | 16777216 | i2), 0);
        } catch (NumberFormatException e) {
            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("CodecSpecificDataUtil", "Ignoring malformed primary profile in IAMF codec string: " + strArr[1], e);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Integer IAuthTabCallback(@Nullable String str) {
        int i2 = 2 % 2;
        char c = 0;
        if (str == null) {
            int i3 = asBinder + 29;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 69 / 0;
            }
            return null;
        }
        switch (str.hashCode()) {
            case 70821:
                if (!str.equals("H30")) {
                    c = 65535;
                    break;
                } else {
                    int i5 = asBinder + 71;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    break;
                }
            case 70914:
                if (str.equals("H60")) {
                    c = 1;
                    break;
                }
                break;
            case 70917:
                if (str.equals("H63")) {
                    c = 2;
                    break;
                }
                break;
            case 71007:
                if (str.equals("H90")) {
                    int i7 = asBinder + 107;
                    int i8 = i7 % 128;
                    IAuthTabCallback_Parcel = i8;
                    int i9 = i7 % 2;
                    int i10 = i8 + 125;
                    asBinder = i10 % 128;
                    int i11 = i10 % 2;
                    c = 3;
                    break;
                }
                break;
            case 71010:
                if (str.equals("H93")) {
                    c = 4;
                    break;
                }
                break;
            case 74665:
                if (str.equals("L30")) {
                    c = 5;
                    break;
                }
                break;
            case 74758:
                if (str.equals("L60")) {
                    c = 6;
                    break;
                }
                break;
            case 74761:
                if (str.equals("L63")) {
                    c = 7;
                    break;
                }
                break;
            case 74851:
                if (!(!str.equals("L90"))) {
                    int i12 = asBinder + 5;
                    IAuthTabCallback_Parcel = i12 % 128;
                    int i13 = i12 % 2;
                    c = '\b';
                    break;
                }
                break;
            case 74854:
                if (str.equals("L93")) {
                    c = '\t';
                    break;
                }
                break;
            case 2193639:
                if (!(!str.equals("H120"))) {
                    c = '\n';
                    break;
                }
                break;
            case 2193642:
                if (str.equals("H123")) {
                    c = 11;
                    break;
                }
                break;
            case 2193732:
                if (str.equals("H150")) {
                    int i14 = IAuthTabCallback_Parcel + 17;
                    asBinder = i14 % 128;
                    int i15 = i14 % 2;
                    c = '\f';
                    break;
                }
                break;
            case 2193735:
                if (str.equals("H153")) {
                    c = '\r';
                    break;
                }
                break;
            case 2193738:
                if (str.equals("H156")) {
                    c = 14;
                    break;
                }
                break;
            case 2193825:
                if (str.equals("H180")) {
                    int i16 = IAuthTabCallback_Parcel + 81;
                    asBinder = i16 % 128;
                    int i17 = i16 % 2;
                    c = 15;
                    break;
                }
                break;
            case 2193828:
                if (str.equals("H183")) {
                    c = 16;
                    break;
                }
                break;
            case 2193831:
                if (str.equals("H186")) {
                    c = 17;
                    break;
                }
                break;
            case 2312803:
                if (str.equals("L120")) {
                    int i18 = IAuthTabCallback_Parcel + 109;
                    asBinder = i18 % 128;
                    int i19 = i18 % 2;
                    c = 18;
                    break;
                }
                break;
            case 2312806:
                if (str.equals("L123")) {
                    c = 19;
                    break;
                }
                break;
            case 2312896:
                if (str.equals("L150")) {
                    c = 20;
                    break;
                }
                break;
            case 2312899:
                if (str.equals("L153")) {
                    c = 21;
                    break;
                }
                break;
            case 2312902:
                if (str.equals("L156")) {
                    c = 22;
                    break;
                }
                break;
            case 2312989:
                if (str.equals("L180")) {
                    int i20 = asBinder + 35;
                    IAuthTabCallback_Parcel = i20 % 128;
                    int i21 = i20 % 2;
                    c = 23;
                    break;
                }
                break;
            case 2312992:
                if (str.equals("L183")) {
                    c = 24;
                    break;
                }
                break;
            case 2312995:
                if (str.equals("L186")) {
                    int i22 = asBinder + 85;
                    IAuthTabCallback_Parcel = i22 % 128;
                    if (i22 % 2 != 0) {
                        c = 25;
                        break;
                    } else {
                        c = 'n';
                        break;
                    }
                }
                break;
        }
        switch (c) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Integer onExtraCallbackWithResult(@Nullable String str) {
        char c;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback_Parcel + 11;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        if (str == null) {
            return null;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != 1567) {
            c = 0;
            switch (iHashCode) {
                case 1536:
                    if (!str.equals("00")) {
                        c = 65535;
                        break;
                    }
                    break;
                case 1537:
                    if (str.equals("01")) {
                        int i5 = asBinder + 115;
                        IAuthTabCallback_Parcel = i5 % 128;
                        if (i5 % 2 != 0) {
                            c = 1;
                            break;
                        }
                    }
                    break;
                case 1538:
                    if (str.equals("02")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1539:
                    if (str.equals("03")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1540:
                    if (str.equals("04")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1541:
                    if (str.equals("05")) {
                        int i6 = asBinder + 65;
                        IAuthTabCallback_Parcel = i6 % 128;
                        int i7 = i6 % 2;
                        c = 5;
                        break;
                    }
                    break;
                case 1542:
                    if (str.equals("06")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1543:
                    if (str.equals("07")) {
                        int i8 = asBinder + 93;
                        IAuthTabCallback_Parcel = i8 % 128;
                        int i9 = i8 % 2;
                        c = 7;
                        break;
                    }
                    break;
                case 1544:
                    if (str.equals("08")) {
                        int i10 = asBinder + 77;
                        IAuthTabCallback_Parcel = i10 % 128;
                        int i11 = i10 % 2;
                        c = '\b';
                        break;
                    }
                    break;
                case 1545:
                    if (str.equals("09")) {
                        c = '\t';
                        break;
                    }
                    break;
            }
        } else if (str.equals("10")) {
            c = '\n';
        }
        switch (c) {
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Integer onNavigationEvent(@Nullable String str) {
        int i2 = 2 % 2;
        char c = 5;
        if (str == null) {
            int i3 = asBinder + 5;
            IAuthTabCallback_Parcel = i3 % 128;
            if (i3 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int iHashCode = str.hashCode();
        switch (iHashCode) {
            case 1537:
                if (!str.equals("01")) {
                    c = 65535;
                    break;
                } else {
                    int i4 = IAuthTabCallback_Parcel + 23;
                    asBinder = i4 % 128;
                    if (i4 % 2 == 0) {
                        c = 0;
                        break;
                    } else {
                        c = 1;
                        break;
                    }
                }
            case 1538:
                if (str.equals("02")) {
                }
                break;
            case 1539:
                if (str.equals("03")) {
                    int i5 = asBinder + 105;
                    IAuthTabCallback_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    c = 2;
                    break;
                }
                break;
            case 1540:
                if (str.equals("04")) {
                    int i7 = asBinder + 11;
                    IAuthTabCallback_Parcel = i7 % 128;
                    int i8 = i7 % 2;
                    c = 3;
                    break;
                }
                break;
            case 1541:
                if (str.equals("05")) {
                    c = 4;
                    break;
                }
                break;
            case 1542:
                if (!str.equals("06")) {
                }
                break;
            case 1543:
                if (!(!str.equals("07"))) {
                    c = 6;
                    break;
                }
                break;
            case 1544:
                if (str.equals("08")) {
                    c = 7;
                    break;
                }
                break;
            case 1545:
                if (str.equals("09")) {
                    int i9 = asBinder + 57;
                    IAuthTabCallback_Parcel = i9 % 128;
                    int i10 = i9 % 2;
                    c = '\b';
                    break;
                }
                break;
            default:
                switch (iHashCode) {
                    case 1567:
                        if (str.equals("10")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 1568:
                        if (!(!str.equals("11"))) {
                            int i11 = asBinder + 113;
                            IAuthTabCallback_Parcel = i11 % 128;
                            int i12 = i11 % 2;
                            c = '\n';
                            break;
                        }
                        break;
                    case 1569:
                        if (str.equals("12")) {
                            int i13 = asBinder + 41;
                            int i14 = i13 % 128;
                            IAuthTabCallback_Parcel = i14;
                            int i15 = i13 % 2;
                            int i16 = i14 + 79;
                            asBinder = i16 % 128;
                            int i17 = i16 % 2;
                            c = 11;
                            break;
                        }
                        break;
                    case 1570:
                        if (str.equals("13")) {
                            c = '\f';
                            break;
                        }
                        break;
                }
        }
        switch (c) {
            case 0:
                int i18 = asBinder + 63;
                IAuthTabCallback_Parcel = i18 % 128;
                int i19 = i18 % 2;
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case '\b':
                return 256;
            case '\t':
                return 512;
            case '\n':
                return 1024;
            case 11:
                return 2048;
            case '\f':
                return 4096;
            default:
                return null;
        }
    }

    private static Pair<Integer, Integer> onExtraCallbackWithResult(String str, String[] strArr) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{str, strArr}, 396479074, -396479070, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static Pair<Integer, Integer> IAuthTabCallback(String str, String[] strArr, @Nullable TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{str, strArr, textToolbarHelperApi28ExternalSyntheticLambda1}, -251035179, 251035179, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static Pair<Integer, Integer> onWarmupCompleted(String str, String[] strArr) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{str, strArr}, -2067831708, 2067831711, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static Pair<Integer, Integer> onExtraCallback(String str, String[] strArr) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{str, strArr}, 1214340072, -1214340070, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    private static Pair<Integer, Integer> onNavigationEvent(String str, String[] strArr) {
        int iOnWarmupCompleted = OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted();
        return (Pair) IAuthTabCallback(OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), iOnWarmupCompleted, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted(), new Object[]{str, strArr}, 2136318528, -2136318527, OtlpGrpcLogRecordExporterBuilder$.ExternalSyntheticLambda0.onWarmupCompleted());
    }

    static void onExtraCallbackWithResult() {
        onExtraCallbackWithResult = (char) 57563;
        onNavigationEvent = (char) 33100;
        IAuthTabCallbackDefault = (char) 35060;
        IAuthTabCallbackStub = (char) 43718;
    }
}
