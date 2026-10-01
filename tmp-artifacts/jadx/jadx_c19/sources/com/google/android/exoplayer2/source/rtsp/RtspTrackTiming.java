package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.UriUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.DefaultGainProviderExternalSyntheticLambda1;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspTrackTiming {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 0;
    private static char onExtraCallback = 24212;
    private static char onExtraCallbackWithResult = 39180;
    private static char onNavigationEvent = 18270;
    private static int onTransact = 1;
    private static char onWarmupCompleted = 9454;
    public final long rtpTimestamp;
    public final int sequenceNumber;
    public final Uri uri;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    public static ImmutableList<RtspTrackTiming> parseTrackTiming(String str, Uri uri) throws Throwable {
        long j;
        String[] strArr;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        String[] strArrSplit = Util.split(str, ",");
        int length = strArrSplit.length;
        int i5 = 0;
        int i6 = 0;
        while (i6 < length) {
            int i7 = IAuthTabCallback + 11;
            onTransact = i7 % 128;
            int i8 = i7 % i3;
            String str2 = strArrSplit[i6];
            String[] strArrSplit2 = Util.split(str2, ";");
            int length2 = strArrSplit2.length;
            int i9 = i5;
            int i10 = -1;
            Uri uriResolveUri = null;
            long j2 = -9223372036854775807L;
            while (i9 < length2) {
                String str3 = strArrSplit2[i9];
                try {
                    String[] strArrSplitAtFirst = Util.splitAtFirst(str3, "=");
                    String str4 = strArrSplitAtFirst[i5];
                    String str5 = strArrSplitAtFirst[1];
                    int iHashCode = str4.hashCode();
                    if (iHashCode != 113759) {
                        int i11 = onTransact + 21;
                        strArr = strArrSplit;
                        IAuthTabCallback = i11 % 128;
                        if (i11 % 2 != 0) {
                            throw null;
                        }
                        if (iHashCode == 116079) {
                            Object[] objArr = new Object[1];
                            a(new char[]{33079, 53382, 24858, 32879}, 2 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr);
                            if (!str4.equals(((String) objArr[0]).intern())) {
                                throw ParserException.createForMalformedManifest(str4, (Throwable) null);
                            }
                            int i12 = onTransact + 37;
                            IAuthTabCallback = i12 % 128;
                            if (i12 % 2 != 0) {
                                uriResolveUri = resolveUri(str5, uri);
                                i2 = 0;
                                int i13 = 41 / 0;
                            } else {
                                i2 = 0;
                                uriResolveUri = resolveUri(str5, uri);
                            }
                            i9++;
                            int i14 = onTransact + 39;
                            IAuthTabCallback = i14 % 128;
                            int i15 = i14 % 2;
                            i5 = i2;
                            strArrSplit = strArr;
                        } else {
                            if (iHashCode != 1524180539 || !str4.equals("rtptime")) {
                                throw ParserException.createForMalformedManifest(str4, (Throwable) null);
                            }
                            int i16 = IAuthTabCallback + 119;
                            onTransact = i16 % 128;
                            int i17 = i16 % 2;
                            j2 = Long.parseLong(str5);
                            i2 = 0;
                            i9++;
                            int i142 = onTransact + 39;
                            IAuthTabCallback = i142 % 128;
                            int i152 = i142 % 2;
                            i5 = i2;
                            strArrSplit = strArr;
                        }
                    } else {
                        strArr = strArrSplit;
                        i2 = 0;
                        if (!str4.equals("seq")) {
                            throw ParserException.createForMalformedManifest(str4, (Throwable) null);
                        }
                        i10 = Integer.parseInt(str5);
                        i9++;
                        int i1422 = onTransact + 39;
                        IAuthTabCallback = i1422 % 128;
                        int i1522 = i1422 % 2;
                        i5 = i2;
                        strArrSplit = strArr;
                    }
                } catch (Exception e) {
                    throw ParserException.createForMalformedManifest(str3, e);
                }
            }
            String[] strArr2 = strArrSplit;
            int i18 = i5;
            if (uriResolveUri != null && uriResolveUri.getScheme() != null) {
                if (i10 == -1) {
                    int i19 = onTransact + 31;
                    IAuthTabCallback = i19 % 128;
                    int i20 = i19 % 2;
                    j = j2;
                    if (j != -9223372036854775807L) {
                    }
                } else {
                    j = j2;
                }
                builder.add(new RtspTrackTiming(j, i10, uriResolveUri));
                i6++;
                int i21 = IAuthTabCallback + 123;
                onTransact = i21 % 128;
                int i22 = i21 % 2;
                i3 = 2;
                i5 = i18;
                strArrSplit = strArr2;
            }
            int i23 = onTransact + 27;
            IAuthTabCallback = i23 % 128;
            int i24 = i23 % 2;
            throw ParserException.createForMalformedManifest(str2, (Throwable) null);
        }
        return builder.build();
    }

    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        int i3;
        int i4 = 2 % 2;
        DefaultGainProviderExternalSyntheticLambda1 defaultGainProviderExternalSyntheticLambda1 = new DefaultGainProviderExternalSyntheticLambda1();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        defaultGainProviderExternalSyntheticLambda1.onNavigationEvent = 0;
        char[] cArr3 = new char[2];
        int i6 = $11 + 13;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (defaultGainProviderExternalSyntheticLambda1.onNavigationEvent < cArr.length) {
            int i8 = $11 + 55;
            $10 = i8 % 128;
            int i9 = 58224;
            if (i8 % 2 != 0) {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                int i10 = defaultGainProviderExternalSyntheticLambda1.onNavigationEvent;
                cArr3[1] = cArr[i5];
                i3 = 1;
            } else {
                cArr3[i5] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent];
                cArr3[1] = cArr[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1];
                i3 = i5;
            }
            while (i3 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i11 = (c2 + i9) ^ ((c2 << 4) + ((char) (onExtraCallbackWithResult ^ 1094535280733222934L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(onWarmupCompleted);
                    objArr2[2] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback == null) {
                        char jumpTapTimeout = (char) (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i5) + 10;
                        int mode = View.MeasureSpec.getMode(i5) + 12434;
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback(jumpTapTimeout, absoluteGravity, mode, -787580090, false, "C", clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i9) ^ ((cCharValue << 4) + ((char) (onExtraCallback ^ 1094535280733222934L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(onNavigationEvent)};
                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-531724842);
                    if (objOnExtraCallback2 == null) {
                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 10 - TextUtils.getTrimmedLength(""), 12434 - (ViewConfiguration.getWindowTouchSlop() >> 8), -787580090, false, "C", new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                    i9 -= 40503;
                    i3++;
                    cArr3 = cArr4;
                    i5 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent] = cArr5[0];
            cArr2[defaultGainProviderExternalSyntheticLambda1.onNavigationEvent + 1] = cArr5[1];
            Object[] objArr4 = {defaultGainProviderExternalSyntheticLambda1, defaultGainProviderExternalSyntheticLambda1};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2077277184);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (16014 - ((Process.getThreadPriority(0) + 20) >> 6)), (Process.myPid() >> 22) + 14, 19901 - (ViewConfiguration.getTapTimeout() >> 16), -1250968944, false, "B", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i2);
    }

    static Uri resolveUri(String str, Uri uri) {
        int i2 = 2 % 2;
        Assertions.checkArgument(((String) Assertions.checkNotNull(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (!((String) Assertions.checkNotNull(uri3.getHost())).equals(uri.getHost())) {
            if (string.endsWith("/")) {
                return UriUtil.resolveToUri(string, str);
            }
            Uri uriResolveToUri = UriUtil.resolveToUri(string + "/", str);
            int i3 = IAuthTabCallback + 11;
            onTransact = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 41 / 0;
            }
            return uriResolveToUri;
        }
        int i5 = IAuthTabCallback + 85;
        onTransact = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 43 / 0;
        }
        return uri3;
    }

    private RtspTrackTiming(long j, int i2, Uri uri) {
        this.rtpTimestamp = j;
        this.sequenceNumber = i2;
        this.uri = uri;
    }
}
