package o;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.skt.usp.UCPApiConstants;
import com.squareup.seismic.ShakeDetector;
import com.tmoney.LiveCheckConstants;
import im.toss.global.features.transfer.ui.region.eu.receiver.select.EuTransferReceiverAccountSelectScreenKt$;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.AUTextView;
import o.BaseRoundCornerProgressBar;
import o.GifDecoderExternalSyntheticLambda0;
import o.ResourceUriFetcherFactory;
import o.TextRoundCornerProgressBarSavedState1;
import org.jetbrains.annotations.NotNull;

/* loaded from: /tmp/toss_alldex/classes4.dex */
public final class ResourceUriFetcherFactory {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final IAuthTabCallback Companion;
    private static int IEngagementSignalsCallbackStubProxy = 1;
    private static int[] IPostMessageService = null;
    private static int IPostMessageServiceDefault = 0;
    private static int IPostMessageServiceStub = 0;
    private static int ITrustedWebActivityCallbackDefault = 1;
    private final Lazy IAuthTabCallback;
    private final Lazy IAuthTabCallbackDefault;
    private final Lazy IAuthTabCallbackStub;
    private final Lazy IAuthTabCallbackStubProxy;
    private final Lazy IAuthTabCallback_Parcel;
    private final Lazy ICustomTabsCallback;
    private final Lazy ICustomTabsCallbackDefault;
    private final Lazy ICustomTabsCallbackStub;
    private final Lazy ICustomTabsCallbackStubProxy;
    private final Lazy ICustomTabsCallback_Parcel;
    private final Lazy ICustomTabsService;
    private final Lazy ICustomTabsServiceDefault;
    private final Lazy ICustomTabsServiceStub;
    private final Lazy ICustomTabsServiceStubProxy;
    private final Lazy ICustomTabsService_Parcel;
    private final Lazy IEngagementSignalsCallback;
    private final Lazy IEngagementSignalsCallbackDefault;
    private final Lazy IEngagementSignalsCallbackStub;
    private final Lazy IEngagementSignalsCallback_Parcel;
    private final Lazy access000;
    private final Lazy access100;
    private final Lazy access200;
    private final Lazy asBinder;
    private final Lazy asInterface;
    private final Lazy extraCallback;
    private final Lazy extraCallbackWithResult;
    private final Lazy extraCommand;
    private final Lazy getInterfaceDescriptor;
    private final Lazy isEngagementSignalsApiAvailable;
    private final Lazy mayLaunchUrl;
    private final Lazy newAuthTabSession;
    private final Lazy newSession;
    private final Lazy newSessionWithExtras;
    private final Lazy onActivityLayout;
    private final Lazy onActivityResized;
    private final Lazy onExtraCallback;
    private final Lazy onExtraCallbackWithResult;
    private final Lazy onGreatestScrollPercentageIncreased;
    private final Lazy onMessageChannelReady;
    private final Lazy onMinimized;
    private final Lazy onNavigationEvent;
    private final Lazy onPostMessage;
    private final Lazy onRelationshipValidationResult;
    private final Lazy onSessionEnded;
    private final Lazy onTransact;
    private final AppSetIdAndScope1 onUnminimized;
    private final Lazy onVerticalScrollEvent;
    private final Lazy onWarmupCompleted;
    private final Lazy postMessage;
    private final Lazy prefetch;
    private final Lazy prefetchWithMultipleUrls;
    private final Lazy readTypedObject;
    private final Lazy receiveFile;
    private final Lazy requestPostMessageChannel;
    private final Lazy requestPostMessageChannelWithExtras;
    private final Lazy setEngagementSignalsCallback;
    private final Lazy updateVisuals;
    private final Lazy validateRelationship;
    private final Lazy warmup;
    private final Lazy writeTypedList;
    private final Lazy writeTypedObject;

    static {
        IPostMessageServiceDefault();
        Companion = new IAuthTabCallback(null);
        int i = IPostMessageServiceDefault + 93;
        ITrustedWebActivityCallbackDefault = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 35;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IPostMessageServiceStubProxy = IPostMessageServiceStubProxy(gifDecoderExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return textRoundCornerProgressBarSavedState1IPostMessageServiceStubProxy;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallbackDefault(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 29;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ResultReceiverMyRunnable(gifDecoderExternalSyntheticLambda0);
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ResultReceiverMyRunnable = ResultReceiverMyRunnable(gifDecoderExternalSyntheticLambda0);
        int i3 = IPostMessageServiceStub + 33;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1ResultReceiverMyRunnable;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackStub(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 51;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1R8lambda7IJBVrN0sHyidCAZufWEJFc7yY = r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 57;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1R8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
        }
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStub(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 113;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            PlaybackStateCompatCustomAction(gifDecoderExternalSyntheticLambda0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1PlaybackStateCompatCustomAction = PlaybackStateCompatCustomAction(gifDecoderExternalSyntheticLambda0);
        int i3 = IEngagementSignalsCallbackStubProxy + 37;
        IPostMessageServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1PlaybackStateCompatCustomAction;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStubProxy(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 11;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RatingCompatApi19Impl = RatingCompatApi19Impl(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 39;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1RatingCompatApi19Impl;
        }
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IAuthTabCallback_Parcel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 49;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RatingCompat = RatingCompat(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 123;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1RatingCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 59;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return MediaMetadataCompat(gifDecoderExternalSyntheticLambda0);
        }
        MediaMetadataCompat(gifDecoderExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackDefault(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 121;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackStubProxy = ITrustedWebActivityCallbackStubProxy(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 85;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackStubProxy;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStub(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 31;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            IconCompatParcelizer(gifDecoderExternalSyntheticLambda0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IconCompatParcelizer = IconCompatParcelizer(gifDecoderExternalSyntheticLambda0);
        int i3 = IEngagementSignalsCallbackStubProxy + 59;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return textRoundCornerProgressBarSavedState1IconCompatParcelizer;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackStub(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 77;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaSessionCompatResultReceiverWrapper = MediaSessionCompatResultReceiverWrapper(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 15;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1MediaSessionCompatResultReceiverWrapper;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackStubProxy(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 115;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ResultReceiver = ResultReceiver(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 87;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1ResultReceiver;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsServiceDefault(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 117;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return ITrustedWebActivityCallback(gifDecoderExternalSyntheticLambda0);
        }
        ITrustedWebActivityCallback(gifDecoderExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsServiceStub(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 121;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            write(gifDecoderExternalSyntheticLambda0);
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Write = write(gifDecoderExternalSyntheticLambda0);
        int i3 = IEngagementSignalsCallbackStubProxy + 15;
        IPostMessageServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1Write;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsServiceStubProxy(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 109;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return PlaybackStateCompat(gifDecoderExternalSyntheticLambda0);
        }
        PlaybackStateCompat(gifDecoderExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsService_Parcel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 21;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -528268137, iOnExtraCallback, 528268145, new Object[]{gifDecoderExternalSyntheticLambda0});
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IEngagementSignalsCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 15;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaSessionCompatToken = MediaSessionCompatToken(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 15;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
        return textRoundCornerProgressBarSavedState1MediaSessionCompatToken;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 IEngagementSignalsCallbackStub(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) throws Throwable {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 83;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = read(gifDecoderExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 13 / 0;
        }
        int i5 = IEngagementSignalsCallbackStubProxy + 91;
        IPostMessageServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 access000(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 111;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault = ITrustedWebActivityServiceDefault(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceDefault;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 access100(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 99;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1NotifyNotificationWithChannel = notifyNotificationWithChannel(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 17;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1NotifyNotificationWithChannel;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 access200(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 47;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IPostMessageServiceStub = IPostMessageServiceStub(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 51;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 38 / 0;
        }
        return textRoundCornerProgressBarSavedState1IPostMessageServiceStub;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 asBinder(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 93;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IEngagementSignalsCallbackDefault = IEngagementSignalsCallbackDefault(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 121;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1IEngagementSignalsCallbackDefault;
        }
        throw null;
    }

    private static /* synthetic */ Object asInterface(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 47;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1529685879, iOnExtraCallback, -1529685864, new Object[]{gifDecoderExternalSyntheticLambda0});
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 asInterface(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 21;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1400167019, iOnExtraCallback, 1400167041, new Object[]{gifDecoderExternalSyntheticLambda0});
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int i3 = 29 / 0;
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1400167019, iOnExtraCallback2, 1400167041, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static /* synthetic */ Object extraCallback(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 39;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 117;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object extraCallbackWithResult(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 29;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1AudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 97;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1AudioAttributesImplApi26Parcelizer;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 extraCallbackWithResult(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 63;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -150495925, iOnExtraCallback, 150495928, new Object[]{gifDecoderExternalSyntheticLambda0});
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int i3 = 22 / 0;
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -150495925, iOnExtraCallback2, 150495928, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 getInterfaceDescriptor(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 17;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityService_Parcel = ITrustedWebActivityService_Parcel(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 87;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 / 0;
        }
        return textRoundCornerProgressBarSavedState1ITrustedWebActivityService_Parcel;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 isEngagementSignalsApiAvailable(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 71;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaSessionCompatQueueItem = MediaSessionCompatQueueItem(gifDecoderExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 74 / 0;
        }
        int i5 = IEngagementSignalsCallbackStubProxy + 87;
        IPostMessageServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1MediaSessionCompatQueueItem;
        }
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 newAuthTabSession(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 3;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 113;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1MediaBrowserCompatMediaItem;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 newSessionWithExtras(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 99;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 activeNotifications = getActiveNotifications(gifDecoderExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 77 / 0;
        }
        return activeNotifications;
    }

    private static /* synthetic */ Object onActivityLayout(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 51;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackStub = ITrustedWebActivityCallbackStub(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 73;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1ITrustedWebActivityCallbackStub;
        }
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onActivityLayout(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 87;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ParcelableVolumeInfo = ParcelableVolumeInfo(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 109;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1ParcelableVolumeInfo;
    }

    public static /* synthetic */ Object onExtraCallback(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        Object objOnExtraCallback;
        int i7;
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1;
        Function1 function1;
        int i8;
        int i9 = ~i4;
        int i10 = ~(i9 | i6);
        int i11 = ~(i4 | i6);
        int i12 = i9 | (~i6);
        int i13 = i11 | (~(i12 | i5));
        int i14 = (~i5) | i12;
        int i15 = i4 + i6 + i + (770105990 * i2) + ((-157043368) * i3);
        int i16 = i15 * i15;
        int i17 = ((315592168 * i4) - 1432092672) + ((-1000312294) * i6) + ((-1315904462) * i10) + ((-657952231) * i13) + (657952231 * i14) + ((-342360064) * i) + ((-2121269248) * i2) + (1950351360 * i3) + ((-66846720) * i16);
        int i18 = (i4 * 105828664) + 1394048361 + (i6 * 105827886) + (i10 * (-778)) + (i13 * (-389)) + (i14 * 389) + (i * 105828275) + (i2 * (-227623502)) + (i3 * 619312264) + (i16 * 1925971968);
        switch (i17 + (i18 * i18 * 261881856)) {
            case 1:
                return onExtraCallbackWithResult(objArr);
            case 2:
                return onExtraCallback(objArr);
            case 3:
                return IAuthTabCallback(objArr);
            case 4:
                return onWarmupCompleted(objArr);
            case 5:
                return onTransact(objArr);
            case 6:
                return asInterface(objArr);
            case 7:
                return asBinder(objArr);
            case 8:
                return IAuthTabCallbackDefault(objArr);
            case LiveCheckConstants.SVC_LOAD_ADD_IMMEDIATELY /* 9 */:
                return IAuthTabCallbackStub(objArr);
            case 10:
                return IAuthTabCallback_Parcel(objArr);
            case 11:
                return access100(objArr);
            case LiveCheckConstants.SVC_U1 /* 12 */:
                return access000(objArr);
            case ShakeDetector.SENSITIVITY_MEDIUM /* 13 */:
                return IAuthTabCallbackStubProxy(objArr);
            case 14:
                return getInterfaceDescriptor(objArr);
            case 15:
                GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
                int i19 = 2 % 2;
                int i20 = IPostMessageServiceStub + 13;
                IEngagementSignalsCallbackStubProxy = i20 % 128;
                int i21 = i20 % 2;
                MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda12 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
                if (i21 == 0) {
                    int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                    objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "dwordStore", memoryCacheBuilderExternalSyntheticLambda12, null, 5, null}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
                } else {
                    int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
                    objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "dwordStore", memoryCacheBuilderExternalSyntheticLambda12, null, 4, null}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2);
                }
                return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
            case 16:
                return ICustomTabsCallback(objArr);
            case 17:
                return extraCallback(objArr);
            case UCPApiConstants.MULTI_UICC_MIN_SEIOAGENT_VERSION_CODE /* 18 */:
                return extraCallbackWithResult(objArr);
            case 19:
                return readTypedObject(objArr);
            case 20:
                GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda02 = (GifDecoderExternalSyntheticLambda0) objArr[0];
                int i22 = 2 % 2;
                int i23 = IPostMessageServiceStub + 17;
                IEngagementSignalsCallbackStubProxy = i23 % 128;
                int i24 = i23 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ResultReceiver1 = ResultReceiver1(gifDecoderExternalSyntheticLambda02);
                int i25 = IEngagementSignalsCallbackStubProxy + 89;
                IPostMessageServiceStub = i25 % 128;
                int i26 = i25 % 2;
                return textRoundCornerProgressBarSavedState1ResultReceiver1;
            case 21:
                return writeTypedObject(objArr);
            case 22:
                return onActivityResized(objArr);
            case 23:
                return onActivityLayout(objArr);
            case 24:
                return onMinimized(objArr);
            case 25:
                return onPostMessage(objArr);
            case 26:
                return onMessageChannelReady(objArr);
            case 27:
                return ICustomTabsCallbackStubProxy(objArr);
            case 28:
                ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
                int i27 = 2 % 2;
                int i28 = IPostMessageServiceStub + 41;
                IEngagementSignalsCallbackStubProxy = i28 % 128;
                int i29 = i28 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.asInterface.getValue();
                int i30 = IEngagementSignalsCallbackStubProxy + 37;
                IPostMessageServiceStub = i30 % 128;
                int i31 = i30 % 2;
                return textRoundCornerProgressBarSavedState1;
            case 29:
                ResourceUriFetcherFactory resourceUriFetcherFactory2 = (ResourceUriFetcherFactory) objArr[0];
                int i32 = 2 % 2;
                int i33 = IEngagementSignalsCallbackStubProxy + 3;
                IPostMessageServiceStub = i33 % 128;
                int i34 = i33 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState12 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory2.newSessionWithExtras.getValue();
                int i35 = IPostMessageServiceStub + 105;
                IEngagementSignalsCallbackStubProxy = i35 % 128;
                int i36 = i35 % 2;
                return textRoundCornerProgressBarSavedState12;
            case 30:
                return ICustomTabsCallbackDefault(objArr);
            case 31:
                return onRelationshipValidationResult(objArr);
            case 32:
                GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda03 = (GifDecoderExternalSyntheticLambda0) objArr[0];
                int i37 = 2 % 2;
                int i38 = IPostMessageServiceStub + 45;
                IEngagementSignalsCallbackStubProxy = i38 % 128;
                if (i38 % 2 == 0) {
                    i7 = 4;
                    memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
                    function1 = null;
                    i8 = 54;
                } else {
                    i7 = 2;
                    memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
                    function1 = null;
                    i8 = 8;
                }
                return GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda03, "webSecureStore", i7, memoryCacheBuilderExternalSyntheticLambda1, function1, i8, (Object) null);
            case 33:
                return onUnminimized(objArr);
            case 34:
                return ICustomTabsCallbackStub(objArr);
            case 35:
                return ICustomTabsCallback_Parcel(objArr);
            default:
                return onNavigationEvent(objArr);
        }
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0, ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 55;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -457832501, iOnExtraCallback, 457832531, new Object[]{gifDecoderExternalSyntheticLambda0, resourceUriFetcherFactory});
        int i4 = IPostMessageServiceStub + 7;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onGreatestScrollPercentageIncreased(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 77;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 83;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1R8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onMessageChannelReady(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 73;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return r8lambda54BeH8ZsBru0CXI2CCSP2syNys(gifDecoderExternalSyntheticLambda0);
        }
        r8lambda54BeH8ZsBru0CXI2CCSP2syNys(gifDecoderExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onMinimized(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 3;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IEngagementSignalsCallbackStubProxy = IEngagementSignalsCallbackStubProxy(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 17;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1IEngagementSignalsCallbackStubProxy;
        }
        throw null;
    }

    public static /* synthetic */ Unit onNavigationEvent(ResourceUriFetcherFactory resourceUriFetcherFactory, BaseRoundCornerProgressBar baseRoundCornerProgressBar) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 97;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            IAuthTabCallback(resourceUriFetcherFactory, baseRoundCornerProgressBar);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Unit unitIAuthTabCallback = IAuthTabCallback(resourceUriFetcherFactory, baseRoundCornerProgressBar);
        int i3 = IEngagementSignalsCallbackStubProxy + 35;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 85 / 0;
        }
        return unitIAuthTabCallback;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onNavigationEvent(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 57;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RatingCompatStarStyle = RatingCompatStarStyle(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 123;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1RatingCompatStarStyle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onPostMessage(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 99;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 43;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1AudioAttributesCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onPostMessage(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 75;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 smallIconBitmap = getSmallIconBitmap(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 97;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return smallIconBitmap;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onRelationshipValidationResult(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 83;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 smallIconId = getSmallIconId(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 57;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return smallIconId;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onSessionEnded(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 21;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IPostMessageServiceDefault = IPostMessageServiceDefault(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IPostMessageServiceDefault;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onTransact(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 31;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1R8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss = r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 1;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1R8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onUnminimized(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 15;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1MediaDescriptionCompat = MediaDescriptionCompat(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 73;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1MediaDescriptionCompat;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onWarmupCompleted(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IPostMessageService = IPostMessageService(gifDecoderExternalSyntheticLambda0);
        int i4 = IPostMessageServiceStub + 105;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
        return textRoundCornerProgressBarSavedState1IPostMessageService;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onWarmupCompleted(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 15;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityService = ITrustedWebActivityService(gifDecoderExternalSyntheticLambda0);
        if (i3 == 0) {
            int i4 = 25 / 0;
        }
        return textRoundCornerProgressBarSavedState1ITrustedWebActivityService;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 postMessage(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 65;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2044065525, iOnExtraCallback, 2044065537, new Object[]{gifDecoderExternalSyntheticLambda0});
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 prefetch(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 81;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(gifDecoderExternalSyntheticLambda0);
        }
        r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(gifDecoderExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 prefetchWithMultipleUrls(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 21;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            RatingCompat1(gifDecoderExternalSyntheticLambda0);
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RatingCompat1 = RatingCompat1(gifDecoderExternalSyntheticLambda0);
        int i3 = IEngagementSignalsCallbackStubProxy + 109;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1RatingCompat1;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object readTypedObject(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 65;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
            return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 718448012, iOnExtraCallback, -718447996, new Object[]{gifDecoderExternalSyntheticLambda0});
        }
        int iOnExtraCallback2 = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        int i3 = 58 / 0;
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 718448012, iOnExtraCallback2, -718447996, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 receiveFile(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 93;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return ResultReceiverMyResultReceiver(gifDecoderExternalSyntheticLambda0);
        }
        ResultReceiverMyResultReceiver(gifDecoderExternalSyntheticLambda0);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 requestPostMessageChannel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 59;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 37;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return textRoundCornerProgressBarSavedState1AudioAttributesImplApi21Parcelizer;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 requestPostMessageChannelWithExtras(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 39;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1825176277, iOnExtraCallback, 1825176309, new Object[]{gifDecoderExternalSyntheticLambda0});
        int i4 = IPostMessageServiceStub + 83;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 setEngagementSignalsCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 47;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IEngagementSignalsCallback_Parcel = IEngagementSignalsCallback_Parcel(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 91;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 54 / 0;
        }
        return textRoundCornerProgressBarSavedState1IEngagementSignalsCallback_Parcel;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 updateVisuals(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 51;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 37;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1R8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 validateRelationship(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 93;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1AudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(gifDecoderExternalSyntheticLambda0);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = IEngagementSignalsCallbackStubProxy + 89;
        IPostMessageServiceStub = i5 % 128;
        int i6 = i5 % 2;
        return textRoundCornerProgressBarSavedState1AudioAttributesImplBaseParcelizer;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 warmup(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 125;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 == 0) {
            return ITrustedWebActivityCallbackDefault(gifDecoderExternalSyntheticLambda0);
        }
        ITrustedWebActivityCallbackDefault(gifDecoderExternalSyntheticLambda0);
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 writeTypedList(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 13;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2122988769, iOnExtraCallback, 2122988769, new Object[]{gifDecoderExternalSyntheticLambda0});
        int i4 = IPostMessageServiceStub + 33;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static /* synthetic */ Object writeTypedObject(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 35;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1R8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(gifDecoderExternalSyntheticLambda0);
        int i4 = IEngagementSignalsCallbackStubProxy + 3;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 24 / 0;
        }
        return textRoundCornerProgressBarSavedState1R8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 writeTypedObject(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 115;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            ITrustedWebActivityServiceStubProxy(gifDecoderExternalSyntheticLambda0);
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStubProxy = ITrustedWebActivityServiceStubProxy(gifDecoderExternalSyntheticLambda0);
        int i3 = IEngagementSignalsCallbackStubProxy + 103;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1ITrustedWebActivityServiceStubProxy;
        }
        throw null;
    }

    public ResourceUriFetcherFactory(@NotNull final GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Intrinsics.checkNotNullParameter(gifDecoderExternalSyntheticLambda0, "");
        this.onUnminimized = ea10.onExtraCallbackWithResult("Prefs");
        this.newAuthTabSession = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda0
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback_Parcel;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 81;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    textRoundCornerProgressBarSavedState1IAuthTabCallback_Parcel = ResourceUriFetcherFactory.IAuthTabCallback_Parcel(gifDecoderExternalSyntheticLambda0);
                    int i3 = 70 / 0;
                } else {
                    textRoundCornerProgressBarSavedState1IAuthTabCallback_Parcel = ResourceUriFetcherFactory.IAuthTabCallback_Parcel(gifDecoderExternalSyntheticLambda0);
                }
                int i4 = IAuthTabCallback + 25;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 16 / 0;
                }
                return textRoundCornerProgressBarSavedState1IAuthTabCallback_Parcel;
            }
        });
        this.ICustomTabsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda11
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 31;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                if (i3 == 0) {
                    return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -863893031, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 863893049, objArr);
                }
                int i4 = 91 / 0;
                return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -863893031, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 863893049, objArr);
            }
        });
        this.IAuthTabCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda22
            private static int IAuthTabCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 55;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 874716825, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -874716819, objArr);
                int i4 = onNavigationEvent + 109;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return textRoundCornerProgressBarSavedState1;
                }
                throw null;
            }
        });
        this.IAuthTabCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda33
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 450923950, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -450923927, objArr);
                int i4 = onWarmupCompleted + 123;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1;
            }
        });
        this.requestPostMessageChannelWithExtras = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda44
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 109;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                if (i3 == 0) {
                    return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -325003464, iOnExtraCallback, 325003473, objArr);
                }
                int i4 = 1 / 0;
                return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -325003464, iOnExtraCallback, 325003473, objArr);
            }
        });
        this.IEngagementSignalsCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda55
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 119;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    ResourceUriFetcherFactory.requestPostMessageChannelWithExtras(gifDecoderExternalSyntheticLambda0);
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RequestPostMessageChannelWithExtras = ResourceUriFetcherFactory.requestPostMessageChannelWithExtras(gifDecoderExternalSyntheticLambda0);
                int i3 = onNavigationEvent + 99;
                onExtraCallback = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1RequestPostMessageChannelWithExtras;
            }
        });
        this.ICustomTabsServiceDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda56
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 87;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsCallbackStub = ResourceUriFetcherFactory.ICustomTabsCallbackStub(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 49;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1ICustomTabsCallbackStub;
            }
        });
        this.IEngagementSignalsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda57
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 107;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ReceiveFile = ResourceUriFetcherFactory.receiveFile(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallback + 119;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1ReceiveFile;
            }
        });
        this.onGreatestScrollPercentageIncreased = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda58
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 33;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
                if (i3 != 0) {
                    return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -861690387, iOnExtraCallback, 861690408, objArr);
                }
                int i4 = 47 / 0;
                return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -861690387, iOnExtraCallback, 861690408, objArr);
            }
        });
        this.onVerticalScrollEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda59
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 123;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Prefetch = ResourceUriFetcherFactory.prefetch(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 27;
                onExtraCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return textRoundCornerProgressBarSavedState1Prefetch;
                }
                throw null;
            }
        });
        this.access200 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda1
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsCallbackStubProxy = ResourceUriFetcherFactory.ICustomTabsCallbackStubProxy(gifDecoderExternalSyntheticLambda0);
                int i4 = onNavigationEvent + 81;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 43 / 0;
                }
                return textRoundCornerProgressBarSavedState1ICustomTabsCallbackStubProxy;
            }
        });
        this.warmup = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda2
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 27;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    ResourceUriFetcherFactory.ICustomTabsServiceStubProxy(gifDecoderExternalSyntheticLambda0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsServiceStubProxy = ResourceUriFetcherFactory.ICustomTabsServiceStubProxy(gifDecoderExternalSyntheticLambda0);
                int i3 = onNavigationEvent + 9;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1ICustomTabsServiceStubProxy;
            }
        });
        this.validateRelationship = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda3
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 81;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallbackStub = ResourceUriFetcherFactory.IAuthTabCallbackStub(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 45;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1IAuthTabCallbackStub;
            }
        });
        this.writeTypedList = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda4
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 89;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -689558558, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 689558578, objArr);
                int i4 = onWarmupCompleted + 121;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1;
            }
        });
        this.ICustomTabsServiceStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda5
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 9;
                onWarmupCompleted = i2 % 128;
                Object obj = null;
                if (i2 % 2 != 0) {
                    ResourceUriFetcherFactory.IEngagementSignalsCallback(gifDecoderExternalSyntheticLambda0);
                    obj.hashCode();
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IEngagementSignalsCallback = ResourceUriFetcherFactory.IEngagementSignalsCallback(gifDecoderExternalSyntheticLambda0);
                int i3 = onWarmupCompleted + 81;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    return textRoundCornerProgressBarSavedState1IEngagementSignalsCallback;
                }
                throw null;
            }
        });
        this.IAuthTabCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda6
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 39;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    ResourceUriFetcherFactory.warmup(gifDecoderExternalSyntheticLambda0);
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Warmup = ResourceUriFetcherFactory.warmup(gifDecoderExternalSyntheticLambda0);
                int i3 = onNavigationEvent + 83;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1Warmup;
            }
        });
        this.setEngagementSignalsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda7
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 107;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallbackStubProxy = ResourceUriFetcherFactory.IAuthTabCallbackStubProxy(gifDecoderExternalSyntheticLambda0);
                if (i3 == 0) {
                    int i4 = 31 / 0;
                }
                return textRoundCornerProgressBarSavedState1IAuthTabCallbackStubProxy;
            }
        });
        this.asInterface = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda8
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsServiceDefault;
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 35;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    textRoundCornerProgressBarSavedState1ICustomTabsServiceDefault = ResourceUriFetcherFactory.ICustomTabsServiceDefault(gifDecoderExternalSyntheticLambda0);
                    int i3 = 24 / 0;
                } else {
                    textRoundCornerProgressBarSavedState1ICustomTabsServiceDefault = ResourceUriFetcherFactory.ICustomTabsServiceDefault(gifDecoderExternalSyntheticLambda0);
                }
                int i4 = onExtraCallback + 95;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 71 / 0;
                }
                return textRoundCornerProgressBarSavedState1ICustomTabsServiceDefault;
            }
        });
        this.getInterfaceDescriptor = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda9
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = ResourceUriFetcherFactory.IAuthTabCallback(gifDecoderExternalSyntheticLambda0);
                int i4 = IAuthTabCallback + 33;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 96 / 0;
                }
                return textRoundCornerProgressBarSavedState1IAuthTabCallback;
            }
        });
        this.IAuthTabCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda10
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 9;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda02 = gifDecoderExternalSyntheticLambda0;
                if (i3 != 0) {
                    return ResourceUriFetcherFactory.onExtraCallbackWithResult(gifDecoderExternalSyntheticLambda02, this);
                }
                ResourceUriFetcherFactory.onExtraCallbackWithResult(gifDecoderExternalSyntheticLambda02, this);
                throw null;
            }
        });
        this.onRelationshipValidationResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda12
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 107;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 interfaceDescriptor = ResourceUriFetcherFactory.getInterfaceDescriptor(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 77;
                onNavigationEvent = i4 % 128;
                if (i4 % 2 != 0) {
                    return interfaceDescriptor;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.mayLaunchUrl = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda13
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 17;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1NewAuthTabSession = ResourceUriFetcherFactory.newAuthTabSession(gifDecoderExternalSyntheticLambda0);
                int i4 = IAuthTabCallback + 9;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return textRoundCornerProgressBarSavedState1NewAuthTabSession;
                }
                throw null;
            }
        });
        this.receiveFile = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda14
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 107;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnActivityLayout = ResourceUriFetcherFactory.onActivityLayout(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 99;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1OnActivityLayout;
            }
        });
        this.ICustomTabsCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda15
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 41;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ValidateRelationship = ResourceUriFetcherFactory.validateRelationship(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallbackWithResult + 37;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1ValidateRelationship;
            }
        });
        this.onMinimized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda16
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() throws Throwable {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 85;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IEngagementSignalsCallbackStub = ResourceUriFetcherFactory.IEngagementSignalsCallbackStub(gifDecoderExternalSyntheticLambda0);
                int i4 = onNavigationEvent + 109;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return textRoundCornerProgressBarSavedState1IEngagementSignalsCallbackStub;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.onActivityLayout = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda17
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 61;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 926890908, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -926890891, objArr);
                int i4 = IAuthTabCallback + 47;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return textRoundCornerProgressBarSavedState1;
                }
                throw null;
            }
        });
        this.prefetch = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda18
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnNavigationEvent;
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 1;
                IAuthTabCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    textRoundCornerProgressBarSavedState1OnNavigationEvent = ResourceUriFetcherFactory.onNavigationEvent(gifDecoderExternalSyntheticLambda0);
                    int i3 = 15 / 0;
                } else {
                    textRoundCornerProgressBarSavedState1OnNavigationEvent = ResourceUriFetcherFactory.onNavigationEvent(gifDecoderExternalSyntheticLambda0);
                }
                int i4 = onExtraCallbackWithResult + 75;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1OnNavigationEvent;
            }
        });
        this.onTransact = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda19
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 123;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda02 = gifDecoderExternalSyntheticLambda0;
                if (i3 == 0) {
                    return ResourceUriFetcherFactory.postMessage(gifDecoderExternalSyntheticLambda02);
                }
                ResourceUriFetcherFactory.postMessage(gifDecoderExternalSyntheticLambda02);
                throw null;
            }
        });
        this.access000 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda20
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 63;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    ResourceUriFetcherFactory.onWarmupCompleted(gifDecoderExternalSyntheticLambda0);
                    obj.hashCode();
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = ResourceUriFetcherFactory.onWarmupCompleted(gifDecoderExternalSyntheticLambda0);
                int i3 = onExtraCallback + 89;
                onNavigationEvent = i3 % 128;
                if (i3 % 2 == 0) {
                    return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
                }
                obj.hashCode();
                throw null;
            }
        });
        this.requestPostMessageChannel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda21
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 111;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 != 0) {
                    ResourceUriFetcherFactory.isEngagementSignalsApiAvailable(gifDecoderExternalSyntheticLambda0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IsEngagementSignalsApiAvailable = ResourceUriFetcherFactory.isEngagementSignalsApiAvailable(gifDecoderExternalSyntheticLambda0);
                int i3 = onNavigationEvent + 111;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1IsEngagementSignalsApiAvailable;
            }
        });
        this.prefetchWithMultipleUrls = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda23
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 5;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1PrefetchWithMultipleUrls = ResourceUriFetcherFactory.prefetchWithMultipleUrls(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 37;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1PrefetchWithMultipleUrls;
            }
        });
        this.ICustomTabsService = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda24
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 59;
                onExtraCallback = i2 % 128;
                Object obj = null;
                if (i2 % 2 == 0) {
                    ResourceUriFetcherFactory.ICustomTabsServiceStub(gifDecoderExternalSyntheticLambda0);
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsServiceStub = ResourceUriFetcherFactory.ICustomTabsServiceStub(gifDecoderExternalSyntheticLambda0);
                int i3 = IAuthTabCallback + 71;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    return textRoundCornerProgressBarSavedState1ICustomTabsServiceStub;
                }
                obj.hashCode();
                throw null;
            }
        });
        this.ICustomTabsCallbackStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda25
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 73;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr2 = {gifDecoderExternalSyntheticLambda0};
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -34524502, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 34524527, objArr2);
                int i3 = onNavigationEvent + 59;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1;
            }
        });
        this.onWarmupCompleted = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda26
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 31;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda02 = gifDecoderExternalSyntheticLambda0;
                if (i3 == 0) {
                    return ResourceUriFetcherFactory.access200(gifDecoderExternalSyntheticLambda02);
                }
                ResourceUriFetcherFactory.access200(gifDecoderExternalSyntheticLambda02);
                throw null;
            }
        });
        this.onPostMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda27
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 119;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnRelationshipValidationResult = ResourceUriFetcherFactory.onRelationshipValidationResult(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 13;
                onExtraCallback = i4 % 128;
                if (i4 % 2 != 0) {
                    return textRoundCornerProgressBarSavedState1OnRelationshipValidationResult;
                }
                throw null;
            }
        });
        this.onExtraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda28
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 71;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnSessionEnded = ResourceUriFetcherFactory.onSessionEnded(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallback + 15;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1OnSessionEnded;
            }
        });
        this.postMessage = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda29
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 111;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    ResourceUriFetcherFactory.ICustomTabsCallback(gifDecoderExternalSyntheticLambda0);
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsCallback = ResourceUriFetcherFactory.ICustomTabsCallback(gifDecoderExternalSyntheticLambda0);
                int i3 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1ICustomTabsCallback;
            }
        });
        this.newSessionWithExtras = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda30
            private static int onExtraCallbackWithResult = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 31;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1AsInterface = ResourceUriFetcherFactory.asInterface(gifDecoderExternalSyntheticLambda0);
                int i4 = onNavigationEvent + 125;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1AsInterface;
            }
        });
        this.updateVisuals = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda31
            private static int IAuthTabCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 97;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsService_Parcel = ResourceUriFetcherFactory.ICustomTabsService_Parcel(gifDecoderExternalSyntheticLambda0);
                int i4 = IAuthTabCallback + 23;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1ICustomTabsService_Parcel;
            }
        });
        this.ICustomTabsServiceStubProxy = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda32
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 11;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnTransact = ResourceUriFetcherFactory.onTransact(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallbackWithResult + 61;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return textRoundCornerProgressBarSavedState1OnTransact;
                }
                throw null;
            }
        });
        this.extraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda34
            private static int onExtraCallbackWithResult = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 23;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1WriteTypedList = ResourceUriFetcherFactory.writeTypedList(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 3;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1WriteTypedList;
            }
        });
        this.isEngagementSignalsApiAvailable = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda35
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 59;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1373453961, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1373453927, objArr);
                int i4 = onExtraCallback + 69;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1;
            }
        });
        this.readTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda36
            private static int onExtraCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 37;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ICustomTabsCallbackDefault = ResourceUriFetcherFactory.ICustomTabsCallbackDefault(gifDecoderExternalSyntheticLambda0);
                int i4 = onNavigationEvent + 19;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1ICustomTabsCallbackDefault;
            }
        });
        this.extraCommand = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda37
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 113;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1RequestPostMessageChannel = ResourceUriFetcherFactory.requestPostMessageChannel(gifDecoderExternalSyntheticLambda0);
                int i4 = onNavigationEvent + 49;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1RequestPostMessageChannel;
            }
        });
        this.IEngagementSignalsCallback_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda38
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 21;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnGreatestScrollPercentageIncreased = ResourceUriFetcherFactory.onGreatestScrollPercentageIncreased(gifDecoderExternalSyntheticLambda0);
                int i4 = IAuthTabCallback + 33;
                onExtraCallbackWithResult = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1OnGreatestScrollPercentageIncreased;
            }
        });
        this.ICustomTabsService_Parcel = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda39
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 65;
                onWarmupCompleted = i2 % 128;
                if (i2 % 2 == 0) {
                    ResourceUriFetcherFactory.IAuthTabCallbackDefault(gifDecoderExternalSyntheticLambda0);
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallbackDefault = ResourceUriFetcherFactory.IAuthTabCallbackDefault(gifDecoderExternalSyntheticLambda0);
                int i3 = onWarmupCompleted + 71;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1IAuthTabCallbackDefault;
            }
        });
        this.asBinder = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda40
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 49;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 engagementSignalsCallback = ResourceUriFetcherFactory.setEngagementSignalsCallback(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallback + 109;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return engagementSignalsCallback;
                }
                throw null;
            }
        });
        this.access100 = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda41
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 27;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1ExtraCallbackWithResult = ResourceUriFetcherFactory.extraCallbackWithResult(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallback + 19;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1ExtraCallbackWithResult;
            }
        });
        this.ICustomTabsCallbackDefault = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda42
            private static int onExtraCallback = 1;
            private static int onNavigationEvent;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 121;
                onNavigationEvent = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1WriteTypedObject = ResourceUriFetcherFactory.writeTypedObject(gifDecoderExternalSyntheticLambda0);
                int i4 = onNavigationEvent + 83;
                onExtraCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1WriteTypedObject;
            }
        });
        this.extraCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda43
            private static int onNavigationEvent = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 101;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access100 = ResourceUriFetcherFactory.access100(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 19;
                onNavigationEvent = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1Access100;
            }
        });
        this.onMessageChannelReady = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda45
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1973058692, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1973058711, objArr);
                int i4 = onExtraCallback + 63;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1;
            }
        });
        this.onSessionEnded = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda46
            private static int IAuthTabCallback = 0;
            private static int onNavigationEvent = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onNavigationEvent + 19;
                IAuthTabCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnMessageChannelReady = ResourceUriFetcherFactory.onMessageChannelReady(gifDecoderExternalSyntheticLambda0);
                if (i3 != 0) {
                    int i4 = 55 / 0;
                }
                return textRoundCornerProgressBarSavedState1OnMessageChannelReady;
            }
        });
        this.onActivityResized = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda47
            private static int onExtraCallback = 1;
            private static int onExtraCallbackWithResult;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallbackWithResult + 83;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1NewSessionWithExtras = ResourceUriFetcherFactory.newSessionWithExtras(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallback + 101;
                onExtraCallbackWithResult = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 28 / 0;
                }
                return textRoundCornerProgressBarSavedState1NewSessionWithExtras;
            }
        });
        this.onExtraCallbackWithResult = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda48
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 95;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1AsBinder = ResourceUriFetcherFactory.asBinder(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallbackWithResult + 25;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1AsBinder;
            }
        });
        this.writeTypedObject = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda49
            private static int onExtraCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 101;
                onExtraCallback = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1Access000 = ResourceUriFetcherFactory.access000(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallback + 99;
                onWarmupCompleted = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1Access000;
            }
        });
        this.IEngagementSignalsCallbackStub = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda50
            private static int IAuthTabCallback = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 1;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1UpdateVisuals = ResourceUriFetcherFactory.updateVisuals(gifDecoderExternalSyntheticLambda0);
                int i4 = onWarmupCompleted + 59;
                IAuthTabCallback = i4 % 128;
                if (i4 % 2 == 0) {
                    return textRoundCornerProgressBarSavedState1UpdateVisuals;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.ICustomTabsCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda51
            private static int onNavigationEvent = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 115;
                onNavigationEvent = i2 % 128;
                if (i2 % 2 != 0) {
                    ResourceUriFetcherFactory.onPostMessage(gifDecoderExternalSyntheticLambda0);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnPostMessage = ResourceUriFetcherFactory.onPostMessage(gifDecoderExternalSyntheticLambda0);
                int i3 = onNavigationEvent + 71;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
                return textRoundCornerProgressBarSavedState1OnPostMessage;
            }
        });
        this.onNavigationEvent = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda52
            private static int onExtraCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onExtraCallback + 1;
                onWarmupCompleted = i2 % 128;
                int i3 = i2 % 2;
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnMinimized = ResourceUriFetcherFactory.onMinimized(gifDecoderExternalSyntheticLambda0);
                int i4 = onExtraCallback + 85;
                onWarmupCompleted = i4 % 128;
                if (i4 % 2 == 0) {
                    return textRoundCornerProgressBarSavedState1OnMinimized;
                }
                throw null;
            }
        });
        this.IAuthTabCallback = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda53
            private static int onExtraCallbackWithResult = 0;
            private static int onWarmupCompleted = 1;

            public final Object invoke() {
                int i = 2 % 2;
                int i2 = onWarmupCompleted + 91;
                onExtraCallbackWithResult = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr = {gifDecoderExternalSyntheticLambda0};
                if (i3 == 0) {
                    return (TextRoundCornerProgressBarSavedState1) ResourceUriFetcherFactory.onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1439867443, EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1439867439, objArr);
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        });
        this.newSession = LazyKt.onExtraCallbackWithResult(new Function0() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda54
            private static int IAuthTabCallback = 1;
            private static int onExtraCallback;

            public final Object invoke() {
                TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnUnminimized;
                int i = 2 % 2;
                int i2 = IAuthTabCallback + 9;
                onExtraCallback = i2 % 128;
                if (i2 % 2 != 0) {
                    textRoundCornerProgressBarSavedState1OnUnminimized = ResourceUriFetcherFactory.onUnminimized(gifDecoderExternalSyntheticLambda0);
                    int i3 = 34 / 0;
                } else {
                    textRoundCornerProgressBarSavedState1OnUnminimized = ResourceUriFetcherFactory.onUnminimized(gifDecoderExternalSyntheticLambda0);
                }
                int i4 = onExtraCallback + 39;
                IAuthTabCallback = i4 % 128;
                int i5 = i4 % 2;
                return textRoundCornerProgressBarSavedState1OnUnminimized;
            }
        });
    }

    public static final class IAuthTabCallback {
        public /* synthetic */ IAuthTabCallback(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private IAuthTabCallback() {
        }
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsService() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 43;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.newAuthTabSession.getValue();
        int i4 = IPostMessageServiceStub + 45;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 RatingCompat(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 71;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {gifDecoderExternalSyntheticLambda0, "TOSS_PLAIN", MemoryCacheBuilderExternalSyntheticLambda1.PREFERENCE, null, 4, null};
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        } else {
            Object[] objArr2 = {gifDecoderExternalSyntheticLambda0, "TOSS_PLAIN", MemoryCacheBuilderExternalSyntheticLambda1.PREFERENCE, null, 4, null};
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr2, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2);
        }
        return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 121;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.ICustomTabsCallbackStub.getValue();
        if (i3 != 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 AudioAttributesImplApi26Parcelizer(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 25;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = i2 % 2 == 0 ? GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "TOSS_LOGIN_INFO", 0, true, MemoryCacheBuilderExternalSyntheticLambda1.PREFERENCE, null, 34, null) : GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "TOSS_LOGIN_INFO", 1, true, MemoryCacheBuilderExternalSyntheticLambda1.PREFERENCE, null, 16, null);
        int i3 = IEngagementSignalsCallbackStubProxy + 93;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 12 / 0;
        }
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 access000() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 47;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.IAuthTabCallback_Parcel.getValue();
        int i4 = IPostMessageServiceStub + 19;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 63;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.IAuthTabCallbackStub.getValue();
        int i3 = IEngagementSignalsCallbackStubProxy + 119;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityCallbackStub(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 35;
        IPostMessageServiceStub = i2 % 128;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "biometricAuth", 0, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 63, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "biometricAuth", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i3 = IPostMessageServiceStub + 23;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 requestPostMessageChannel() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 21;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.requestPostMessageChannelWithExtras.getValue();
        if (i3 == 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 r8lambda7IJBVrN0sHyidCAZufWEJFc7yY(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 33;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "TOSS", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IEngagementSignalsCallbackStubProxy + 61;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 IEngagementSignalsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 39;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.IEngagementSignalsCallbackDefault.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 49;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 79 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    public final TextRoundCornerProgressBarSavedState1 setEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 103;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.ICustomTabsServiceDefault.getValue();
        if (i3 != 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 MediaSessionCompatResultReceiverWrapper(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 115;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossBankStore", 4, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 65, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossBankStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
    }

    public final TextRoundCornerProgressBarSavedState1 IEngagementSignalsCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 89;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.IEngagementSignalsCallback.getValue();
        int i3 = IEngagementSignalsCallbackStubProxy + 43;
        IPostMessageServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 ResultReceiverMyResultReceiver(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 27;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossPlaceStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IEngagementSignalsCallbackStubProxy + 107;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 IEngagementSignalsCallbackStub() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 41;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onGreatestScrollPercentageIncreased.getValue();
        if (i3 == 0) {
            int i4 = 43 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 11;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossSecuritiesStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IPostMessageServiceStub + 113;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsServiceStubProxy() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 1;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onVerticalScrollEvent.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 109;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 73;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, "tossSecuritiesPlainStore", MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 4, null};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        int i4 = IPostMessageServiceStub + 11;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 writeTypedList() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 67;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.access200.getValue();
        if (i3 != 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        int i4 = 85 / 0;
        return (TextRoundCornerProgressBarSavedState1) value;
    }

    private static final TextRoundCornerProgressBarSavedState1 ResultReceiver(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossPaymentsStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IPostMessageServiceStub + 35;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 updateVisuals() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 81;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.warmup.getValue();
            int i3 = 52 / 0;
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.warmup.getValue();
        }
        int i4 = IPostMessageServiceStub + 111;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 PlaybackStateCompat(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 111;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossInsuranceStore", 4, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 2, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossInsuranceStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
    }

    private static /* synthetic */ Object onMinimized(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 11;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.validateRelationship.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 69;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 PlaybackStateCompatCustomAction(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 13;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossCxStore", 4, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 107, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossCxStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsServiceStub() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 41;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.writeTypedList.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 11;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 ResultReceiver1(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 67;
        IPostMessageServiceStub = i2 % 128;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossMobileStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 73, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossMobileStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i3 = IEngagementSignalsCallbackStubProxy + 51;
        IPostMessageServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 validateRelationship() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 29;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.ICustomTabsServiceStub.getValue();
        int i4 = IPostMessageServiceStub + 69;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 15 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 MediaSessionCompatToken(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 53;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossIncomeStore", 2, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IPostMessageServiceStub + 79;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = IPostMessageService;
        int i4 = -1469660336;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 101;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i4);
                    if (objOnExtraCallback == null) {
                        objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ViewConfiguration.getTouchSlop() >> 8), Drawable.resolveOpacity(0, 0) + 72, View.getDefaultSize(0, 0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                    i8++;
                    int i9 = $10 + 77;
                    $11 = i9 % 128;
                    if (i9 % 2 == 0) {
                        int i10 = 2 / 2;
                    }
                    i4 = -1469660336;
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
        int[] iArr5 = IPostMessageService;
        long j = 0;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i11]);
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) View.MeasureSpec.getMode(i5), 72 - (ExpandableListView.getPackedPositionForGroup(i5) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == j ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 8847, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                i11++;
                i5 = 0;
                j = 0;
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = i2;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            cArr[i2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            for (int i12 = 0; i12 < 16; i12++) {
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[i12];
                Object[] objArr4 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22252 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), AndroidCharacter.getMirror('0') - '\t', 10300 - TextUtils.indexOf((CharSequence) "", '0', 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
            }
            int i13 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i13;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr4[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr4[17];
            int i14 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i15 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr4);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback4 == null) {
                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 4034), TextUtils.getOffsetAfter("", 0) + 78, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static /* synthetic */ Object onExtraCallbackWithResult(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 47;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.IAuthTabCallbackStubProxy.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 119;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityCallbackDefault(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 69;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "credentialSync", 0, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 76, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "credentialSync", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
    }

    public final TextRoundCornerProgressBarSavedState1 prefetchWithMultipleUrls() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 9;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.setEngagementSignalsCallback.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 117;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 RatingCompatApi19Impl(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 87;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "sync", MemoryCacheBuilderExternalSyntheticLambda1.PREFERENCE, null, 4, null}, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback());
        int i4 = IEngagementSignalsCallbackStubProxy + 117;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 35;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "clipboard", 1, false, MemoryCacheBuilderExternalSyntheticLambda1.PREFERENCE, null, 63, null) : GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "clipboard", 0, false, MemoryCacheBuilderExternalSyntheticLambda1.PREFERENCE, null, 22, null);
    }

    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStubProxy() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 57;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.getInterfaceDescriptor.getValue();
        int i4 = IPostMessageServiceStub + 109;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IPostMessageServiceStubProxy(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 57;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, "credit", MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT, null, 4, null};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        int i4 = IEngagementSignalsCallbackStubProxy + 17;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static /* synthetic */ Object ICustomTabsCallback_Parcel(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 63;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.IAuthTabCallbackDefault.getValue();
        if (i3 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object ICustomTabsCallbackDefault(Object[] objArr) throws RealMemoryCache, ResourceIntMapper, RealStrongMemoryCachecache1 {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        final ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[1];
        int i = 2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnWarmupCompleted = gifDecoderExternalSyntheticLambda0.onWarmupCompleted("card", 2, MemoryCacheBuilderExternalSyntheticLambda1.DEFAULT, new Function1() { // from class: im.toss.components.sharedpreferences.entity.Entity$$ExternalSyntheticLambda60
            private static int IAuthTabCallback = 1;
            private static int onWarmupCompleted;

            public final Object invoke(Object obj) {
                int i2 = 2 % 2;
                int i3 = onWarmupCompleted + 9;
                IAuthTabCallback = i3 % 128;
                int i4 = i3 % 2;
                Unit unitOnNavigationEvent = ResourceUriFetcherFactory.onNavigationEvent(this.f$0, (BaseRoundCornerProgressBar) obj);
                int i5 = IAuthTabCallback + 67;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 == 0) {
                    return unitOnNavigationEvent;
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
        });
        int i2 = IPostMessageServiceStub + 79;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1OnWarmupCompleted;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final Unit IAuthTabCallback(ResourceUriFetcherFactory resourceUriFetcherFactory, BaseRoundCornerProgressBar baseRoundCornerProgressBar) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorEdit2;
        Iterator<Map.Entry<String, Object>> it;
        String string;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Intrinsics.checkNotNullParameter(baseRoundCornerProgressBar, "");
            if (baseRoundCornerProgressBar.getInt("version", 0) == 0) {
                int i3 = IEngagementSignalsCallbackStubProxy + 21;
                IPostMessageServiceStub = i3 % 128;
                if (i3 % 2 != 0) {
                    editorEdit = baseRoundCornerProgressBar.edit();
                    editorEdit2 = baseRoundCornerProgressBar.onNavigationEvent().edit();
                    it = baseRoundCornerProgressBar.getAll().entrySet().iterator();
                    int i4 = 68 / 0;
                } else {
                    editorEdit = baseRoundCornerProgressBar.edit();
                    editorEdit2 = baseRoundCornerProgressBar.onNavigationEvent().edit();
                    it = baseRoundCornerProgressBar.getAll().entrySet().iterator();
                }
                while (it.hasNext()) {
                    Map.Entry<String, Object> next = it.next();
                    AppSetIdAndScope1 appSetIdAndScope1 = resourceUriFetcherFactory.onUnminimized;
                    String key = next.getKey();
                    Object value = next.getValue();
                    Objects.toString(key);
                    Objects.toString(value);
                    String key2 = next.getKey();
                    Object value2 = next.getValue();
                    if (value2 == null || (string = value2.toString()) == null) {
                        string = "";
                    }
                    editorEdit.putString(key2, string);
                    editorEdit2.remove(next.getKey());
                }
                editorEdit.putInt("version", 1);
                editorEdit.commit();
            }
        } else {
            Intrinsics.checkNotNullParameter(baseRoundCornerProgressBar, "");
            if (baseRoundCornerProgressBar.getInt("version", 0) == 0) {
            }
        }
        return Unit.INSTANCE;
    }

    private static /* synthetic */ Object onMessageChannelReady(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 111;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.onRelationshipValidationResult.getValue();
        int i4 = IPostMessageServiceStub + 119;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 68 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityService_Parcel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 81;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "invest", null, null, 6, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        int i4 = IEngagementSignalsCallbackStubProxy + 17;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public final TextRoundCornerProgressBarSavedState1 extraCommand() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 75;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.mayLaunchUrl.getValue();
        if (i3 == 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 MediaBrowserCompatMediaItem(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 21;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "payment", null, null, 102, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        } else {
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "payment", null, null, 6, null}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
        int i3 = IEngagementSignalsCallbackStubProxy + 53;
        IPostMessageServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public final TextRoundCornerProgressBarSavedState1 requestPostMessageChannelWithExtras() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 31;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.receiveFile.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 43;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 ParcelableVolumeInfo(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 31;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "timeline", null, null, 67, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        } else {
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "timeline", null, null, 6, null}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
        int i3 = IEngagementSignalsCallbackStubProxy + 115;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 isEngagementSignalsApiAvailable() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 59;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.ICustomTabsCallback_Parcel.getValue();
        if (i3 != 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 AudioAttributesImplBaseParcelizer(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 35;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "pedometer", null, null, 6, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        int i4 = IEngagementSignalsCallbackStubProxy + 41;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 onMessageChannelReady() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 109;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onMinimized.getValue();
        int i4 = IPostMessageServiceStub + 103;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 84 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 read(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) throws Throwable {
        String strIntern;
        int i;
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1;
        Function1 function1;
        int i2;
        int i3 = 2 % 2;
        int i4 = IEngagementSignalsCallbackStubProxy + 81;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            Object[] objArr = new Object[1];
            a(new int[]{-1415138052, -1513025723}, 3 - KeyEvent.normalizeMetaState(0), objArr);
            strIntern = ((String) objArr[0]).intern();
            i = 1;
            memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
            function1 = null;
            i2 = 46;
        } else {
            Object[] objArr2 = new Object[1];
            a(new int[]{-1415138052, -1513025723}, 4 - KeyEvent.normalizeMetaState(0), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            i = 1;
            memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
            function1 = null;
            i2 = 8;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, strIntern, i, memoryCacheBuilderExternalSyntheticLambda1, function1, i2, (Object) null);
        int i5 = IPostMessageServiceStub + 33;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 onActivityLayout() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 15;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.onActivityLayout.getValue();
        if (i3 != 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        int i4 = 87 / 0;
        return (TextRoundCornerProgressBarSavedState1) value;
    }

    private static final TextRoundCornerProgressBarSavedState1 RemoteActionCompatParcelizer(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 105;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "homeDevtool", null, null, 6, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        int i4 = IPostMessageServiceStub + 79;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public final TextRoundCornerProgressBarSavedState1 postMessage() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 5;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.prefetch.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 77;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 RatingCompatStarStyle(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 27;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "shopping", null, null, 1, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        } else {
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "shopping", null, null, 6, null}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
        int i3 = IEngagementSignalsCallbackStubProxy + 87;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallbackStub() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 19;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onTransact.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 63;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 98 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static /* synthetic */ Object access000(Object[] objArr) {
        String str;
        int i;
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1;
        Function1 function1;
        int i2;
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i3 = 2 % 2;
        int i4 = IPostMessageServiceStub + 91;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            str = "caSecureStore";
            i = 3;
            memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
            function1 = null;
            i2 = 125;
        } else {
            str = "caSecureStore";
            i = 2;
            memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
            function1 = null;
            i2 = 8;
        }
        return GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, str, i, memoryCacheBuilderExternalSyntheticLambda1, function1, i2, (Object) null);
    }

    public final TextRoundCornerProgressBarSavedState1 getInterfaceDescriptor() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 57;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.access000.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 49;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityService(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 75;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "debug", null, null, 99, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        } else {
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "debug", null, null, 6, null}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        }
        return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
    }

    private static /* synthetic */ Object onTransact(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 107;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.requestPostMessageChannel.getValue();
        if (i3 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 MediaSessionCompatQueueItem(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 43;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "survey", null, null, 37, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        } else {
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "survey", null, null, 6, null}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        }
        return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
    }

    private static /* synthetic */ Object IAuthTabCallbackStubProxy(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 115;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.prefetchWithMultipleUrls.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 91;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 RatingCompat1(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 95;
        IPostMessageServiceStub = i2 % 128;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "teens", 1, (MemoryCacheBuilderExternalSyntheticLambda1) null, (Function1) null, 78, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "teens", 1, (MemoryCacheBuilderExternalSyntheticLambda1) null, (Function1) null, 12, (Object) null);
        int i3 = IPostMessageServiceStub + 81;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 36 / 0;
        }
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 mayLaunchUrl() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 99;
        IPostMessageServiceStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.ICustomTabsService.getValue();
        int i3 = IPostMessageServiceStub + 93;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 write(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 99;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        return i2 % 2 == 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "mydata", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 77, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "mydata", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
    }

    private static /* synthetic */ Object getInterfaceDescriptor(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 105;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.ICustomTabsCallbackStubProxy.getValue();
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 AudioAttributesCompatParcelizer(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 43;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "loanApply", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IEngagementSignalsCallbackStubProxy + 115;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 111;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onWarmupCompleted.getValue();
        int i3 = IPostMessageServiceStub + 101;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IPostMessageServiceStub(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 15;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "bankConversion", null, null, 114, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        } else {
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "bankConversion", null, null, 6, null}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        }
        return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
    }

    private static /* synthetic */ Object access100(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 43;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.onPostMessage.getValue();
        if (i3 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 getSmallIconId(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 89;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "guest", null, null, 6, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        int i4 = IEngagementSignalsCallbackStubProxy + 39;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 onExtraCallback() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 61;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onExtraCallback.getValue();
        int i4 = IPostMessageServiceStub + 119;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 42 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IPostMessageServiceDefault(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 71;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "appLock", null, null, 28, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        } else {
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "appLock", null, null, 6, null}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
        int i3 = IPostMessageServiceStub + 73;
        IEngagementSignalsCallbackStubProxy = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 23 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static /* synthetic */ Object ICustomTabsCallbackStubProxy(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 87;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.postMessage.getValue();
        int i4 = IPostMessageServiceStub + 107;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 MediaMetadataCompat(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 23;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "privatePKI", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IPostMessageServiceStub + 47;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    private static /* synthetic */ Object onActivityResized(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 59;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "search", 0, false, null, null, 30, null);
        int i4 = IPostMessageServiceStub + 63;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 warmup() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 105;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.updateVisuals.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 121;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallbackDefault(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 7;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossMobilePrivatePKI", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IPostMessageServiceStub + 61;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 access200() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 117;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.ICustomTabsServiceStubProxy.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 3;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 45;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossReact", 0, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 56, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "tossReact", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallback() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 49;
        IPostMessageServiceStub = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            throw null;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.extraCallbackWithResult.getValue();
        int i3 = IEngagementSignalsCallbackStubProxy + 115;
        IPostMessageServiceStub = i3 % 128;
        if (i3 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        String str;
        int i;
        boolean z;
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1;
        Function1 function1;
        int i2;
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i3 = 2 % 2;
        int i4 = IPostMessageServiceStub + 101;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            str = "faceAuth";
            i = 1;
            z = false;
            memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
            function1 = null;
            i2 = 29;
        } else {
            str = "faceAuth";
            i = 0;
            z = false;
            memoryCacheBuilderExternalSyntheticLambda1 = MemoryCacheBuilderExternalSyntheticLambda1.CORE;
            function1 = null;
            i2 = 22;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, str, i, z, memoryCacheBuilderExternalSyntheticLambda1, function1, i2, null);
        int i5 = IPostMessageServiceStub + 97;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        int i6 = i5 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackDefault() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 39;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.isEngagementSignalsApiAvailable.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 75;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IconCompatParcelizer(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "mobileId", 0, false, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 22, null);
        int i4 = IPostMessageServiceStub + 123;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    private static /* synthetic */ Object IAuthTabCallback_Parcel(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 119;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.readTypedObject.getValue();
        if (i3 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityCallbackStubProxy(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 59;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "facepay", 0, false, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 117, null) : GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "facepay", 0, false, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 22, null);
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallback_Parcel() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 41;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.extraCommand.getValue();
        int i4 = IPostMessageServiceStub + 41;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 AudioAttributesImplApi21Parcelizer(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 79;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "mobility", 0, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 56, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "mobility", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
    }

    private static /* synthetic */ Object asBinder(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 45;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.IEngagementSignalsCallback_Parcel.getValue();
        int i4 = IPostMessageServiceStub + 87;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 107;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "webtools", null, null, 6, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        int i4 = IPostMessageServiceStub + 113;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsService_Parcel() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 115;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.ICustomTabsService_Parcel.getValue();
        if (i3 == 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 ResultReceiverMyRunnable(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 33;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "tosspay", null, null, 6, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        int i4 = IEngagementSignalsCallbackStubProxy + 47;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 onTransact() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 51;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.asBinder.getValue();
        if (i3 == 0) {
            int i4 = 89 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IEngagementSignalsCallback_Parcel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 119;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback3 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "benefit_ads", null, null, 67, null}, iOnExtraCallback2, iOnExtraCallback3, iOnExtraCallback);
        } else {
            int iOnExtraCallback4 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback5 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            int iOnExtraCallback6 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), new Object[]{gifDecoderExternalSyntheticLambda0, "benefit_ads", null, null, 6, null}, iOnExtraCallback5, iOnExtraCallback6, iOnExtraCallback4);
        }
        return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 IAuthTabCallback_Parcel() {
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 37;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.access100.getValue();
            int i3 = 98 / 0;
        } else {
            textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.access100.getValue();
        }
        int i4 = IEngagementSignalsCallbackStubProxy + 75;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IAuthTabCallback(Object[] objArr) {
        String str;
        int i;
        MemoryCacheBuilderExternalSyntheticLambda1 memoryCacheBuilderExternalSyntheticLambda1;
        Function1 function1;
        int i2;
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i3 = 2 % 2;
        int i4 = IPostMessageServiceStub + 93;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            str = "esim";
            i = 2;
            memoryCacheBuilderExternalSyntheticLambda1 = null;
            function1 = null;
            i2 = 82;
        } else {
            str = "esim";
            i = 2;
            memoryCacheBuilderExternalSyntheticLambda1 = null;
            function1 = null;
            i2 = 12;
        }
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, str, i, memoryCacheBuilderExternalSyntheticLambda1, function1, i2, (Object) null);
        int i5 = IEngagementSignalsCallbackStubProxy + 21;
        IPostMessageServiceStub = i5 % 128;
        if (i5 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 onUnminimized() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 95;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.ICustomTabsCallbackDefault.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 33;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityServiceStubProxy(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 49;
        IPostMessageServiceStub = i2 % 128;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "kycCddProfile", 0, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 67, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "kycCddProfile", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i3 = IEngagementSignalsCallbackStubProxy + 65;
        IPostMessageServiceStub = i3 % 128;
        int i4 = i3 % 2;
        return textRoundCornerProgressBarSavedState1OnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 writeTypedObject() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 5;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.extraCallback.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 101;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 notifyNotificationWithChannel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 121;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "globalKycInfo", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 80, (Object) null) : GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "globalKycInfo", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
    }

    public final TextRoundCornerProgressBarSavedState1 onActivityResized() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 37;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onMessageChannelReady.getValue();
        if (i3 != 0) {
            int i4 = 68 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static /* synthetic */ Object ICustomTabsCallback(Object[] objArr) {
        GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0 = (GifDecoderExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 55;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1OnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(gifDecoderExternalSyntheticLambda0, "InitData", 1, MemoryCacheBuilderExternalSyntheticLambda1.CORE, (Function1) null, 8, (Object) null);
        int i4 = IEngagementSignalsCallbackStubProxy + 67;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1OnExtraCallback;
        }
        throw null;
    }

    private static /* synthetic */ Object onRelationshipValidationResult(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 99;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.onSessionEnded.getValue();
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = IPostMessageServiceStub + 71;
        IEngagementSignalsCallbackStubProxy = i5 % 128;
        if (i5 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 r8lambda54BeH8ZsBru0CXI2CCSP2syNys(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 123;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {gifDecoderExternalSyntheticLambda0, "tossServiceRegion", MemoryCacheBuilderExternalSyntheticLambda1.PERSISTENT, null, 4, null};
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        } else {
            Object[] objArr2 = {gifDecoderExternalSyntheticLambda0, "tossServiceRegion", MemoryCacheBuilderExternalSyntheticLambda1.PERSISTENT, null, 4, null};
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr2, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2);
        }
        return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 onMinimized() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 103;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onActivityResized.getValue();
        int i4 = IPostMessageServiceStub + 51;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 getActiveNotifications(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 89;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, "globalOnboarding", MemoryCacheBuilderExternalSyntheticLambda1.PERSISTENT, null, 4, null};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        int i4 = IPostMessageServiceStub + 97;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public final TextRoundCornerProgressBarSavedState1 onWarmupCompleted() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 35;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.onExtraCallbackWithResult.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 73;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 66 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IEngagementSignalsCallbackDefault(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 9;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, "accountTerminate", MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 4, null};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        int i4 = IEngagementSignalsCallbackStubProxy + 119;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    public final TextRoundCornerProgressBarSavedState1 extraCallbackWithResult() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 125;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object value = this.writeTypedObject.getValue();
        if (i3 == 0) {
            return (TextRoundCornerProgressBarSavedState1) value;
        }
        int i4 = 76 / 0;
        return (TextRoundCornerProgressBarSavedState1) value;
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityServiceDefault(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 3;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, "globalCdr", MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 4, null};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        int i4 = IEngagementSignalsCallbackStubProxy + 85;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 onSessionEnded() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 1;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.IEngagementSignalsCallbackStub.getValue();
        if (i3 == 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 15;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, "visitor", MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 4, null};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        int i4 = IPostMessageServiceStub + 47;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final TextRoundCornerProgressBarSavedState1 extraCallback() {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 31;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.ICustomTabsCallback.getValue();
        int i4 = IPostMessageServiceStub + 77;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 getSmallIconBitmap(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        Object objOnExtraCallback;
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 93;
        IPostMessageServiceStub = i2 % 128;
        if (i2 % 2 != 0) {
            Object[] objArr = {gifDecoderExternalSyntheticLambda0, "foreigner", MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 2, null};
            int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        } else {
            Object[] objArr2 = {gifDecoderExternalSyntheticLambda0, "foreigner", MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 4, null};
            int iOnExtraCallback2 = AUTextView.onExtraCallbackWithResult.onExtraCallback();
            objOnExtraCallback = GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr2, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback2);
        }
        return (TextRoundCornerProgressBarSavedState1) objOnExtraCallback;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 71;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.onNavigationEvent.getValue();
        if (i3 == 0) {
            throw null;
        }
        int i4 = IPostMessageServiceStub + 43;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 98 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IEngagementSignalsCallbackStubProxy(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 121;
        IPostMessageServiceStub = i2 % 128;
        return i2 % 2 != 0 ? GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "adsSdk", 0, true, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 116, null) : GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "adsSdk", 0, false, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 22, null);
    }

    private static /* synthetic */ Object onUnminimized(Object[] objArr) {
        ResourceUriFetcherFactory resourceUriFetcherFactory = (ResourceUriFetcherFactory) objArr[0];
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 61;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) resourceUriFetcherFactory.IAuthTabCallback.getValue();
        int i4 = IEngagementSignalsCallbackStubProxy + 33;
        IPostMessageServiceStub = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 7 / 0;
        }
        return textRoundCornerProgressBarSavedState1;
    }

    private static final TextRoundCornerProgressBarSavedState1 IPostMessageService(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 69;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1IAuthTabCallback = GifDecoderExternalSyntheticLambda0.IAuthTabCallback(gifDecoderExternalSyntheticLambda0, "AuthMethodSelection", 0, false, MemoryCacheBuilderExternalSyntheticLambda1.CORE, null, 22, null);
        int i4 = IEngagementSignalsCallbackStubProxy + 27;
        IPostMessageServiceStub = i4 % 128;
        int i5 = i4 % 2;
        return textRoundCornerProgressBarSavedState1IAuthTabCallback;
    }

    public final TextRoundCornerProgressBarSavedState1 newSession() {
        int i = 2 % 2;
        int i2 = IEngagementSignalsCallbackStubProxy + 37;
        IPostMessageServiceStub = i2 % 128;
        int i3 = i2 % 2;
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) this.newSession.getValue();
        int i4 = IPostMessageServiceStub + 15;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final TextRoundCornerProgressBarSavedState1 MediaDescriptionCompat(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int i = 2 % 2;
        int i2 = IPostMessageServiceStub + 101;
        IEngagementSignalsCallbackStubProxy = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = {gifDecoderExternalSyntheticLambda0, "qaLogin", MemoryCacheBuilderExternalSyntheticLambda1.PERSISTENT, null, 4, null};
        int iOnExtraCallback = AUTextView.onExtraCallbackWithResult.onExtraCallback();
        TextRoundCornerProgressBarSavedState1 textRoundCornerProgressBarSavedState1 = (TextRoundCornerProgressBarSavedState1) GifDecoderExternalSyntheticLambda0.onExtraCallback(-1817491730, 1817491731, AUTextView.onExtraCallbackWithResult.onExtraCallback(), objArr, AUTextView.onExtraCallbackWithResult.onExtraCallback(), AUTextView.onExtraCallbackWithResult.onExtraCallback(), iOnExtraCallback);
        int i4 = IPostMessageServiceStub + 121;
        IEngagementSignalsCallbackStubProxy = i4 % 128;
        if (i4 % 2 != 0) {
            return textRoundCornerProgressBarSavedState1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1373453961, iOnExtraCallback, -1373453927, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onExtraCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -689558558, iOnExtraCallback, 689558578, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 extraCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -325003464, iOnExtraCallback, 325003473, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 readTypedObject(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 450923950, iOnExtraCallback, -450923927, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onActivityResized(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 874716825, iOnExtraCallback, -874716819, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsService(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 926890908, iOnExtraCallback, -926890891, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 ICustomTabsCallback_Parcel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1439867443, iOnExtraCallback, -1439867439, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 extraCommand(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1973058692, iOnExtraCallback, 1973058711, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 mayLaunchUrl(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -861690387, iOnExtraCallback, 861690408, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 newSession(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -34524502, iOnExtraCallback, 34524527, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public static /* synthetic */ TextRoundCornerProgressBarSavedState1 onVerticalScrollEvent(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -863893031, iOnExtraCallback, 863893049, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static final TextRoundCornerProgressBarSavedState1 IPostMessageService_Parcel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2044065525, iOnExtraCallback, 2044065537, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static final TextRoundCornerProgressBarSavedState1 IAuthTabCallback(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0, ResourceUriFetcherFactory resourceUriFetcherFactory) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -457832501, iOnExtraCallback, 457832531, new Object[]{gifDecoderExternalSyntheticLambda0, resourceUriFetcherFactory});
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityCallback_Parcel(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1529685879, iOnExtraCallback, -1529685864, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static final TextRoundCornerProgressBarSavedState1 cancelNotification(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -150495925, iOnExtraCallback, 150495928, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static final TextRoundCornerProgressBarSavedState1 areNotificationsEnabled(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -2122988769, iOnExtraCallback, 2122988769, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static final TextRoundCornerProgressBarSavedState1 ITrustedWebActivityServiceStub(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 718448012, iOnExtraCallback, -718447996, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static final TextRoundCornerProgressBarSavedState1 RatingCompatStyle(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1400167019, iOnExtraCallback, 1400167041, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static final TextRoundCornerProgressBarSavedState1 ComponentActivity(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -528268137, iOnExtraCallback, 528268145, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    private static final TextRoundCornerProgressBarSavedState1 r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8(GifDecoderExternalSyntheticLambda0 gifDecoderExternalSyntheticLambda0) {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1825176277, iOnExtraCallback, 1825176309, new Object[]{gifDecoderExternalSyntheticLambda0});
    }

    public final TextRoundCornerProgressBarSavedState1 onExtraCallbackWithResult() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 645211264, iOnExtraCallback, -645211262, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 onNavigationEvent() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1023734169, iOnExtraCallback, 1023734202, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 asInterface() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -339593442, iOnExtraCallback, 339593477, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 asBinder() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -994495188, iOnExtraCallback, 994495216, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 access100() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1050120187, iOnExtraCallback, 1050120188, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 readTypedObject() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1065113470, iOnExtraCallback, 1065113480, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 onPostMessage() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -320476741, iOnExtraCallback, 320476752, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 onRelationshipValidationResult() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1253848547, iOnExtraCallback, -1253848521, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsCallbackStub() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -987761047, iOnExtraCallback, 987761061, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 prefetch() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -306003695, iOnExtraCallback, 306003722, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 newSessionWithExtras() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1081042435, iOnExtraCallback, -1081042406, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 newAuthTabSession() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1320628468, iOnExtraCallback, 1320628473, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 receiveFile() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 1285944127, iOnExtraCallback, -1285944114, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 ICustomTabsServiceDefault() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 130035302, iOnExtraCallback, -130035278, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 onVerticalScrollEvent() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), -1367725844, iOnExtraCallback, 1367725875, new Object[]{this});
    }

    public final TextRoundCornerProgressBarSavedState1 onGreatestScrollPercentageIncreased() {
        int iOnExtraCallback = EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback();
        return (TextRoundCornerProgressBarSavedState1) onExtraCallback(EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), EuTransferReceiverAccountSelectScreenKt$.ExternalSyntheticLambda27.onExtraCallback(), 551107339, iOnExtraCallback, -551107332, new Object[]{this});
    }

    static void IPostMessageServiceDefault() {
        IPostMessageService = new int[]{91305690, 930078487, -1003653212, 1318307736, -881628903, -314856902, -1353135016, -117243514, 1056435755, -151167747, 2040062793, -2091906046, -1521822614, -793988529, 664355979, -1867864444, -1299176070, 2042611916};
    }
}
