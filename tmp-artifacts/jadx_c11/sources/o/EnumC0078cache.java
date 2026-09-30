package o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import im.toss.tds.sharebottomsheet.R;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.deprecated_retryOnConnectionFailure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.cache, reason: case insensitive filesystem */
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class EnumC0078cache implements deprecated_readTimeoutMillis {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EnumC0078cache[] $VALUES;
    public static final EnumC0078cache BAND;
    public static final EnumC0078cache FACEBOOK;
    public static final EnumC0078cache FACEBOOK_MESSENGER;
    private static int IAuthTabCallback = 0;
    public static final EnumC0078cache INSTAGRAM;
    public static final EnumC0078cache KAKAO;
    public static final EnumC0078cache KAKAO_STORY;
    public static final EnumC0078cache TIKTOK;
    public static final EnumC0078cache TWITTER;
    private static int onExtraCallback = 0;
    private static int onExtraCallbackWithResult = 1;
    private static long onNavigationEvent = 0;
    private static int onWarmupCompleted = 1;
    private final List<deprecated_retryOnConnectionFailure> availableTypes;
    private final String iconUrl;
    private final String id;
    private final int label;
    private final String packageName;

    private static final /* synthetic */ EnumC0078cache[] $values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 69;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumC0078cache[] enumC0078cacheArr = {KAKAO, INSTAGRAM, FACEBOOK_MESSENGER, FACEBOOK, TWITTER, TIKTOK, BAND, KAKAO_STORY};
        int i5 = i2 + 115;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return enumC0078cacheArr;
        }
        throw null;
    }

    public static EnumEntries<EnumC0078cache> getEntries() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 79;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        EnumEntries<EnumC0078cache> enumEntries = $ENTRIES;
        int i5 = i2 + 87;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 6 / 0;
        }
        return enumEntries;
    }

    public static EnumC0078cache valueOf(String str) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 123;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumC0078cache enumC0078cache = (EnumC0078cache) Enum.valueOf(EnumC0078cache.class, str);
        if (i3 != 0) {
            int i4 = 63 / 0;
        }
        int i5 = onExtraCallbackWithResult + 69;
        onExtraCallback = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 75 / 0;
        }
        return enumC0078cache;
    }

    public static EnumC0078cache[] values() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 25;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        EnumC0078cache[] enumC0078cacheArr = (EnumC0078cache[]) $VALUES.clone();
        int i4 = onExtraCallback + 115;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 != 0) {
            return enumC0078cacheArr;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private EnumC0078cache(String str, int i, String str2, List list, String str3, int i2, String str4) {
        this.id = str2;
        this.availableTypes = list;
        this.iconUrl = str3;
        this.label = i2;
        this.packageName = str4;
    }

    @Override // o.deprecated_readTimeoutMillis
    public /* bridge */ boolean isAvailable(@NotNull deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 21;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            return super.isAvailable(deprecated_retryonconnectionfailure);
        }
        super.isAvailable(deprecated_retryonconnectionfailure);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.deprecated_readTimeoutMillis
    public /* bridge */ void share(@NotNull Context context, @Nullable String str, @Nullable Uri uri, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @Nullable String str2, @Nullable Function1<? super Intent, ? extends Intent> function12) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 79;
        onExtraCallback = i2 % 128;
        int i3 = i2 % 2;
        super.share(context, str, uri, function0, function1, str2, function12);
        if (i3 != 0) {
            throw null;
        }
    }

    @Override // o.deprecated_readTimeoutMillis
    public /* bridge */ void showErrorToast(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallback + 99;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        super.showErrorToast(context, i);
        int i5 = onExtraCallback + 9;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.deprecated_readTimeoutMillis
    public /* bridge */ void showSuccessToast(@NotNull Context context, int i) {
        int i2 = 2 % 2;
        int i3 = onExtraCallbackWithResult + 31;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        super.showSuccessToast(context, i);
        int i5 = onExtraCallback + 37;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.deprecated_readTimeoutMillis
    public String getId() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 87;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.id;
        int i5 = i2 + 19;
        onExtraCallback = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    @Override // o.deprecated_readTimeoutMillis
    public List<deprecated_retryOnConnectionFailure> getAvailableTypes() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 57;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        List<deprecated_retryOnConnectionFailure> list = this.availableTypes;
        int i4 = i3 + 117;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
        return list;
    }

    @Override // o.deprecated_readTimeoutMillis
    public String getIconUrl() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 99;
        onExtraCallback = i3 % 128;
        int i4 = i3 % 2;
        String str = this.iconUrl;
        int i5 = i2 + 25;
        onExtraCallback = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    @Override // o.deprecated_readTimeoutMillis
    public int getLabel() {
        int i = 2 % 2;
        int i2 = onExtraCallback;
        int i3 = i2 + 23;
        onExtraCallbackWithResult = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.label;
        int i6 = i2 + 7;
        onExtraCallbackWithResult = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    public final String getPackageName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 11;
        int i3 = i2 % 128;
        onExtraCallback = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.packageName;
        int i4 = i3 + 11;
        onExtraCallbackWithResult = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
        return str;
    }

    static {
        onNavigationEvent();
        deprecated_retryOnConnectionFailure.onWarmupCompleted onwarmupcompleted = deprecated_retryOnConnectionFailure.Companion;
        EnumEntries<deprecated_retryOnConnectionFailure> enumEntriesOnNavigationEvent = onwarmupcompleted.onNavigationEvent();
        int i = R.string.tds_sharebottomsheet_target_kakao;
        Object[] objArr = new Object[1];
        a(new char[]{39173, 15134, 56599, 32520, 4354, 45940, 21864, 63347, 35110, 11046, 52554, 28500, 336, 41813, 17697, 59248, 47474, 23401, 64864, 40902, 12680, 54163, 30168, 6053, 43430, 19373, 60853, 36771, 8582, 50134, 26065, 2003, 55714, 31678, 7675, 49079, 20984, 61965, 37897, 13905, 51206, 27162, 3114, 44594, 16444, 57979, 33856, 9810, 63580, 39510, 15390, 56931, 28768, 4725, 46198, 22147, 59595, 35474, 11413, 52887}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 41479, objArr);
        KAKAO = new EnumC0078cache("KAKAO", 0, "kakao", enumEntriesOnNavigationEvent, ((String) objArr[0]).intern(), i, "com.kakao.talk");
        EnumEntries<deprecated_retryOnConnectionFailure> enumEntriesOnNavigationEvent2 = onwarmupcompleted.onNavigationEvent();
        int i2 = R.string.tds_sharebottomsheet_target_instagram;
        Object[] objArr2 = new Object[1];
        a(new char[]{39173, 63148, 18035, 54786, 10186, 47070, 1916, 38065, 58550, 29764, 50206, 21982, 42360, 13631, 33445, 4738, 25170, 61979, 17316, 54060, 8992, 45273, 204, 36935, 57846, 29103, 49505, 20745, 44686, 16028, 36405, 8161, 28642, 65292, 20255, 56573, 11376, 48167, 3549, 40403, 60758, 31480, 51902, 23160, 43540, 15249, 35716, 6944, 26876, 63652, 18458, 55307, 10695, 47463, 2359, 26351, 63122, 18002, 54798, 10167, 46895, 1852, 38101, 58497}, 28597 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr2);
        INSTAGRAM = new EnumC0078cache("INSTAGRAM", 1, "instagram", enumEntriesOnNavigationEvent2, ((String) objArr2[0]).intern(), i2, "com.instagram.android");
        deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure = deprecated_retryOnConnectionFailure.LINK;
        List listListOf = CollectionsKt.listOf(deprecated_retryonconnectionfailure);
        int i3 = R.string.tds_sharebottomsheet_target_facebook_messenger;
        Object[] objArr3 = new Object[1];
        a(new char[]{39173, 25506, 27759, 26924, 29682, 31984, 31008, 16991, 19654, 18826, 21058, 24336, 22976, 8817, 12153, 10732, 12978, 16245, 14392, 674, 3992, 2135, 5456, 8137, 6278, 58689, 61437, 59559, 62774, 65074, 63721, 50607, 52770, 52034, 54723, 57043, 56136, 41993, 44737, 43837, 46118, 48886, 48034, 33910, 33068, 35743, 38040, 37198, 39452, 25802, 25030, 27210, 29936, 29113, 31354, 18210, 16874, 19105, 22360, 20505, 23260, 10129, 8276, 11533, 14275, 12401, 15678, 2030, 236, 3433, 5664, 4316, 7578, 58956, 58189, 60884, 63111, 62261}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 64186, objArr3);
        FACEBOOK_MESSENGER = new EnumC0078cache("FACEBOOK_MESSENGER", 2, "facebook_messenger", listListOf, ((String) objArr3[0]).intern(), i3, "com.facebook.orca");
        deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure2 = deprecated_retryOnConnectionFailure.IMAGE;
        List listListOf2 = CollectionsKt.listOf(new deprecated_retryOnConnectionFailure[]{deprecated_retryonconnectionfailure, deprecated_retryonconnectionfailure2, deprecated_retryOnConnectionFailure.IMAGE_WITH_LINK});
        int i4 = R.string.tds_sharebottomsheet_target_facebook;
        Object[] objArr4 = new Object[1];
        a(new char[]{39173, 25126, 28519, 26784, 30178, 29036, 31288, 18427, 16614, 19502, 18810, 21164, 24560, 23357, 9265, 8616, 10994, 13873, 13168, 15598, 14824, 1323, 3624, 2989, 5350, 4133, 7525, 59067, 58278, 61246, 59489, 62891, 65186, 64070, 51019, 49375, 52696, 51477, 53849, 57305, 55494, 42002, 41306, 43658, 47068, 45907, 48208, 47498, 33500, 36366, 35598, 38022, 37312, 40197, 26178, 25478, 27850, 26629, 30016, 32454, 31705, 18176, 16456}, 64319 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr4);
        FACEBOOK = new EnumC0078cache("FACEBOOK", 3, "facebook", listListOf2, ((String) objArr4[0]).intern(), i4, "com.facebook.katana");
        deprecated_retryOnConnectionFailure deprecated_retryonconnectionfailure3 = deprecated_retryOnConnectionFailure.TEXT;
        List listListOf3 = CollectionsKt.listOf(new deprecated_retryOnConnectionFailure[]{deprecated_retryonconnectionfailure, deprecated_retryonconnectionfailure3});
        int i5 = R.string.tds_sharebottomsheet_target_twitter;
        Object[] objArr5 = new Object[1];
        a(new char[]{39173, 20810, 2495, 49636, 47186, 28872, 10416, 58119, 56198, 37874, 18994, 648, 64224, 46393, 28105, 9668, 7218, 54429, 36040, 18282, 16248, 63439, 44640, 26225, 24265, 2330, 49526, 47583, 28685, 10361, 57592, 56067, 37732, 19372, 520, 64088, 45732, 27327, 9547, 7615, 54780, 35922, 17543, 15609, 63323, 45012, 26615, 24126, 5786}, 51283 - (ViewConfiguration.getTouchSlop() >> 8), objArr5);
        TWITTER = new EnumC0078cache("TWITTER", 4, "twitter", listListOf3, ((String) objArr5[0]).intern(), i5, "com.twitter.android");
        List listListOf4 = CollectionsKt.listOf(deprecated_retryonconnectionfailure2);
        int i6 = R.string.tds_sharebottomsheet_target_tiktok;
        Object[] objArr6 = new Object[1];
        a(new char[]{39173, 11184, 64587, 36582, 21434, 58394, 46772, 31709, 3158, 57064, 25494, 13402, 50920, 35739, 23677, 61182, 45970, 17447, 5884, 56264, 27696, 16093, 50116, 37938, 9947, 60299, 48234, 20183, 4978, 42023, 30413, 15209, 52322, 40656, 9078, 62491, 34508, 19308, 7186, 44732, 29536, 1107, 54947, 39783, 11274, 65196, 33628, 21505, 59120, 43846, 31744, 3763, 54103, 26100, 14053, 64338, 36347, 24235}, ((Process.getThreadPriority(0) + 20) >> 6) + 45737, objArr6);
        TIKTOK = new EnumC0078cache("TIKTOK", 5, "tiktok", listListOf4, ((String) objArr6[0]).intern(), i6, "com.ss.android.ugc.trill");
        List listListOf5 = CollectionsKt.listOf(new deprecated_retryOnConnectionFailure[]{deprecated_retryonconnectionfailure, deprecated_retryonconnectionfailure3});
        int i7 = R.string.tds_sharebottomsheet_target_naver_band;
        Object[] objArr7 = new Object[1];
        a(new char[]{39173, 29760, 17323, 20758, 11386, 15338, 2388, 58413, 62422, 49464, 56438, 43978, 47400, 38027, 25501, 28974, 19602, 23543, 10588, 1240, 5104, 57677, 64740, 52194, 55643, 46267, 33354, 37223, 27826, 31255, 18797, 9433, 12898, 352, 7382, 59947, 63884, 54492, 41522, 45452, 36064, 39427, 27033, 17663, 21079, 8621, 15585, 2583, 6591, 63237, 49761, 53682, 44884, 47724, 35268, 26389, 29306, 16786, 24375, 10880, 14806}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 60761, objArr7);
        BAND = new EnumC0078cache("BAND", 6, "band", listListOf5, ((String) objArr7[0]).intern(), i7, "com.nhn.android.band");
        List listListOf6 = CollectionsKt.listOf(deprecated_retryonconnectionfailure3);
        int i8 = R.string.tds_sharebottomsheet_target_kakao_story;
        Object[] objArr8 = new Object[1];
        a(new char[]{39173, 50302, 9175, 33064, 60546, 19028, 43304, 5267, 29222, 53638, 16138, 39540, 63952, 10037, 33505, 57360, 20338, 43721, 2080, 30694, 54536, 12403, 40856, 64860, 22699, 34309, 58678, 16601, 44618, 3497, 27409, 54887, 13730, 37726, 65194, 23573, 47988, 59106, 17486, 41906, 272, 27709, 52192, 10561, 38066, 61975, 20864, 48375, 6729, 31157, 42753, 657, 25007, 53070, 10937, 34859}, 23911 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr8);
        KAKAO_STORY = new EnumC0078cache("KAKAO_STORY", 7, "kakaostory", listListOf6, ((String) objArr8[0]).intern(), i8, "com.kakao.story");
        EnumC0078cache[] enumC0078cacheArr$values = $values();
        $VALUES = enumC0078cacheArr$values;
        $ENTRIES = access15300.onExtraCallbackWithResult(enumC0078cacheArr$values);
        int i9 = IAuthTabCallback + 35;
        onWarmupCompleted = i9 % 128;
        int i10 = i9 % 2;
    }

    private static void a(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i3 = $10 + 103;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 19626, 1002848041, false, "u", new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onNavigationEvent ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - ImageFormat.getBitsPerPixel(0)), View.MeasureSpec.getMode(0) + 59, 6383 - Color.red(0), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        int i6 = $10 + 55;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 2 % 3;
        }
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
            Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
            Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
            if (objOnExtraCallback3 == null) {
                objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) Color.argb(0, 0, 0, 0), 59 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // o.deprecated_readTimeoutMillis
    public Intent buildIntent(@NotNull Context context, @Nullable String str, @Nullable String str2, @Nullable Uri uri, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1) {
        int i = 2 % 2;
        int i2 = onExtraCallback + 69;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intent intentOnNavigationEvent = deprecated_pingIntervalMillis.onNavigationEvent(this, str, str2, uri);
        int i4 = onExtraCallbackWithResult + 123;
        onExtraCallback = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return intentOnNavigationEvent;
    }

    static void onNavigationEvent() {
        onNavigationEvent = 6431693411371523162L;
    }
}
