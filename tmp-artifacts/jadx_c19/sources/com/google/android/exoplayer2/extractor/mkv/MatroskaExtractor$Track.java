package com.google.android.exoplayer2.extractor.mkv;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: Access modifiers changed from: protected */
/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class MatroskaExtractor$Track {
    private static final int DEFAULT_MAX_CLL = 1000;
    private static final int DEFAULT_MAX_FALL = 200;
    private static final int DISPLAY_UNIT_PIXELS = 0;
    private static final int MAX_CHROMATICITY = 50000;
    private int blockAddIdType;
    public String codecId;
    public byte[] codecPrivate;
    public TrackOutput.CryptoData cryptoData;
    public int defaultSampleDurationNs;
    public byte[] dolbyVisionConfigBytes;
    public DrmInitData drmInitData;
    public boolean flagForced;
    public boolean hasContentEncryption;
    public int maxBlockAdditionId;
    public int nalUnitLengthFieldLength;
    public String name;
    public int number;
    public TrackOutput output;
    public byte[] sampleStrippedBytes;
    public TrueHdSampleRechunker trueHdSampleRechunker;
    public int type;
    public int width = -1;
    public int height = -1;
    public int displayWidth = -1;
    public int displayHeight = -1;
    public int displayUnit = 0;
    public int projectionType = -1;
    public float projectionPoseYaw = 0.0f;
    public float projectionPosePitch = 0.0f;
    public float projectionPoseRoll = 0.0f;
    public byte[] projectionData = null;
    public int stereoMode = -1;
    public boolean hasColorInfo = false;
    public int colorSpace = -1;
    public int colorTransfer = -1;
    public int colorRange = -1;
    public int maxContentLuminance = DEFAULT_MAX_CLL;
    public int maxFrameAverageLuminance = 200;
    public float primaryRChromaticityX = -1.0f;
    public float primaryRChromaticityY = -1.0f;
    public float primaryGChromaticityX = -1.0f;
    public float primaryGChromaticityY = -1.0f;
    public float primaryBChromaticityX = -1.0f;
    public float primaryBChromaticityY = -1.0f;
    public float whitePointChromaticityX = -1.0f;
    public float whitePointChromaticityY = -1.0f;
    public float maxMasteringLuminance = -1.0f;
    public float minMasteringLuminance = -1.0f;
    public int channelCount = 1;
    public int audioBitDepth = -1;
    public int sampleRate = 8000;
    public long codecDelayNs = 0;
    public long seekPreRollNs = 0;
    public boolean flagDefault = true;
    private String language = "eng";

    protected MatroskaExtractor$Track() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0528  */
    @EnsuresNonNull
    @RequiresNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void initializeOutput(ExtractorOutput extractorOutput, int i2) throws ParserException {
        char c;
        List listSingletonList;
        String str;
        int i3;
        int i4;
        String str2;
        List list;
        String str3;
        String str4;
        int i5;
        int pcmEncoding;
        byte[] bArr;
        String str5;
        Format.Builder builder;
        int i6;
        int iIntValue;
        int i7;
        DolbyVisionConfig dolbyVisionConfig;
        String str6 = this.codecId;
        switch (str6.hashCode()) {
            case -2095576542:
                if (!str6.equals("V_MPEG4/ISO/AP")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -2095575984:
                if (str6.equals("V_MPEG4/ISO/SP")) {
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str6.equals("A_MS/ACM")) {
                    c = 2;
                    break;
                }
                break;
            case -1784763192:
                if (str6.equals("A_TRUEHD")) {
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str6.equals("A_VORBIS")) {
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str6.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str6.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str6.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str6.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str6.equals("V_MPEG4/ISO/ASP")) {
                    c = '\t';
                    break;
                }
                break;
            case -538363109:
                if (str6.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str6.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str6.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str6.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str6.equals("A_AC3")) {
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str6.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str6.equals("V_AV1")) {
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str6.equals("V_VP8")) {
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str6.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str6.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str6.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str6.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str6.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str6.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str6.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str6.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 855502857:
                if (str6.equals("V_MPEGH/ISO/HEVC")) {
                    c = 26;
                    break;
                }
                break;
            case 1045209816:
                if (str6.equals("S_TEXT/WEBVTT")) {
                    c = 27;
                    break;
                }
                break;
            case 1422270023:
                if (str6.equals("S_TEXT/UTF8")) {
                    c = 28;
                    break;
                }
                break;
            case 1809237540:
                if (str6.equals("V_MPEG2")) {
                    c = 29;
                    break;
                }
                break;
            case 1950749482:
                if (str6.equals("A_EAC3")) {
                    c = 30;
                    break;
                }
                break;
            case 1950789798:
                if (str6.equals("A_FLAC")) {
                    c = 31;
                    break;
                }
                break;
            case 1951062397:
                if (str6.equals("A_OPUS")) {
                    c = ' ';
                    break;
                }
                break;
        }
        String str7 = "audio/x-unknown";
        String str8 = "audio/raw";
        switch (c) {
            case 0:
            case 1:
            case '\t':
                byte[] bArr2 = this.codecPrivate;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str7 = "video/mp4v-es";
                str8 = str7;
                i4 = -1;
                str = null;
                i3 = -1;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null && (dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray(bArr))) != null) {
                    str = dolbyVisionConfig.codecs;
                    str8 = "video/dolby-vision";
                }
                str5 = str8;
                boolean z = this.flagDefault;
                int i8 = !this.flagForced ? 2 : 0;
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                    builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i3);
                    i6 = 1;
                } else if (MimeTypes.isVideo(str5)) {
                    if (this.displayUnit == 0) {
                        int i9 = this.displayWidth;
                        iIntValue = -1;
                        if (i9 == -1) {
                            i9 = this.width;
                        }
                        this.displayWidth = i9;
                        int i10 = this.displayHeight;
                        if (i10 == -1) {
                            i10 = this.height;
                        }
                        this.displayHeight = i10;
                    } else {
                        iIntValue = -1;
                    }
                    float f = (this.displayWidth == iIntValue || (i7 = this.displayHeight) == iIntValue) ? -1.0f : (this.height * r2) / (this.width * i7);
                    ColorInfo colorInfo = this.hasColorInfo ? new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo()) : null;
                    if (this.name != null && MatroskaExtractor.access$600().containsKey(this.name)) {
                        iIntValue = ((Integer) MatroskaExtractor.access$600().get(this.name)).intValue();
                    }
                    if (this.projectionType == 0 && Float.compare(this.projectionPoseYaw, 0.0f) == 0 && Float.compare(this.projectionPosePitch, 0.0f) == 0) {
                        if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                            iIntValue = 0;
                        } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                            iIntValue = 90;
                        } else if (Float.compare(this.projectionPosePitch, -180.0f) == 0 || Float.compare(this.projectionPosePitch, 180.0f) == 0) {
                            iIntValue = 180;
                        } else if (Float.compare(this.projectionPosePitch, -90.0f) == 0) {
                            iIntValue = 270;
                        }
                    }
                    builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                    i6 = 2;
                } else {
                    if (!"application/x-subrip".equals(str5) && !"text/x-ssa".equals(str5) && !"text/vtt".equals(str5) && !"application/vobsub".equals(str5) && !"application/pgs".equals(str5) && !"application/dvbsubs".equals(str5)) {
                        throw ParserException.createForMalformedContainer("Unexpected MIME type.", (Throwable) null);
                    }
                    i6 = 3;
                }
                if (this.name != null && !MatroskaExtractor.access$600().containsKey(this.name)) {
                    builder.setLabel(this.name);
                }
                Format formatBuild = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack;
                trackOutputTrack.format(formatBuild);
                return;
            case 2:
                if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                    int pcmEncoding2 = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding2 == 0) {
                        Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                    } else {
                        listSingletonList = null;
                        str = null;
                        i3 = pcmEncoding2;
                        i4 = -1;
                        bArr = this.dolbyVisionConfigBytes;
                        if (bArr != null) {
                            str = dolbyVisionConfig.codecs;
                            str8 = "video/dolby-vision";
                            break;
                        }
                        str5 = str8;
                        boolean z2 = this.flagDefault;
                        if (!this.flagForced) {
                        }
                        builder = new Format.Builder();
                        if (!MimeTypes.isAudio(str5)) {
                        }
                        if (this.name != null) {
                            builder.setLabel(this.name);
                            break;
                        }
                        Format formatBuild2 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i6);
                        this.output = trackOutputTrack2;
                        trackOutputTrack2.format(formatBuild2);
                        return;
                    }
                } else {
                    Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                }
                listSingletonList = null;
                str8 = str7;
                i4 = -1;
                str = null;
                i3 = -1;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22;
                trackOutputTrack22.format(formatBuild22);
                return;
            case 3:
                this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                str7 = "audio/true-hd";
                listSingletonList = null;
                str8 = str7;
                i4 = -1;
                str = null;
                i3 = -1;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222;
                trackOutputTrack222.format(formatBuild222);
                return;
            case 4:
                listSingletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                i4 = 8192;
                str8 = "audio/vorbis";
                str = null;
                i3 = -1;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222;
                trackOutputTrack2222.format(formatBuild2222);
                return;
            case 5:
                str2 = "audio/mpeg-L2";
                str8 = str2;
                i4 = 4096;
                listSingletonList = null;
                str = null;
                i3 = -1;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222;
                trackOutputTrack22222.format(formatBuild22222);
                return;
            case 6:
                str2 = "audio/mpeg";
                str8 = str2;
                i4 = 4096;
                listSingletonList = null;
                str = null;
                i3 = -1;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222;
                trackOutputTrack222222.format(formatBuild222222);
                return;
            case 7:
                Pair<String, List<byte[]>> fourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                str7 = (String) fourCcPrivate.first;
                listSingletonList = (List) fourCcPrivate.second;
                str8 = str7;
                i4 = -1;
                str = null;
                i3 = -1;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222222;
                trackOutputTrack2222222.format(formatBuild2222222);
                return;
            case '\b':
                byte[] bArr3 = new byte[4];
                System.arraycopy(getCodecPrivate(this.codecId), 0, bArr3, 0, 4);
                listSingletonList = ImmutableList.of(bArr3);
                str7 = "application/dvbsubs";
                str8 = str7;
                i4 = -1;
                str = null;
                i3 = -1;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222222;
                trackOutputTrack22222222.format(formatBuild22222222);
                return;
            case '\n':
                AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                list = avcConfig.initializationData;
                this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                str3 = avcConfig.codecs;
                str7 = "video/avc";
                List list2 = list;
                str = str3;
                listSingletonList = list2;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222222;
                trackOutputTrack222222222.format(formatBuild222222222);
                return;
            case 11:
                listSingletonList = ImmutableList.of(getCodecPrivate(this.codecId));
                str = null;
                str7 = "application/vobsub";
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222222222;
                trackOutputTrack2222222222.format(formatBuild2222222222);
                return;
            case '\f':
                str4 = "audio/vnd.dts.hd";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222222222;
                trackOutputTrack22222222222.format(formatBuild22222222222);
                return;
            case '\r':
                listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                this.sampleRate = audioSpecificConfig.sampleRateHz;
                this.channelCount = audioSpecificConfig.channelCount;
                str = audioSpecificConfig.codecs;
                str7 = "audio/mp4a-latm";
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222222222;
                trackOutputTrack222222222222.format(formatBuild222222222222);
                return;
            case 14:
                str4 = "audio/ac3";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222222222222;
                trackOutputTrack2222222222222.format(formatBuild2222222222222);
                return;
            case 15:
            case 21:
                str4 = "audio/vnd.dts";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222222222222;
                trackOutputTrack22222222222222.format(formatBuild22222222222222);
                return;
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                str4 = "video/av01";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222222222222;
                trackOutputTrack222222222222222.format(formatBuild222222222222222);
                return;
            case 17:
                str4 = "video/x-vnd.on2.vp8";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222222222222222;
                trackOutputTrack2222222222222222.format(formatBuild2222222222222222);
                return;
            case 18:
                str4 = "video/x-vnd.on2.vp9";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222222222222222;
                trackOutputTrack22222222222222222.format(formatBuild22222222222222222);
                return;
            case 19:
                listSingletonList = null;
                str = null;
                str7 = "application/pgs";
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222222222222222;
                trackOutputTrack222222222222222222.format(formatBuild222222222222222222);
                return;
            case 20:
                str4 = "video/x-unknown";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222222222222222222;
                trackOutputTrack2222222222222222222.format(formatBuild2222222222222222222);
                return;
            case 22:
                if (this.audioBitDepth != 32) {
                    Log.w("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str8 = str7;
                    i4 = -1;
                    i5 = -1;
                    i3 = i5;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str5 = str8;
                    boolean z22222222222222222222 = this.flagDefault;
                    if (!this.flagForced) {
                    }
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str5)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222222 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack22222222222222222222;
                    trackOutputTrack22222222222222222222.format(formatBuild22222222222222222222);
                    return;
                }
                listSingletonList = null;
                str = null;
                i4 = -1;
                i5 = 4;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222222222222222222;
                trackOutputTrack222222222222222222222.format(formatBuild222222222222222222222);
                return;
            case 23:
                int i11 = this.audioBitDepth;
                if (i11 == 8) {
                    pcmEncoding = 3;
                } else {
                    if (i11 != 16) {
                        Log.w("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str8 = str7;
                        i4 = -1;
                        i5 = -1;
                        i3 = i5;
                        bArr = this.dolbyVisionConfigBytes;
                        if (bArr != null) {
                        }
                        str5 = str8;
                        boolean z2222222222222222222222 = this.flagDefault;
                        if (!this.flagForced) {
                        }
                        builder = new Format.Builder();
                        if (!MimeTypes.isAudio(str5)) {
                        }
                        if (this.name != null) {
                        }
                        Format formatBuild2222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack2222222222222222222222 = extractorOutput.track(this.number, i6);
                        this.output = trackOutputTrack2222222222222222222222;
                        trackOutputTrack2222222222222222222222.format(formatBuild2222222222222222222222);
                        return;
                    }
                    pcmEncoding = 268435456;
                }
                i5 = pcmEncoding;
                listSingletonList = null;
                str = null;
                i4 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222222222222222222222;
                trackOutputTrack22222222222222222222222.format(formatBuild22222222222222222222222);
                return;
            case 24:
                pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                if (pcmEncoding == 0) {
                    Log.w("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str8 = str7;
                    i4 = -1;
                    i5 = -1;
                    i3 = i5;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str5 = str8;
                    boolean z222222222222222222222222 = this.flagDefault;
                    if (!this.flagForced) {
                    }
                    builder = new Format.Builder();
                    if (!MimeTypes.isAudio(str5)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222222 = extractorOutput.track(this.number, i6);
                    this.output = trackOutputTrack222222222222222222222222;
                    trackOutputTrack222222222222222222222222.format(formatBuild222222222222222222222222);
                    return;
                }
                i5 = pcmEncoding;
                listSingletonList = null;
                str = null;
                i4 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222222222222222222222222;
                trackOutputTrack2222222222222222222222222.format(formatBuild2222222222222222222222222);
                return;
            case 25:
                listSingletonList = ImmutableList.of(MatroskaExtractor.access$500(), getCodecPrivate(this.codecId));
                str = null;
                str7 = "text/x-ssa";
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222222222222222222222222;
                trackOutputTrack22222222222222222222222222.format(formatBuild22222222222222222222222222);
                return;
            case 26:
                HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                list = hevcConfig.initializationData;
                this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                str3 = hevcConfig.codecs;
                str7 = "video/hevc";
                List list22 = list;
                str = str3;
                listSingletonList = list22;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222222222222222222222222;
                trackOutputTrack222222222222222222222222222.format(formatBuild222222222222222222222222222);
                return;
            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                str7 = "text/vtt";
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222222222222222222222222222;
                trackOutputTrack2222222222222222222222222222.format(formatBuild2222222222222222222222222222);
                return;
            case 28:
                str7 = "application/x-subrip";
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222222222222222222222222222;
                trackOutputTrack22222222222222222222222222222.format(formatBuild22222222222222222222222222222);
                return;
            case 29:
                str4 = "video/mpeg2";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222222222222222222222222222;
                trackOutputTrack222222222222222222222222222222.format(formatBuild222222222222222222222222222222);
                return;
            case 30:
                str4 = "audio/eac3";
                str7 = str4;
                listSingletonList = null;
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z2222222222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild2222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z2222222222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack2222222222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack2222222222222222222222222222222;
                trackOutputTrack2222222222222222222222222222222.format(formatBuild2222222222222222222222222222222);
                return;
            case 31:
                listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                str7 = "audio/flac";
                str = null;
                str8 = str7;
                i4 = -1;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z22222222222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild22222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z22222222222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack22222222222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack22222222222222222222222222222222;
                trackOutputTrack22222222222222222222222222222222.format(formatBuild22222222222222222222222222222222);
                return;
            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                listSingletonList = new ArrayList(3);
                listSingletonList.add(getCodecPrivate(this.codecId));
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.codecDelayNs).array());
                listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                i4 = 5760;
                str8 = "audio/opus";
                str = null;
                i5 = -1;
                i3 = i5;
                bArr = this.dolbyVisionConfigBytes;
                if (bArr != null) {
                }
                str5 = str8;
                boolean z222222222222222222222222222222222 = this.flagDefault;
                if (!this.flagForced) {
                }
                builder = new Format.Builder();
                if (!MimeTypes.isAudio(str5)) {
                }
                if (this.name != null) {
                }
                Format formatBuild222222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str5).setMaxInputSize(i4).setLanguage(this.language).setSelectionFlags(i8 | (z222222222222222222222222222222222 ? 1 : 0)).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                TrackOutput trackOutputTrack222222222222222222222222222222222 = extractorOutput.track(this.number, i6);
                this.output = trackOutputTrack222222222222222222222222222222222;
                trackOutputTrack222222222222222222222222222222222.format(formatBuild222222222222222222222222222222222);
                return;
            default:
                throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", (Throwable) null);
        }
    }

    @RequiresNonNull
    public void outputPendingSampleMetadata() {
        TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
        }
    }

    public void reset() {
        TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.reset();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean samplesHaveSupplementalData(boolean z) {
        return "A_OPUS".equals(this.codecId) ? z : this.maxBlockAdditionId > 0;
    }

    private byte[] getHdrStaticInfo() {
        if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
            return null;
        }
        byte[] bArr = new byte[25];
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put((byte) 0);
        byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
        byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
        byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
        byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
        byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
        byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
        byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
        byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
        byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
        byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
        byteBufferOrder.putShort((short) this.maxContentLuminance);
        byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
        return bArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
        try {
            parsableByteArray.skipBytes(16);
            long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
            if (littleEndianUnsignedInt == 1482049860) {
                return new Pair<>("video/divx", null);
            }
            if (littleEndianUnsignedInt == 859189832) {
                return new Pair<>("video/3gpp", null);
            }
            if (littleEndianUnsignedInt == 826496599) {
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", (Throwable) null);
            }
            Log.w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
            return new Pair<>("video/x-unknown", null);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw ParserException.createForMalformedContainer("Error parsing FourCC private data", (Throwable) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
        int i2;
        int i3;
        try {
            if (bArr[0] != 2) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
            }
            int i4 = 0;
            int i5 = 1;
            while (true) {
                i2 = bArr[i5] & OggPageHeader.MAX_SEGMENT_COUNT;
                if (i2 != 255) {
                    break;
                }
                i4 += OggPageHeader.MAX_SEGMENT_COUNT;
                i5++;
            }
            int i6 = i5 + 1;
            int i7 = i4 + i2;
            int i8 = 0;
            while (true) {
                i3 = bArr[i6] & OggPageHeader.MAX_SEGMENT_COUNT;
                if (i3 != 255) {
                    break;
                }
                i8 += OggPageHeader.MAX_SEGMENT_COUNT;
                i6++;
            }
            int i9 = i6 + 1;
            if (bArr[i9] != 1) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
            }
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, i9, bArr2, 0, i7);
            int i10 = i9 + i7;
            if (bArr[i10] != 3) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
            }
            int i11 = i10 + i8 + i3;
            if (bArr[i11] != 5) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
            }
            byte[] bArr3 = new byte[bArr.length - i11];
            System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bArr2);
            arrayList.add(bArr3);
            return arrayList;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", (Throwable) null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
        try {
            int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
            if (littleEndianUnsignedShort == 1) {
                return true;
            }
            if (littleEndianUnsignedShort != 65534) {
                return false;
            }
            parsableByteArray.setPosition(24);
            if (parsableByteArray.readLong() == MatroskaExtractor.access$700().getMostSignificantBits()) {
                return parsableByteArray.readLong() == MatroskaExtractor.access$700().getLeastSignificantBits();
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", (Throwable) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @EnsuresNonNull
    public void assertOutputInitialized() {
        Assertions.checkNotNull(this.output);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.exoplayer2.ParserException */
    @EnsuresNonNull
    private byte[] getCodecPrivate(String str) throws ParserException {
        byte[] bArr = this.codecPrivate;
        if (bArr != null) {
            return bArr;
        }
        throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, (Throwable) null);
    }
}
