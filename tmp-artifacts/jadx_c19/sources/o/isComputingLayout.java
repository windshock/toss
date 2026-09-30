package o;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Range;
import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class isComputingLayout {
    private static final addFocusables onExtraCallbackWithResult = addFocusables.onExtraCallback(isComputingLayout.class.getSimpleName());
    static boolean onWarmupCompleted = true;
    private final MediaCodecInfo.AudioCapabilities IAuthTabCallback;
    private final MediaCodecInfo.VideoCapabilities onExtraCallback;
    private final MediaCodecInfo onNavigationEvent;
    private final MediaCodecInfo onTransact;

    public class onExtraCallback extends RuntimeException {
        private onExtraCallback(@NonNull String str) {
            super(str);
        }
    }

    public class onExtraCallbackWithResult extends RuntimeException {
        private onExtraCallbackWithResult(@NonNull String str) {
            super(str);
        }
    }

    public isComputingLayout(int i2, @NonNull String str, @NonNull String str2, int i3, int i4) {
        if (onWarmupCompleted) {
            List<MediaCodecInfo> listOnExtraCallbackWithResult = onExtraCallbackWithResult();
            MediaCodecInfo mediaCodecInfoOnExtraCallbackWithResult = onExtraCallbackWithResult(listOnExtraCallbackWithResult, str, i2, i3);
            this.onTransact = mediaCodecInfoOnExtraCallbackWithResult;
            addFocusables addfocusables = onExtraCallbackWithResult;
            addfocusables.onExtraCallbackWithResult(new Object[]{"Enabled. Found video encoder:", mediaCodecInfoOnExtraCallbackWithResult.getName()});
            MediaCodecInfo mediaCodecInfoOnExtraCallbackWithResult2 = onExtraCallbackWithResult(listOnExtraCallbackWithResult, str2, i2, i4);
            this.onNavigationEvent = mediaCodecInfoOnExtraCallbackWithResult2;
            addfocusables.onExtraCallbackWithResult(new Object[]{"Enabled. Found audio encoder:", mediaCodecInfoOnExtraCallbackWithResult2.getName()});
            this.onExtraCallback = mediaCodecInfoOnExtraCallbackWithResult.getCapabilitiesForType(str).getVideoCapabilities();
            this.IAuthTabCallback = mediaCodecInfoOnExtraCallbackWithResult2.getCapabilitiesForType(str2).getAudioCapabilities();
            return;
        }
        this.onTransact = null;
        this.onNavigationEvent = null;
        this.onExtraCallback = null;
        this.IAuthTabCallback = null;
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"Disabled."});
    }

    List<MediaCodecInfo> onExtraCallbackWithResult() {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        return arrayList;
    }

    boolean IAuthTabCallback(@NonNull String str) {
        String lowerCase = str.toLowerCase();
        return !(lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2.")));
    }

    MediaCodecInfo onExtraCallbackWithResult(@NonNull List<MediaCodecInfo> list, @NonNull String str, int i2, int i3) {
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : list) {
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            int length = supportedTypes.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (supportedTypes[i4].equalsIgnoreCase(str)) {
                    arrayList.add(mediaCodecInfo);
                    break;
                }
                i4++;
            }
        }
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"findDeviceEncoder -", "type:", str, "encoders:", Integer.valueOf(arrayList.size())});
        if (i2 == 1) {
            Collections.sort(arrayList, new Comparator<MediaCodecInfo>() { // from class: o.isComputingLayout.1
                @Override // java.util.Comparator
                /* renamed from: onExtraCallback, reason: merged with bridge method [inline-methods] */
                public int compare(MediaCodecInfo mediaCodecInfo2, MediaCodecInfo mediaCodecInfo3) {
                    return Boolean.compare(isComputingLayout.this.IAuthTabCallback(mediaCodecInfo3.getName()), isComputingLayout.this.IAuthTabCallback(mediaCodecInfo2.getName()));
                }
            });
        }
        if (arrayList.size() < i3 + 1) {
            throw new RuntimeException("No encoders for type:" + str);
        }
        return (MediaCodecInfo) arrayList.get(i3);
    }

    public removeOnChildAttachStateChangeListener onNavigationEvent(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener) {
        if (!onWarmupCompleted) {
            return removeonchildattachstatechangelistener;
        }
        int iOnExtraCallback = removeonchildattachstatechangelistener.onExtraCallback();
        int iOnExtraCallbackWithResult = removeonchildattachstatechangelistener.onExtraCallbackWithResult();
        double d = iOnExtraCallback / iOnExtraCallbackWithResult;
        addFocusables addfocusables = onExtraCallbackWithResult;
        addfocusables.onExtraCallbackWithResult(new Object[]{"getSupportedVideoSize - started. width:", Integer.valueOf(iOnExtraCallback), "height:", Integer.valueOf(iOnExtraCallbackWithResult)});
        if (((Integer) this.onExtraCallback.getSupportedWidths().getUpper()).intValue() < iOnExtraCallback) {
            Integer num = (Integer) this.onExtraCallback.getSupportedWidths().getUpper();
            iOnExtraCallback = num.intValue();
            int iRound = (int) Math.round(iOnExtraCallback / d);
            addfocusables.onExtraCallbackWithResult(new Object[]{"getSupportedVideoSize - exceeds maxWidth! width:", num, "height:", Integer.valueOf(iRound)});
            iOnExtraCallbackWithResult = iRound;
        }
        if (((Integer) this.onExtraCallback.getSupportedHeights().getUpper()).intValue() < iOnExtraCallbackWithResult) {
            Integer num2 = (Integer) this.onExtraCallback.getSupportedHeights().getUpper();
            int iIntValue = num2.intValue();
            int iRound2 = (int) Math.round(iIntValue * d);
            addfocusables.onExtraCallbackWithResult(new Object[]{"getSupportedVideoSize - exceeds maxHeight! width:", Integer.valueOf(iRound2), "height:", num2});
            iOnExtraCallbackWithResult = iIntValue;
            iOnExtraCallback = iRound2;
        }
        while (iOnExtraCallback % this.onExtraCallback.getWidthAlignment() != 0) {
            iOnExtraCallback--;
        }
        while (iOnExtraCallbackWithResult % this.onExtraCallback.getHeightAlignment() != 0) {
            iOnExtraCallbackWithResult--;
        }
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"getSupportedVideoSize - aligned. width:", Integer.valueOf(iOnExtraCallback), "height:", Integer.valueOf(iOnExtraCallbackWithResult)});
        if (!this.onExtraCallback.getSupportedWidths().contains((Range<Integer>) Integer.valueOf(iOnExtraCallback))) {
            throw new onExtraCallback("Width not supported after adjustment. Desired:" + iOnExtraCallback + " Range:" + this.onExtraCallback.getSupportedWidths());
        }
        if (!this.onExtraCallback.getSupportedHeights().contains((Range<Integer>) Integer.valueOf(iOnExtraCallbackWithResult))) {
            throw new onExtraCallback("Height not supported after adjustment. Desired:" + iOnExtraCallbackWithResult + " Range:" + this.onExtraCallback.getSupportedHeights());
        }
        try {
            if (!this.onExtraCallback.getSupportedHeightsFor(iOnExtraCallback).contains((Range<Integer>) Integer.valueOf(iOnExtraCallbackWithResult))) {
                int iIntValue2 = ((Integer) this.onExtraCallback.getSupportedWidths().getLower()).intValue();
                int widthAlignment = this.onExtraCallback.getWidthAlignment();
                int i2 = iOnExtraCallback;
                while (i2 >= iIntValue2) {
                    i2 -= 32;
                    while (i2 % widthAlignment != 0) {
                        i2--;
                    }
                    int iRound3 = (int) Math.round(i2 / d);
                    if (this.onExtraCallback.getSupportedHeightsFor(i2).contains((Range<Integer>) Integer.valueOf(iRound3))) {
                        onExtraCallbackWithResult.onWarmupCompleted(new Object[]{"getSupportedVideoSize - restarting with smaller size."});
                        return onNavigationEvent(new removeOnChildAttachStateChangeListener(i2, iRound3));
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        if (!this.onExtraCallback.isSizeSupported(iOnExtraCallback, iOnExtraCallbackWithResult)) {
            throw new onExtraCallback("Size not supported for unknown reason. Might be an aspect ratio issue. Desired size:" + new removeOnChildAttachStateChangeListener(iOnExtraCallback, iOnExtraCallbackWithResult));
        }
        return new removeOnChildAttachStateChangeListener(iOnExtraCallback, iOnExtraCallbackWithResult);
    }

    public int onWarmupCompleted(int i2) {
        if (!onWarmupCompleted) {
            return i2;
        }
        Integer num = (Integer) this.onExtraCallback.getBitrateRange().clamp(Integer.valueOf(i2));
        int iIntValue = num.intValue();
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"getSupportedVideoBitRate -", "inputRate:", Integer.valueOf(i2), "adjustedRate:", num});
        return iIntValue;
    }

    public int onWarmupCompleted(@NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, int i2) {
        if (!onWarmupCompleted) {
            return i2;
        }
        int iDoubleValue = (int) ((Double) this.onExtraCallback.getSupportedFrameRatesFor(removeonchildattachstatechangelistener.onExtraCallback(), removeonchildattachstatechangelistener.onExtraCallbackWithResult()).clamp(Double.valueOf(i2))).doubleValue();
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"getSupportedVideoFrameRate -", "inputRate:", Integer.valueOf(i2), "adjustedRate:", Integer.valueOf(iDoubleValue)});
        return iDoubleValue;
    }

    public int onExtraCallback(int i2) {
        if (!onWarmupCompleted) {
            return i2;
        }
        Integer num = (Integer) this.IAuthTabCallback.getBitrateRange().clamp(Integer.valueOf(i2));
        int iIntValue = num.intValue();
        onExtraCallbackWithResult.onExtraCallbackWithResult(new Object[]{"getSupportedAudioBitRate -", "inputRate:", Integer.valueOf(i2), "adjustedRate:", num});
        return iIntValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void IAuthTabCallback(@NonNull String str, @NonNull removeOnChildAttachStateChangeListener removeonchildattachstatechangelistener, int i2, int i3) throws Throwable {
        MediaCodec mediaCodecCreateByCodecName;
        if (this.onTransact == null) {
            return;
        }
        MediaCodec mediaCodec = null;
        Object[] objArr = 0;
        try {
            MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(str, removeonchildattachstatechangelistener.onExtraCallback(), removeonchildattachstatechangelistener.onExtraCallbackWithResult());
            mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
            mediaFormatCreateVideoFormat.setInteger("bitrate", i3);
            mediaFormatCreateVideoFormat.setInteger("frame-rate", i2);
            mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 1);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(this.onTransact.getName());
            try {
                try {
                    mediaCodecCreateByCodecName.configure(mediaFormatCreateVideoFormat, (Surface) null, (MediaCrypto) null, 1);
                    try {
                        mediaCodecCreateByCodecName.release();
                    } catch (Exception unused) {
                    }
                } catch (Exception e) {
                    e = e;
                    throw new onExtraCallback("Failed to configure video codec: " + e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.release();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        } catch (Throwable th2) {
            th = th2;
            if (mediaCodec != null) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(@NonNull String str, int i2, int i3, int i4) throws Throwable {
        MediaCodec mediaCodecCreateByCodecName;
        if (this.onNavigationEvent == null) {
            return;
        }
        MediaCodec mediaCodec = null;
        Object[] objArr = 0;
        try {
            MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat(str, i3, i4);
            mediaFormatCreateAudioFormat.setInteger("channel-mask", i4 == 2 ? 12 : 16);
            mediaFormatCreateAudioFormat.setInteger("bitrate", i2);
            mediaCodecCreateByCodecName = MediaCodec.createByCodecName(this.onNavigationEvent.getName());
            try {
                try {
                    mediaCodecCreateByCodecName.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
                    try {
                        mediaCodecCreateByCodecName.release();
                    } catch (Exception unused) {
                    }
                } catch (Exception e) {
                    e = e;
                    throw new onExtraCallbackWithResult("Failed to configure video audio: " + e.getMessage());
                }
            } catch (Throwable th) {
                th = th;
                mediaCodec = mediaCodecCreateByCodecName;
                if (mediaCodec != null) {
                    try {
                        mediaCodec.release();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            mediaCodecCreateByCodecName = null;
        } catch (Throwable th2) {
            th = th2;
            if (mediaCodec != null) {
            }
            throw th;
        }
    }
}
