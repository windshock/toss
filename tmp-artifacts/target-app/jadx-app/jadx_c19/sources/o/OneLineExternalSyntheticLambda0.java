package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.extractor.ogg.OggPageHeader;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.material.button.MaterialButton;
import com.google.common.collect.ImmutableList;
import com.google.zxing.aztec.encoder.Encoder;
import im.toss.rn.appsintoss.api.model.contacts_common.PushInfo;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import o.BasicTextContextMenuProviderExternalSyntheticLambda0;
import o.BasicTextContextMenuProviderKtExternalSyntheticLambda4;
import o.DrawerKtExternalSyntheticLambda23;
import o.DrawerStateExternalSyntheticLambda0;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4;
import o.ExposedDropdownMenu_androidKtExternalSyntheticLambda5;
import o.OneLineExternalSyntheticLambda0;
import o.RippleKtExternalSyntheticLambda0;
import o.TextToolbarHelperApi28ExternalSyntheticLambda1;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public final class OneLineExternalSyntheticLambda0 implements DrawerStateExternalSyntheticLambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] IAuthTabCallback;
    private static final byte[] IAuthTabCallbackStub;
    private static char[] IPostMessageServiceDefault = null;
    private static int IPostMessageService_Parcel = 0;
    private static int ITrustedWebActivityCallback = 1;
    private static int ITrustedWebActivityCallbackDefault = 0;
    private static int ITrustedWebActivityCallbackStub = 1;
    private static final UUID asBinder;

    @Deprecated
    public static final DrawerStateExternalSyntheticLambda2 onExtraCallback;
    private static final byte[] onExtraCallbackWithResult;
    private static final Map<String, Integer> onNavigationEvent;
    private static final byte[] onWarmupCompleted;
    private int IAuthTabCallbackDefault;
    private int IAuthTabCallbackStubProxy;
    private int IAuthTabCallback_Parcel;
    private int ICustomTabsCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 ICustomTabsCallbackDefault;
    private long ICustomTabsCallbackStub;
    private ByteBuffer ICustomTabsCallbackStubProxy;
    private final boolean ICustomTabsCallback_Parcel;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 ICustomTabsService;
    private long ICustomTabsServiceDefault;
    private int ICustomTabsServiceStub;
    private boolean ICustomTabsServiceStubProxy;
    private boolean ICustomTabsService_Parcel;
    private long IEngagementSignalsCallback;
    private boolean IEngagementSignalsCallbackDefault;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IEngagementSignalsCallbackStub;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 IEngagementSignalsCallbackStubProxy;
    private long IEngagementSignalsCallback_Parcel;
    private final OutlinedTextFieldKtExternalSyntheticLambda1 IPostMessageService;
    private final SparseArray<onExtraCallback> IPostMessageServiceStub;
    private long access000;
    private boolean access100;
    private final boolean access200;
    private int asInterface;
    private int extraCallback;
    private int extraCallbackWithResult;
    private boolean extraCommand;
    private int[] getInterfaceDescriptor;
    private boolean isEngagementSignalsApiAvailable;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 mayLaunchUrl;
    private final NavigationRailKtExternalSyntheticLambda8 newAuthTabSession;
    private boolean newSession;
    private int newSessionWithExtras;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda17 onActivityLayout;
    private long onActivityResized;
    private long onGreatestScrollPercentageIncreased;
    private onExtraCallback onMessageChannelReady;
    private TextFieldDecoratorModifierNodeExternalSyntheticLambda17 onMinimized;
    private long onPostMessage;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onRelationshipValidationResult;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 onSessionEnded;
    private long onTransact;
    private DrawerStateExternalSyntheticLambda1 onUnminimized;
    private final RippleKtExternalSyntheticLambda0.onExtraCallback onVerticalScrollEvent;
    private int postMessage;
    private int prefetch;
    private boolean prefetchWithMultipleUrls;
    private long readTypedObject;
    private boolean receiveFile;
    private boolean requestPostMessageChannel;
    private byte requestPostMessageChannelWithExtras;
    private int setEngagementSignalsCallback;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 updateVisuals;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 validateRelationship;
    private final TextFieldDecoratorModifierNodeExternalSyntheticLambda20 warmup;
    private long writeTypedList;
    private long writeTypedObject;

    public static /* synthetic */ Object IAuthTabCallback(int i2, int i3, int i4, Object[] objArr, int i5, int i6, int i7) {
        int i8 = ~i6;
        int i9 = ~((~i4) | i8 | i5);
        int i10 = (~i5) | i8;
        int i11 = i9 | (~(i10 | i4)) | (~(i6 | i4 | i5));
        int i12 = ~i10;
        int i13 = (~(i5 | i6)) | i4 | i12;
        int i14 = (~(i8 | i4)) | i12;
        int i15 = i6 + i4 + i2 + (933655473 * i3) + ((-1037598838) * i7);
        int i16 = i15 * i15;
        int i17 = (((-1556109539) * i6) - 925892608) + (470833381 * i4) + (i11 * (-1134012188)) + (1134012188 * i13) + ((-1134012188) * i14) + (1604845568 * i2) + ((-1691877376) * i3) + ((-393216000) * i7) + ((-1633878016) * i16);
        int i18 = ((i6 * (-727610197)) - 1081761860) + (i4 * (-727608285)) + (i11 * 956) + (i13 * (-956)) + (i14 * 956) + (i2 * (-727609241)) + (i3 * 1532828727) + (i7 * (-747900794)) + (i16 * 556466176);
        int i19 = i17 + (i18 * i18 * (-1911357440));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? onExtraCallback(objArr) : IAuthTabCallback(objArr) : onExtraCallbackWithResult(objArr) : onNavigationEvent(objArr) : onWarmupCompleted(objArr);
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 79;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    protected int onExtraCallback(int i2) {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel;
        int i5 = i4 + 93;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                int i7 = i4 + 75;
                ITrustedWebActivityCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected boolean onNavigationEvent(int i2) {
        int i3 = 2 % 2;
        if (i2 == 357149030) {
            return true;
        }
        int i4 = IPostMessageService_Parcel;
        int i5 = i4 + 51;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        if (i2 == 524531317 || i2 == 475249515) {
            return true;
        }
        int i6 = i4 + 79;
        ITrustedWebActivityCallbackStub = i6 % 128;
        int i7 = i6 % 2;
        if (i2 == 374648427) {
            return true;
        }
        int i8 = i4 + 69;
        ITrustedWebActivityCallbackStub = i8 % 128;
        int i9 = i8 % 2;
        return false;
    }

    static /* synthetic */ Map IAuthTabCallbackDefault() {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel;
        int i4 = i3 + 123;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        Map<String, Integer> map = onNavigationEvent;
        int i6 = i3 + 125;
        ITrustedWebActivityCallbackStub = i6 % 128;
        if (i6 % 2 != 0) {
            return map;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub;
        int i4 = i3 + 99;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        UUID uuid = asBinder;
        int i6 = i3 + 87;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 90 / 0;
        }
        return uuid;
    }

    static /* synthetic */ byte[] onNavigationEvent() {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 111;
        IPostMessageService_Parcel = i3 % 128;
        if (i3 % 2 == 0) {
            return onWarmupCompleted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onWarmupCompleted(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        int i2 = 2 % 2;
        DrawerStateExternalSyntheticLambda0[] drawerStateExternalSyntheticLambda0Arr = {new OneLineExternalSyntheticLambda0(onextracallback)};
        int i3 = IPostMessageService_Parcel + 91;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return drawerStateExternalSyntheticLambda0Arr;
    }

    static {
        onTransact();
        onExtraCallback = new DrawerStateExternalSyntheticLambda2() { // from class: androidx.media3.extractor.mkv.MatroskaExtractor$$ExternalSyntheticLambda1
            @Override // o.DrawerStateExternalSyntheticLambda2
            public final DrawerStateExternalSyntheticLambda0[] createExtractors() {
                return OneLineExternalSyntheticLambda0.onExtraCallback();
            }
        };
        IAuthTabCallback = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        onWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        onExtraCallbackWithResult = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        IAuthTabCallbackStub = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        asBinder = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        onNavigationEvent = Collections.unmodifiableMap(map);
        int i2 = ITrustedWebActivityCallbackDefault + 45;
        ITrustedWebActivityCallback = i2 % 128;
        int i3 = i2 % 2;
    }

    public static /* synthetic */ DrawerStateExternalSyntheticLambda0[] onExtraCallback() {
        int i2 = 2 % 2;
        DrawerStateExternalSyntheticLambda0[] drawerStateExternalSyntheticLambda0Arr = {new OneLineExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback, 2)};
        int i3 = ITrustedWebActivityCallbackStub + 45;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        return drawerStateExternalSyntheticLambda0Arr;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IPostMessageServiceDefault;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35284 - (SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1))), Color.rgb(0, 0, 0) + 16777251, 14239 - Color.green(0), -884206168, false, "t", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            char c = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                    int i8 = $11 + 101;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ExpandableListView.getPackedPositionChild(0L)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 65, (ViewConfiguration.getEdgeSlop() >> 16) + 16718, -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i10 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                    if (objOnExtraCallback3 == null) {
                        objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 10936), Drawable.resolveOpacity(0, 0) + 65, 16718 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -846731970, false, TtmlNode.TAG_P, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                    Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getScrollBarSize() >> 8), 28 - TextUtils.indexOf((CharSequence) "", '0', 0), 17657 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                if (objOnExtraCallback5 == null) {
                    objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 49468), View.getDefaultSize(0, 0) + 70, TextUtils.getOffsetAfter("", 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i12 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i12, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i12);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i13 = $10 + 69;
                $11 = i13 % 128;
                int i14 = i13 % 2;
                cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i4 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i15 = $11 + 5;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
            while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i4) {
                int i17 = $10 + 115;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                trackGroupExternalSyntheticLambda0.onNavigationEvent++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Deprecated
    public OneLineExternalSyntheticLambda0() {
        this(new NavigationRailKtExternalSyntheticLambda5(), 2, RippleKtExternalSyntheticLambda0.onExtraCallback.onExtraCallback);
    }

    public OneLineExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        this(new NavigationRailKtExternalSyntheticLambda5(), 0, onextracallback);
    }

    public OneLineExternalSyntheticLambda0(RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback, int i2) {
        this(new NavigationRailKtExternalSyntheticLambda5(), i2, onextracallback);
    }

    OneLineExternalSyntheticLambda0(NavigationRailKtExternalSyntheticLambda8 navigationRailKtExternalSyntheticLambda8, int i2, RippleKtExternalSyntheticLambda0.onExtraCallback onextracallback) {
        boolean z;
        this.IEngagementSignalsCallback = -1L;
        this.IEngagementSignalsCallback_Parcel = -9223372036854775807L;
        this.onActivityResized = -9223372036854775807L;
        this.ICustomTabsCallbackStub = -9223372036854775807L;
        this.onPostMessage = -1L;
        this.writeTypedList = -1L;
        this.readTypedObject = -9223372036854775807L;
        this.newAuthTabSession = navigationRailKtExternalSyntheticLambda8;
        navigationRailKtExternalSyntheticLambda8.onExtraCallback(new IAuthTabCallback());
        this.onVerticalScrollEvent = onextracallback;
        if ((i2 & 1) == 0) {
            z = true;
        } else {
            int i3 = IPostMessageService_Parcel + 41;
            ITrustedWebActivityCallbackStub = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 2 % 2;
            }
            z = false;
        }
        this.access200 = z;
        this.ICustomTabsCallback_Parcel = (i2 & 2) == 0;
        this.IPostMessageService = new OutlinedTextFieldKtExternalSyntheticLambda1();
        this.IPostMessageServiceStub = new SparseArray<>();
        this.warmup = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
        this.IEngagementSignalsCallbackStubProxy = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(ByteBuffer.allocate(4).putInt(-1).array());
        this.updateVisuals = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
        this.mayLaunchUrl = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(TextFieldKeyEventHandlerExternalSyntheticLambda1.onNavigationEvent);
        this.ICustomTabsService = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(4);
        this.validateRelationship = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        this.IEngagementSignalsCallbackStub = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        this.onRelationshipValidationResult = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(8);
        this.ICustomTabsCallbackDefault = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        this.onSessionEnded = new TextFieldDecoratorModifierNodeExternalSyntheticLambda20();
        this.getInterfaceDescriptor = new int[1];
        int i5 = IPostMessageService_Parcel + 41;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 79 / 0;
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public final boolean onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws IOException {
        int i2 = 2 % 2;
        boolean zOnWarmupCompleted = new OutlinedTextFieldKtExternalSyntheticLambda0().onWarmupCompleted(drawerKtExternalSyntheticLambda9);
        int i3 = IPostMessageService_Parcel + 71;
        ITrustedWebActivityCallbackStub = i3 % 128;
        if (i3 % 2 != 0) {
            return zOnWarmupCompleted;
        }
        throw null;
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public final void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 55;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        if (this.ICustomTabsCallback_Parcel) {
            drawerStateExternalSyntheticLambda1 = new ResistanceConfig(drawerStateExternalSyntheticLambda1, this.onVerticalScrollEvent);
        }
        this.onUnminimized = drawerStateExternalSyntheticLambda1;
        int i5 = IPostMessageService_Parcel + 25;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 28 / 0;
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public void onNavigationEvent(long j, long j2) {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 29;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.readTypedObject = -9223372036854775807L;
        int i5 = 0;
        this.extraCallback = 0;
        this.newAuthTabSession.IAuthTabCallback();
        this.IPostMessageService.IAuthTabCallback();
        access100();
        while (i5 < this.IPostMessageServiceStub.size()) {
            this.IPostMessageServiceStub.valueAt(i5).onWarmupCompleted();
            i5++;
            int i6 = ITrustedWebActivityCallbackStub + 85;
            IPostMessageService_Parcel = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public final int onWarmupCompleted(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3) throws IOException {
        int i2 = 2 % 2;
        int i3 = 0;
        this.isEngagementSignalsApiAvailable = false;
        boolean zOnExtraCallbackWithResult = true;
        while (zOnExtraCallbackWithResult) {
            int i4 = IPostMessageService_Parcel + 105;
            ITrustedWebActivityCallbackStub = i4 % 128;
            if (i4 % 2 != 0) {
                if (this.isEngagementSignalsApiAvailable) {
                    break;
                }
                zOnExtraCallbackWithResult = this.newAuthTabSession.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9);
                if (!(!zOnExtraCallbackWithResult)) {
                    int i5 = IPostMessageService_Parcel + 125;
                    ITrustedWebActivityCallbackStub = i5 % 128;
                    if (i5 % 2 == 0) {
                        ((Boolean) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1224482128, new Object[]{this, exposedDropdownMenuDefaultsExternalSyntheticLambda3, Long.valueOf(drawerKtExternalSyntheticLambda9.IAuthTabCallback())}, PushInfo.Companion.onExtraCallback(), 1224482129, PushInfo.Companion.onExtraCallback())).booleanValue();
                        throw null;
                    }
                    if (((Boolean) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1224482128, new Object[]{this, exposedDropdownMenuDefaultsExternalSyntheticLambda3, Long.valueOf(drawerKtExternalSyntheticLambda9.IAuthTabCallback())}, PushInfo.Companion.onExtraCallback(), 1224482129, PushInfo.Companion.onExtraCallback())).booleanValue()) {
                        return 1;
                    }
                }
            } else {
                throw null;
            }
        }
        if (zOnExtraCallbackWithResult) {
            int i6 = ITrustedWebActivityCallbackStub + 89;
            IPostMessageService_Parcel = i6 % 128;
            int i7 = i6 % 2;
            return 0;
        }
        while (i3 < this.IPostMessageServiceStub.size()) {
            int i8 = IPostMessageService_Parcel + 115;
            ITrustedWebActivityCallbackStub = i8 % 128;
            int i9 = i8 % 2;
            this.IPostMessageServiceStub.valueAt(i3).onExtraCallbackWithResult();
            i3++;
            int i10 = ITrustedWebActivityCallbackStub + 71;
            IPostMessageService_Parcel = i10 % 128;
            int i11 = i10 % 2;
        }
        return -1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r8 == 174) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        if (r8 == 187) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
    
        if (r8 == 19899) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r8 == 20533) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
    
        r1 = o.OneLineExternalSyntheticLambda0.ITrustedWebActivityCallbackStub + 27;
        r6 = r1 % 128;
        o.OneLineExternalSyntheticLambda0.IPostMessageService_Parcel = r6;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
    
        if (r8 == 21968) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r8 == 408125543) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        if (r8 == 475249515) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r8 != 524531317) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if ((!r7.IEngagementSignalsCallbackDefault) == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (r7.access200 == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r6 = r6 + 99;
        o.OneLineExternalSyntheticLambda0.ITrustedWebActivityCallbackStub = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if ((r6 % 2) != 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r9 = 39 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0066, code lost:
    
        if (r7.onPostMessage == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006d, code lost:
    
        if (r7.onPostMessage == (-1)) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        r7.ICustomTabsService_Parcel = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        r7.onUnminimized.IAuthTabCallback(new o.ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(r7.ICustomTabsCallbackStub));
        r7.IEngagementSignalsCallbackDefault = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
    
        r7.onActivityLayout = new o.TextFieldDecoratorModifierNodeExternalSyntheticLambda17();
        r7.onMinimized = new o.TextFieldDecoratorModifierNodeExternalSyntheticLambda17();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
    
        r1 = r7.IEngagementSignalsCallback;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0094, code lost:
    
        if (r1 == (-1)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        r6 = r6 + 7;
        o.OneLineExternalSyntheticLambda0.ITrustedWebActivityCallbackStub = r6 % 128;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        if ((r6 % 2) == 0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a2, code lost:
    
        if (r1 != r9) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        throw androidx.media3.common.ParserException.onNavigationEvent("Multiple Segment elements not supported", (java.lang.Throwable) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ac, code lost:
    
        r8.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00af, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b0, code lost:
    
        r7.IEngagementSignalsCallback = r9;
        r7.onGreatestScrollPercentageIncreased = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        IAuthTabCallback(r8).ICustomTabsCallback = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
    
        IAuthTabCallback(r8).extraCallback = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c3, code lost:
    
        r7.ICustomTabsServiceStub = -1;
        r7.ICustomTabsServiceDefault = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r8 != 10064) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00c8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        r7.ICustomTabsServiceStubProxy = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cc, code lost:
    
        r8 = new o.OneLineExternalSyntheticLambda0.onExtraCallback();
        r7.onMessageChannelReady = r8;
        r8.onActivityResized = r7.extraCommand;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d8, code lost:
    
        r7.access100 = false;
        r7.access000 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00de, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r8 != 160) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onNavigationEvent(int i2, long j, long j2) throws ParserException {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 89;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            IAuthTabCallbackStub();
        } else {
            IAuthTabCallbackStub();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    protected void onWarmupCompleted(int i2) throws ParserException {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 63;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        IAuthTabCallbackStub();
        if (i2 == 160) {
            if (this.extraCallback != 2) {
                return;
            }
            onExtraCallback onextracallback = this.IPostMessageServiceStub.get(this.ICustomTabsCallback);
            if (this.access000 > 0 && "A_OPUS".equals(onextracallback.onExtraCallbackWithResult)) {
                int i6 = IPostMessageService_Parcel + 111;
                ITrustedWebActivityCallbackStub = i6 % 128;
                if (i6 % 2 == 0) {
                    this.onSessionEnded.onWarmupCompleted(ByteBuffer.allocate(36).order(ByteOrder.LITTLE_ENDIAN).putLong(this.access000).array());
                } else {
                    this.onSessionEnded.onWarmupCompleted(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.access000).array());
                }
            }
            int i7 = 0;
            for (int i8 = 0; i8 < this.IAuthTabCallbackStubProxy; i8++) {
                i7 += this.getInterfaceDescriptor[i8];
            }
            int i9 = 0;
            while (i9 < this.IAuthTabCallbackStubProxy) {
                long j = this.writeTypedObject;
                long j2 = (onextracallback.IAuthTabCallbackStubProxy * i9) / 1000;
                int i10 = this.asInterface;
                if (i9 == 0 && !this.access100) {
                    i10 |= 1;
                    int i11 = IPostMessageService_Parcel + 67;
                    ITrustedWebActivityCallbackStub = i11 % 128;
                    int i12 = i11 % 2;
                }
                int i13 = this.getInterfaceDescriptor[i9];
                int i14 = i7 - i13;
                onExtraCallbackWithResult(onextracallback, j + j2, i10, i13, i14);
                i9++;
                i7 = i14;
            }
            this.extraCallback = 0;
            return;
        }
        Object obj = null;
        if (i2 == 174) {
            onExtraCallback onextracallback2 = (onExtraCallback) RecordingInputConnection_androidKt.onWarmupCompleted(this.onMessageChannelReady);
            String str = onextracallback2.onExtraCallbackWithResult;
            if (str == null) {
                throw ParserException.onNavigationEvent("CodecId is missing in TrackEntry element", (Throwable) null);
            }
            if (onWarmupCompleted(str)) {
                onextracallback2.onNavigationEvent(this.onUnminimized, onextracallback2.ICustomTabsCallbackStub);
                this.IPostMessageServiceStub.put(onextracallback2.ICustomTabsCallbackStub, onextracallback2);
            }
            this.onMessageChannelReady = null;
            return;
        }
        int i15 = IPostMessageService_Parcel;
        int i16 = i15 + 41;
        int i17 = i16 % 128;
        ITrustedWebActivityCallbackStub = i17;
        if (i16 % 2 != 0 ? i2 == 19899 : i2 == 7332) {
            int i18 = this.ICustomTabsServiceStub;
            if (i18 != -1) {
                long j3 = this.ICustomTabsServiceDefault;
                if (j3 != -1) {
                    if (i18 == 475249515) {
                        int i19 = i17 + 101;
                        IPostMessageService_Parcel = i19 % 128;
                        int i20 = i19 % 2;
                        this.onPostMessage = j3;
                        return;
                    }
                    return;
                }
            }
            throw ParserException.onNavigationEvent("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
        }
        if (i2 == 25152) {
            IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
            onExtraCallback onextracallback3 = this.onMessageChannelReady;
            if (onextracallback3.extraCallback) {
                if (onextracallback3.asInterface == null) {
                    throw ParserException.onNavigationEvent("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
                }
                onextracallback3.writeTypedObject = new BasicTextContextMenuProviderExternalSyntheticLambda0(new BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback[]{new BasicTextContextMenuProviderExternalSyntheticLambda0.IAuthTabCallback(AddTextContextMenuDataComponentsWithContextNodeExternalSyntheticLambda0.onWarmupCompleted, "video/webm", this.onMessageChannelReady.asInterface.onWarmupCompleted)});
                return;
            }
            return;
        }
        int i21 = i15 + 83;
        int i22 = i21 % 128;
        ITrustedWebActivityCallbackStub = i22;
        if (i21 % 2 != 0 ? i2 == 28032 : i2 == 12398) {
            IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
            onExtraCallback onextracallback4 = this.onMessageChannelReady;
            if (onextracallback4.extraCallback) {
                int i23 = IPostMessageService_Parcel + 43;
                ITrustedWebActivityCallbackStub = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 70 / 0;
                    if (onextracallback4.prefetchWithMultipleUrls == null) {
                        return;
                    }
                } else if (onextracallback4.prefetchWithMultipleUrls == null) {
                    return;
                }
                throw ParserException.onNavigationEvent("Combining encryption and compression is not supported", (Throwable) null);
            }
            return;
        }
        if (i2 == 357149030) {
            if (this.IEngagementSignalsCallback_Parcel == -9223372036854775807L) {
                int i25 = i22 + 105;
                IPostMessageService_Parcel = i25 % 128;
                if (i25 % 2 != 0) {
                    this.IEngagementSignalsCallback_Parcel = 1000000L;
                    throw null;
                }
                this.IEngagementSignalsCallback_Parcel = 1000000L;
            }
            long j4 = this.onActivityResized;
            if (j4 != -9223372036854775807L) {
                this.ICustomTabsCallbackStub = ((Long) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -118611028, new Object[]{this, Long.valueOf(j4)}, PushInfo.Companion.onExtraCallback(), 118611032, PushInfo.Companion.onExtraCallback())).longValue();
                return;
            }
            return;
        }
        if (i2 == 374648427) {
            if (this.IPostMessageServiceStub.size() == 0) {
                throw ParserException.onNavigationEvent("No valid tracks were found", (Throwable) null);
            }
            this.onUnminimized.onExtraCallbackWithResult();
            return;
        }
        int i26 = i15 + 39;
        ITrustedWebActivityCallbackStub = i26 % 128;
        if (i26 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (i2 == 475249515) {
            if (!this.IEngagementSignalsCallbackDefault) {
                this.onUnminimized.IAuthTabCallback(onExtraCallback(this.onActivityLayout, this.onMinimized));
                this.IEngagementSignalsCallbackDefault = true;
            }
            this.onActivityLayout = null;
            this.onMinimized = null;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    protected void onExtraCallback(int i2, long j) throws Throwable {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel + 17;
        int i5 = i4 % 128;
        ITrustedWebActivityCallbackStub = i5;
        if (i4 % 2 != 0 ? i2 == 20529 : i2 == 15280) {
            if (j == 0) {
                return;
            }
            throw ParserException.onNavigationEvent("ContentEncodingOrder " + j + " not supported", (Throwable) null);
        }
        if (i2 == 20530) {
            if (j == 1) {
                return;
            }
            throw ParserException.onNavigationEvent("ContentEncodingScope " + j + " not supported", (Throwable) null);
        }
        switch (i2) {
            case 131:
                IAuthTabCallback(i2).warmup = (int) j;
                return;
            case 136:
                IAuthTabCallback(i2).extraCallbackWithResult = j == 1;
                return;
            case 155:
                this.onTransact = ((Long) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -118611028, new Object[]{this, Long.valueOf(j)}, PushInfo.Companion.onExtraCallback(), 118611032, PushInfo.Companion.onExtraCallback())).longValue();
                return;
            case 159:
                IAuthTabCallback(i2).onExtraCallback = (int) j;
                return;
            case 176:
                IAuthTabCallback(i2).ICustomTabsServiceStubProxy = (int) j;
                return;
            case 179:
                onExtraCallbackWithResult(i2);
                this.onActivityLayout.onWarmupCompleted(((Long) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -118611028, new Object[]{this, Long.valueOf(j)}, PushInfo.Companion.onExtraCallback(), 118611032, PushInfo.Companion.onExtraCallback())).longValue());
                return;
            case 186:
                IAuthTabCallback(i2).onMinimized = (int) j;
                return;
            case 215:
                IAuthTabCallback(i2).ICustomTabsCallbackStub = (int) j;
                return;
            case 231:
                this.readTypedObject = ((Long) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -118611028, new Object[]{this, Long.valueOf(j)}, PushInfo.Companion.onExtraCallback(), 118611032, PushInfo.Companion.onExtraCallback())).longValue();
                return;
            case 238:
                this.IAuthTabCallbackDefault = (int) j;
                return;
            case 241:
                if (this.ICustomTabsServiceStubProxy) {
                    return;
                }
                onExtraCallbackWithResult(i2);
                this.onMinimized.onWarmupCompleted(j);
                this.ICustomTabsServiceStubProxy = true;
                return;
            case 251:
                this.access100 = true;
                return;
            case 16871:
                IAuthTabCallback(i2).writeTypedList = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw ParserException.onNavigationEvent("ContentCompAlgo " + j + " not supported", (Throwable) null);
            case 17029:
                if (j >= 1) {
                    int i6 = i5 + 73;
                    IPostMessageService_Parcel = i6 % 128;
                    if (i6 % 2 != 0) {
                        throw null;
                    }
                    if (j <= 2) {
                        return;
                    }
                }
                throw ParserException.onNavigationEvent("DocTypeReadVersion " + j + " not supported", (Throwable) null);
            case 17143:
                if (j == 1) {
                    return;
                }
                throw ParserException.onNavigationEvent("EBMLReadVersion " + j + " not supported", (Throwable) null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw ParserException.onNavigationEvent("ContentEncAlgo " + j + " not supported", (Throwable) null);
            case 18408:
                if (j == 1) {
                    return;
                }
                StringBuilder sb = new StringBuilder();
                Object[] objArr = new Object[1];
                a(new int[]{0, 22, 51, 0}, false, new byte[]{0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1}, objArr);
                sb.append(((String) objArr[0]).intern());
                sb.append(j);
                sb.append(" not supported");
                throw ParserException.onNavigationEvent(sb.toString(), (Throwable) null);
            case 21420:
                this.ICustomTabsServiceDefault = j + this.IEngagementSignalsCallback;
                return;
            case 21432:
                int i7 = (int) j;
                IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
                if (i7 == 0) {
                    this.onMessageChannelReady.ICustomTabsServiceStub = 0;
                    return;
                }
                int i8 = ITrustedWebActivityCallbackStub + 123;
                IPostMessageService_Parcel = i8 % 128;
                if (i8 % 2 == 0 ? i7 == 1 : i7 == 0) {
                    this.onMessageChannelReady.ICustomTabsServiceStub = 2;
                    return;
                } else if (i7 == 3) {
                    this.onMessageChannelReady.ICustomTabsServiceStub = 1;
                    return;
                } else {
                    if (i7 == 15) {
                        this.onMessageChannelReady.ICustomTabsServiceStub = 3;
                        return;
                    }
                    return;
                }
            case 21680:
                IAuthTabCallback(i2).access000 = (int) j;
                return;
            case 21682:
                IAuthTabCallback(i2).IAuthTabCallback_Parcel = (int) j;
                return;
            case 21690:
                IAuthTabCallback(i2).getInterfaceDescriptor = (int) j;
                return;
            case 21930:
                onExtraCallback onextracallbackIAuthTabCallback = IAuthTabCallback(i2);
                if (j == 1) {
                    int i9 = IPostMessageService_Parcel + 3;
                    ITrustedWebActivityCallbackStub = i9 % 128;
                    if (i9 % 2 != 0) {
                        z = true;
                    }
                }
                onextracallbackIAuthTabCallback.readTypedObject = z;
                return;
            case 21938:
                IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
                onExtraCallback onextracallback = this.onMessageChannelReady;
                onextracallback.ICustomTabsCallback = true;
                onextracallback.IAuthTabCallback = (int) j;
                return;
            case 21998:
                IAuthTabCallback(i2).onActivityLayout = (int) j;
                return;
            case 22186:
                IAuthTabCallback(i2).onWarmupCompleted = j;
                return;
            case 22203:
                IAuthTabCallback(i2).requestPostMessageChannel = j;
                return;
            case 25188:
                IAuthTabCallback(i2).onNavigationEvent = (int) j;
                return;
            case 30114:
                this.access000 = j;
                return;
            case 30321:
                IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
                int i10 = (int) j;
                if (i10 == 0) {
                    this.onMessageChannelReady.setEngagementSignalsCallback = 0;
                    return;
                }
                int i11 = ITrustedWebActivityCallbackStub + 37;
                int i12 = i11 % 128;
                IPostMessageService_Parcel = i12;
                int i13 = i11 % 2;
                if (i10 == 1) {
                    this.onMessageChannelReady.setEngagementSignalsCallback = 1;
                    return;
                }
                if (i10 == 2) {
                    this.onMessageChannelReady.setEngagementSignalsCallback = 2;
                    return;
                }
                int i14 = i12 + 101;
                ITrustedWebActivityCallbackStub = i14 % 128;
                if (i14 % 2 == 0) {
                    if (i10 != 3) {
                        return;
                    }
                } else if (i10 != 3) {
                    return;
                }
                this.onMessageChannelReady.setEngagementSignalsCallback = 3;
                return;
            case 2352003:
                IAuthTabCallback(i2).IAuthTabCallbackStubProxy = (int) j;
                return;
            case 2807729:
                this.IEngagementSignalsCallback_Parcel = j;
                return;
            default:
                switch (i2) {
                    case 21945:
                        IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
                        int i15 = (int) j;
                        if (i15 == 1) {
                            this.onMessageChannelReady.IAuthTabCallbackStub = 2;
                            return;
                        }
                        int i16 = ITrustedWebActivityCallbackStub + 101;
                        IPostMessageService_Parcel = i16 % 128;
                        int i17 = i16 % 2;
                        if (i15 == 2) {
                            this.onMessageChannelReady.IAuthTabCallbackStub = 1;
                            return;
                        }
                        return;
                    case 21946:
                        IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
                        int iIAuthTabCallback = TextToolbarHelperApi28ExternalSyntheticLambda1.IAuthTabCallback((int) j);
                        if (iIAuthTabCallback != -1) {
                            this.onMessageChannelReady.onTransact = iIAuthTabCallback;
                            return;
                        }
                        return;
                    case 21947:
                        IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
                        this.onMessageChannelReady.ICustomTabsCallback = true;
                        int iOnNavigationEvent = TextToolbarHelperApi28ExternalSyntheticLambda1.onNavigationEvent((int) j);
                        if (iOnNavigationEvent != -1) {
                            this.onMessageChannelReady.IAuthTabCallbackDefault = iOnNavigationEvent;
                            return;
                        }
                        return;
                    case 21948:
                        IAuthTabCallback(i2).onPostMessage = (int) j;
                        return;
                    case 21949:
                        IAuthTabCallback(i2).onMessageChannelReady = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    protected void onExtraCallbackWithResult(int i2, double d) throws ParserException {
        int i3 = 2 % 2;
        if (i2 == 181) {
            IAuthTabCallback(i2).requestPostMessageChannelWithExtras = (int) d;
            return;
        }
        if (i2 == 17545) {
            this.onActivityResized = (long) d;
            return;
        }
        int i4 = ITrustedWebActivityCallbackStub + 99;
        IPostMessageService_Parcel = i4 % 128;
        int i5 = i4 % 2;
        switch (i2) {
            case 21969:
                IAuthTabCallback(i2).postMessage = (float) d;
                break;
            case 21970:
                IAuthTabCallback(i2).prefetch = (float) d;
                break;
            case 21971:
                IAuthTabCallback(i2).ICustomTabsCallback_Parcel = (float) d;
                break;
            case 21972:
                IAuthTabCallback(i2).ICustomTabsService = (float) d;
                int i6 = IPostMessageService_Parcel + 11;
                ITrustedWebActivityCallbackStub = i6 % 128;
                int i7 = i6 % 2;
                break;
            case 21973:
                IAuthTabCallback(i2).mayLaunchUrl = (float) d;
                int i8 = ITrustedWebActivityCallbackStub + 83;
                IPostMessageService_Parcel = i8 % 128;
                int i9 = i8 % 2;
                break;
            case 21974:
                IAuthTabCallback(i2).extraCommand = (float) d;
                int i10 = IPostMessageService_Parcel + 51;
                ITrustedWebActivityCallbackStub = i10 % 128;
                int i11 = i10 % 2;
                break;
            case 21975:
                IAuthTabCallback(i2).ICustomTabsServiceDefault = (float) d;
                break;
            case 21976:
                IAuthTabCallback(i2).validateRelationship = (float) d;
                break;
            case 21977:
                IAuthTabCallback(i2).ICustomTabsCallbackStubProxy = (float) d;
                break;
            case 21978:
                IAuthTabCallback(i2).ICustomTabsCallbackDefault = (float) d;
                break;
            default:
                switch (i2) {
                    case 30323:
                        IAuthTabCallback(i2).receiveFile = (float) d;
                        break;
                    case 30324:
                        IAuthTabCallback(i2).newAuthTabSession = (float) d;
                        break;
                    case 30325:
                        IAuthTabCallback(i2).newSession = (float) d;
                        break;
                }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    protected void onExtraCallbackWithResult(int i2, String str) throws ParserException {
        int i3 = 2 % 2;
        if (i2 == 134) {
            IAuthTabCallback(i2).onExtraCallbackWithResult = str;
            return;
        }
        int i4 = IPostMessageService_Parcel + 43;
        int i5 = i4 % 128;
        ITrustedWebActivityCallbackStub = i5;
        if (i4 % 2 != 0 ? i2 != 17026 : i2 != 25537) {
            if (i2 == 21358) {
                IAuthTabCallback(i2).onUnminimized = str;
                return;
            } else {
                if (i2 == 2274716) {
                    IAuthTabCallback(i2).ICustomTabsService_Parcel = str;
                    return;
                }
                int i6 = i5 + 45;
                IPostMessageService_Parcel = i6 % 128;
                int i7 = i6 % 2;
                return;
            }
        }
        if ((!"webm".equals(str)) && !"matroska".equals(str)) {
            throw ParserException.onNavigationEvent("DocType " + str + " not supported", (Throwable) null);
        }
        this.extraCommand = Objects.equals(str, "webm");
        int i8 = ITrustedWebActivityCallbackStub + 25;
        IPostMessageService_Parcel = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    protected void IAuthTabCallback(int i2, int i3, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
        onExtraCallback onextracallback;
        int i4;
        onExtraCallback onextracallback2;
        onExtraCallback onextracallback3;
        long j;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        Throwable th = null;
        int i10 = 1;
        int i11 = 0;
        if (i2 != 161 && i2 != 163) {
            if (i2 == 165) {
                if (this.extraCallback == 2) {
                    onExtraCallback(this.IPostMessageServiceStub.get(this.ICustomTabsCallback), this.IAuthTabCallbackDefault, drawerKtExternalSyntheticLambda9, i3);
                    return;
                }
                return;
            }
            int i12 = ITrustedWebActivityCallbackStub + 113;
            int i13 = i12 % 128;
            IPostMessageService_Parcel = i13;
            if (i12 % 2 == 0 ? i2 == 16877 : i2 == 22809) {
                onExtraCallback(IAuthTabCallback(i2), drawerKtExternalSyntheticLambda9, i3);
                return;
            }
            if (i2 == 16981) {
                IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
                byte[] bArr = new byte[i3];
                this.onMessageChannelReady.prefetchWithMultipleUrls = bArr;
                drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr, 0, i3);
                return;
            }
            if (i2 == 18402) {
                byte[] bArr2 = new byte[i3];
                drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr2, 0, i3);
                IAuthTabCallback(i2).asInterface = new ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback(1, bArr2, 0, 0);
                return;
            }
            int i14 = i13 + 19;
            ITrustedWebActivityCallbackStub = i14 % 128;
            int i15 = i14 % 2;
            if (i2 == 21419) {
                Arrays.fill(this.updateVisuals.onExtraCallback(), (byte) 0);
                drawerKtExternalSyntheticLambda9.onNavigationEvent(this.updateVisuals.onExtraCallback(), 4 - i3, i3);
                this.updateVisuals.asBinder(0);
                this.ICustomTabsServiceStub = (int) this.updateVisuals.onActivityResized();
                return;
            }
            if (i2 == 25506) {
                IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
                byte[] bArr3 = new byte[i3];
                this.onMessageChannelReady.asBinder = bArr3;
                drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr3, 0, i3);
                return;
            }
            if (i2 != 30322) {
                throw ParserException.onNavigationEvent("Unexpected id: " + i2, (Throwable) null);
            }
            IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
            byte[] bArr4 = new byte[i3];
            this.onMessageChannelReady.newSessionWithExtras = bArr4;
            drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr4, 0, i3);
            return;
        }
        if (this.extraCallback == 0) {
            this.ICustomTabsCallback = (int) this.IPostMessageService.onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, false, true, 8);
            this.extraCallbackWithResult = this.IPostMessageService.onExtraCallbackWithResult();
            this.onTransact = -9223372036854775807L;
            this.extraCallback = 1;
            this.warmup.onExtraCallback(0);
        }
        onExtraCallback onextracallback4 = this.IPostMessageServiceStub.get(this.ICustomTabsCallback);
        if (onextracallback4 == null) {
            drawerKtExternalSyntheticLambda9.onExtraCallback(i3 - this.extraCallbackWithResult);
            this.extraCallback = 0;
            return;
        }
        if (this.extraCallback == 1) {
            onNavigationEvent(drawerKtExternalSyntheticLambda9, 3);
            int i16 = (this.warmup.onExtraCallback()[2] & 6) >> 1;
            byte b = 255;
            if (i16 == 0) {
                int i17 = IPostMessageService_Parcel + 87;
                ITrustedWebActivityCallbackStub = i17 % 128;
                int i18 = i17 % 2;
                this.IAuthTabCallbackStubProxy = 1;
                int[] iArrIAuthTabCallback = IAuthTabCallback(this.getInterfaceDescriptor, 1);
                this.getInterfaceDescriptor = iArrIAuthTabCallback;
                iArrIAuthTabCallback[0] = (i3 - this.extraCallbackWithResult) - 3;
            } else {
                int i19 = 4;
                onNavigationEvent(drawerKtExternalSyntheticLambda9, 4);
                int i20 = (this.warmup.onExtraCallback()[3] & 255) + 1;
                this.IAuthTabCallbackStubProxy = i20;
                int[] iArrIAuthTabCallback2 = IAuthTabCallback(this.getInterfaceDescriptor, i20);
                this.getInterfaceDescriptor = iArrIAuthTabCallback2;
                if (i16 == 2) {
                    int i21 = this.extraCallbackWithResult;
                    int i22 = this.IAuthTabCallbackStubProxy;
                    Arrays.fill(iArrIAuthTabCallback2, 0, i22, ((i3 - i21) - 4) / i22);
                } else {
                    if (i16 != 1) {
                        if (i16 != 3) {
                            throw ParserException.onNavigationEvent("Unexpected lacing value: " + i16, (Throwable) null);
                        }
                        int i23 = ITrustedWebActivityCallbackStub + 75;
                        IPostMessageService_Parcel = i23 % 128;
                        int i24 = i23 % 2;
                        int i25 = 0;
                        int i26 = 0;
                        while (true) {
                            int i27 = this.IAuthTabCallbackStubProxy - i10;
                            if (i25 >= i27) {
                                onextracallback2 = onextracallback4;
                                this.getInterfaceDescriptor[i27] = ((i3 - this.extraCallbackWithResult) - i19) - i26;
                                break;
                            }
                            int i28 = IPostMessageService_Parcel + 63;
                            ITrustedWebActivityCallbackStub = i28 % 128;
                            int i29 = i28 % 2;
                            this.getInterfaceDescriptor[i25] = i11;
                            int i30 = i19 + 1;
                            onNavigationEvent(drawerKtExternalSyntheticLambda9, i30);
                            if (this.warmup.onExtraCallback()[i19] == 0) {
                                throw ParserException.onNavigationEvent("No valid varint length mask found", th);
                            }
                            int i31 = i11;
                            while (true) {
                                if (i31 >= 8) {
                                    onextracallback3 = onextracallback4;
                                    j = 0;
                                    i5 = i30;
                                    break;
                                }
                                int i32 = i10 << (7 - i31);
                                if ((this.warmup.onExtraCallback()[i19] & i32) != 0) {
                                    i5 = i30 + i31;
                                    onNavigationEvent(drawerKtExternalSyntheticLambda9, i5);
                                    j = this.warmup.onExtraCallback()[i19] & b & (~i32);
                                    while (i30 < i5) {
                                        int i33 = ITrustedWebActivityCallbackStub + 91;
                                        IPostMessageService_Parcel = i33 % 128;
                                        int i34 = i33 % 2;
                                        j = (j << 8) | (this.warmup.onExtraCallback()[i30] & 255);
                                        onextracallback4 = onextracallback4;
                                        i30++;
                                    }
                                    onextracallback3 = onextracallback4;
                                    if (i25 > 0) {
                                        int i35 = ITrustedWebActivityCallbackStub + 107;
                                        IPostMessageService_Parcel = i35 % 128;
                                        j = i35 % 2 != 0 ? j + ((1 << (i31 >>> 229)) % 1) : j - ((1 << ((i31 * 7) + 6)) - 1);
                                    }
                                } else {
                                    i31++;
                                    i10 = 1;
                                    b = 255;
                                }
                            }
                            if (j < -2147483648L || j > 2147483647L) {
                                break;
                            }
                            int i36 = (int) j;
                            int[] iArr = this.getInterfaceDescriptor;
                            if (i25 != 0) {
                                i36 += iArr[i25 - 1];
                            }
                            iArr[i25] = i36;
                            i26 += i36;
                            i25++;
                            i19 = i5;
                            onextracallback4 = onextracallback3;
                            th = null;
                            i10 = 1;
                            i11 = 0;
                            b = 255;
                        }
                        throw ParserException.onNavigationEvent("EBML lacing sample size out of range.", (Throwable) null);
                    }
                    int i37 = 0;
                    int i38 = 0;
                    while (true) {
                        i6 = this.IAuthTabCallbackStubProxy - 1;
                        if (i37 >= i6) {
                            break;
                        }
                        int i39 = ITrustedWebActivityCallbackStub + 101;
                        IPostMessageService_Parcel = i39 % 128;
                        if (i39 % 2 != 0) {
                            this.getInterfaceDescriptor[i37] = 1;
                        } else {
                            this.getInterfaceDescriptor[i37] = 0;
                        }
                        while (true) {
                            i7 = i19 + 1;
                            onNavigationEvent(drawerKtExternalSyntheticLambda9, i7);
                            int i40 = this.warmup.onExtraCallback()[i19] & 255;
                            int[] iArr2 = this.getInterfaceDescriptor;
                            i8 = iArr2[i37] + i40;
                            iArr2[i37] = i8;
                            if (i40 != 255) {
                                break;
                            } else {
                                i19 = i7;
                            }
                        }
                        int i41 = IPostMessageService_Parcel + 49;
                        ITrustedWebActivityCallbackStub = i41 % 128;
                        int i42 = i41 % 2;
                        i38 += i8;
                        i37++;
                        i19 = i7;
                    }
                    this.getInterfaceDescriptor[i6] = ((i3 - this.extraCallbackWithResult) - i19) - i38;
                }
            }
            onextracallback2 = onextracallback4;
            this.writeTypedObject = this.readTypedObject + ((Long) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -118611028, new Object[]{this, Long.valueOf((this.warmup.onExtraCallback()[0] << 8) | (this.warmup.onExtraCallback()[1] & 255))}, PushInfo.Companion.onExtraCallback(), 118611032, PushInfo.Companion.onExtraCallback())).longValue();
            onextracallback = onextracallback2;
            this.asInterface = (onextracallback.warmup == 2 || (i2 == 163 && (this.warmup.onExtraCallback()[2] & 128) == 128)) ? 1 : 0;
            this.extraCallback = 2;
            this.IAuthTabCallback_Parcel = 0;
            i4 = 163;
        } else {
            onextracallback = onextracallback4;
            i4 = 163;
        }
        if (i2 == i4) {
            while (true) {
                int i43 = this.IAuthTabCallback_Parcel;
                if (i43 >= this.IAuthTabCallbackStubProxy) {
                    this.extraCallback = 0;
                    return;
                } else {
                    onExtraCallbackWithResult(onextracallback, ((this.IAuthTabCallback_Parcel * onextracallback.IAuthTabCallbackStubProxy) / 1000) + this.writeTypedObject, this.asInterface, onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, onextracallback, this.getInterfaceDescriptor[i43], false), 0);
                    this.IAuthTabCallback_Parcel++;
                }
            }
        } else {
            while (true) {
                int i44 = this.IAuthTabCallback_Parcel;
                if (i44 >= this.IAuthTabCallbackStubProxy) {
                    return;
                }
                int[] iArr3 = this.getInterfaceDescriptor;
                iArr3[i44] = onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, onextracallback, iArr3[i44], true);
                this.IAuthTabCallback_Parcel++;
            }
        }
    }

    protected void onExtraCallback(onExtraCallback onextracallback, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel + 39;
        ITrustedWebActivityCallbackStub = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            if (onextracallback.writeTypedList != 1685485123 && onextracallback.writeTypedList != 1685480259) {
                int i5 = ITrustedWebActivityCallbackStub + 93;
                IPostMessageService_Parcel = i5 % 128;
                if (i5 % 2 == 0) {
                    drawerKtExternalSyntheticLambda9.onExtraCallback(i2);
                    return;
                } else {
                    drawerKtExternalSyntheticLambda9.onExtraCallback(i2);
                    throw null;
                }
            }
            byte[] bArr = new byte[i2];
            onextracallback.access100 = bArr;
            drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr, 0, i2);
            return;
        }
        int unused = onextracallback.writeTypedList;
        obj.hashCode();
        throw null;
    }

    protected void onExtraCallback(onExtraCallback onextracallback, int i2, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i3) throws IOException {
        int i4 = 2 % 2;
        if (i2 == 4) {
            int i5 = ITrustedWebActivityCallbackStub + 7;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            if ("V_VP9".equals(onextracallback.onExtraCallbackWithResult)) {
                int i7 = ITrustedWebActivityCallbackStub + 47;
                IPostMessageService_Parcel = i7 % 128;
                if (i7 % 2 != 0) {
                    this.onSessionEnded.onExtraCallback(i3);
                    drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onSessionEnded.onExtraCallback(), 0, i3);
                    return;
                } else {
                    this.onSessionEnded.onExtraCallback(i3);
                    drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onSessionEnded.onExtraCallback(), 0, i3);
                    return;
                }
            }
        }
        drawerKtExternalSyntheticLambda9.onExtraCallback(i3);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static /* synthetic */ Object onExtraCallback(Object[] objArr) throws ParserException {
        OneLineExternalSyntheticLambda0 oneLineExternalSyntheticLambda0 = (OneLineExternalSyntheticLambda0) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub;
        int i4 = i3 + 49;
        IPostMessageService_Parcel = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            if (oneLineExternalSyntheticLambda0.onMessageChannelReady == null) {
                throw ParserException.onNavigationEvent("Element " + iIntValue + " must be in a TrackEntry", (Throwable) null);
            }
            int i5 = i3 + 47;
            IPostMessageService_Parcel = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        onExtraCallback onextracallback = oneLineExternalSyntheticLambda0.onMessageChannelReady;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    @EnsuresNonNull
    private void onExtraCallbackWithResult(int i2) throws ParserException {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub;
        int i5 = i4 + 125;
        IPostMessageService_Parcel = i5 % 128;
        if (i5 % 2 == 0) {
            if (this.onActivityLayout != null) {
                int i6 = i4 + 107;
                IPostMessageService_Parcel = i6 % 128;
                if (i6 % 2 == 0) {
                    if (this.onMinimized != null) {
                        return;
                    }
                } else {
                    throw null;
                }
            }
            throw ParserException.onNavigationEvent("Element " + i2 + " must be in a Cues", (Throwable) null);
        }
        throw null;
    }

    protected onExtraCallback IAuthTabCallback(int i2) throws ParserException {
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 121;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 == 0) {
            IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
            return this.onMessageChannelReady;
        }
        IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    @RequiresNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallbackWithResult(onExtraCallback onextracallback, long j, int i2, int i3, int i4) {
        int iOnExtraCallbackWithResult;
        int i5 = 2 % 2;
        int i6 = ITrustedWebActivityCallbackStub + 17;
        IPostMessageService_Parcel = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            ExposedDropdownMenu_androidKtExternalSyntheticLambda8 exposedDropdownMenu_androidKtExternalSyntheticLambda8 = onextracallback.updateVisuals;
            obj.hashCode();
            throw null;
        }
        ExposedDropdownMenu_androidKtExternalSyntheticLambda8 exposedDropdownMenu_androidKtExternalSyntheticLambda82 = onextracallback.updateVisuals;
        if (exposedDropdownMenu_androidKtExternalSyntheticLambda82 != null) {
            exposedDropdownMenu_androidKtExternalSyntheticLambda82.onExtraCallback(onextracallback.isEngagementSignalsApiAvailable, j, i2, i3, i4, onextracallback.asInterface);
        } else if ((!"S_TEXT/UTF8".equals(onextracallback.onExtraCallbackWithResult)) && !"S_TEXT/ASS".equals(onextracallback.onExtraCallbackWithResult) && !"S_TEXT/SSA".equals(onextracallback.onExtraCallbackWithResult)) {
            int i7 = ITrustedWebActivityCallbackStub + 105;
            IPostMessageService_Parcel = i7 % 128;
            if (i7 % 2 != 0) {
                "S_TEXT/WEBVTT".equals(onextracallback.onExtraCallbackWithResult);
                throw null;
            }
            if ("S_TEXT/WEBVTT".equals(onextracallback.onExtraCallbackWithResult)) {
                if (this.IAuthTabCallbackStubProxy > 1) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.onTransact;
                    if (j2 == -9223372036854775807L) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                        int i8 = ITrustedWebActivityCallbackStub + 31;
                        IPostMessageService_Parcel = i8 % 128;
                        int i9 = i8 % 2;
                    } else {
                        onExtraCallback(onextracallback.onExtraCallbackWithResult, j2, this.IEngagementSignalsCallbackStub.onExtraCallback());
                        int iOnWarmupCompleted = this.IEngagementSignalsCallbackStub.onWarmupCompleted();
                        while (true) {
                            if (iOnWarmupCompleted >= this.IEngagementSignalsCallbackStub.onExtraCallbackWithResult()) {
                                break;
                            }
                            if (this.IEngagementSignalsCallbackStub.onExtraCallback()[iOnWarmupCompleted] == 0) {
                                this.IEngagementSignalsCallbackStub.onNavigationEvent(iOnWarmupCompleted);
                                break;
                            }
                            iOnWarmupCompleted++;
                        }
                        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = onextracallback.isEngagementSignalsApiAvailable;
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.IEngagementSignalsCallbackStub;
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(textFieldDecoratorModifierNodeExternalSyntheticLambda20, textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallbackWithResult());
                        iOnExtraCallbackWithResult = i3 + this.IEngagementSignalsCallbackStub.onExtraCallbackWithResult();
                        if ((i2 & 268435456) != 0) {
                            int i10 = IPostMessageService_Parcel + 119;
                            ITrustedWebActivityCallbackStub = i10 % 128;
                            if (i10 % 2 != 0 ? this.IAuthTabCallbackStubProxy <= 1 : this.IAuthTabCallbackStubProxy <= 0) {
                                int iOnExtraCallbackWithResult2 = this.onSessionEnded.onExtraCallbackWithResult();
                                onextracallback.isEngagementSignalsApiAvailable.IAuthTabCallback(this.onSessionEnded, iOnExtraCallbackWithResult2, 2);
                                iOnExtraCallbackWithResult += iOnExtraCallbackWithResult2;
                            } else {
                                this.onSessionEnded.onExtraCallback(0);
                            }
                        }
                        onextracallback.isEngagementSignalsApiAvailable.onExtraCallback(j, i2, iOnExtraCallbackWithResult, i4, onextracallback.asInterface);
                    }
                }
                iOnExtraCallbackWithResult = i3;
                if ((i2 & 268435456) != 0) {
                }
                onextracallback.isEngagementSignalsApiAvailable.onExtraCallback(j, i2, iOnExtraCallbackWithResult, i4, onextracallback.asInterface);
            } else {
                iOnExtraCallbackWithResult = i3;
                if ((i2 & 268435456) != 0) {
                }
                onextracallback.isEngagementSignalsApiAvailable.onExtraCallback(j, i2, iOnExtraCallbackWithResult, i4, onextracallback.asInterface);
            }
        }
        this.isEngagementSignalsApiAvailable = true;
    }

    private void onNavigationEvent(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, int i2) throws IOException {
        TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20;
        int iIAuthTabCallback;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 73;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
            if (this.warmup.onExtraCallbackWithResult() >= i2) {
                return;
            }
        } else if (this.warmup.onExtraCallbackWithResult() >= i2) {
            return;
        }
        if (this.warmup.IAuthTabCallback() < i2) {
            int i6 = ITrustedWebActivityCallbackStub + 69;
            IPostMessageService_Parcel = i6 % 128;
            if (i6 % 2 != 0) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.warmup;
                iIAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback() % 1;
            } else {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20 = this.warmup;
                iIAuthTabCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback() << 1;
            }
            textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback(Math.max(iIAuthTabCallback, i2));
        }
        drawerKtExternalSyntheticLambda9.onNavigationEvent(this.warmup.onExtraCallback(), this.warmup.onExtraCallbackWithResult(), i2 - this.warmup.onExtraCallbackWithResult());
        this.warmup.onNavigationEvent(i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Removed duplicated region for block: B:111:0x018f A[EDGE_INSN: B:111:0x018f->B:65:0x018f BREAK  A[LOOP:0: B:58:0x016d->B:64:0x018b], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b1  */
    @RequiresNonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, onExtraCallback onextracallback, int i2, boolean z) throws ParserException, IOException {
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        if ("S_TEXT/UTF8".equals(onextracallback.onExtraCallbackWithResult)) {
            IAuthTabCallback(drawerKtExternalSyntheticLambda9, IAuthTabCallback, i2);
            return asBinder();
        }
        if (!"S_TEXT/ASS".equals(onextracallback.onExtraCallbackWithResult)) {
            int i7 = ITrustedWebActivityCallbackStub + 25;
            IPostMessageService_Parcel = i7 % 128;
            Object obj = null;
            if (i7 % 2 != 0) {
                "S_TEXT/SSA".equals(onextracallback.onExtraCallbackWithResult);
                throw null;
            }
            if (!"S_TEXT/SSA".equals(onextracallback.onExtraCallbackWithResult)) {
                if ("S_TEXT/WEBVTT".equals(onextracallback.onExtraCallbackWithResult)) {
                    IAuthTabCallback(drawerKtExternalSyntheticLambda9, IAuthTabCallbackStub, i2);
                    return asBinder();
                }
                ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5 = onextracallback.isEngagementSignalsApiAvailable;
                boolean z2 = true;
                if (!this.newSession) {
                    if (onextracallback.extraCallback) {
                        this.asInterface &= -1073741825;
                        if (!this.requestPostMessageChannel) {
                            drawerKtExternalSyntheticLambda9.onNavigationEvent(this.warmup.onExtraCallback(), 0, 1);
                            this.postMessage++;
                            if ((this.warmup.onExtraCallback()[0] & 128) == 128) {
                                throw ParserException.onNavigationEvent("Extension bit is set in signal byte", (Throwable) null);
                            }
                            int i8 = IPostMessageService_Parcel + 19;
                            ITrustedWebActivityCallbackStub = i8 % 128;
                            this.requestPostMessageChannelWithExtras = i8 % 2 == 0 ? this.warmup.onExtraCallback()[0] : this.warmup.onExtraCallback()[0];
                            this.requestPostMessageChannel = true;
                        }
                        byte b = this.requestPostMessageChannelWithExtras;
                        if ((b & 1) == 1) {
                            boolean z3 = (b & 2) == 2;
                            this.asInterface |= 1073741824;
                            if (!this.prefetchWithMultipleUrls) {
                                drawerKtExternalSyntheticLambda9.onNavigationEvent(this.onRelationshipValidationResult.onExtraCallback(), 0, 8);
                                this.postMessage += 8;
                                this.prefetchWithMultipleUrls = true;
                                this.warmup.onExtraCallback()[0] = (byte) ((z3 ? 128 : 0) | 8);
                                this.warmup.asBinder(0);
                                exposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback(this.warmup, 1, 1);
                                this.prefetch++;
                                this.onRelationshipValidationResult.asBinder(0);
                                exposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback(this.onRelationshipValidationResult, 8, 1);
                                this.prefetch += 8;
                            }
                            if (z3) {
                                if (!this.receiveFile) {
                                    drawerKtExternalSyntheticLambda9.onNavigationEvent(this.warmup.onExtraCallback(), 0, 1);
                                    this.postMessage++;
                                    this.warmup.asBinder(0);
                                    this.setEngagementSignalsCallback = this.warmup.onMinimized();
                                    this.receiveFile = true;
                                }
                                int i9 = this.setEngagementSignalsCallback << 2;
                                this.warmup.onExtraCallback(i9);
                                drawerKtExternalSyntheticLambda9.onNavigationEvent(this.warmup.onExtraCallback(), 0, i9);
                                this.postMessage += i9;
                                short s = (short) ((this.setEngagementSignalsCallback / 2) + 1);
                                int i10 = (s * 6) + 2;
                                ByteBuffer byteBuffer = this.ICustomTabsCallbackStubProxy;
                                if (byteBuffer != null) {
                                    int i11 = IPostMessageService_Parcel + 97;
                                    ITrustedWebActivityCallbackStub = i11 % 128;
                                    if (i11 % 2 == 0) {
                                        int i12 = 40 / 0;
                                        if (byteBuffer.capacity() < i10) {
                                            this.ICustomTabsCallbackStubProxy = ByteBuffer.allocate(i10);
                                        }
                                        this.ICustomTabsCallbackStubProxy.position(0);
                                        this.ICustomTabsCallbackStubProxy.putShort(s);
                                        i3 = 0;
                                        i4 = 0;
                                        while (true) {
                                            i5 = this.setEngagementSignalsCallback;
                                            if (i3 < i5) {
                                                break;
                                            }
                                            int iICustomTabsCallbackDefault = this.warmup.ICustomTabsCallbackDefault();
                                            if (i3 % 2 == 0) {
                                                this.ICustomTabsCallbackStubProxy.putShort((short) (iICustomTabsCallbackDefault - i4));
                                            } else {
                                                this.ICustomTabsCallbackStubProxy.putInt(iICustomTabsCallbackDefault - i4);
                                            }
                                            i3++;
                                            i4 = iICustomTabsCallbackDefault;
                                        }
                                        int i13 = (i2 - this.postMessage) - i4;
                                        if (i5 % 2 != 1) {
                                            int i14 = ITrustedWebActivityCallbackStub + 97;
                                            IPostMessageService_Parcel = i14 % 128;
                                            if (i14 % 2 != 0) {
                                                this.ICustomTabsCallbackStubProxy.putInt(i13);
                                                obj.hashCode();
                                                throw null;
                                            }
                                            this.ICustomTabsCallbackStubProxy.putInt(i13);
                                        } else {
                                            this.ICustomTabsCallbackStubProxy.putShort((short) i13);
                                            this.ICustomTabsCallbackStubProxy.putInt(0);
                                        }
                                        this.ICustomTabsCallbackDefault.onExtraCallback(this.ICustomTabsCallbackStubProxy.array(), i10);
                                        exposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback(this.ICustomTabsCallbackDefault, i10, 1);
                                        this.prefetch += i10;
                                    } else {
                                        if (byteBuffer.capacity() < i10) {
                                        }
                                        this.ICustomTabsCallbackStubProxy.position(0);
                                        this.ICustomTabsCallbackStubProxy.putShort(s);
                                        i3 = 0;
                                        i4 = 0;
                                        while (true) {
                                            i5 = this.setEngagementSignalsCallback;
                                            if (i3 < i5) {
                                            }
                                            i3++;
                                            i4 = iICustomTabsCallbackDefault;
                                        }
                                        int i132 = (i2 - this.postMessage) - i4;
                                        if (i5 % 2 != 1) {
                                        }
                                        this.ICustomTabsCallbackDefault.onExtraCallback(this.ICustomTabsCallbackStubProxy.array(), i10);
                                        exposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback(this.ICustomTabsCallbackDefault, i10, 1);
                                        this.prefetch += i10;
                                    }
                                }
                            }
                        }
                    } else {
                        byte[] bArr = onextracallback.prefetchWithMultipleUrls;
                        if (bArr != null) {
                            this.validateRelationship.onExtraCallback(bArr, bArr.length);
                        }
                    }
                    if (!(!onextracallback.IAuthTabCallback(z))) {
                        int i15 = ITrustedWebActivityCallbackStub + 97;
                        IPostMessageService_Parcel = i15 % 128;
                        int i16 = i15 % 2;
                        this.asInterface |= 268435456;
                        this.onSessionEnded.onExtraCallback(0);
                        int iOnExtraCallbackWithResult = (this.validateRelationship.onExtraCallbackWithResult() + i2) - this.postMessage;
                        this.warmup.onExtraCallback(4);
                        this.warmup.onExtraCallback()[0] = (byte) (iOnExtraCallbackWithResult >>> 24);
                        this.warmup.onExtraCallback()[1] = (byte) (iOnExtraCallbackWithResult >> 16);
                        this.warmup.onExtraCallback()[2] = (byte) (iOnExtraCallbackWithResult >> 8);
                        this.warmup.onExtraCallback()[3] = (byte) iOnExtraCallbackWithResult;
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback(this.warmup, 4, 2);
                        this.prefetch += 4;
                        int i17 = IPostMessageService_Parcel + 3;
                        ITrustedWebActivityCallbackStub = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    this.newSession = true;
                }
                int iOnExtraCallbackWithResult2 = i2 + this.validateRelationship.onExtraCallbackWithResult();
                if (!"V_MPEG4/ISO/AVC".equals(onextracallback.onExtraCallbackWithResult) && !"V_MPEGH/ISO/HEVC".equals(onextracallback.onExtraCallbackWithResult)) {
                    if (onextracallback.updateVisuals != null) {
                        if (this.validateRelationship.onExtraCallbackWithResult() == 0) {
                            int i19 = ITrustedWebActivityCallbackStub + 119;
                            IPostMessageService_Parcel = i19 % 128;
                            int i20 = i19 % 2;
                        } else {
                            z2 = false;
                        }
                        RecordingInputConnection_androidKt.onExtraCallbackWithResult(z2);
                        onextracallback.updateVisuals.onNavigationEvent(drawerKtExternalSyntheticLambda9);
                    }
                    while (true) {
                        int i21 = this.postMessage;
                        if (i21 >= iOnExtraCallbackWithResult2) {
                            break;
                        }
                        int iOnExtraCallbackWithResult3 = onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenu_androidKtExternalSyntheticLambda5, iOnExtraCallbackWithResult2 - i21);
                        this.postMessage += iOnExtraCallbackWithResult3;
                        this.prefetch += iOnExtraCallbackWithResult3;
                    }
                } else {
                    byte[] bArrOnExtraCallback = this.ICustomTabsService.onExtraCallback();
                    bArrOnExtraCallback[0] = 0;
                    bArrOnExtraCallback[1] = 0;
                    bArrOnExtraCallback[2] = 0;
                    int i22 = onextracallback.onRelationshipValidationResult;
                    while (this.postMessage < iOnExtraCallbackWithResult2) {
                        int i23 = this.newSessionWithExtras;
                        if (i23 == 0) {
                            onExtraCallback(drawerKtExternalSyntheticLambda9, bArrOnExtraCallback, 4 - i22, i22);
                            this.postMessage += i22;
                            this.ICustomTabsService.asBinder(0);
                            this.newSessionWithExtras = this.ICustomTabsService.ICustomTabsCallbackDefault();
                            this.mayLaunchUrl.asBinder(0);
                            exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(this.mayLaunchUrl, 4);
                            this.prefetch += 4;
                        } else {
                            int iOnExtraCallbackWithResult4 = onExtraCallbackWithResult(drawerKtExternalSyntheticLambda9, exposedDropdownMenu_androidKtExternalSyntheticLambda5, i23);
                            this.postMessage += iOnExtraCallbackWithResult4;
                            this.prefetch += iOnExtraCallbackWithResult4;
                            this.newSessionWithExtras -= iOnExtraCallbackWithResult4;
                        }
                    }
                }
                if ("A_VORBIS".equals(onextracallback.onExtraCallbackWithResult)) {
                    this.IEngagementSignalsCallbackStubProxy.asBinder(0);
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5.onNavigationEvent(this.IEngagementSignalsCallbackStubProxy, 4);
                    this.prefetch += 4;
                }
                return asBinder();
            }
        }
        IAuthTabCallback(drawerKtExternalSyntheticLambda9, onExtraCallbackWithResult, i2);
        return asBinder();
    }

    private int asBinder() {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 51;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.prefetch;
        access100();
        int i6 = ITrustedWebActivityCallbackStub + 21;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    private void access100() {
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 37;
        ITrustedWebActivityCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        this.postMessage = 0;
        this.prefetch = 0;
        this.newSessionWithExtras = 0;
        this.newSession = false;
        this.requestPostMessageChannel = false;
        this.receiveFile = false;
        this.setEngagementSignalsCallback = 0;
        this.requestPostMessageChannelWithExtras = (byte) 0;
        this.prefetchWithMultipleUrls = false;
        this.validateRelationship.onExtraCallback(0);
        int i5 = ITrustedWebActivityCallbackStub + 63;
        IPostMessageService_Parcel = i5 % 128;
        int i6 = i5 % 2;
    }

    private void IAuthTabCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, byte[] bArr, int i2) throws IOException {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel + 101;
        ITrustedWebActivityCallbackStub = i4 % 128;
        int i5 = i4 % 2;
        int length = bArr.length + i2;
        if (this.IEngagementSignalsCallbackStub.IAuthTabCallback() < length) {
            this.IEngagementSignalsCallbackStub.onWarmupCompleted(Arrays.copyOf(bArr, length + i2));
            int i6 = ITrustedWebActivityCallbackStub + 85;
            IPostMessageService_Parcel = i6 % 128;
            int i7 = i6 % 2;
        } else {
            System.arraycopy(bArr, 0, this.IEngagementSignalsCallbackStub.onExtraCallback(), 0, bArr.length);
        }
        drawerKtExternalSyntheticLambda9.onNavigationEvent(this.IEngagementSignalsCallbackStub.onExtraCallback(), bArr.length, i2);
        this.IEngagementSignalsCallbackStub.asBinder(0);
        this.IEngagementSignalsCallbackStub.onNavigationEvent(length);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void onExtraCallback(String str, long j, byte[] bArr) {
        char c;
        byte[] bArrOnExtraCallbackWithResult;
        int i2;
        int i3 = 2 % 2;
        switch (str.hashCode()) {
            case 738597099:
                if (!str.equals("S_TEXT/ASS")) {
                    c = 65535;
                    break;
                } else {
                    int i4 = ITrustedWebActivityCallbackStub + 41;
                    IPostMessageService_Parcel = i4 % 128;
                    int i5 = i4 % 2;
                    c = 0;
                    break;
                }
            case 738614379:
                if (!(!str.equals("S_TEXT/SSA"))) {
                    c = 1;
                    break;
                }
                break;
            case 1045209816:
                if (!(!str.equals("S_TEXT/WEBVTT"))) {
                    int i6 = ITrustedWebActivityCallbackStub + 7;
                    IPostMessageService_Parcel = i6 % 128;
                    int i7 = i6 % 2;
                    c = 2;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    int i8 = ITrustedWebActivityCallbackStub + 77;
                    IPostMessageService_Parcel = i8 % 128;
                    if (i8 % 2 == 0) {
                        c = 3;
                        break;
                    } else {
                        c = 4;
                        break;
                    }
                }
                break;
        }
        if (c == 0 || c == 1) {
            bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(j, "%01d:%02d:%02d:%02d", 10000L);
            i2 = 21;
        } else if (c == 2) {
            bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(j, "%02d:%02d:%02d.%03d", 1000L);
            i2 = 25;
        } else {
            if (c != 3) {
                throw new IllegalArgumentException();
            }
            bArrOnExtraCallbackWithResult = onExtraCallbackWithResult(j, "%02d:%02d:%02d,%03d", 1000L);
            int i9 = IPostMessageService_Parcel + 87;
            ITrustedWebActivityCallbackStub = i9 % 128;
            int i10 = i9 % 2;
            i2 = 19;
        }
        System.arraycopy(bArrOnExtraCallbackWithResult, 0, bArr, i2, bArrOnExtraCallbackWithResult.length);
    }

    private static byte[] onExtraCallbackWithResult(long j, String str, long j2) {
        boolean z;
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel;
        int i4 = i3 + 11;
        ITrustedWebActivityCallbackStub = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (j != -9223372036854775807L) {
            int i5 = i3 + 123;
            ITrustedWebActivityCallbackStub = i5 % 128;
            int i6 = i5 % 2;
            z = true;
        } else {
            z = false;
        }
        RecordingInputConnection_androidKt.onNavigationEvent(z);
        int i7 = (int) (j / 3600000000L);
        long j3 = j - (i7 * 3600000000L);
        int i8 = (int) (j3 / 60000000);
        long j4 = j3 - (i8 * 60000000);
        int i9 = (int) (j4 / 1000000);
        return TextFieldDecoratorModifierNodeExternalSyntheticLambda6.onNavigationEvent(String.format(Locale.US, str, Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf((int) ((j4 - (i9 * 1000000)) / j2))));
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[PHI: r1
      0x0033: PHI (r1v7 int) = (r1v6 int), (r1v10 int) binds: [B:8:0x0031, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void onExtraCallback(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, byte[] bArr, int i2, int i3) throws IOException {
        int iMin;
        int i4 = 2 % 2;
        int i5 = IPostMessageService_Parcel + 57;
        ITrustedWebActivityCallbackStub = i5 % 128;
        if (i5 % 2 == 0) {
            iMin = Math.min(i3, this.validateRelationship.onNavigationEvent());
            drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr, i2 - iMin, i3 * iMin);
            if (iMin > 0) {
                this.validateRelationship.onWarmupCompleted(bArr, i2, iMin);
            }
        } else {
            iMin = Math.min(i3, this.validateRelationship.onNavigationEvent());
            drawerKtExternalSyntheticLambda9.onNavigationEvent(bArr, i2 + iMin, i3 - iMin);
            if (iMin > 0) {
            }
        }
        int i6 = ITrustedWebActivityCallbackStub + 15;
        IPostMessageService_Parcel = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        if ((r6 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        r6 = 75 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r6.onExtraCallback(r5, r7, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0018, code lost:
    
        if (r1 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 > 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        r5 = java.lang.Math.min(r7, r1);
        r6.onNavigationEvent(r4.validateRelationship, r5);
        r6 = o.OneLineExternalSyntheticLambda0.IPostMessageService_Parcel + 79;
        o.OneLineExternalSyntheticLambda0.ITrustedWebActivityCallbackStub = r6 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int onExtraCallbackWithResult(DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9, ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5, int i2) throws IOException {
        int iOnNavigationEvent;
        int i3 = 2 % 2;
        int i4 = ITrustedWebActivityCallbackStub + 53;
        IPostMessageService_Parcel = i4 % 128;
        if (i4 % 2 != 0) {
            iOnNavigationEvent = this.validateRelationship.onNavigationEvent();
            int i5 = 91 / 0;
        } else {
            iOnNavigationEvent = this.validateRelationship.onNavigationEvent();
        }
    }

    private ExposedDropdownMenu_androidKtExternalSyntheticLambda4 onExtraCallback(@Nullable TextFieldDecoratorModifierNodeExternalSyntheticLambda17 textFieldDecoratorModifierNodeExternalSyntheticLambda17, @Nullable TextFieldDecoratorModifierNodeExternalSyntheticLambda17 textFieldDecoratorModifierNodeExternalSyntheticLambda172) {
        int i2;
        int i3;
        int i4 = 2 % 2;
        if (this.IEngagementSignalsCallback != -1 && this.ICustomTabsCallbackStub != -9223372036854775807L && textFieldDecoratorModifierNodeExternalSyntheticLambda17 != null && textFieldDecoratorModifierNodeExternalSyntheticLambda17.onExtraCallbackWithResult() != 0 && textFieldDecoratorModifierNodeExternalSyntheticLambda172 != null) {
            int i5 = ITrustedWebActivityCallbackStub + 57;
            IPostMessageService_Parcel = i5 % 128;
            if (i5 % 2 != 0) {
                textFieldDecoratorModifierNodeExternalSyntheticLambda172.onExtraCallbackWithResult();
                textFieldDecoratorModifierNodeExternalSyntheticLambda17.onExtraCallbackWithResult();
                throw null;
            }
            if (textFieldDecoratorModifierNodeExternalSyntheticLambda172.onExtraCallbackWithResult() == textFieldDecoratorModifierNodeExternalSyntheticLambda17.onExtraCallbackWithResult()) {
                int iOnExtraCallbackWithResult = textFieldDecoratorModifierNodeExternalSyntheticLambda17.onExtraCallbackWithResult();
                int[] iArrCopyOf = new int[iOnExtraCallbackWithResult];
                long[] jArrCopyOf = new long[iOnExtraCallbackWithResult];
                long[] jArrCopyOf2 = new long[iOnExtraCallbackWithResult];
                long[] jArrCopyOf3 = new long[iOnExtraCallbackWithResult];
                int i6 = 0;
                int i7 = 0;
                while (i7 < iOnExtraCallbackWithResult) {
                    int i8 = IPostMessageService_Parcel + 93;
                    ITrustedWebActivityCallbackStub = i8 % 128;
                    if (i8 % 2 == 0) {
                        jArrCopyOf3[i7] = textFieldDecoratorModifierNodeExternalSyntheticLambda17.onWarmupCompleted(i7);
                        jArrCopyOf[i7] = this.IEngagementSignalsCallback + textFieldDecoratorModifierNodeExternalSyntheticLambda172.onWarmupCompleted(i7);
                        i7 += 77;
                    } else {
                        jArrCopyOf3[i7] = textFieldDecoratorModifierNodeExternalSyntheticLambda17.onWarmupCompleted(i7);
                        jArrCopyOf[i7] = this.IEngagementSignalsCallback + textFieldDecoratorModifierNodeExternalSyntheticLambda172.onWarmupCompleted(i7);
                        i7++;
                    }
                }
                while (true) {
                    i2 = iOnExtraCallbackWithResult - 1;
                    if (i6 >= i2) {
                        break;
                    }
                    int i9 = ITrustedWebActivityCallbackStub + 11;
                    IPostMessageService_Parcel = i9 % 128;
                    if (i9 % 2 != 0) {
                        i3 = i6 / 0;
                        iArrCopyOf[i6] = (int) (jArrCopyOf[i3] * jArrCopyOf[i6]);
                        jArrCopyOf2[i6] = jArrCopyOf3[i3] / jArrCopyOf3[i6];
                    } else {
                        i3 = i6 + 1;
                        iArrCopyOf[i6] = (int) (jArrCopyOf[i3] - jArrCopyOf[i6]);
                        jArrCopyOf2[i6] = jArrCopyOf3[i3] - jArrCopyOf3[i6];
                    }
                    i6 = i3;
                }
                int i10 = i2;
                while (i10 > 0) {
                    int i11 = ITrustedWebActivityCallbackStub + 21;
                    int i12 = i11 % 128;
                    IPostMessageService_Parcel = i12;
                    int i13 = i11 % 2;
                    if (jArrCopyOf3[i10] <= this.ICustomTabsCallbackStub) {
                        break;
                    }
                    i10--;
                    int i14 = i12 + 45;
                    ITrustedWebActivityCallbackStub = i14 % 128;
                    int i15 = i14 % 2;
                }
                iArrCopyOf[i10] = (int) ((this.IEngagementSignalsCallback + this.onGreatestScrollPercentageIncreased) - jArrCopyOf[i10]);
                jArrCopyOf2[i10] = this.ICustomTabsCallbackStub - jArrCopyOf3[i10];
                if (i10 < i2) {
                    TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
                    int i16 = i10 + 1;
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                    jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i16);
                    jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i16);
                }
                DrawerKtExternalSyntheticLambda29 drawerKtExternalSyntheticLambda29 = new DrawerKtExternalSyntheticLambda29(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                int i17 = ITrustedWebActivityCallbackStub + 59;
                IPostMessageService_Parcel = i17 % 128;
                if (i17 % 2 == 0) {
                    return drawerKtExternalSyntheticLambda29;
                }
                throw null;
            }
        }
        return new ExposedDropdownMenu_androidKtExternalSyntheticLambda4.onExtraCallbackWithResult(this.ICustomTabsCallbackStub);
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        OneLineExternalSyntheticLambda0 oneLineExternalSyntheticLambda0 = (OneLineExternalSyntheticLambda0) objArr[0];
        ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3 = (ExposedDropdownMenuDefaultsExternalSyntheticLambda3) objArr[1];
        long jLongValue = ((Number) objArr[2]).longValue();
        int i2 = 2 % 2;
        if (oneLineExternalSyntheticLambda0.ICustomTabsService_Parcel) {
            int i3 = ITrustedWebActivityCallbackStub + 49;
            IPostMessageService_Parcel = i3 % 128;
            int i4 = i3 % 2;
            oneLineExternalSyntheticLambda0.writeTypedList = jLongValue;
            exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = oneLineExternalSyntheticLambda0.onPostMessage;
            oneLineExternalSyntheticLambda0.ICustomTabsService_Parcel = false;
            return true;
        }
        if (!(!oneLineExternalSyntheticLambda0.IEngagementSignalsCallbackDefault)) {
            int i5 = ITrustedWebActivityCallbackStub + 9;
            IPostMessageService_Parcel = i5 % 128;
            int i6 = i5 % 2;
            long j = oneLineExternalSyntheticLambda0.writeTypedList;
            if (j != -1) {
                exposedDropdownMenuDefaultsExternalSyntheticLambda3.onWarmupCompleted = j;
                oneLineExternalSyntheticLambda0.writeTypedList = -1L;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) throws ParserException {
        OneLineExternalSyntheticLambda0 oneLineExternalSyntheticLambda0 = (OneLineExternalSyntheticLambda0) objArr[0];
        long jLongValue = ((Number) objArr[1]).longValue();
        int i2 = 2 % 2;
        int i3 = IPostMessageService_Parcel + 117;
        int i4 = i3 % 128;
        ITrustedWebActivityCallbackStub = i4;
        int i5 = i3 % 2;
        long j = oneLineExternalSyntheticLambda0.IEngagementSignalsCallback_Parcel;
        Object obj = null;
        if (j == -9223372036854775807L) {
            throw ParserException.onNavigationEvent("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
        }
        int i6 = i4 + 5;
        IPostMessageService_Parcel = i6 % 128;
        if (i6 % 2 == 0) {
            return Long.valueOf(TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(jLongValue, j, 1000L));
        }
        TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallback(jLongValue, j, 1000L);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean onWarmupCompleted(String str) {
        char c = 2;
        int i2 = 2 % 2;
        switch (str.hashCode()) {
            case -2095576542:
                if (!str.equals("V_MPEG4/ISO/AP")) {
                    c = 65535;
                    break;
                } else {
                    c = 0;
                    break;
                }
            case -2095575984:
                if (str.equals("V_MPEG4/ISO/SP")) {
                    int i3 = IPostMessageService_Parcel + 67;
                    ITrustedWebActivityCallbackStub = i3 % 128;
                    int i4 = i3 % 2;
                    c = 1;
                    break;
                }
                break;
            case -1985379776:
                if (str.equals("A_MS/ACM")) {
                    int i5 = ITrustedWebActivityCallbackStub + 85;
                    IPostMessageService_Parcel = i5 % 128;
                    int i6 = i5 % 2;
                    break;
                }
                break;
            case -1784763192:
                if (str.equals("A_TRUEHD")) {
                    int i7 = IPostMessageService_Parcel + 1;
                    ITrustedWebActivityCallbackStub = i7 % 128;
                    int i8 = i7 % 2;
                    c = 3;
                    break;
                }
                break;
            case -1730367663:
                if (str.equals("A_VORBIS")) {
                    int i9 = ITrustedWebActivityCallbackStub + 71;
                    IPostMessageService_Parcel = i9 % 128;
                    int i10 = i9 % 2;
                    c = 4;
                    break;
                }
                break;
            case -1482641358:
                if (str.equals("A_MPEG/L2")) {
                    c = 5;
                    break;
                }
                break;
            case -1482641357:
                if (str.equals("A_MPEG/L3")) {
                    c = 6;
                    break;
                }
                break;
            case -1373388978:
                if (str.equals("V_MS/VFW/FOURCC")) {
                    c = 7;
                    break;
                }
                break;
            case -933872740:
                if (str.equals("S_DVBSUB")) {
                    c = '\b';
                    break;
                }
                break;
            case -538363189:
                if (str.equals("V_MPEG4/ISO/ASP")) {
                    int i11 = IPostMessageService_Parcel + 39;
                    ITrustedWebActivityCallbackStub = i11 % 128;
                    if (i11 % 2 != 0) {
                        c = '\t';
                        break;
                    } else {
                        c = 'Q';
                        break;
                    }
                }
                break;
            case -538363109:
                if (str.equals("V_MPEG4/ISO/AVC")) {
                    c = '\n';
                    break;
                }
                break;
            case -425012669:
                if (str.equals("S_VOBSUB")) {
                    c = 11;
                    break;
                }
                break;
            case -356037306:
                if (str.equals("A_DTS/LOSSLESS")) {
                    c = '\f';
                    break;
                }
                break;
            case 62923557:
                if (str.equals("A_AAC")) {
                    c = '\r';
                    break;
                }
                break;
            case 62923603:
                if (str.equals("A_AC3")) {
                    int i12 = IPostMessageService_Parcel + 89;
                    ITrustedWebActivityCallbackStub = i12 % 128;
                    int i13 = i12 % 2;
                    c = 14;
                    break;
                }
                break;
            case 62927045:
                if (str.equals("A_DTS")) {
                    c = 15;
                    break;
                }
                break;
            case 82318131:
                if (str.equals("V_AV1")) {
                    int i14 = ITrustedWebActivityCallbackStub + 47;
                    IPostMessageService_Parcel = i14 % 128;
                    int i15 = i14 % 2;
                    c = 16;
                    break;
                }
                break;
            case 82338133:
                if (str.equals("V_VP8")) {
                    int i16 = IPostMessageService_Parcel + 27;
                    ITrustedWebActivityCallbackStub = i16 % 128;
                    int i17 = i16 % 2;
                    c = 17;
                    break;
                }
                break;
            case 82338134:
                if (str.equals("V_VP9")) {
                    c = 18;
                    break;
                }
                break;
            case 99146302:
                if (str.equals("S_HDMV/PGS")) {
                    c = 19;
                    break;
                }
                break;
            case 444813526:
                if (str.equals("V_THEORA")) {
                    c = 20;
                    break;
                }
                break;
            case 542569478:
                if (str.equals("A_DTS/EXPRESS")) {
                    c = 21;
                    break;
                }
                break;
            case 635596514:
                if (str.equals("A_PCM/FLOAT/IEEE")) {
                    c = 22;
                    break;
                }
                break;
            case 725948237:
                if (str.equals("A_PCM/INT/BIG")) {
                    c = 23;
                    break;
                }
                break;
            case 725957860:
                if (str.equals("A_PCM/INT/LIT")) {
                    c = 24;
                    break;
                }
                break;
            case 738597099:
                if (str.equals("S_TEXT/ASS")) {
                    c = 25;
                    break;
                }
                break;
            case 738614379:
                if (str.equals("S_TEXT/SSA")) {
                    c = 26;
                    break;
                }
                break;
            case 855502857:
                if (str.equals("V_MPEGH/ISO/HEVC")) {
                    c = 27;
                    break;
                }
                break;
            case 1045209816:
                if (str.equals("S_TEXT/WEBVTT")) {
                    c = 28;
                    break;
                }
                break;
            case 1422270023:
                if (str.equals("S_TEXT/UTF8")) {
                    c = 29;
                    break;
                }
                break;
            case 1809237540:
                if (str.equals("V_MPEG2")) {
                    int i18 = IPostMessageService_Parcel + 107;
                    ITrustedWebActivityCallbackStub = i18 % 128;
                    c = i18 % 2 == 0 ? 'x' : (char) 30;
                    break;
                }
                break;
            case 1950749482:
                if (str.equals("A_EAC3")) {
                    c = 31;
                    break;
                }
                break;
            case 1950789798:
                if (str.equals("A_FLAC")) {
                    c = ' ';
                    break;
                }
                break;
            case 1951062397:
                if (str.equals("A_OPUS")) {
                    int i19 = ITrustedWebActivityCallbackStub + 15;
                    IPostMessageService_Parcel = i19 % 128;
                    if (i19 % 2 == 0) {
                        c = '!';
                        break;
                    } else {
                        c = '|';
                        break;
                    }
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
            case 28:
            case 29:
            case 30:
            case 31:
            case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
            case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                return true;
            default:
                return false;
        }
    }

    private static int[] IAuthTabCallback(@Nullable int[] iArr, int i2) {
        int i3 = 2 % 2;
        int i4 = IPostMessageService_Parcel;
        int i5 = i4 + 71;
        ITrustedWebActivityCallbackStub = i5 % 128;
        int i6 = i5 % 2;
        if (iArr != null) {
            if (iArr.length >= i2) {
                int i7 = i4 + 105;
                ITrustedWebActivityCallbackStub = i7 % 128;
                int i8 = i7 % 2;
                return iArr;
            }
            return new int[Math.max(iArr.length << 1, i2)];
        }
        int i9 = i4 + 67;
        ITrustedWebActivityCallbackStub = i9 % 128;
        if (i9 % 2 != 0) {
            return new int[i2];
        }
        int[] iArr2 = new int[i2];
        int i10 = 44 / 0;
        return iArr2;
    }

    @EnsuresNonNull
    private void IAuthTabCallbackStub() {
        int i2 = 2 % 2;
        int i3 = ITrustedWebActivityCallbackStub + 5;
        IPostMessageService_Parcel = i3 % 128;
        int i4 = i3 % 2;
        RecordingInputConnection_androidKt.onWarmupCompleted(this.onUnminimized);
        if (i4 != 0) {
            int i5 = 34 / 0;
        }
    }

    static /* synthetic */ UUID asInterface() {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        return (UUID) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1279235759, new Object[0], iOnExtraCallback, 1279235762, PushInfo.Companion.onExtraCallback());
    }

    @EnsuresNonNull
    private void asBinder(int i2) throws ParserException {
        IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), 1140650420, new Object[]{this, Integer.valueOf(i2)}, PushInfo.Companion.onExtraCallback(), -1140650420, PushInfo.Companion.onExtraCallback());
    }

    final class IAuthTabCallback implements NavigationRailKtExternalSyntheticLambda7 {
        private IAuthTabCallback() {
        }

        @Override // o.NavigationRailKtExternalSyntheticLambda7
        public int onExtraCallback(int i2) {
            return OneLineExternalSyntheticLambda0.this.onExtraCallback(i2);
        }

        @Override // o.NavigationRailKtExternalSyntheticLambda7
        public boolean IAuthTabCallback(int i2) {
            return OneLineExternalSyntheticLambda0.this.onNavigationEvent(i2);
        }

        @Override // o.NavigationRailKtExternalSyntheticLambda7
        public void IAuthTabCallback(int i2, long j, long j2) throws ParserException {
            OneLineExternalSyntheticLambda0.this.onNavigationEvent(i2, j, j2);
        }

        @Override // o.NavigationRailKtExternalSyntheticLambda7
        public void onWarmupCompleted(int i2) throws ParserException {
            OneLineExternalSyntheticLambda0.this.onWarmupCompleted(i2);
        }

        @Override // o.NavigationRailKtExternalSyntheticLambda7
        public void onExtraCallbackWithResult(int i2, long j) throws Throwable {
            OneLineExternalSyntheticLambda0.this.onExtraCallback(i2, j);
        }

        @Override // o.NavigationRailKtExternalSyntheticLambda7
        public void onWarmupCompleted(int i2, double d) throws ParserException {
            OneLineExternalSyntheticLambda0.this.onExtraCallbackWithResult(i2, d);
        }

        @Override // o.NavigationRailKtExternalSyntheticLambda7
        public void onExtraCallback(int i2, String str) throws ParserException {
            OneLineExternalSyntheticLambda0.this.onExtraCallbackWithResult(i2, str);
        }

        @Override // o.NavigationRailKtExternalSyntheticLambda7
        public void onWarmupCompleted(int i2, int i3, DrawerKtExternalSyntheticLambda9 drawerKtExternalSyntheticLambda9) throws ParserException, IOException {
            OneLineExternalSyntheticLambda0.this.IAuthTabCallback(i2, i3, drawerKtExternalSyntheticLambda9);
        }
    }

    private boolean IAuthTabCallback(ExposedDropdownMenuDefaultsExternalSyntheticLambda3 exposedDropdownMenuDefaultsExternalSyntheticLambda3, long j) {
        return ((Boolean) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1224482128, new Object[]{this, exposedDropdownMenuDefaultsExternalSyntheticLambda3, Long.valueOf(j)}, PushInfo.Companion.onExtraCallback(), 1224482129, PushInfo.Companion.onExtraCallback())).booleanValue();
    }

    private long onWarmupCompleted(long j) throws ParserException {
        return ((Long) IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -118611028, new Object[]{this, Long.valueOf(j)}, PushInfo.Companion.onExtraCallback(), 118611032, PushInfo.Companion.onExtraCallback())).longValue();
    }

    @Override // o.DrawerStateExternalSyntheticLambda0
    public final void onWarmupCompleted() {
        int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
        IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1724859736, new Object[]{this}, iOnExtraCallback, 1724859738, PushInfo.Companion.onExtraCallback());
    }

    static void onTransact() {
        IPostMessageServiceDefault = new char[]{27252, 27192, 27185, 27336, 27329, 27345, 27369, 27375, 27344, 27347, 27374, 27328, 27335, 27345, 27345, 27351, 27344, 27356, 27359, 27346, 27353, 27195};
    }

    protected static final class onExtraCallback {
        public int IAuthTabCallbackStubProxy;
        public int ICustomTabsCallbackStub;
        public byte[] access100;
        public byte[] asBinder;
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda5.IAuthTabCallback asInterface;
        public boolean extraCallback;
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda5 isEngagementSignalsApiAvailable;
        public int onActivityLayout;
        public boolean onActivityResized;
        public String onExtraCallbackWithResult;
        public int onRelationshipValidationResult;
        public String onUnminimized;
        public byte[] prefetchWithMultipleUrls;
        public boolean readTypedObject;
        public ExposedDropdownMenu_androidKtExternalSyntheticLambda8 updateVisuals;
        public int warmup;
        private int writeTypedList;
        public BasicTextContextMenuProviderExternalSyntheticLambda0 writeTypedObject;
        public int ICustomTabsServiceStubProxy = -1;
        public int onMinimized = -1;
        public int IAuthTabCallback = -1;
        public int access000 = -1;
        public int getInterfaceDescriptor = -1;
        public int IAuthTabCallback_Parcel = 0;
        public int setEngagementSignalsCallback = -1;
        public float receiveFile = 0.0f;
        public float newAuthTabSession = 0.0f;
        public float newSession = 0.0f;
        public byte[] newSessionWithExtras = null;
        public int ICustomTabsServiceStub = -1;
        public boolean ICustomTabsCallback = false;
        public int IAuthTabCallbackDefault = -1;
        public int onTransact = -1;
        public int IAuthTabCallbackStub = -1;
        public int onPostMessage = 1000;
        public int onMessageChannelReady = RVParams.WEBVIEW_FONT_SIZE_LARGEST;
        public float postMessage = -1.0f;
        public float prefetch = -1.0f;
        public float ICustomTabsCallback_Parcel = -1.0f;
        public float ICustomTabsService = -1.0f;
        public float mayLaunchUrl = -1.0f;
        public float extraCommand = -1.0f;
        public float ICustomTabsServiceDefault = -1.0f;
        public float validateRelationship = -1.0f;
        public float ICustomTabsCallbackStubProxy = -1.0f;
        public float ICustomTabsCallbackDefault = -1.0f;
        public int onExtraCallback = 1;
        public int onNavigationEvent = -1;
        public int requestPostMessageChannelWithExtras = 8000;
        public long onWarmupCompleted = 0;
        public long requestPostMessageChannel = 0;
        public boolean extraCallbackWithResult = true;
        private String ICustomTabsService_Parcel = "eng";

        protected onExtraCallback() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0197  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x0415  */
        /* JADX WARN: Removed duplicated region for block: B:196:0x042e  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x0430  */
        /* JADX WARN: Removed duplicated region for block: B:200:0x043c  */
        /* JADX WARN: Removed duplicated region for block: B:201:0x044e  */
        /* JADX WARN: Removed duplicated region for block: B:266:0x0577  */
        /* JADX WARN: Removed duplicated region for block: B:271:0x0592  */
        /* JADX WARN: Removed duplicated region for block: B:272:0x0595  */
        @EnsuresNonNull
        @RequiresNonNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onNavigationEvent(DrawerStateExternalSyntheticLambda1 drawerStateExternalSyntheticLambda1, int i2) throws ParserException {
            char c;
            List listSingletonList;
            int i3;
            String str;
            int i4;
            String str2;
            List list;
            String str3;
            String str4;
            String str5;
            int iIAuthTabCallbackStub;
            String str6;
            BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult onextracallbackwithresult;
            int i5;
            int iIntValue;
            int i6;
            TextFieldDecoratorModifierNodeExternalSyntheticLambda7 textFieldDecoratorModifierNodeExternalSyntheticLambda7OnWarmupCompleted;
            String str7 = this.onExtraCallbackWithResult;
            switch (str7.hashCode()) {
                case -2095576542:
                    if (!str7.equals("V_MPEG4/ISO/AP")) {
                        c = 65535;
                        break;
                    } else {
                        c = 0;
                        break;
                    }
                case -2095575984:
                    if (str7.equals("V_MPEG4/ISO/SP")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1985379776:
                    if (str7.equals("A_MS/ACM")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1784763192:
                    if (str7.equals("A_TRUEHD")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1730367663:
                    if (str7.equals("A_VORBIS")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1482641358:
                    if (str7.equals("A_MPEG/L2")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1482641357:
                    if (str7.equals("A_MPEG/L3")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1373388978:
                    if (str7.equals("V_MS/VFW/FOURCC")) {
                        c = 7;
                        break;
                    }
                    break;
                case -933872740:
                    if (str7.equals("S_DVBSUB")) {
                        c = '\b';
                        break;
                    }
                    break;
                case -538363189:
                    if (str7.equals("V_MPEG4/ISO/ASP")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -538363109:
                    if (str7.equals("V_MPEG4/ISO/AVC")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -425012669:
                    if (str7.equals("S_VOBSUB")) {
                        c = 11;
                        break;
                    }
                    break;
                case -356037306:
                    if (str7.equals("A_DTS/LOSSLESS")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 62923557:
                    if (str7.equals("A_AAC")) {
                        c = '\r';
                        break;
                    }
                    break;
                case 62923603:
                    if (str7.equals("A_AC3")) {
                        c = 14;
                        break;
                    }
                    break;
                case 62927045:
                    if (str7.equals("A_DTS")) {
                        c = 15;
                        break;
                    }
                    break;
                case 82318131:
                    if (str7.equals("V_AV1")) {
                        c = 16;
                        break;
                    }
                    break;
                case 82338133:
                    if (str7.equals("V_VP8")) {
                        c = 17;
                        break;
                    }
                    break;
                case 82338134:
                    if (str7.equals("V_VP9")) {
                        c = 18;
                        break;
                    }
                    break;
                case 99146302:
                    if (str7.equals("S_HDMV/PGS")) {
                        c = 19;
                        break;
                    }
                    break;
                case 444813526:
                    if (str7.equals("V_THEORA")) {
                        c = 20;
                        break;
                    }
                    break;
                case 542569478:
                    if (str7.equals("A_DTS/EXPRESS")) {
                        c = 21;
                        break;
                    }
                    break;
                case 635596514:
                    if (str7.equals("A_PCM/FLOAT/IEEE")) {
                        c = 22;
                        break;
                    }
                    break;
                case 725948237:
                    if (str7.equals("A_PCM/INT/BIG")) {
                        c = 23;
                        break;
                    }
                    break;
                case 725957860:
                    if (str7.equals("A_PCM/INT/LIT")) {
                        c = 24;
                        break;
                    }
                    break;
                case 738597099:
                    if (str7.equals("S_TEXT/ASS")) {
                        c = 25;
                        break;
                    }
                    break;
                case 738614379:
                    if (str7.equals("S_TEXT/SSA")) {
                        c = 26;
                        break;
                    }
                    break;
                case 855502857:
                    if (str7.equals("V_MPEGH/ISO/HEVC")) {
                        c = 27;
                        break;
                    }
                    break;
                case 1045209816:
                    if (str7.equals("S_TEXT/WEBVTT")) {
                        c = 28;
                        break;
                    }
                    break;
                case 1422270023:
                    if (str7.equals("S_TEXT/UTF8")) {
                        c = 29;
                        break;
                    }
                    break;
                case 1809237540:
                    if (str7.equals("V_MPEG2")) {
                        c = 30;
                        break;
                    }
                    break;
                case 1950749482:
                    if (str7.equals("A_EAC3")) {
                        c = 31;
                        break;
                    }
                    break;
                case 1950789798:
                    if (str7.equals("A_FLAC")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 1951062397:
                    if (str7.equals("A_OPUS")) {
                        c = '!';
                        break;
                    }
                    break;
            }
            String str8 = "audio/x-unknown";
            String str9 = "audio/raw";
            switch (c) {
                case 0:
                case 1:
                case '\t':
                    byte[] bArr = this.asBinder;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str8 = "video/mp4v-es";
                    str9 = str8;
                    i4 = -1;
                    str = null;
                    i3 = -1;
                    if (this.access100 != null && (textFieldDecoratorModifierNodeExternalSyntheticLambda7OnWarmupCompleted = TextFieldDecoratorModifierNodeExternalSyntheticLambda7.onWarmupCompleted(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(this.access100))) != null) {
                        str = textFieldDecoratorModifierNodeExternalSyntheticLambda7OnWarmupCompleted.onExtraCallback;
                        str9 = "video/dolby-vision";
                    }
                    str6 = str9;
                    boolean z = this.extraCallbackWithResult;
                    int i7 = this.readTypedObject ? 2 : 0;
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                        onextracallbackwithresult.onExtraCallback(this.onExtraCallback).extraCallbackWithResult(this.requestPostMessageChannelWithExtras).writeTypedObject(i3);
                        i5 = 1;
                    } else if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.onTransact(str6)) {
                        if (this.IAuthTabCallback_Parcel == 0) {
                            int i8 = this.access000;
                            iIntValue = -1;
                            if (i8 == -1) {
                                i8 = this.ICustomTabsServiceStubProxy;
                            }
                            this.access000 = i8;
                            int i9 = this.getInterfaceDescriptor;
                            if (i9 == -1) {
                                i9 = this.onMinimized;
                            }
                            this.getInterfaceDescriptor = i9;
                        } else {
                            iIntValue = -1;
                        }
                        float f = (this.access000 == iIntValue || (i6 = this.getInterfaceDescriptor) == iIntValue) ? -1.0f : (this.onMinimized * r2) / (this.ICustomTabsServiceStubProxy * i6);
                        TextToolbarHelperApi28ExternalSyntheticLambda1 textToolbarHelperApi28ExternalSyntheticLambda1IAuthTabCallback = this.ICustomTabsCallback ? new TextToolbarHelperApi28ExternalSyntheticLambda1.onExtraCallbackWithResult().onExtraCallback(this.IAuthTabCallbackDefault).onNavigationEvent(this.IAuthTabCallbackStub).onExtraCallbackWithResult(this.onTransact).onWarmupCompleted(IAuthTabCallback()).IAuthTabCallback(this.IAuthTabCallback).onWarmupCompleted(this.IAuthTabCallback).IAuthTabCallback() : null;
                        if (this.onUnminimized != null && OneLineExternalSyntheticLambda0.IAuthTabCallbackDefault().containsKey(this.onUnminimized)) {
                            iIntValue = ((Integer) OneLineExternalSyntheticLambda0.IAuthTabCallbackDefault().get(this.onUnminimized)).intValue();
                        }
                        if (this.setEngagementSignalsCallback == 0 && Float.compare(this.receiveFile, 0.0f) == 0 && Float.compare(this.newAuthTabSession, 0.0f) == 0) {
                            if (Float.compare(this.newSession, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.newSession, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.newSession, -180.0f) == 0 || Float.compare(this.newSession, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.newSession, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        onextracallbackwithresult.onActivityLayout(this.ICustomTabsServiceStubProxy).access100(this.onMinimized).onNavigationEvent(f).ICustomTabsCallback(iIntValue).onExtraCallbackWithResult(this.newSessionWithExtras).onMessageChannelReady(this.ICustomTabsServiceStub).onExtraCallback(textToolbarHelperApi28ExternalSyntheticLambda1IAuthTabCallback);
                        i5 = 2;
                    } else {
                        if (!"application/x-subrip".equals(str6) && !"text/x-ssa".equals(str6) && !"text/vtt".equals(str6) && !"application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                            throw ParserException.onNavigationEvent("Unexpected MIME type.", (Throwable) null);
                        }
                        i5 = 3;
                    }
                    if (this.onUnminimized != null && !OneLineExternalSyntheticLambda0.IAuthTabCallbackDefault().containsKey(this.onUnminimized)) {
                        onextracallbackwithresult.IAuthTabCallback(this.onUnminimized);
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent);
                    return;
                case 2:
                    if (onExtraCallbackWithResult(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(onExtraCallback(this.onExtraCallbackWithResult)))) {
                        int iIAuthTabCallbackStub2 = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStub(this.onNavigationEvent);
                        if (iIAuthTabCallbackStub2 == 0) {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Unsupported PCM bit depth: " + this.onNavigationEvent + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i3 = iIAuthTabCallbackStub2;
                            listSingletonList = null;
                            str = null;
                            i4 = -1;
                            if (this.access100 != null) {
                                str = textFieldDecoratorModifierNodeExternalSyntheticLambda7OnWarmupCompleted.onExtraCallback;
                                str9 = "video/dolby-vision";
                                break;
                            }
                            str6 = str9;
                            boolean z2 = this.extraCallbackWithResult;
                            if (this.readTypedObject) {
                            }
                            onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                            if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                            }
                            if (this.onUnminimized != null) {
                                onextracallbackwithresult.IAuthTabCallback(this.onUnminimized);
                                break;
                            }
                            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                            this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2;
                            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2);
                            return;
                        }
                    } else {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    }
                    listSingletonList = null;
                    str9 = str8;
                    i4 = -1;
                    str = null;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22);
                    return;
                case 3:
                    this.updateVisuals = new ExposedDropdownMenu_androidKtExternalSyntheticLambda8();
                    str8 = "audio/true-hd";
                    listSingletonList = null;
                    str9 = str8;
                    i4 = -1;
                    str = null;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222);
                    return;
                case 4:
                    listSingletonList = onWarmupCompleted(onExtraCallback(this.onExtraCallbackWithResult));
                    i4 = 8192;
                    str9 = "audio/vorbis";
                    str = null;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222);
                    return;
                case 5:
                    str2 = "audio/mpeg-L2";
                    str9 = str2;
                    i4 = 4096;
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222);
                    return;
                case 6:
                    str2 = "audio/mpeg";
                    str9 = str2;
                    i4 = 4096;
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairOnNavigationEvent = onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(onExtraCallback(this.onExtraCallbackWithResult)));
                    str8 = (String) pairOnNavigationEvent.first;
                    listSingletonList = (List) pairOnNavigationEvent.second;
                    str9 = str8;
                    i4 = -1;
                    str = null;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222);
                    return;
                case '\b':
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(onExtraCallback(this.onExtraCallbackWithResult), 0, bArr2, 0, 4);
                    listSingletonList = ImmutableList.of(bArr2);
                    str8 = "application/dvbsubs";
                    str9 = str8;
                    i4 = -1;
                    str = null;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222);
                    return;
                case '\n':
                    DrawerKtExternalSyntheticLambda30 drawerKtExternalSyntheticLambda30OnNavigationEvent = DrawerKtExternalSyntheticLambda30.onNavigationEvent(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(onExtraCallback(this.onExtraCallbackWithResult)));
                    list = drawerKtExternalSyntheticLambda30OnNavigationEvent.IAuthTabCallbackDefault;
                    this.onRelationshipValidationResult = drawerKtExternalSyntheticLambda30OnNavigationEvent.IAuthTabCallbackStub;
                    str3 = drawerKtExternalSyntheticLambda30OnNavigationEvent.onExtraCallback;
                    str8 = "video/avc";
                    List list2 = list;
                    str = str3;
                    listSingletonList = list2;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222);
                    return;
                case 11:
                    listSingletonList = ImmutableList.of(onExtraCallback(this.onExtraCallbackWithResult));
                    str8 = "application/vobsub";
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222);
                    return;
                case '\f':
                    str4 = "audio/vnd.dts.hd";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222);
                    return;
                case '\r':
                    listSingletonList = Collections.singletonList(onExtraCallback(this.onExtraCallbackWithResult));
                    DrawerKtExternalSyntheticLambda23.onWarmupCompleted onwarmupcompletedIAuthTabCallback = DrawerKtExternalSyntheticLambda23.IAuthTabCallback(this.asBinder);
                    this.requestPostMessageChannelWithExtras = onwarmupcompletedIAuthTabCallback.IAuthTabCallback;
                    this.onExtraCallback = onwarmupcompletedIAuthTabCallback.onExtraCallback;
                    str = onwarmupcompletedIAuthTabCallback.onExtraCallbackWithResult;
                    str8 = "audio/mp4a-latm";
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222);
                    return;
                case 14:
                    str4 = "audio/ac3";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222);
                    return;
                case 15:
                case 21:
                    str4 = "audio/vnd.dts";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222);
                    return;
                case MaterialButton.ICON_GRAVITY_TOP /* 16 */:
                    byte[] bArr3 = this.asBinder;
                    listSingletonList = bArr3 == null ? null : ImmutableList.of(bArr3);
                    str5 = "video/av01";
                    str8 = str5;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222);
                    return;
                case 17:
                    str4 = "video/x-vnd.on2.vp8";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222);
                    return;
                case 18:
                    byte[] bArr4 = this.asBinder;
                    listSingletonList = bArr4 == null ? null : ImmutableList.of(bArr4);
                    str5 = "video/x-vnd.on2.vp9";
                    str8 = str5;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str8 = "application/pgs";
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222);
                    return;
                case 20:
                    str4 = "video/x-unknown";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222);
                    return;
                case 22:
                    if (this.onNavigationEvent != 32) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.onNavigationEvent + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str9 = str8;
                        i4 = -1;
                        i3 = -1;
                        if (this.access100 != null) {
                        }
                        str6 = str9;
                        boolean z22222222222222222222 = this.extraCallbackWithResult;
                        if (this.readTypedObject) {
                        }
                        onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                        if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                        }
                        if (this.onUnminimized != null) {
                        }
                        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                        this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222;
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222);
                        return;
                    }
                    listSingletonList = null;
                    str = null;
                    i4 = -1;
                    i3 = 4;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222);
                    return;
                case 23:
                    int i10 = this.onNavigationEvent;
                    if (i10 == 8) {
                        i3 = 3;
                        listSingletonList = null;
                        str = null;
                        i4 = -1;
                        if (this.access100 != null) {
                        }
                        str6 = str9;
                        boolean z2222222222222222222222 = this.extraCallbackWithResult;
                        if (this.readTypedObject) {
                        }
                        onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                        if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                        }
                        if (this.onUnminimized != null) {
                        }
                        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                        this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222;
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222);
                        return;
                    }
                    if (i10 == 16) {
                        iIAuthTabCallbackStub = 268435456;
                    } else if (i10 == 24) {
                        iIAuthTabCallbackStub = 1342177280;
                    } else {
                        if (i10 != 32) {
                            TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.onNavigationEvent + ". Setting mimeType to audio/x-unknown");
                            listSingletonList = null;
                            str = null;
                            str9 = str8;
                            i4 = -1;
                            i3 = -1;
                            if (this.access100 != null) {
                            }
                            str6 = str9;
                            boolean z22222222222222222222222 = this.extraCallbackWithResult;
                            if (this.readTypedObject) {
                            }
                            onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                            if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                            }
                            if (this.onUnminimized != null) {
                            }
                            BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                            ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                            this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222;
                            exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222222);
                            return;
                        }
                        iIAuthTabCallbackStub = 1610612736;
                    }
                    i3 = iIAuthTabCallbackStub;
                    listSingletonList = null;
                    str = null;
                    i4 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222222);
                    return;
                case 24:
                    iIAuthTabCallbackStub = TextFieldDecoratorModifierNodeExternalSyntheticLambda6.IAuthTabCallbackStub(this.onNavigationEvent);
                    if (iIAuthTabCallbackStub == 0) {
                        TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.onNavigationEvent + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str9 = str8;
                        i4 = -1;
                        i3 = -1;
                        if (this.access100 != null) {
                        }
                        str6 = str9;
                        boolean z2222222222222222222222222 = this.extraCallbackWithResult;
                        if (this.readTypedObject) {
                        }
                        onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                        if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                        }
                        if (this.onUnminimized != null) {
                        }
                        BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                        ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                        this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222;
                        exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222222);
                        return;
                    }
                    i3 = iIAuthTabCallbackStub;
                    listSingletonList = null;
                    str = null;
                    i4 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222222222);
                    return;
                case 25:
                case 26:
                    listSingletonList = ImmutableList.of(OneLineExternalSyntheticLambda0.onNavigationEvent(), onExtraCallback(this.onExtraCallbackWithResult));
                    str8 = "text/x-ssa";
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222222222);
                    return;
                case OggPageHeader.EMPTY_PAGE_HEADER_SIZE /* 27 */:
                    ExposedDropdownMenuBoxScopeExternalSyntheticLambda2 exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted = ExposedDropdownMenuBoxScopeExternalSyntheticLambda2.onWarmupCompleted(new TextFieldDecoratorModifierNodeExternalSyntheticLambda20(onExtraCallback(this.onExtraCallbackWithResult)));
                    list = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallbackStub;
                    this.onRelationshipValidationResult = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.IAuthTabCallback_Parcel;
                    str3 = exposedDropdownMenuBoxScopeExternalSyntheticLambda2OnWarmupCompleted.onNavigationEvent;
                    str8 = "video/hevc";
                    List list22 = list;
                    str = str3;
                    listSingletonList = list22;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222222222);
                    return;
                case 28:
                    str4 = "text/vtt";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22222222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222222222222);
                    return;
                case 29:
                    str4 = "application/x-subrip";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222222222222);
                    return;
                case 30:
                    str4 = "video/mpeg2";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222222222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222222222222);
                    return;
                case 31:
                    str4 = "audio/eac3";
                    str8 = str4;
                    listSingletonList = null;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z22222222222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z22222222222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult22222222222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent22222222222222222222222222222222);
                    return;
                case MaterialButton.ICON_GRAVITY_TEXT_TOP /* 32 */:
                    listSingletonList = Collections.singletonList(onExtraCallback(this.onExtraCallbackWithResult));
                    str5 = "audio/flac";
                    str8 = str5;
                    str = null;
                    str9 = str8;
                    i4 = -1;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z222222222222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z222222222222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult222222222222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent222222222222222222222222222222222);
                    return;
                case Encoder.DEFAULT_EC_PERCENT /* 33 */:
                    listSingletonList = new ArrayList(3);
                    listSingletonList.add(onExtraCallback(this.onExtraCallbackWithResult));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.onWarmupCompleted).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.requestPostMessageChannel).array());
                    i4 = 5760;
                    str9 = "audio/opus";
                    str = null;
                    i3 = -1;
                    if (this.access100 != null) {
                    }
                    str6 = str9;
                    boolean z2222222222222222222222222222222222 = this.extraCallbackWithResult;
                    if (this.readTypedObject) {
                    }
                    onextracallbackwithresult = new BasicTextContextMenuProviderKtExternalSyntheticLambda4.onExtraCallbackWithResult();
                    if (AndroidLegacyPlatformTextInputServiceAdapterExternalSyntheticLambda0.asBinder(str6)) {
                    }
                    if (this.onUnminimized != null) {
                    }
                    BasicTextContextMenuProviderKtExternalSyntheticLambda4 basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222222222222222 = onextracallbackwithresult.IAuthTabCallback_Parcel(i2).onNavigationEvent(this.onActivityResized ? "video/webm" : "video/x-matroska").IAuthTabCallbackDefault(str6).IAuthTabCallbackStubProxy(i4).onWarmupCompleted(this.ICustomTabsService_Parcel).onActivityResized(i7 | (z2222222222222222222222222222222222 ? 1 : 0)).IAuthTabCallback(listSingletonList).onExtraCallback(str).onNavigationEvent(this.writeTypedObject).onNavigationEvent();
                    ExposedDropdownMenu_androidKtExternalSyntheticLambda5 exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222222222 = drawerStateExternalSyntheticLambda1.onExtraCallbackWithResult(this.ICustomTabsCallbackStub, i5);
                    this.isEngagementSignalsApiAvailable = exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222222222;
                    exposedDropdownMenu_androidKtExternalSyntheticLambda5OnExtraCallbackWithResult2222222222222222222222222222222222.onExtraCallbackWithResult(basicTextContextMenuProviderKtExternalSyntheticLambda4OnNavigationEvent2222222222222222222222222222222222);
                    return;
                default:
                    throw ParserException.onNavigationEvent("Unrecognized codec identifier.", (Throwable) null);
            }
        }

        @RequiresNonNull
        public void onExtraCallbackWithResult() {
            ExposedDropdownMenu_androidKtExternalSyntheticLambda8 exposedDropdownMenu_androidKtExternalSyntheticLambda8 = this.updateVisuals;
            if (exposedDropdownMenu_androidKtExternalSyntheticLambda8 != null) {
                exposedDropdownMenu_androidKtExternalSyntheticLambda8.onExtraCallback(this.isEngagementSignalsApiAvailable, this.asInterface);
            }
        }

        public void onWarmupCompleted() {
            ExposedDropdownMenu_androidKtExternalSyntheticLambda8 exposedDropdownMenu_androidKtExternalSyntheticLambda8 = this.updateVisuals;
            if (exposedDropdownMenu_androidKtExternalSyntheticLambda8 != null) {
                exposedDropdownMenu_androidKtExternalSyntheticLambda8.IAuthTabCallback();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean IAuthTabCallback(boolean z) {
            return "A_OPUS".equals(this.onExtraCallbackWithResult) ? z : this.onActivityLayout > 0;
        }

        private byte[] IAuthTabCallback() {
            if (this.postMessage == -1.0f || this.prefetch == -1.0f || this.ICustomTabsCallback_Parcel == -1.0f || this.ICustomTabsService == -1.0f || this.mayLaunchUrl == -1.0f || this.extraCommand == -1.0f || this.ICustomTabsServiceDefault == -1.0f || this.validateRelationship == -1.0f || this.ICustomTabsCallbackStubProxy == -1.0f || this.ICustomTabsCallbackDefault == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.postMessage * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.prefetch * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.ICustomTabsCallback_Parcel * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.ICustomTabsService * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.mayLaunchUrl * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.extraCommand * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.ICustomTabsServiceDefault * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.validateRelationship * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.ICustomTabsCallbackStubProxy + 0.5f));
            byteBufferOrder.putShort((short) (this.ICustomTabsCallbackDefault + 0.5f));
            byteBufferOrder.putShort((short) this.onPostMessage);
            byteBufferOrder.putShort((short) this.onMessageChannelReady);
            return bArr;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
        private static Pair<String, List<byte[]>> onNavigationEvent(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
            try {
                textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallbackDefault(16);
                long jIAuthTabCallback_Parcel = textFieldDecoratorModifierNodeExternalSyntheticLambda20.IAuthTabCallback_Parcel();
                if (jIAuthTabCallback_Parcel == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jIAuthTabCallback_Parcel == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jIAuthTabCallback_Parcel == 826496599) {
                    byte[] bArrOnExtraCallback = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onExtraCallback();
                    for (int iOnWarmupCompleted = textFieldDecoratorModifierNodeExternalSyntheticLambda20.onWarmupCompleted() + 20; iOnWarmupCompleted < bArrOnExtraCallback.length - 4; iOnWarmupCompleted++) {
                        if (bArrOnExtraCallback[iOnWarmupCompleted] == 0 && bArrOnExtraCallback[iOnWarmupCompleted + 1] == 0 && bArrOnExtraCallback[iOnWarmupCompleted + 2] == 1 && bArrOnExtraCallback[iOnWarmupCompleted + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrOnExtraCallback, iOnWarmupCompleted, bArrOnExtraCallback.length)));
                        }
                    }
                    throw ParserException.onNavigationEvent("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                TextFieldDecoratorModifierNodeExternalSyntheticLambda18.onExtraCallbackWithResult("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.onNavigationEvent("Error parsing FourCC private data", (Throwable) null);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
        private static List<byte[]> onWarmupCompleted(byte[] bArr) throws ParserException {
            int i2;
            int i3;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.onNavigationEvent("Error parsing vorbis codec private", (Throwable) null);
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
                    throw ParserException.onNavigationEvent("Error parsing vorbis codec private", (Throwable) null);
                }
                byte[] bArr2 = new byte[i7];
                System.arraycopy(bArr, i9, bArr2, 0, i7);
                int i10 = i9 + i7;
                if (bArr[i10] != 3) {
                    throw ParserException.onNavigationEvent("Error parsing vorbis codec private", (Throwable) null);
                }
                int i11 = i10 + i8 + i3;
                if (bArr[i11] != 5) {
                    throw ParserException.onNavigationEvent("Error parsing vorbis codec private", (Throwable) null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.onNavigationEvent("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
        private static boolean onExtraCallbackWithResult(TextFieldDecoratorModifierNodeExternalSyntheticLambda20 textFieldDecoratorModifierNodeExternalSyntheticLambda20) throws ParserException {
            try {
                int iWriteTypedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda20.writeTypedObject();
                if (iWriteTypedObject == 1) {
                    return true;
                }
                if (iWriteTypedObject == 65534) {
                    textFieldDecoratorModifierNodeExternalSyntheticLambda20.asBinder(24);
                    long typedObject = textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject();
                    int iOnExtraCallback = PushInfo.Companion.onExtraCallback();
                    if (typedObject == ((UUID) OneLineExternalSyntheticLambda0.IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1279235759, new Object[0], iOnExtraCallback, 1279235762, PushInfo.Companion.onExtraCallback())).getMostSignificantBits()) {
                        long typedObject2 = textFieldDecoratorModifierNodeExternalSyntheticLambda20.readTypedObject();
                        int iOnExtraCallback2 = PushInfo.Companion.onExtraCallback();
                        if (typedObject2 == ((UUID) OneLineExternalSyntheticLambda0.IAuthTabCallback(PushInfo.Companion.onExtraCallback(), PushInfo.Companion.onExtraCallback(), -1279235759, new Object[0], iOnExtraCallback2, 1279235762, PushInfo.Companion.onExtraCallback())).getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.onNavigationEvent("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
        @EnsuresNonNull
        private byte[] onExtraCallback(String str) throws ParserException {
            byte[] bArr = this.asBinder;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.onNavigationEvent("Missing CodecPrivate for codec " + str, (Throwable) null);
        }
    }
}
