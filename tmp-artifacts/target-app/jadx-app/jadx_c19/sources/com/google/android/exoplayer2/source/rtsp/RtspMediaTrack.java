package com.google.android.exoplayer2.source.rtsp;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.net.Uri;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.NalUnitUtil$H265SpsData;
import com.google.android.exoplayer2.util.NalUnitUtil$SpsData;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.TrackSelectionParametersExternalSyntheticLambda0;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class RtspMediaTrack {
    private static final String AAC_CODECS_PREFIX = "mp4a.40.";
    private static final int DEFAULT_H263_HEIGHT = 288;
    private static final int DEFAULT_H263_WIDTH = 352;
    private static final int DEFAULT_MP4V_HEIGHT = 288;
    private static final int DEFAULT_MP4V_WIDTH = 352;
    private static final int DEFAULT_VP8_HEIGHT = 240;
    private static final int DEFAULT_VP8_WIDTH = 320;
    private static final int DEFAULT_VP9_HEIGHT = 240;
    private static final int DEFAULT_VP9_WIDTH = 320;
    private static final String GENERIC_CONTROL_ATTR = "*";
    private static final String H264_CODECS_PREFIX = "avc1.";
    private static final String MPEG4_CODECS_PREFIX = "mp4v.";
    private static final int OPUS_CLOCK_RATE = 48000;
    private static final String PARAMETER_AMR_INTERLEAVING = "interleaving";
    private static final String PARAMETER_AMR_OCTET_ALIGN = "octet-align";
    private static final String PARAMETER_H265_SPROP_MAX_DON_DIFF = "sprop-max-don-diff";
    private static final String PARAMETER_H265_SPROP_PPS = "sprop-pps";
    private static final String PARAMETER_H265_SPROP_SPS = "sprop-sps";
    private static final String PARAMETER_H265_SPROP_VPS = "sprop-vps";
    private static final String PARAMETER_MP4V_CONFIG = "config";
    private static final String PARAMETER_PROFILE_LEVEL_ID = "profile-level-id";
    private static final String PARAMETER_SPROP_PARAMS = "sprop-parameter-sets";
    private static short[] onExtraCallback;
    public final RtpPayloadFormat payloadFormat;
    public final Uri uri;
    private static final byte[] $$a = {119, -27, 13, -93};
    private static final int $$b = 237;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int asBinder = 0;
    private static int IAuthTabCallbackStub = 1;
    private static int IAuthTabCallback = -417024316;
    private static int onExtraCallbackWithResult = -1538795503;
    private static int onNavigationEvent = -1190160179;
    private static byte[] onWarmupCompleted = {-32};

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, byte b2, byte b3) {
        int i2;
        byte b4;
        int i3;
        int i4 = 1 - (b2 * 4);
        byte[] bArr = $$a;
        ?? r6 = (b * 3) + 4;
        ?? r8 = (b3 * 4) + 115;
        byte[] bArr2 = new byte[i4];
        if (bArr == null) {
            byte b5 = r8;
            i2 = 0;
            byte b6 = r6;
            int i5 = r6;
            i3 = i5 + 1;
            b4 = b6 + b5;
            byte b7 = b4;
            int i6 = i3;
            bArr2[i2] = b7;
            i2++;
            if (i2 == i4) {
                return new String(bArr2, 0);
            }
            b5 = bArr[i6];
            b6 = b7;
            i5 = i6;
            i3 = i5 + 1;
            b4 = b6 + b5;
            byte b72 = b4;
            int i62 = i3;
            bArr2[i2] = b72;
            i2++;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            i3 = r6;
            b4 = r8;
            byte b722 = b4;
            int i622 = i3;
            bArr2[i2] = b722;
            i2++;
            if (i2 == i4) {
            }
        }
    }

    public RtspMediaTrack(MediaDescription mediaDescription, Uri uri) {
        Assertions.checkArgument(mediaDescription.attributes.containsKey(SessionDescription.ATTR_CONTROL));
        this.payloadFormat = generatePayloadFormat(mediaDescription);
        this.uri = extractTrackUri(uri, (String) Util.castNonNull((String) mediaDescription.attributes.get(SessionDescription.ATTR_CONTROL)));
    }

    public boolean equals(@Nullable Object obj) {
        int i2 = 2 % 2;
        int i3 = asBinder + 115;
        int i4 = i3 % 128;
        IAuthTabCallbackStub = i4;
        Object obj2 = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i5 = i4 + 11;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            if (RtspMediaTrack.class == obj.getClass()) {
                RtspMediaTrack rtspMediaTrack = (RtspMediaTrack) obj;
                if (this.payloadFormat.equals(rtspMediaTrack.payloadFormat) && this.uri.equals(rtspMediaTrack.uri)) {
                    int i7 = IAuthTabCallbackStub + 57;
                    asBinder = i7 % 128;
                    return i7 % 2 == 0;
                }
            }
        }
        int i8 = IAuthTabCallbackStub + 23;
        asBinder = i8 % 128;
        if (i8 % 2 == 0) {
            return false;
        }
        obj2.hashCode();
        throw null;
    }

    public int hashCode() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 93;
        asBinder = i3 % 128;
        int iHashCode = i3 % 2 != 0 ? ((this.payloadFormat.hashCode() + 31813) >>> 1) * this.uri.hashCode() : ((this.payloadFormat.hashCode() + 217) * 31) + this.uri.hashCode();
        int i4 = asBinder + 79;
        IAuthTabCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        return iHashCode;
    }

    private static void a(short s, byte b, int i2, int i3, int i4, Object[] objArr) throws Throwable {
        boolean z;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int length;
        byte[] bArr;
        int i8;
        int i9 = 2 % 2;
        TrackSelectionParametersExternalSyntheticLambda0 trackSelectionParametersExternalSyntheticLambda0 = new TrackSelectionParametersExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i4), Integer.valueOf(onExtraCallbackWithResult)};
            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
            char c = '0';
            if (objOnExtraCallback == null) {
                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43424), 41 - TextUtils.lastIndexOf("", '0', 0), 22439 - TextUtils.getCapsMode("", 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i10 = $10 + 39;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr2 = onWarmupCompleted;
                if (bArr2 != null) {
                    int i12 = $10 + 95;
                    $11 = i12 % 128;
                    if (i12 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i8 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i8 = 0;
                    }
                    while (i8 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i8])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-546443534);
                        if (objOnExtraCallback2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf("", c, 0, 0) + 12844), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 55, View.MeasureSpec.getMode(0) + 2167, -299036574, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i8] = ((Byte) ((Method) objOnExtraCallback2).invoke(null, objArr3)).byteValue();
                        i8++;
                        c = '0';
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i13 = $10 + 65;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        byte[] bArr3 = onWarmupCompleted;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - ExpandableListView.getPackedPositionGroup(0L)), 41 - TextUtils.lastIndexOf("", '0'), 22439 - Color.argb(0, 0, 0, 0), 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i7 = ((byte) (bArr3[((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue()] - 4629411779493505016L)) >> ((int) (onExtraCallbackWithResult | (-4629411779493505016L)));
                    } else {
                        byte[] bArr4 = onWarmupCompleted;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(IAuthTabCallback)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1741532694);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (43424 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 43, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 22439, 1452101766, false, "o", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i7 = ((byte) (bArr4[((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue()] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L)));
                    }
                    iIntValue = (byte) i7;
                    i5 = 2;
                } else {
                    iIntValue = (short) (((short) (onExtraCallback[i2 + ((int) (IAuthTabCallback ^ (-4629411779493505016L)))] ^ (-4629411779493505016L))) + ((int) (onExtraCallbackWithResult ^ (-4629411779493505016L))));
                    int i14 = $10 + 111;
                    $11 = i14 % 128;
                    i5 = 2;
                    int i15 = i14 % 2;
                }
            } else {
                i5 = 2;
            }
            if (iIntValue > 0) {
                int i16 = ((i2 + iIntValue) - i5) + ((int) (IAuthTabCallback ^ (-4629411779493505016L)));
                if (z) {
                    int i17 = $11 + 69;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = i16 + i6;
                Object[] objArr6 = {trackSelectionParametersExternalSyntheticLambda0, Integer.valueOf(i3), Integer.valueOf(onNavigationEvent), sb};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1413518156);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) KeyEvent.normalizeMetaState(0), 85 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 9567, -1694526940, false, "r", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objOnExtraCallback5).invoke(null, objArr6)).append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                byte[] bArr5 = onWarmupCompleted;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr6[i19] = (byte) (bArr5[i19] ^ (-4629411779493505016L));
                    }
                    bArr5 = bArr6;
                }
                if (bArr5 != null) {
                    int i20 = $11 + 55;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted = 1;
                while (trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted < iIntValue) {
                    int i22 = $10 + 57;
                    $11 = i22 % 128;
                    int i23 = i22 % 2;
                    if (z2) {
                        byte[] bArr7 = onWarmupCompleted;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((byte) (((byte) (bArr7[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    } else {
                        short[] sArr = onExtraCallback;
                        trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent = trackSelectionParametersExternalSyntheticLambda0.onNavigationEvent - 1;
                        trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult = (char) (trackSelectionParametersExternalSyntheticLambda0.onExtraCallback + (((short) (((short) (sArr[r7] ^ (-4629411779493505016L))) + s)) ^ b));
                    }
                    sb.append(trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult);
                    trackSelectionParametersExternalSyntheticLambda0.onExtraCallback = trackSelectionParametersExternalSyntheticLambda0.onExtraCallbackWithResult;
                    trackSelectionParametersExternalSyntheticLambda0.onWarmupCompleted++;
                }
            }
            String string = sb.toString();
            int i24 = $10 + 25;
            $11 = i24 % 128;
            if (i24 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            objArr[0] = string;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static RtpPayloadFormat generatePayloadFormat(MediaDescription mediaDescription) throws Throwable {
        int iInferChannelCount;
        boolean z;
        String str;
        int i2 = 2 % 2;
        Format.Builder builder = new Format.Builder();
        int i3 = mediaDescription.bitrate;
        if (i3 > 0) {
            builder.setAverageBitrate(i3);
        }
        MediaDescription.RtpMapAttribute rtpMapAttribute = mediaDescription.rtpMapAttribute;
        int i4 = rtpMapAttribute.payloadType;
        String str2 = rtpMapAttribute.mediaEncoding;
        String mimeTypeFromRtpMediaType = RtpPayloadFormat.getMimeTypeFromRtpMediaType(str2);
        builder.setSampleMimeType(mimeTypeFromRtpMediaType);
        int i5 = mediaDescription.rtpMapAttribute.clockRate;
        if (MediaDescription.MEDIA_TYPE_AUDIO.equals(mediaDescription.mediaType)) {
            iInferChannelCount = inferChannelCount(mediaDescription.rtpMapAttribute.encodingParameters, mimeTypeFromRtpMediaType);
            builder.setSampleRate(i5).setChannelCount(iInferChannelCount);
        } else {
            iInferChannelCount = -1;
        }
        ImmutableMap<String, String> fmtpParametersAsMap = mediaDescription.getFmtpParametersAsMap();
        switch (mimeTypeFromRtpMediaType.hashCode()) {
            case -1664118616:
                if (mimeTypeFromRtpMediaType.equals("video/3gpp")) {
                    builder.setWidth(352).setHeight(288);
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case -1662541442:
                if (!(!mimeTypeFromRtpMediaType.equals("video/hevc"))) {
                    int i6 = asBinder + 107;
                    IAuthTabCallbackStub = i6 % 128;
                    Assertions.checkArgument(i6 % 2 == 0 ? fmtpParametersAsMap.isEmpty() : !fmtpParametersAsMap.isEmpty());
                    processH265FmtpAttribute(builder, fmtpParametersAsMap);
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case -1606874997:
                if (mimeTypeFromRtpMediaType.equals("audio/amr-wb")) {
                    Assertions.checkArgument(iInferChannelCount == 1, "Multi channel AMR is not currently supported.");
                    Assertions.checkArgument(!fmtpParametersAsMap.isEmpty(), "fmtp parameters must include octet-align.");
                    Assertions.checkArgument(fmtpParametersAsMap.containsKey(PARAMETER_AMR_OCTET_ALIGN), "Only octet aligned mode is currently supported.");
                    Assertions.checkArgument(!fmtpParametersAsMap.containsKey(PARAMETER_AMR_INTERLEAVING), "Interleaving mode is not currently supported.");
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case -53558318:
                if (mimeTypeFromRtpMediaType.equals("audio/mp4a-latm")) {
                    if (iInferChannelCount != -1) {
                        int i7 = IAuthTabCallbackStub + 95;
                        asBinder = i7 % 128;
                        int i8 = i7 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    Assertions.checkArgument(z);
                    Assertions.checkArgument(!fmtpParametersAsMap.isEmpty());
                    processAacFmtpAttribute(builder, fmtpParametersAsMap, iInferChannelCount, i5);
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 187078296:
                str = "audio/ac3";
                mimeTypeFromRtpMediaType.equals(str);
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 187094639:
                if (!(!mimeTypeFromRtpMediaType.equals("audio/raw"))) {
                    builder.setPcmEncoding(RtpPayloadFormat.getRawPcmEncodingType(str2));
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 1187890754:
                if (!(!mimeTypeFromRtpMediaType.equals("video/mp4v-es"))) {
                    Assertions.checkArgument(!fmtpParametersAsMap.isEmpty());
                    processMPEG4FmtpAttribute(builder, fmtpParametersAsMap);
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 1331836730:
                if (mimeTypeFromRtpMediaType.equals("video/avc")) {
                    Assertions.checkArgument(!fmtpParametersAsMap.isEmpty());
                    processH264FmtpAttribute(builder, fmtpParametersAsMap);
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 1503095341:
                if (mimeTypeFromRtpMediaType.equals("audio/3gpp")) {
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 1504891608:
                if (!(!mimeTypeFromRtpMediaType.equals("audio/opus"))) {
                    int i9 = IAuthTabCallbackStub + 49;
                    asBinder = i9 % 128;
                    if (i9 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    Assertions.checkArgument(iInferChannelCount != -1);
                    Assertions.checkArgument(i5 == 48000, "Invalid OPUS clock rate.");
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 1599127256:
                if (mimeTypeFromRtpMediaType.equals("video/x-vnd.on2.vp8")) {
                    builder.setWidth(320).setHeight(240);
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 1599127257:
                if (mimeTypeFromRtpMediaType.equals("video/x-vnd.on2.vp9")) {
                    int i10 = IAuthTabCallbackStub + 19;
                    asBinder = i10 % 128;
                    if (i10 % 2 != 0) {
                        builder.setWidth(6892).setHeight(1591);
                    } else {
                        builder.setWidth(320).setHeight(240);
                    }
                }
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 1903231877:
                str = "audio/g711-alaw";
                mimeTypeFromRtpMediaType.equals(str);
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            case 1903589369:
                str = "audio/g711-mlaw";
                mimeTypeFromRtpMediaType.equals(str);
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
            default:
                Assertions.checkArgument(i5 > 0);
                return new RtpPayloadFormat(builder.build(), i4, i5, fmtpParametersAsMap);
        }
    }

    private static int inferChannelCount(int i2, String str) {
        int i3 = 2 % 2;
        int i4 = asBinder;
        int i5 = i4 + 21;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (i2 != -1) {
            int i6 = i4 + 61;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                return i2;
            }
            throw null;
        }
        if (str.equals("audio/ac3")) {
            int i7 = IAuthTabCallbackStub + 101;
            asBinder = i7 % 128;
            int i8 = i7 % 2;
            return 6;
        }
        int i9 = IAuthTabCallbackStub + 21;
        asBinder = i9 % 128;
        int i10 = i9 % 2;
        return 1;
    }

    private static void processAacFmtpAttribute(Format.Builder builder, ImmutableMap<String, String> immutableMap, int i2, int i3) {
        int i4 = 2 % 2;
        Assertions.checkArgument(immutableMap.containsKey(PARAMETER_PROFILE_LEVEL_ID));
        builder.setCodecs(AAC_CODECS_PREFIX + ((String) Assertions.checkNotNull((String) immutableMap.get(PARAMETER_PROFILE_LEVEL_ID))));
        builder.setInitializationData(ImmutableList.of(AacUtil.buildAacLcAudioSpecificConfig(i3, i2)));
        int i5 = IAuthTabCallbackStub + 43;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void processMPEG4FmtpAttribute(Format.Builder builder, ImmutableMap<String, String> immutableMap) throws Throwable {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 43;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = (String) immutableMap.get(PARAMETER_MP4V_CONFIG);
        if (str != null) {
            byte[] bytesFromHexString = Util.getBytesFromHexString(str);
            builder.setInitializationData(ImmutableList.of(bytesFromHexString));
            Pair videoResolutionFromMpeg4VideoConfig = CodecSpecificDataUtil.getVideoResolutionFromMpeg4VideoConfig(bytesFromHexString);
            builder.setWidth(((Integer) videoResolutionFromMpeg4VideoConfig.first).intValue()).setHeight(((Integer) videoResolutionFromMpeg4VideoConfig.second).intValue());
        } else {
            builder.setWidth(352).setHeight(288);
        }
        String strIntern = (String) immutableMap.get(PARAMETER_PROFILE_LEVEL_ID);
        StringBuilder sb = new StringBuilder();
        sb.append(MPEG4_CODECS_PREFIX);
        if (strIntern == null) {
            int i5 = IAuthTabCallbackStub + 37;
            asBinder = i5 % 128;
            int i6 = i5 % 2;
            Object[] objArr = new Object[1];
            a((short) ((-16777216) - Color.rgb(0, 0, 0)), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-1130589900) - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (-491274388) + TextUtils.getTrimmedLength(""), View.combineMeasuredStates(0, 0) - 26, objArr);
            strIntern = ((String) objArr[0]).intern();
        }
        sb.append(strIntern);
        builder.setCodecs(sb.toString());
    }

    private static byte[] getInitializationDataFromParameterSet(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 61;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        byte[] bArrDecode = Base64.decode(str, 0);
        int length = bArrDecode.length;
        byte[] bArr = NalUnitUtil.NAL_START_CODE;
        byte[] bArr2 = new byte[length + bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        System.arraycopy(bArrDecode, 0, bArr2, bArr.length, bArrDecode.length);
        int i5 = asBinder + 15;
        IAuthTabCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 78 / 0;
        }
        return bArr2;
    }

    private static void processH264FmtpAttribute(Format.Builder builder, ImmutableMap<String, String> immutableMap) {
        boolean z;
        int i2 = 2 % 2;
        Assertions.checkArgument(immutableMap.containsKey(PARAMETER_SPROP_PARAMS));
        String[] strArrSplit = Util.split((String) Assertions.checkNotNull((String) immutableMap.get(PARAMETER_SPROP_PARAMS)), ",");
        if (strArrSplit.length == 2) {
            int i3 = IAuthTabCallbackStub + 83;
            int i4 = i3 % 128;
            asBinder = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 113;
            IAuthTabCallbackStub = i6 % 128;
            int i7 = i6 % 2;
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        ImmutableList immutableListOf = ImmutableList.of(getInitializationDataFromParameterSet(strArrSplit[0]), getInitializationDataFromParameterSet(strArrSplit[1]));
        builder.setInitializationData(immutableListOf);
        byte[] bArr = (byte[]) immutableListOf.get(0);
        NalUnitUtil$SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit(bArr, NalUnitUtil.NAL_START_CODE.length, bArr.length);
        builder.setPixelWidthHeightRatio(spsNalUnit.pixelWidthHeightRatio);
        builder.setHeight(spsNalUnit.height);
        builder.setWidth(spsNalUnit.width);
        String str = (String) immutableMap.get(PARAMETER_PROFILE_LEVEL_ID);
        if (str == null) {
            builder.setCodecs(CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc));
            return;
        }
        builder.setCodecs(H264_CODECS_PREFIX + str);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[PHI: r1
      0x003f: PHI (r1v18 int) = (r1v17 int), (r1v26 int) binds: [B:10:0x003d, B:7:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void processH265FmtpAttribute(Format.Builder builder, ImmutableMap<String, String> immutableMap) throws NumberFormatException {
        int i2;
        int i3 = 2 % 2;
        if (immutableMap.containsKey(PARAMETER_H265_SPROP_MAX_DON_DIFF)) {
            int i4 = asBinder + 63;
            IAuthTabCallbackStub = i4 % 128;
            boolean z = false;
            if (i4 % 2 == 0) {
                i2 = Integer.parseInt((String) Assertions.checkNotNull((String) immutableMap.get(PARAMETER_H265_SPROP_MAX_DON_DIFF)));
                int i5 = 1 / 0;
                if (i2 == 0) {
                    z = true;
                }
                Assertions.checkArgument(z, "non-zero sprop-max-don-diff " + i2 + " is not supported");
            } else {
                i2 = Integer.parseInt((String) Assertions.checkNotNull((String) immutableMap.get(PARAMETER_H265_SPROP_MAX_DON_DIFF)));
                if (i2 == 0) {
                }
                Assertions.checkArgument(z, "non-zero sprop-max-don-diff " + i2 + " is not supported");
            }
        }
        Assertions.checkArgument(immutableMap.containsKey(PARAMETER_H265_SPROP_VPS));
        String str = (String) Assertions.checkNotNull((String) immutableMap.get(PARAMETER_H265_SPROP_VPS));
        Assertions.checkArgument(immutableMap.containsKey(PARAMETER_H265_SPROP_SPS));
        String str2 = (String) Assertions.checkNotNull((String) immutableMap.get(PARAMETER_H265_SPROP_SPS));
        Assertions.checkArgument(immutableMap.containsKey(PARAMETER_H265_SPROP_PPS));
        ImmutableList immutableListOf = ImmutableList.of(getInitializationDataFromParameterSet(str), getInitializationDataFromParameterSet(str2), getInitializationDataFromParameterSet((String) Assertions.checkNotNull((String) immutableMap.get(PARAMETER_H265_SPROP_PPS))));
        builder.setInitializationData(immutableListOf);
        byte[] bArr = (byte[]) immutableListOf.get(1);
        NalUnitUtil$H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, NalUnitUtil.NAL_START_CODE.length, bArr.length);
        builder.setPixelWidthHeightRatio(h265SpsNalUnit.pixelWidthHeightRatio);
        builder.setHeight(h265SpsNalUnit.height).setWidth(h265SpsNalUnit.width);
        builder.setCodecs(CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc));
        int i6 = IAuthTabCallbackStub + 67;
        asBinder = i6 % 128;
        int i7 = i6 % 2;
    }

    private static Uri extractTrackUri(Uri uri, String str) {
        int i2 = 2 % 2;
        int i3 = asBinder + 25;
        IAuthTabCallbackStub = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Uri uri2 = Uri.parse(str);
            if (!(!uri2.isAbsolute())) {
                return uri2;
            }
            if (str.equals(GENERIC_CONTROL_ATTR)) {
                int i4 = asBinder + 57;
                IAuthTabCallbackStub = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 8 / 0;
                }
                return uri;
            }
            Uri uriBuild = uri.buildUpon().appendEncodedPath(str).build();
            int i6 = asBinder + 35;
            IAuthTabCallbackStub = i6 % 128;
            if (i6 % 2 != 0) {
                return uriBuild;
            }
            obj.hashCode();
            throw null;
        }
        Uri.parse(str).isAbsolute();
        obj.hashCode();
        throw null;
    }
}
