package o;

import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import viva.republica.toss.analytics.appsflyer.CampaignDeepLinkFetcherImpl$;
import viva.republica.toss.main.more.push.NotificationMarketingSettingActivity$$ExternalSyntheticLambda29;
import viva.republica.toss.network.api.TossLogApi;
import viva.republica.toss.network.model.campaign.Result;

/* loaded from: /Users/1004276/Downloads/toss/tmp-artifacts/target-app/dex/toss_alldex/classes14.dex */
public final class DERSequenceParser implements copyLicense {
    private static short[] IAuthTabCallbackStub;
    private final TossLogApi onExtraCallback;
    private static final byte[] $$a = {79, 9, 94, -7};
    private static final int $$b = 130;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asInterface = 0;
    private static int asBinder = 1;
    private static int IAuthTabCallback = 1198285605;
    private static int onWarmupCompleted = -1538795440;
    private static int onExtraCallbackWithResult = 2008338666;
    private static byte[] onNavigationEvent = {90, -93, 83, -92, -88, 74, -83, 90, -119, 116, -88, 73, -88, -125, 118, -90, -91, -118, 22, 16, -22, -31, 18, -81, 81, -20, 6, -26, 22, -81, 92, 20, -20, 20, 21, -30, -23, -24, -83, 91, -18, 23, -31, 24, -22, -27, 23, 8, 8};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String $$c(int r6, byte r7, int r8) {
        /*
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = o.DERSequenceParser.$$a
            int r6 = r6 * 2
            int r6 = 4 - r6
            int r7 = r7 * 4
            int r7 = 115 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = -r6
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DERSequenceParser.$$c(int, byte, int):java.lang.String");
    }

    public static /* synthetic */ String IAuthTabCallback(Result result) {
        int i = 2 % 2;
        int i2 = asInterface + 115;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            return onWarmupCompleted(result);
        }
        onWarmupCompleted(result);
        throw null;
    }

    public static /* synthetic */ Unit IAuthTabCallback(Throwable th) {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        int iIAuthTabCallback = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        Unit unit = (Unit) onExtraCallback(iIAuthTabCallback, new Object[]{th}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1816107522, 1816107522, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
        int i4 = asInterface + 25;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return unit;
    }

    public static /* synthetic */ boolean IAuthTabCallback(String str) {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnNavigationEvent = onNavigationEvent(str);
        int i4 = asBinder + 27;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return zOnNavigationEvent;
    }

    public static /* synthetic */ Object onExtraCallback(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = (~(i7 | i)) | i4;
        int i9 = i | i4 | i7;
        int i10 = i4 + i3 + i6 + (1159740906 * i5) + ((-617157175) * i2);
        int i11 = i10 * i10;
        int i12 = ((i4 * 934236018) - 2089811968) + (934236018 * i3) + (i8 * (-953110385)) + ((-953110385) * i9) + (953110385 * i7) + ((-18874368) * i6) + (1488977920 * i5) + (2111832064 * i2) + (2070937600 * i11);
        int i13 = (i4 * (-824977050)) + 1921657099 + (i3 * (-824977050)) + (i8 * (-923)) + (i9 * (-923)) + (i7 * 923) + (i6 * (-824977973)) + (i5 * (-135083378)) + (i2 * 1125239651) + (i11 * 298844160);
        int i14 = i12 + (i13 * i13 * 2098200576);
        if (i14 == 1) {
            return onNavigationEvent(objArr);
        }
        if (i14 != 2) {
            return onExtraCallback(objArr);
        }
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i15 = 2 % 2;
        int i16 = asBinder + 15;
        asInterface = i16 % 128;
        int i17 = i16 % 2;
        String strIAuthTabCallback = IAuthTabCallback(function1, obj);
        int i18 = asInterface + 125;
        asBinder = i18 % 128;
        int i19 = i18 % 2;
        return strIAuthTabCallback;
    }

    public static /* synthetic */ boolean onExtraCallback(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 49;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        boolean zOnTransact = onTransact(function1, obj);
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
        return zOnTransact;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        Function1 function1 = (Function1) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = asInterface + 17;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        asBinder(function1, obj);
        if (i3 == 0) {
            throw null;
        }
        int i4 = asBinder + 37;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
        return null;
    }

    public static /* synthetic */ Unit onNavigationEvent(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = asInterface + 81;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        Unit unitOnExtraCallback = onExtraCallback(function1, str);
        int i4 = asBinder + 45;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
        return unitOnExtraCallback;
    }

    public static /* synthetic */ void onWarmupCompleted(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 21;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        IAuthTabCallbackStub(function1, obj);
        if (i3 != 0) {
            int i4 = 41 / 0;
        }
        int i5 = asInterface + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
    }

    @Inject
    public DERSequenceParser(@NotNull TossLogApi tossLogApi) {
        Intrinsics.checkNotNullParameter(tossLogApi, "");
        this.onExtraCallback = tossLogApi;
    }

    private static final String IAuthTabCallback(Function1 function1, Object obj) {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 63;
        asInterface = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            str = (String) function1.invoke(obj);
            int i3 = 22 / 0;
        } else {
            Intrinsics.checkNotNullParameter(obj, "");
            str = (String) function1.invoke(obj);
        }
        int i4 = asInterface + 9;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    private static final String onWarmupCompleted(Result result) {
        int i = 2 % 2;
        int i2 = asInterface + 79;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(result, "");
            result.onNavigationEvent();
            throw null;
        }
        Intrinsics.checkNotNullParameter(result, "");
        String strOnNavigationEvent = result.onNavigationEvent();
        int i3 = asBinder + 105;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return strOnNavigationEvent;
        }
        throw null;
    }

    private static final boolean onNavigationEvent(String str) {
        int i = 2 % 2;
        int i2 = asInterface + 65;
        asBinder = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            return mergeParams.onExtraCallbackWithResult(str);
        }
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = 35 / 0;
        return mergeParams.onExtraCallbackWithResult(str);
    }

    private static final boolean onTransact(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asInterface + 97;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            Intrinsics.checkNotNullParameter(obj, "");
            ((Boolean) function1.invoke(obj)).booleanValue();
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        Intrinsics.checkNotNullParameter(obj, "");
        boolean zBooleanValue = ((Boolean) function1.invoke(obj)).booleanValue();
        int i3 = asInterface + 73;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        return zBooleanValue;
    }

    private static final void IAuthTabCallbackStub(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        if (i3 != 0) {
            int i4 = 58 / 0;
        }
        int i5 = asInterface + 55;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 90 / 0;
        }
    }

    private static final void asBinder(Function1 function1, Object obj) {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        function1.invoke(obj);
        int i4 = asBinder + 115;
        asInterface = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Unit onExtraCallback(Function1 function1, String str) {
        int i = 2 % 2;
        int i2 = asBinder + 15;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNull(str);
        function1.invoke(str);
        Unit unit = Unit.INSTANCE;
        if (i3 == 0) {
            return unit;
        }
        throw null;
    }

    public void onExtraCallbackWithResult(@NotNull String str, @Nullable String str2, @Nullable String str3, @NotNull Function1<? super String, Unit> function1) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        JsonReaderUnknownNumberParsing<getAttributeSet> jsonReaderUnknownNumberParsingOnExtraCallback = this.onExtraCallback.onExtraCallback(new AdViewConstructorParams(str, str2, str3));
        Object obj = null;
        jsonReaderUnknownNumberParsingOnExtraCallback.onWarmupCompleted(UtilsKtExternalSyntheticLambda17.onNavigationEvent((MapConverter) null, (MapConverter) null, 1, (Object) null)).onNavigationEvent(new CampaignDeepLinkFetcherImpl$.ExternalSyntheticLambda1(new CampaignDeepLinkFetcherImpl$.ExternalSyntheticLambda0())).onWarmupCompleted(new CampaignDeepLinkFetcherImpl$.ExternalSyntheticLambda3(new CampaignDeepLinkFetcherImpl$.ExternalSyntheticLambda2())).onWarmupCompleted(new CampaignDeepLinkFetcherImpl$.ExternalSyntheticLambda5(new CampaignDeepLinkFetcherImpl$.ExternalSyntheticLambda4(function1)), new CampaignDeepLinkFetcherImpl$.ExternalSyntheticLambda7(new CampaignDeepLinkFetcherImpl$.ExternalSyntheticLambda6()));
        int i2 = asBinder + 49;
        asInterface = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws Throwable {
        Throwable th = (Throwable) objArr[0];
        int i = 2 % 2;
        int i2 = asBinder + 85;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        ConvertFloatArrayToByteArray convertFloatArrayToByteArray = ConvertFloatArrayToByteArray.onExtraCallbackWithResult;
        Object[] objArr2 = new Object[1];
        a((short) TextUtils.getOffsetBefore("", 0), (byte) (View.combineMeasuredStates(0, 0) - 83), 483673299 - KeyEvent.getDeadChar(0, 0), 739047263 + ExpandableListView.getPackedPositionType(0L), TextUtils.getTrimmedLength("") - 69, objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        a((short) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (byte) ((KeyEvent.getMaxKeyCode() >> 16) - 31), 483673317 + (ViewConfiguration.getTouchSlop() >> 8), 739047297 - TextUtils.getTrimmedLength(""), (-58) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3);
        ConvertFloatArrayToByteArray.IAuthTabCallback(convertFloatArrayToByteArray, strIntern, ((String) objArr3[0]).intern(), th, (Map) null, 8, (Object) null);
        Unit unit = Unit.INSTANCE;
        int i4 = asBinder + 49;
        asInterface = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 69 / 0;
        }
        return unit;
    }

    private static void a(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onWarmupCompleted)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            long j = 0;
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - TextUtils.getTrimmedLength("")), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22438, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr = onNavigationEvent;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 12843);
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 55;
                            int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 2166;
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(offsetBefore, capsMode, i7, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i6++;
                        int i8 = $11 + 9;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IAuthTabCallback)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43425 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 42 - TextUtils.getOffsetBefore("", 0), 22439 - View.MeasureSpec.getSize(0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                } else {
                    iIntValue = (short) (((short) (IAuthTabCallbackStub[i + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onWarmupCompleted ^ (-4629411779493505016L))));
                }
            }
            if (iIntValue > 0) {
                int i10 = $10 + 25;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = ((i + iIntValue) - 2) + ((int) (IAuthTabCallback ^ (-4629411779493505016L))) + i5;
                Object[] objArr5 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i2), Integer.valueOf(onExtraCallbackWithResult), sb};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-16777216) - Color.rgb(0, 0, 0)), 86 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback4).invoke(null, objArr5)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr4 = onNavigationEvent;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i12 = 0; i12 < length2; i12++) {
                        bArr5[i12] = (byte) (bArr4[i12] ^ (-4629411779493505016L));
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $11 + 85;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    if (!(!z)) {
                        int i15 = $10 + 9;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        byte[] bArr6 = onNavigationEvent;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr6[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = IAuthTabCallbackStub;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                        int i17 = $10 + 97;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ void onNavigationEvent(Function1 function1, Object obj) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        onExtraCallback(iIAuthTabCallback, new Object[]{function1, obj}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1313030520, 1313030521, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
    }

    public static /* synthetic */ String onExtraCallbackWithResult(Function1 function1, Object obj) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        return (String) onExtraCallback(iIAuthTabCallback, new Object[]{function1, obj}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1059835283, 1059835285, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
    }

    private static final Unit onNavigationEvent(Throwable th) {
        int iIAuthTabCallback = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        int iIAuthTabCallback2 = NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback();
        return (Unit) onExtraCallback(iIAuthTabCallback, new Object[]{th}, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), -1816107522, 1816107522, NotificationMarketingSettingActivity$$ExternalSyntheticLambda29.IAuthTabCallback(), iIAuthTabCallback2);
    }
}
