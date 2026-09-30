package o;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import com.bytedance.sdk.openadsdk.oty.sya;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class loadLayoutDescription {
    public static JSONArray onExtraCallbackWithResult() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        HashSet hashSet = new HashSet();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder() && (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias())) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equals("video/hevc") && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType("video/hevc")) != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            hashSet.add(onExtraCallbackWithResult(codecProfileLevel.level));
                        }
                    }
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }

    private static String onExtraCallbackWithResult(int i2) throws SecurityException {
        for (Field field : MediaCodecInfo.CodecProfileLevel.class.getFields()) {
            String name = field.getName();
            if (field.getType() == Integer.TYPE && name.contains("HEVC")) {
                try {
                    if (field.getInt(null) == i2) {
                        return name;
                    }
                } catch (IllegalAccessException e) {
                    sya.ycx(e, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un0pRD204=", "becpkAyYbMSPTtJomBis", "XOs5vSaKSuuFXNJRohCtLQ==", 83);
                }
            }
        }
        return String.valueOf(i2);
    }

    public static int onExtraCallbackWithResult(File file) throws Throwable {
        Throwable th;
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return -1;
        }
        long length = file.length();
        if (length <= 0) {
            return -1;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = fileInputStream2;
        }
        try {
            byte[] bArr = new byte[8];
            long j = 0;
            while (fileInputStream.read(bArr) == 8) {
                long j2 = ((bArr[1] & 255) << 16) | ((bArr[0] & 255) << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                if (bArr[4] != 109 || bArr[5] != 111 || bArr[6] != 111 || bArr[7] != 118) {
                    long j3 = j2 - 8;
                    if (j3 > 0 && fileInputStream.skip(j3) < j3) {
                        break;
                    }
                    j += j2;
                } else {
                    break;
                }
            }
            int i2 = (int) ((j * 100.0f) / length);
            try {
                fileInputStream.close();
                return i2;
            } catch (Exception e2) {
                sya.ycx(e2, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un0pRD204=", "becpkAyYbMSPTtJomBis", "XOs5uDPoT86MT/pSgweCJ0PeIoYKqGDIjg==", 148);
                return i2;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            sya.ycx(e, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un0pRD204=", "becpkAyYbMSPTtJomBis", "XOs5uDPoT86MT/pSgweCJ0PeIoYKqGDIjg==", 139);
            if (fileInputStream2 == null) {
                return -1;
            }
            try {
                fileInputStream2.close();
                return -1;
            } catch (Exception e4) {
                sya.ycx(e4, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un0pRD204=", "becpkAyYbMSPTtJomBis", "XOs5uDPoT86MT/pSgweCJ0PeIoYKqGDIjg==", 148);
                return -1;
            }
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (Exception e5) {
                    sya.ycx(e5, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un0pRD204=", "becpkAyYbMSPTtJomBis", "XOs5uDPoT86MT/pSgweCJ0PeIoYKqGDIjg==", 148);
                    throw th;
                }
            }
            throw th;
        }
    }

    public static int onWarmupCompleted(String str) {
        MediaExtractor mediaExtractor;
        try {
            mediaExtractor = new MediaExtractor();
        } catch (Throwable th) {
            th = th;
            mediaExtractor = null;
        }
        try {
            mediaExtractor.setDataSource(str);
            int trackCount = mediaExtractor.getTrackCount();
            for (int i2 = 0; i2 < trackCount; i2++) {
                MediaFormat trackFormat = mediaExtractor.getTrackFormat(i2);
                String string = trackFormat.getString("mime");
                if (string != null && (("video/avc".equals(string) || "video/hevc".equals(string)) && trackFormat.containsKey("level"))) {
                    int integer = trackFormat.getInteger("level");
                    mediaExtractor.release();
                    return integer;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            sya.ycx(th, "WOEg2wGlYtHOXNwTgwGlJk3lY5YMsXnIjk/ZScIHqSxe4WOUE7Un0pRD204=", "becpkAyYbMSPTtJomBis", "XOs5uDPoRcKWT9s=", 179);
            if (mediaExtractor == null) {
                return -1;
            }
            mediaExtractor.release();
            return -1;
        }
        mediaExtractor.release();
        return -1;
    }
}
