package com.google.android.exoplayer2.source.rtsp;

import android.graphics.Color;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Strings;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class SessionDescriptionParser {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final Pattern ATTRIBUTE_PATTERN;
    private static final String ATTRIBUTE_TYPE = "a";
    private static final String BANDWIDTH_TYPE = "b";
    private static final String CONNECTION_TYPE = "c";
    private static final String EMAIL_TYPE = "e";
    private static int IAuthTabCallback = 0;
    private static final String INFORMATION_TYPE = "i";
    private static final String KEY_TYPE = "k";
    private static final Pattern MEDIA_DESCRIPTION_PATTERN;
    private static final String MEDIA_TYPE = "m";
    private static final String ORIGIN_TYPE = "o";
    private static final String PHONE_NUMBER_TYPE = "p";
    private static final String REPEAT_TYPE = "r";
    private static final Pattern SDP_LINE_PATTERN;
    private static final String SESSION_TYPE = "s";
    private static final String TIMING_TYPE = "t";
    private static final String URI_TYPE = "u";
    private static final String VERSION_TYPE = "v";
    private static final String ZONE_TYPE = "z";
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static int[] onNavigationEvent = null;
    private static int onWarmupCompleted = 1;

    static {
        onExtraCallbackWithResult();
        SDP_LINE_PATTERN = Pattern.compile("([a-z])=\\s?(.+)");
        ATTRIBUTE_PATTERN = Pattern.compile("([\\x21\\x23-\\x27\\x2a\\x2b\\x2d\\x2e\\x30-\\x39\\x41-\\x5a\\x5e-\\x7e]+)(?::(.*))?");
        MEDIA_DESCRIPTION_PATTERN = Pattern.compile("(\\S+)\\s(\\S+)\\s(\\S+)\\s(\\S+)");
        int i2 = onWarmupCompleted + 105;
        onExtraCallback = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static void a(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = onNavigationEvent;
        int i5 = -1469660336;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Gravity.getAbsoluteGravity(0, 0), 72 - Color.red(0), TextUtils.indexOf("", "", 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i7++;
                    int i8 = $11 + 85;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    i5 = -1469660336;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = onNavigationEvent;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $10 + 101;
                $11 = i11 % 128;
                if (i11 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i10]);
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Process.myTid() >> 22), TextUtils.getOffsetAfter("", i6) + 72, 8848 - TextUtils.indexOf("", ""), -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr6[i10] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                    i10 /= 0;
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 72 - ExpandableListView.getPackedPositionType(0L), 8848 - (Process.myPid() >> 22), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                        i10++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i6 = 0;
            }
            int i12 = $10 + 55;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            iArr5 = iArr6;
            i3 = 0;
        } else {
            i3 = 0;
        }
        System.arraycopy(iArr5, i3, iArr4, i3, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i3;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            int i14 = 0;
            while (i14 < 16) {
                int i15 = $10 + 115;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i14];
                Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback4 == null) {
                    objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 22252), 39 - Color.alpha(0), 10301 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                i14++;
                int i17 = $11 + 55;
                $10 = i17 % 128;
                int i18 = i17 % 2;
            }
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i19;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i20 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i21 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback5 == null) {
                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4034 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 78, AndroidCharacter.getMirror('0') + 7350, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0205, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SessionDescription parse(String str) throws Throwable {
        String str2;
        int i2 = 2 % 2;
        SessionDescription.Builder builder = new SessionDescription.Builder();
        String[] strArrSplitRtspMessageBody = RtspMessageUtil.splitRtspMessageBody(str);
        int length = strArrSplitRtspMessageBody.length;
        Object obj = null;
        MediaDescription.Builder mediaDescriptionLine = null;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i4 % 128;
            if (i4 % 2 == 0) {
                "".equals(strArrSplitRtspMessageBody[i3]);
                obj.hashCode();
                throw null;
            }
            String str3 = strArrSplitRtspMessageBody[i3];
            if (!"".equals(str3)) {
                Matcher matcher = SDP_LINE_PATTERN.matcher(str3);
                if (!matcher.matches()) {
                    throw ParserException.createForMalformedManifest("Malformed SDP line: " + str3, (Throwable) null);
                }
                String str4 = (String) Assertions.checkNotNull(matcher.group(1));
                String str5 = (String) Assertions.checkNotNull(matcher.group(2));
                switch (str4.hashCode()) {
                    case 97:
                        if (str4.equals(ATTRIBUTE_TYPE)) {
                            int i5 = IAuthTabCallback + 5;
                            onExtraCallbackWithResult = i5 % 128;
                            if (i5 % 2 == 0) {
                                ATTRIBUTE_PATTERN.matcher(str5).matches();
                                throw null;
                            }
                            Matcher matcher2 = ATTRIBUTE_PATTERN.matcher(str5);
                            if (!matcher2.matches()) {
                                throw ParserException.createForMalformedManifest("Malformed Attribute line: " + str3, (Throwable) null);
                            }
                            String str6 = (String) Assertions.checkNotNull(matcher2.group(1));
                            String strNullToEmpty = Strings.nullToEmpty(matcher2.group(2));
                            if (mediaDescriptionLine == null) {
                                builder.addAttribute(str6, strNullToEmpty);
                                break;
                            } else {
                                mediaDescriptionLine.addAttribute(str6, strNullToEmpty);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 98:
                        if (str4.equals(BANDWIDTH_TYPE)) {
                            String[] strArrSplit = Util.split(str5, ":\\s?");
                            Assertions.checkArgument(strArrSplit.length == 2);
                            int i6 = Integer.parseInt(strArrSplit[1]);
                            if (mediaDescriptionLine == null) {
                                builder.setBitrate(i6 * 1000);
                                break;
                            } else {
                                mediaDescriptionLine.setBitrate(i6 * 1000);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 99:
                        if (str4.equals(CONNECTION_TYPE)) {
                            int i7 = IAuthTabCallback + 85;
                            onExtraCallbackWithResult = i7 % 128;
                            if (i7 % 2 == 0) {
                                obj.hashCode();
                                throw null;
                            }
                            if (mediaDescriptionLine == null) {
                                builder.setConnection(str5);
                                break;
                            } else {
                                mediaDescriptionLine.setConnection(str5);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 101:
                        if (str4.equals(EMAIL_TYPE)) {
                            builder.setEmailAddress(str5);
                            break;
                        } else {
                            continue;
                        }
                    case 105:
                        if (str4.equals(INFORMATION_TYPE)) {
                            int i8 = onExtraCallbackWithResult + 31;
                            IAuthTabCallback = i8 % 128;
                            if (i8 % 2 != 0) {
                                throw null;
                            }
                            if (mediaDescriptionLine == null) {
                                builder.setSessionInfo(str5);
                                break;
                            } else {
                                mediaDescriptionLine.setMediaTitle(str5);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 107:
                        if (str4.equals(KEY_TYPE)) {
                            if (mediaDescriptionLine == null) {
                                builder.setKey(str5);
                                break;
                            } else {
                                mediaDescriptionLine.setKey(str5);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 109:
                        if (str4.equals(MEDIA_TYPE)) {
                            if (mediaDescriptionLine != null) {
                                addMediaDescriptionToSession(builder, mediaDescriptionLine);
                            }
                            mediaDescriptionLine = parseMediaDescriptionLine(str5);
                            break;
                        } else {
                            continue;
                        }
                    case 111:
                        if (str4.equals(ORIGIN_TYPE)) {
                            builder.setOrigin(str5);
                            break;
                        } else {
                            continue;
                        }
                    case 112:
                        if (!str4.equals("p")) {
                            break;
                        } else {
                            int i9 = IAuthTabCallback + 121;
                            onExtraCallbackWithResult = i9 % 128;
                            if (i9 % 2 != 0) {
                                builder.setPhoneNumber(str5);
                                break;
                            } else {
                                builder.setPhoneNumber(str5);
                                int i10 = 44 / 0;
                                continue;
                            }
                        }
                    case 114:
                        str2 = REPEAT_TYPE;
                        break;
                    case 115:
                        if (str4.equals(SESSION_TYPE)) {
                            builder.setSessionName(str5);
                            break;
                        } else {
                            continue;
                        }
                    case 116:
                        if (str4.equals(TIMING_TYPE)) {
                            int i11 = IAuthTabCallback + 101;
                            onExtraCallbackWithResult = i11 % 128;
                            if (i11 % 2 == 0) {
                                builder.setTiming(str5);
                                obj.hashCode();
                                throw null;
                            }
                            builder.setTiming(str5);
                            break;
                        } else {
                            continue;
                        }
                    case 117:
                        if (str4.equals("u")) {
                            builder.setUri(Uri.parse(str5));
                            break;
                        } else {
                            continue;
                        }
                    case 118:
                        if (str4.equals(VERSION_TYPE)) {
                            Object[] objArr = new Object[1];
                            a(new int[]{787623889, 553280592}, 1 - TextUtils.getOffsetBefore("", 0), objArr);
                            if (!((String) objArr[0]).intern().equals(str5)) {
                                throw ParserException.createForMalformedManifest(String.format("SDP version %s is not supported.", str5), (Throwable) null);
                            }
                            break;
                        } else {
                            continue;
                        }
                    case 122:
                        str2 = ZONE_TYPE;
                        break;
                }
                str4.equals(str2);
            }
        }
        if (mediaDescriptionLine != null) {
            int i12 = IAuthTabCallback + 75;
            onExtraCallbackWithResult = i12 % 128;
            int i13 = i12 % 2;
            addMediaDescriptionToSession(builder, mediaDescriptionLine);
        }
        try {
            return builder.build();
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest((String) null, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static void addMediaDescriptionToSession(SessionDescription.Builder builder, MediaDescription.Builder builder2) throws ParserException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 81;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        try {
            builder.addMediaDescription(builder2.build());
            int i5 = IAuthTabCallback + 29;
            onExtraCallbackWithResult = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (IllegalArgumentException | IllegalStateException e) {
            throw ParserException.createForMalformedManifest((String) null, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static MediaDescription.Builder parseMediaDescriptionLine(String str) throws ParserException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 103;
        onExtraCallbackWithResult = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Matcher matcher = MEDIA_DESCRIPTION_PATTERN.matcher(str);
            if (!matcher.matches()) {
                throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, (Throwable) null);
            }
            try {
                MediaDescription.Builder builder = new MediaDescription.Builder((String) Assertions.checkNotNull(matcher.group(1)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))), (String) Assertions.checkNotNull(matcher.group(3)), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(4))));
                int i4 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 74 / 0;
                }
                return builder;
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest("Malformed SDP media description line: " + str, e);
            }
        }
        MEDIA_DESCRIPTION_PATTERN.matcher(str).matches();
        obj.hashCode();
        throw null;
    }

    private SessionDescriptionParser() {
    }

    static void onExtraCallbackWithResult() {
        onNavigationEvent = new int[]{-405712250, 1462328006, 969753584, 645714809, -1975978671, 1611504544, -1943022761, 112000346, -820877368, -1375323363, -196623240, -796216265, 194186147, -726842076, -1965064687, -1515250857, -639261856, -647241333};
    }
}
