package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Ints;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.setApTextSize;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class SelectionManagerExternalSyntheticLambda13 {
    public static final SelectionManagerExternalSyntheticLambda13 IAuthTabCallback = new SelectionManagerExternalSyntheticLambda13(ImmutableList.of(onExtraCallbackWithResult.onExtraCallbackWithResult));
    private static final ImmutableList<Integer> onExtraCallback = ImmutableList.of(2, 5, 6);
    static final ImmutableMap<Integer, Integer> onExtraCallbackWithResult = new ImmutableMap.Builder().put(5, 6).put(17, 6).put(7, 6).put(30, 10).put(18, 6).put(6, 8).put(8, 8).put(14, 8).buildOrThrow();
    private final SparseArray<onExtraCallbackWithResult> onNavigationEvent;
    private final int onWarmupCompleted;

    static SelectionManagerExternalSyntheticLambda13 onExtraCallbackWithResult(Context context, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, @Nullable SelectionManagerExternalSyntheticLambda4 selectionManagerExternalSyntheticLambda4) {
        return onNavigationEvent(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), textContextMenuHelperApi28ExternalSyntheticLambda5, selectionManagerExternalSyntheticLambda4);
    }

    static SelectionManagerExternalSyntheticLambda13 onNavigationEvent(Context context, @Nullable Intent intent, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5, @Nullable SelectionManagerExternalSyntheticLambda4 selectionManagerExternalSyntheticLambda4) {
        AudioManager audioManagerOnNavigationEvent = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda7.onNavigationEvent(context);
        if (selectionManagerExternalSyntheticLambda4 == null) {
            selectionManagerExternalSyntheticLambda4 = Build.VERSION.SDK_INT >= 33 ? onExtraCallback.onNavigationEvent(audioManagerOnNavigationEvent, textContextMenuHelperApi28ExternalSyntheticLambda5) : null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33 && (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onTransact(context) || TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(context))) {
            return onExtraCallback.IAuthTabCallback(audioManagerOnNavigationEvent, textContextMenuHelperApi28ExternalSyntheticLambda5);
        }
        if (IAuthTabCallback.IAuthTabCallback(audioManagerOnNavigationEvent, selectionManagerExternalSyntheticLambda4)) {
            return IAuthTabCallback;
        }
        ImmutableSet.Builder builder = new ImmutableSet.Builder();
        builder.add(2);
        if (i2 >= 29 && (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onTransact(context) || TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onWarmupCompleted(context))) {
            builder.addAll(onWarmupCompleted.onExtraCallbackWithResult(textContextMenuHelperApi28ExternalSyntheticLambda5));
            return new SelectionManagerExternalSyntheticLambda13(onNavigationEvent(Ints.toArray(builder.build()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z || onNavigationEvent()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            builder.addAll(onExtraCallback);
        }
        if (intent != null && !z && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1) {
            int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
            if (intArrayExtra != null) {
                builder.addAll(Ints.asList(intArrayExtra));
            }
            return new SelectionManagerExternalSyntheticLambda13(onNavigationEvent(Ints.toArray(builder.build()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
        }
        return new SelectionManagerExternalSyntheticLambda13(onNavigationEvent(Ints.toArray(builder.build()), 10));
    }

    static Uri onExtraCallback() {
        if (onNavigationEvent()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    private SelectionManagerExternalSyntheticLambda13(List<onExtraCallbackWithResult> list) {
        this.onNavigationEvent = new SparseArray<>();
        for (int i2 = 0; i2 < list.size(); i2++) {
            onExtraCallbackWithResult onextracallbackwithresult = list.get(i2);
            this.onNavigationEvent.put(onextracallbackwithresult.onNavigationEvent, onextracallbackwithresult);
        }
        int iMax = 0;
        for (int i3 = 0; i3 < this.onNavigationEvent.size(); i3++) {
            iMax = Math.max(iMax, this.onNavigationEvent.valueAt(i3).IAuthTabCallback);
        }
        this.onWarmupCompleted = iMax;
    }

    public boolean onExtraCallback(int i2) {
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(this.onNavigationEvent, i2);
    }

    public boolean onWarmupCompleted(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
        return IAuthTabCallback(basicTextContextMenuProviderKtExternalSyntheticLambda4, textContextMenuHelperApi28ExternalSyntheticLambda5) != null;
    }

    public Pair<Integer, Integer> IAuthTabCallback(BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
        int iOnNavigationEvent = AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onNavigationEvent((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable), basicTextContextMenuProviderKtExternalSyntheticLambda4.IAuthTabCallbackStub);
        if (!onExtraCallbackWithResult.containsKey(Integer.valueOf(iOnNavigationEvent))) {
            return null;
        }
        if (iOnNavigationEvent == 18 && !onExtraCallback(18)) {
            iOnNavigationEvent = 6;
        } else if ((iOnNavigationEvent == 8 && !onExtraCallback(8)) || (iOnNavigationEvent == 30 && !onExtraCallback(30))) {
            iOnNavigationEvent = 7;
        }
        if (!onExtraCallback(iOnNavigationEvent)) {
            return null;
        }
        onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) RecordingInputConnection_androidKt.onExtraCallbackWithResult(this.onNavigationEvent.get(iOnNavigationEvent));
        int iOnExtraCallback = basicTextContextMenuProviderKtExternalSyntheticLambda4.onNavigationEvent;
        if (iOnExtraCallback == -1 || iOnNavigationEvent == 18) {
            int i2 = basicTextContextMenuProviderKtExternalSyntheticLambda4.prefetch;
            if (i2 == -1) {
                i2 = OpusUtil.SAMPLE_RATE;
            }
            iOnExtraCallback = onextracallbackwithresult.onExtraCallback(i2, textContextMenuHelperApi28ExternalSyntheticLambda5);
        } else if (!basicTextContextMenuProviderKtExternalSyntheticLambda4.isEngagementSignalsApiAvailable.equals("audio/vnd.dts.uhd;profile=p2") || Build.VERSION.SDK_INT >= 33) {
            if (!onextracallbackwithresult.onExtraCallbackWithResult(iOnExtraCallback)) {
                return null;
            }
        } else if (iOnExtraCallback > 10) {
            return null;
        }
        int iOnNavigationEvent2 = onNavigationEvent(iOnExtraCallback);
        if (iOnNavigationEvent2 == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iOnNavigationEvent), Integer.valueOf(iOnNavigationEvent2));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionManagerExternalSyntheticLambda13)) {
            return false;
        }
        SelectionManagerExternalSyntheticLambda13 selectionManagerExternalSyntheticLambda13 = (SelectionManagerExternalSyntheticLambda13) obj;
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallbackWithResult(this.onNavigationEvent, selectionManagerExternalSyntheticLambda13.onNavigationEvent) && this.onWarmupCompleted == selectionManagerExternalSyntheticLambda13.onWarmupCompleted;
    }

    public int hashCode() {
        int i2 = this.onWarmupCompleted;
        Object[] objArr = {this.onNavigationEvent};
        int iOnNavigationEvent = setApTextSize.onNavigationEvent.4.onNavigationEvent();
        return i2 + (((Integer) TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(-2039221013, setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), setApTextSize.onNavigationEvent.4.onNavigationEvent(), iOnNavigationEvent, objArr, 2039221017)).intValue() * 31);
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.onWarmupCompleted + ", audioProfiles=" + this.onNavigationEvent + "]";
    }

    private static boolean onNavigationEvent() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    private static int onNavigationEvent(int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 <= 28) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (i3 <= 26 && "fugu".equals(Build.DEVICE) && i2 == 1) {
            i2 = 2;
        }
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableList<onExtraCallbackWithResult> onNavigationEvent(List<AudioProfile> list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(Ints.asList(new int[]{12})));
        for (int i2 = 0; i2 < list.size(); i2++) {
            AudioProfile audioProfileNT_ = SelectionManagerExternalSyntheticLambda1.nT_(list.get(i2));
            if (audioProfileNT_.getEncapsulationType() != 1) {
                int format = audioProfileNT_.getFormat();
                if (TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStubProxy(format) || onExtraCallbackWithResult.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) RecordingInputConnection_androidKt.onExtraCallbackWithResult((Set) map.get(Integer.valueOf(format)))).addAll(Ints.asList(audioProfileNT_.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(Ints.asList(audioProfileNT_.getChannelMasks())));
                    }
                }
            }
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Map.Entry entry : map.entrySet()) {
            builder.add(new onExtraCallbackWithResult(((Integer) entry.getKey()).intValue(), (Set<Integer>) entry.getValue()));
        }
        return builder.build();
    }

    private static ImmutableList<onExtraCallbackWithResult> onNavigationEvent(@Nullable int[] iArr, int i2) {
        ImmutableList.Builder builder = ImmutableList.builder();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i3 : iArr) {
            builder.add(new onExtraCallbackWithResult(i3, i2));
        }
        return builder.build();
    }

    static final class onExtraCallbackWithResult {
        public static final onExtraCallbackWithResult onExtraCallbackWithResult;
        public final int IAuthTabCallback;
        private final ImmutableSet<Integer> onExtraCallback;
        public final int onNavigationEvent;

        static {
            onExtraCallbackWithResult onextracallbackwithresult;
            if (Build.VERSION.SDK_INT >= 33) {
                onextracallbackwithresult = new onExtraCallbackWithResult(2, (Set<Integer>) IAuthTabCallback(10));
            } else {
                onextracallbackwithresult = new onExtraCallbackWithResult(2, 10);
            }
            onExtraCallbackWithResult = onextracallbackwithresult;
        }

        public onExtraCallbackWithResult(int i2, Set<Integer> set) {
            this.onNavigationEvent = i2;
            ImmutableSet<Integer> immutableSetCopyOf = ImmutableSet.copyOf(set);
            this.onExtraCallback = immutableSetCopyOf;
            UnmodifiableIterator it = immutableSetCopyOf.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.IAuthTabCallback = iMax;
        }

        public onExtraCallbackWithResult(int i2, int i3) {
            this.onNavigationEvent = i2;
            this.IAuthTabCallback = i3;
            this.onExtraCallback = null;
        }

        public boolean onExtraCallbackWithResult(int i2) {
            if (this.onExtraCallback == null) {
                return i2 <= this.IAuthTabCallback;
            }
            int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i2);
            if (iOnExtraCallback == 0) {
                return false;
            }
            return this.onExtraCallback.contains(Integer.valueOf(iOnExtraCallback));
        }

        public int onExtraCallback(int i2, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
            if (this.onExtraCallback != null) {
                return this.IAuthTabCallback;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                return onWarmupCompleted.onExtraCallbackWithResult(this.onNavigationEvent, i2, textContextMenuHelperApi28ExternalSyntheticLambda5);
            }
            return ((Integer) RecordingInputConnection_androidKt.onExtraCallbackWithResult((Integer) SelectionManagerExternalSyntheticLambda13.onExtraCallbackWithResult.getOrDefault(Integer.valueOf(this.onNavigationEvent), 0))).intValue();
        }

        private static ImmutableSet<Integer> IAuthTabCallback(int i2) {
            ImmutableSet.Builder builder = new ImmutableSet.Builder();
            for (int i3 = 1; i3 <= i2; i3++) {
                builder.add(Integer.valueOf(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i3)));
            }
            return builder.build();
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof onExtraCallbackWithResult)) {
                return false;
            }
            onExtraCallbackWithResult onextracallbackwithresult = (onExtraCallbackWithResult) obj;
            return this.onNavigationEvent == onextracallbackwithresult.onNavigationEvent && this.IAuthTabCallback == onextracallbackwithresult.IAuthTabCallback && Objects.equals(this.onExtraCallback, onextracallbackwithresult.onExtraCallback);
        }

        public int hashCode() {
            int i2 = this.onNavigationEvent;
            int i3 = this.IAuthTabCallback;
            ImmutableSet<Integer> immutableSet = this.onExtraCallback;
            return (((i2 * 31) + i3) * 31) + (immutableSet == null ? 0 : immutableSet.hashCode());
        }

        public String toString() {
            return "AudioProfile[format=" + this.onNavigationEvent + ", maxChannelCount=" + this.IAuthTabCallback + ", channelMasks=" + this.onExtraCallback + "]";
        }
    }

    static final class IAuthTabCallback {
        public static boolean IAuthTabCallback(AudioManager audioManager, @Nullable SelectionManagerExternalSyntheticLambda4 selectionManagerExternalSyntheticLambda4) {
            AudioDeviceInfo[] devices;
            if (selectionManagerExternalSyntheticLambda4 == null) {
                devices = ((AudioManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult(audioManager)).getDevices(2);
            } else {
                devices = new AudioDeviceInfo[]{selectionManagerExternalSyntheticLambda4.onExtraCallback};
            }
            ImmutableSet<Integer> immutableSetIAuthTabCallback = IAuthTabCallback();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (immutableSetIAuthTabCallback.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }

        private static ImmutableSet<Integer> IAuthTabCallback() {
            ImmutableSet.Builder builderAdd = new ImmutableSet.Builder().add(new Integer[]{8, 7});
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                builderAdd.add(new Integer[]{26, 27});
            }
            if (i2 >= 33) {
                builderAdd.add(30);
            }
            return builderAdd.build();
        }
    }

    static final class onWarmupCompleted {
        public static ImmutableList<Integer> onExtraCallbackWithResult(TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
            ImmutableList.Builder builder = ImmutableList.builder();
            UnmodifiableIterator it = SelectionManagerExternalSyntheticLambda13.onExtraCallbackWithResult.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (Build.VERSION.SDK_INT >= TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(OpusUtil.SAMPLE_RATE).build(), textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent)) {
                    builder.add(num);
                }
            }
            builder.add(2);
            return builder.build();
        }

        public static int onExtraCallbackWithResult(int i2, int i3, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
            for (int i4 = 10; i4 > 0; i4--) {
                int iOnExtraCallback = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onExtraCallback(i4);
                if (iOnExtraCallback != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(iOnExtraCallback).build(), textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent)) {
                    return i4;
                }
            }
            return 0;
        }
    }

    static final class onExtraCallback {
        public static SelectionManagerExternalSyntheticLambda13 IAuthTabCallback(AudioManager audioManager, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
            return new SelectionManagerExternalSyntheticLambda13(SelectionManagerExternalSyntheticLambda13.onNavigationEvent(audioManager.getDirectProfilesForAttributes(textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent)));
        }

        public static SelectionManagerExternalSyntheticLambda4 onNavigationEvent(AudioManager audioManager, TextContextMenuHelperApi28ExternalSyntheticLambda5 textContextMenuHelperApi28ExternalSyntheticLambda5) {
            List<AudioDeviceInfo> audioDevicesForAttributes = ((AudioManager) RecordingInputConnection_androidKt.onExtraCallbackWithResult(audioManager)).getAudioDevicesForAttributes(textContextMenuHelperApi28ExternalSyntheticLambda5.onNavigationEvent().onNavigationEvent);
            if (audioDevicesForAttributes.isEmpty()) {
                return null;
            }
            return new SelectionManagerExternalSyntheticLambda4(audioDevicesForAttributes.get(0));
        }
    }
}
