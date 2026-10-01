package o;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import o.AppBarKtExternalSyntheticLambda5;
import o.AppBarKtExternalSyntheticLambda9;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class AppBarKtExternalSyntheticLambda9 {
    private static final HashMap<onNavigationEvent, List<AppBarKtExternalSyntheticLambda5>> onExtraCallback = new HashMap<>();
    private static int onWarmupCompleted = -1;

    interface onExtraCallbackWithResult {
        MediaCodecInfo IAuthTabCallback(int i2);

        boolean IAuthTabCallback(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean onExtraCallback();

        int onExtraCallbackWithResult();

        boolean onNavigationEvent(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);
    }

    public interface onWarmupCompleted<T> {
        int getScore(T t);
    }

    public static class onExtraCallback extends Exception {
        private onExtraCallback(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    private AppBarKtExternalSyntheticLambda9() {
    }

    public static AppBarKtExternalSyntheticLambda5 onWarmupCompleted() throws onExtraCallback {
        return onNavigationEvent("audio/raw", false, false);
    }

    public static AppBarKtExternalSyntheticLambda5 onNavigationEvent(String str, boolean z, boolean z2) throws onExtraCallback {
        List<AppBarKtExternalSyntheticLambda5> listOnExtraCallback = onExtraCallback(str, z, z2);
        if (listOnExtraCallback.isEmpty()) {
            return null;
        }
        return listOnExtraCallback.get(0);
    }

    public static List<AppBarKtExternalSyntheticLambda5> onExtraCallback(String str, boolean z, boolean z2) throws onExtraCallback {
        synchronized (AppBarKtExternalSyntheticLambda9.class) {
            onNavigationEvent onnavigationevent = new onNavigationEvent(str, z, z2);
            HashMap<onNavigationEvent, List<AppBarKtExternalSyntheticLambda5>> map = onExtraCallback;
            List<AppBarKtExternalSyntheticLambda5> list = map.get(onnavigationevent);
            if (list != null) {
                return list;
            }
            ArrayList<AppBarKtExternalSyntheticLambda5> arrayListIAuthTabCallback = IAuthTabCallback(onnavigationevent, new IAuthTabCallback(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                arrayListIAuthTabCallback.isEmpty();
            }
            onExtraCallback(str, arrayListIAuthTabCallback);
            ImmutableList immutableListCopyOf = ImmutableList.copyOf(arrayListIAuthTabCallback);
            map.put(onnavigationevent, immutableListCopyOf);
            return immutableListCopyOf;
        }
    }

    @RequiresNonNull
    public static List<AppBarKtExternalSyntheticLambda5> onExtraCallbackWithResult(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z, boolean z2) throws onExtraCallback {
        List<AppBarKtExternalSyntheticLambda5> decoderInfos = appBarKtExternalSyntheticLambda6.getDecoderInfos(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable, z, z2);
        return ImmutableList.builder().addAll(decoderInfos).addAll(onNavigationEvent(appBarKtExternalSyntheticLambda6, basicTextContextMenuProviderKtExternalSyntheticLambda4, z, z2)).build();
    }

    public static List<AppBarKtExternalSyntheticLambda5> onNavigationEvent(AppBarKtExternalSyntheticLambda6 appBarKtExternalSyntheticLambda6, BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, boolean z, boolean z2) throws onExtraCallback {
        String strOnExtraCallback = onExtraCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
        if (strOnExtraCallback == null) {
            return ImmutableList.of();
        }
        return appBarKtExternalSyntheticLambda6.getDecoderInfos(strOnExtraCallback, z, z2);
    }

    public static List<AppBarKtExternalSyntheticLambda5> onExtraCallback(List<AppBarKtExternalSyntheticLambda5> list, final BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        ArrayList arrayList = new ArrayList(list);
        IAuthTabCallback(arrayList, new onWarmupCompleted() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda4
            @Override // o.AppBarKtExternalSyntheticLambda9.onWarmupCompleted
            public final int getScore(Object obj) {
                return AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4, (AppBarKtExternalSyntheticLambda5) obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        return appBarKtExternalSyntheticLambda5.onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4) ? 1 : 0;
    }

    public static /* synthetic */ int onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        try {
            return appBarKtExternalSyntheticLambda5.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4) ? 1 : 0;
        } catch (onExtraCallback unused) {
            return -1;
        }
    }

    public static List<AppBarKtExternalSyntheticLambda5> onExtraCallbackWithResult(List<AppBarKtExternalSyntheticLambda5> list) {
        ArrayList arrayList = new ArrayList(list);
        IAuthTabCallback(arrayList, new onWarmupCompleted() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda0
            @Override // o.AppBarKtExternalSyntheticLambda9.onWarmupCompleted
            public final int getScore(Object obj) {
                return AppBarKtExternalSyntheticLambda9.onExtraCallback((AppBarKtExternalSyntheticLambda5) obj);
            }
        });
        return ImmutableList.copyOf(arrayList);
    }

    public static /* synthetic */ int onExtraCallback(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        return (appBarKtExternalSyntheticLambda5.IAuthTabCallbackDefault ? 2 : 0) + (!appBarKtExternalSyntheticLambda5.access100 ? 1 : 0);
    }

    @Deprecated
    public static Pair<Integer, Integer> onNavigationEvent(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        return TextFieldCoreModifierNodeExternalSyntheticLambda1.IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4);
    }

    public static Pair<Integer, Integer> onExtraCallbackWithResult(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        String strOnNavigationEvent = TextFieldKeyEventHandlerExternalSyntheticLambda1.onNavigationEvent((List<byte[]>) basicTextContextMenuProviderKtExternalSyntheticLambda4.onMessageChannelReady);
        if (strOnNavigationEvent == null) {
            return null;
        }
        return TextFieldCoreModifierNodeExternalSyntheticLambda1.onExtraCallback(strOnNavigationEvent, TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(strOnNavigationEvent.trim(), "\\."), basicTextContextMenuProviderKtExternalSyntheticLambda4.onTransact);
    }

    public static String onExtraCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4) {
        Pair<Integer, Integer> pairOnNavigationEvent;
        if ("audio/eac3-joc".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable) && (pairOnNavigationEvent = onNavigationEvent(basicTextContextMenuProviderKtExternalSyntheticLambda4)) != null) {
            int iIntValue = ((Integer) pairOnNavigationEvent.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable)) {
            return "video/hevc";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static ArrayList<AppBarKtExternalSyntheticLambda5> IAuthTabCallback(onNavigationEvent onnavigationevent, onExtraCallbackWithResult onextracallbackwithresult) throws Exception {
        String strOnExtraCallback;
        String str;
        String str2;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean zIAuthTabCallback;
        boolean zOnNavigationEvent;
        boolean z;
        String str3;
        int i2;
        boolean z2;
        String str4;
        StringBuilder sb;
        try {
            ArrayList<AppBarKtExternalSyntheticLambda5> arrayList = new ArrayList<>();
            String str5 = onnavigationevent.onNavigationEvent;
            int iOnExtraCallbackWithResult = onextracallbackwithresult.onExtraCallbackWithResult();
            boolean zOnExtraCallback = onextracallbackwithresult.onExtraCallback();
            int i3 = 0;
            while (i3 < iOnExtraCallbackWithResult) {
                MediaCodecInfo mediaCodecInfoIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback(i3);
                if (IAuthTabCallback(mediaCodecInfoIAuthTabCallback)) {
                    i2 = i3;
                    z2 = zOnExtraCallback;
                } else {
                    String name = mediaCodecInfoIAuthTabCallback.getName();
                    if (IAuthTabCallback(mediaCodecInfoIAuthTabCallback, name, zOnExtraCallback, str5) && (strOnExtraCallback = onExtraCallback(mediaCodecInfoIAuthTabCallback, name, str5)) != null) {
                        try {
                            capabilitiesForType = mediaCodecInfoIAuthTabCallback.getCapabilitiesForType(strOnExtraCallback);
                            zIAuthTabCallback = onextracallbackwithresult.IAuthTabCallback("tunneled-playback", strOnExtraCallback, capabilitiesForType);
                            zOnNavigationEvent = onextracallbackwithresult.onNavigationEvent("tunneled-playback", strOnExtraCallback, capabilitiesForType);
                            z = onnavigationevent.onExtraCallbackWithResult;
                        } catch (Exception e) {
                            e = e;
                            str = strOnExtraCallback;
                            str2 = name;
                        }
                        if ((z || !zOnNavigationEvent) && (!z || zIAuthTabCallback)) {
                            boolean zIAuthTabCallback2 = onextracallbackwithresult.IAuthTabCallback("secure-playback", strOnExtraCallback, capabilitiesForType);
                            boolean zOnNavigationEvent2 = onextracallbackwithresult.onNavigationEvent("secure-playback", strOnExtraCallback, capabilitiesForType);
                            boolean z3 = onnavigationevent.IAuthTabCallback;
                            if ((z3 || !zOnNavigationEvent2) && (!z3 || zIAuthTabCallback2)) {
                                boolean zOnWarmupCompleted = onWarmupCompleted(mediaCodecInfoIAuthTabCallback, str5);
                                boolean zOnExtraCallbackWithResult = onExtraCallbackWithResult(mediaCodecInfoIAuthTabCallback, str5);
                                boolean zOnNavigationEvent3 = onNavigationEvent(mediaCodecInfoIAuthTabCallback);
                                if (!zOnExtraCallback || onnavigationevent.IAuthTabCallback != zIAuthTabCallback2) {
                                    if (!zOnExtraCallback) {
                                        try {
                                            if (!onnavigationevent.IAuthTabCallback) {
                                                str = strOnExtraCallback;
                                                str3 = name;
                                                i2 = i3;
                                                z2 = zOnExtraCallback;
                                                try {
                                                    arrayList.add(AppBarKtExternalSyntheticLambda5.onNavigationEvent(name, str5, strOnExtraCallback, capabilitiesForType, zOnWarmupCompleted, zOnExtraCallbackWithResult, zOnNavigationEvent3, false, false));
                                                } catch (Exception e2) {
                                                    e = e2;
                                                    str2 = str3;
                                                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                    throw e;
                                                }
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            str = strOnExtraCallback;
                                            str3 = name;
                                            str2 = str3;
                                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                    str = strOnExtraCallback;
                                    i2 = i3;
                                    z2 = zOnExtraCallback;
                                    if (!z2 && zIAuthTabCallback2) {
                                        try {
                                            sb = new StringBuilder();
                                            str4 = name;
                                        } catch (Exception e4) {
                                            e = e4;
                                            str4 = name;
                                        }
                                        try {
                                            sb.append(str4);
                                            sb.append(".secure");
                                            arrayList.add(AppBarKtExternalSyntheticLambda5.onNavigationEvent(sb.toString(), str5, str, capabilitiesForType, zOnWarmupCompleted, zOnExtraCallbackWithResult, zOnNavigationEvent3, false, true));
                                            return arrayList;
                                        } catch (Exception e5) {
                                            e = e5;
                                            str2 = str4;
                                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                            throw e;
                                        }
                                    }
                                }
                                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallback("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                throw e;
                            }
                        }
                    }
                }
                i3 = i2 + 1;
                zOnExtraCallback = z2;
            }
            return arrayList;
        } catch (Exception e6) {
            throw new onExtraCallback(e6);
        }
    }

    private static String onExtraCallback(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    private static boolean IAuthTabCallback(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z || !str.endsWith(".secure");
    }

    private static void onExtraCallback(String str, List<AppBarKtExternalSyntheticLambda5> list) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && list.get(0).IAuthTabCallbackStub.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(AppBarKtExternalSyntheticLambda5.onNavigationEvent("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            IAuthTabCallback(list, new onWarmupCompleted() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda3
                @Override // o.AppBarKtExternalSyntheticLambda9.onWarmupCompleted
                public final int getScore(Object obj) {
                    return AppBarKtExternalSyntheticLambda9.onWarmupCompleted((AppBarKtExternalSyntheticLambda5) obj);
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(list.get(0).IAuthTabCallbackStub)) {
            return;
        }
        list.add(list.remove(0));
    }

    public static /* synthetic */ int onWarmupCompleted(AppBarKtExternalSyntheticLambda5 appBarKtExternalSyntheticLambda5) {
        String str = appBarKtExternalSyntheticLambda5.IAuthTabCallbackStub;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static boolean IAuthTabCallback(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && onExtraCallback(mediaCodecInfo);
    }

    private static boolean onExtraCallback(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean onWarmupCompleted(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return onWarmupCompleted(mediaCodecInfo);
        }
        return !onExtraCallbackWithResult(mediaCodecInfo, str);
    }

    private static boolean onWarmupCompleted(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean onExtraCallbackWithResult(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return onExtraCallbackWithResult(mediaCodecInfo);
        }
        if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str)) {
            return true;
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        if (lowerCase.startsWith("arc.")) {
            return false;
        }
        return lowerCase.startsWith("omx.google.") || lowerCase.startsWith("omx.ffmpeg.") || (lowerCase.startsWith("omx.sec.") && lowerCase.contains(".sw.")) || lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.") || !(lowerCase.startsWith("omx.") || lowerCase.startsWith("c2."));
    }

    private static boolean onExtraCallbackWithResult(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean onNavigationEvent(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return onTransact(mediaCodecInfo);
        }
        String lowerCase = Ascii.toLowerCase(mediaCodecInfo.getName());
        return (lowerCase.startsWith("omx.google.") || lowerCase.startsWith("c2.android.") || lowerCase.startsWith("c2.google.")) ? false : true;
    }

    private static boolean onTransact(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }

    public static /* synthetic */ int IAuthTabCallback(onWarmupCompleted onwarmupcompleted, Object obj, Object obj2) {
        return onwarmupcompleted.getScore(obj2) - onwarmupcompleted.getScore(obj);
    }

    private static <T> void IAuthTabCallback(List<T> list, final onWarmupCompleted<T> onwarmupcompleted) {
        Collections.sort(list, new Comparator() { // from class: androidx.media3.exoplayer.mediacodec.MediaCodecUtil$$ExternalSyntheticLambda2
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AppBarKtExternalSyntheticLambda9.IAuthTabCallback(onwarmupcompleted, obj, obj2);
            }
        });
    }

    static final class IAuthTabCallback implements onExtraCallbackWithResult {
        private MediaCodecInfo[] onNavigationEvent;
        private final int onWarmupCompleted;

        @Override // o.AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult
        public boolean onExtraCallback() {
            return true;
        }

        public IAuthTabCallback(boolean z, boolean z2, boolean z3) {
            this.onWarmupCompleted = (z || z2 || z3) ? 1 : 0;
        }

        @Override // o.AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult
        public int onExtraCallbackWithResult() {
            onNavigationEvent();
            return this.onNavigationEvent.length;
        }

        @Override // o.AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult
        public MediaCodecInfo IAuthTabCallback(int i2) {
            onNavigationEvent();
            return this.onNavigationEvent[i2];
        }

        @Override // o.AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult
        public boolean IAuthTabCallback(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // o.AppBarKtExternalSyntheticLambda9.onExtraCallbackWithResult
        public boolean onNavigationEvent(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @EnsuresNonNull
        private void onNavigationEvent() {
            if (this.onNavigationEvent == null) {
                this.onNavigationEvent = new MediaCodecList(this.onWarmupCompleted).getCodecInfos();
            }
        }
    }

    static final class onNavigationEvent {
        public final boolean IAuthTabCallback;
        public final boolean onExtraCallbackWithResult;
        public final String onNavigationEvent;

        public onNavigationEvent(String str, boolean z, boolean z2) {
            this.onNavigationEvent = str;
            this.IAuthTabCallback = z;
            this.onExtraCallbackWithResult = z2;
        }

        public int hashCode() {
            int iHashCode = this.onNavigationEvent.hashCode();
            return ((((iHashCode + 31) * 31) + (this.IAuthTabCallback ? 1231 : 1237)) * 31) + (this.onExtraCallbackWithResult ? 1231 : 1237);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || obj.getClass() != onNavigationEvent.class) {
                return false;
            }
            onNavigationEvent onnavigationevent = (onNavigationEvent) obj;
            return TextUtils.equals(this.onNavigationEvent, onnavigationevent.onNavigationEvent) && this.IAuthTabCallback == onnavigationevent.IAuthTabCallback && this.onExtraCallbackWithResult == onnavigationevent.onExtraCallbackWithResult;
        }
    }
}
