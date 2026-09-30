package o;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.database.StandaloneDatabaseProvider;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheWriter;
import com.google.android.exoplayer2.upstream.cache.LeastRecentlyUsedCacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.HttpUrl;
import okhttp3.internal.url._UrlKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.opencv.imgproc.Imgproc;

/* loaded from: /tmp/toss_alldex/classes13.dex */
public final class CommonModule_setSecureScreen {
    private static Cache IAuthTabCallback = null;
    private static int IAuthTabCallbackDefault = 0;
    private static Function1<? super Context, Unit> IAuthTabCallbackStub = null;
    private static int asInterface = 0;
    private static int getInterfaceDescriptor = 1;
    private static boolean onNavigationEvent = false;
    private static int onTransact = 1;
    public static final CommonModule_setSecureScreen onWarmupCompleted = new CommonModule_setSecureScreen();
    private static final Object onExtraCallback = new Object();
    private static final Set<String> asBinder = new LinkedHashSet();
    public static final int onExtraCallbackWithResult = 8;

    public static /* synthetic */ Object onExtraCallbackWithResult(int i, int i2, int i3, int i4, Object[] objArr, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i;
        int i9 = (~i2) | i8;
        int i10 = i7 | (~i9);
        int i11 = i2 | i8;
        int i12 = ~(i9 | i3);
        int i13 = i + i3 + i6 + (1075552530 * i4) + ((-1519595880) * i5);
        int i14 = i13 * i13;
        int i15 = (((-1050772794) * i) - 1639710720) + ((-2116975300) * i3) + (i10 * (-533101253)) + (533101253 * i11) + ((-533101253) * i12) + ((-1583874048) * i6) + ((-189792256) * i4) + (1111490560 * i5) + (1415839744 * i14);
        int i16 = (i * 251836610) + 257048825 + (i3 * 251838484) + (i10 * 937) + (i11 * (-937)) + (i12 * 937) + (i6 * 251837547) + (i4 * 1710852742) + (i5 * (-1855850104)) + (i14 * (-1244921856));
        return i15 + ((i16 * i16) * (-1300496384)) != 1 ? onExtraCallback(objArr) : onNavigationEvent(objArr);
    }

    private CommonModule_setSecureScreen() {
    }

    static {
        int i = IAuthTabCallbackDefault + 111;
        onTransact = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void IAuthTabCallback(@Nullable Function1<? super Context, Unit> function1) {
        int i = 2 % 2;
        int i2 = asInterface;
        int i3 = i2 + 111;
        getInterfaceDescriptor = i3 % 128;
        int i4 = i3 % 2;
        IAuthTabCallbackStub = function1;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 21;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onExtraCallback(@NotNull String str) {
        int i = 2 % 2;
        int i2 = asInterface + 15;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        asBinder.add(str);
        int i4 = getInterfaceDescriptor + 97;
        asInterface = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String onExtraCallbackWithResult(@NotNull Context context) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        onWarmupCompleted(context);
        String userAgent = Util.getUserAgent(context, context.getPackageName());
        Intrinsics.checkNotNullExpressionValue(userAgent, "");
        StringBuilder sb = new StringBuilder();
        sb.append(userAgent);
        Iterator<T> it = asBinder.iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                String string = sb.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                int i2 = getInterfaceDescriptor + 111;
                asInterface = i2 % 128;
                if (i2 % 2 == 0) {
                    return string;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = getInterfaceDescriptor + 55;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                String str = (String) it.next();
                sb.append(" ");
                sb.append(str);
                obj.hashCode();
                throw null;
            }
            String str2 = (String) it.next();
            sb.append(" ");
            sb.append(str2);
        }
    }

    private final void onWarmupCompleted(Context context) {
        synchronized (this) {
            Function1<? super Context, Unit> function1 = IAuthTabCallbackStub;
            if (function1 != null && !onNavigationEvent) {
                if (function1 != null) {
                    function1.invoke(context);
                }
                onNavigationEvent = true;
            }
        }
    }

    public final Object IAuthTabCallback(@NotNull Context context, @NotNull String str, @NotNull CacheWriter.ProgressListener progressListener) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(progressListener, "");
        CacheWriter cacheWriter = new CacheWriter(onNavigationEvent(context).createDataSource(), new DataSpec(Uri.parse(((HttpUrl) getTcfVendorConsentStatus.Companion.IAuthTabCallbackStub().onWarmupCompleted().invoke(HttpUrl.Companion.get(str))).toString())), (byte[]) null, progressListener);
        try {
            Result.Companion companion = Result.Companion;
            cacheWriter.cache();
            Object objM31constructorimpl = Result.m31constructorimpl(Unit.INSTANCE);
            int i2 = asInterface + 45;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            return objM31constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            return Result.m31constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final CacheDataSource.Factory onNavigationEvent(Context context) {
        if (IAuthTabCallback == null) {
            synchronized (onExtraCallback) {
                if (IAuthTabCallback == null) {
                    IAuthTabCallback = new SimpleCache(new File(context.getCacheDir().getAbsolutePath() + "/media_cache"), new LeastRecentlyUsedCacheEvictor(314572800L), new StandaloneDatabaseProvider(context));
                }
                Unit unit = Unit.INSTANCE;
            }
        }
        CacheDataSource.Factory factory = new CacheDataSource.Factory();
        Cache cache = IAuthTabCallback;
        Intrinsics.checkNotNull(cache);
        CacheDataSource.Factory upstreamDataSourceFactory = factory.setCache(cache).setUpstreamDataSourceFactory(onExtraCallback(context));
        Intrinsics.checkNotNullExpressionValue(upstreamDataSourceFactory, "");
        return upstreamDataSourceFactory;
    }

    public static final class onNavigationEvent implements TransferListener {
        private static int IAuthTabCallback = 0;
        private static int onNavigationEvent = 1;
        private final Map<DataSource, Long> onExtraCallback = new LinkedHashMap();

        public void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
            int i = 2 % 2;
            int i2 = onNavigationEvent + 119;
            IAuthTabCallback = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(dataSource, "");
            Intrinsics.checkNotNullParameter(dataSpec, "");
            if (i3 != 0) {
                int i4 = 51 / 0;
            }
            int i5 = onNavigationEvent + 101;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }

        onNavigationEvent() {
        }

        public void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
            Map<DataSource, Long> map;
            int i = 2 % 2;
            int i2 = onNavigationEvent + 107;
            IAuthTabCallback = i2 % 128;
            if (i2 % 2 != 0) {
                Intrinsics.checkNotNullParameter(dataSource, "");
                Intrinsics.checkNotNullParameter(dataSpec, "");
                map = this.onExtraCallback;
            } else {
                Intrinsics.checkNotNullParameter(dataSource, "");
                Intrinsics.checkNotNullParameter(dataSpec, "");
                map = this.onExtraCallback;
            }
            map.put(dataSource, 0L);
        }

        public void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
            long jLongValue;
            int i2 = 2 % 2;
            Intrinsics.checkNotNullParameter(dataSource, "");
            Intrinsics.checkNotNullParameter(dataSpec, "");
            Map<DataSource, Long> map = this.onExtraCallback;
            Long l = map.get(dataSource);
            if (l != null) {
                int i3 = IAuthTabCallback + 35;
                onNavigationEvent = i3 % 128;
                int i4 = i3 % 2;
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            map.put(dataSource, Long.valueOf(jLongValue + i));
            int i5 = IAuthTabCallback + 107;
            onNavigationEvent = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 26 / 0;
            }
        }

        public void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
            int i = 2 % 2;
            int i2 = IAuthTabCallback + 49;
            onNavigationEvent = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                Intrinsics.checkNotNullParameter(dataSource, "");
                Intrinsics.checkNotNullParameter(dataSpec, "");
                this.onExtraCallback.get(dataSource);
                throw null;
            }
            Intrinsics.checkNotNullParameter(dataSource, "");
            Intrinsics.checkNotNullParameter(dataSpec, "");
            Long l = this.onExtraCallback.get(dataSource);
            long jLongValue = l != null ? l.longValue() : 0L;
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerTransferredBytes", String.valueOf(jLongValue), access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback("humanBytes", getLongName.onWarmupCompleted(jLongValue)), getWrite.IAuthTabCallback("isWifi", AFj1rSDK.onExtraCallback.IAuthTabCallback().invoke()), getWrite.IAuthTabCallback("dataUri", dataSpec.uri.toString())), (String) null, false, (String) null, 56, (Object) null);
            int i3 = IAuthTabCallback + 73;
            onNavigationEvent = i3 % 128;
            if (i3 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
    }

    private final DataSource.Factory onExtraCallback(Context context) {
        int i = 2 % 2;
        DefaultHttpDataSource.Factory transferListener = new DefaultHttpDataSource.Factory().setUserAgent(onExtraCallbackWithResult(context)).setTransferListener(new onNavigationEvent());
        Intrinsics.checkNotNullExpressionValue(transferListener, "");
        int i2 = asInterface + 71;
        getInterfaceDescriptor = i2 % 128;
        int i3 = i2 % 2;
        return transferListener;
    }

    private static /* synthetic */ Object onNavigationEvent(Object[] objArr) {
        CommonModule_setSecureScreen commonModule_setSecureScreen = (CommonModule_setSecureScreen) objArr[0];
        ExoPlayer exoPlayer = (ExoPlayer) objArr[1];
        Context context = (Context) objArr[2];
        String str = (String) objArr[3];
        boolean zBooleanValue = ((Boolean) objArr[4]).booleanValue();
        AnalyticsListener analyticsListener = (AnalyticsListener) objArr[5];
        int iIntValue = ((Number) objArr[6]).intValue();
        Object obj = objArr[7];
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + 21;
        asInterface = i2 % 128;
        if (i2 % 2 == 0 ? (iIntValue & 4) != 0 : (iIntValue & 4) != 0) {
            zBooleanValue = true;
        }
        if ((iIntValue & 8) != 0) {
            analyticsListener = null;
        }
        commonModule_setSecureScreen.IAuthTabCallback(exoPlayer, context, str, zBooleanValue, analyticsListener);
        int i3 = getInterfaceDescriptor + 17;
        asInterface = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        throw null;
    }

    public static final class onExtraCallback implements AnalyticsListener {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int IAuthTabCallbackDefault = 0;
        private static int asInterface = 1;
        private static char[] onExtraCallback = {27364, 27344, 27369};
        final /* synthetic */ boolean IAuthTabCallback;
        final /* synthetic */ String onExtraCallbackWithResult;
        final /* synthetic */ Uri onNavigationEvent;
        final /* synthetic */ AnalyticsListener onWarmupCompleted;

        onExtraCallback(Uri uri, boolean z, String str, AnalyticsListener analyticsListener) {
            this.onNavigationEvent = uri;
            this.IAuthTabCallback = z;
            this.onExtraCallbackWithResult = str;
            this.onWarmupCompleted = analyticsListener;
        }

        public void onPlayerError(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 107;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventTime, "");
            Intrinsics.checkNotNullParameter(playbackException, "");
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 53, 1}, true, null, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerError", playbackException.toString(), (Throwable) null, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onNavigationEvent), getWrite.IAuthTabCallback("eventTime", Long.valueOf(eventTime.eventPlaybackPositionMs)), getWrite.IAuthTabCallback("eventType", "onPlayerError"), getWrite.IAuthTabCallback("useCache", Boolean.valueOf(this.IAuthTabCallback)), getWrite.IAuthTabCallback("userAgent", this.onExtraCallbackWithResult)), 4, (Object) null);
            AnalyticsListener analyticsListener = this.onWarmupCompleted;
            if (analyticsListener != null) {
                int i4 = IAuthTabCallbackDefault + 61;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                analyticsListener.onPlayerError(eventTime, playbackException);
            }
        }

        public void onPlayerErrorChanged(AnalyticsListener.EventTime eventTime, PlaybackException playbackException) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 41;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventTime, "");
            Object[] objArr = new Object[1];
            Object obj = null;
            a(new int[]{0, 3, 53, 1}, true, null, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerError", String.valueOf(playbackException), (Throwable) null, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onNavigationEvent), getWrite.IAuthTabCallback("eventTime", Long.valueOf(eventTime.eventPlaybackPositionMs)), getWrite.IAuthTabCallback("eventType", "onPlayerErrorChanged"), getWrite.IAuthTabCallback("useCache", Boolean.valueOf(this.IAuthTabCallback)), getWrite.IAuthTabCallback("userAgent", this.onExtraCallbackWithResult)), 4, (Object) null);
            AnalyticsListener analyticsListener = this.onWarmupCompleted;
            if (analyticsListener != null) {
                int i4 = IAuthTabCallbackDefault + 27;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                analyticsListener.onPlayerErrorChanged(eventTime, playbackException);
                if (i5 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }

        private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
            char[] cArr;
            int i = 2 % 2;
            TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr2 = onExtraCallback;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 35282), Color.green(0) + 35, ExpandableListView.getPackedPositionType(j) + 14239, -884206168, false, "t", new Class[]{Integer.TYPE});
                        }
                        cArr3[i6] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
                        i6++;
                        int i7 = $10 + 75;
                        $11 = i7 % 128;
                        int i8 = i7 % 2;
                        j = 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr2 = cArr3;
            }
            char[] cArr4 = new char[i3];
            System.arraycopy(cArr2, i2, cArr4, 0, i3);
            if (bArr != null) {
                int i9 = $11 + 97;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 1;
                } else {
                    cArr = new char[i3];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                }
                char c = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i10 = $11 + 17;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                        int i12 = $10 + 25;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr3 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                            if (objOnExtraCallback2 == null) {
                                objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10934 - ((byte) KeyEvent.getModifierMetaStateMask())), 64 - ((byte) KeyEvent.getModifierMetaStateMask()), View.resolveSizeAndState(0, 0, 0) + 16718, -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            Object obj = null;
                            cArr[i13] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                            obj.hashCode();
                            throw null;
                        }
                        int i14 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr4 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                        if (objOnExtraCallback3 == null) {
                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 65, 16717 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i14] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                    } else {
                        int i15 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                        Object[] objArr5 = {Integer.valueOf(cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                        Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                        if (objOnExtraCallback4 == null) {
                            objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 29 - Gravity.getAbsoluteGravity(0, 0), TextUtils.lastIndexOf(_UrlKt.FRAGMENT_ENCODE_SET, '0') + 17658, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr[i15] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                    }
                    c = cArr[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                    Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49467 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 70, 12486 - Drawable.resolveOpacity(0, 0), 1993337549, false, "w", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback5).invoke(null, objArr6);
                }
                cArr4 = cArr;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr4, 0, cArr5, 0, i3);
                int i16 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr4, i16, i5);
                System.arraycopy(cArr5, i5, cArr4, 0, i16);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    int i17 = $11 + 83;
                    $10 = i17 % 128;
                    int i18 = i17 % 2;
                    cArr6[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr4[(i3 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
                cArr4 = cArr6;
            }
            if (i4 > 0) {
                trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i3) {
                    cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                    trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                }
            }
            objArr[0] = new String(cArr4);
        }

        public void onLoadError(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) throws Throwable {
            int i = 2 % 2;
            Intrinsics.checkNotNullParameter(eventTime, "");
            Intrinsics.checkNotNullParameter(loadEventInfo, "");
            Intrinsics.checkNotNullParameter(mediaLoadData, "");
            Intrinsics.checkNotNullParameter(iOException, "");
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 53, 1}, true, null, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerError", iOException.toString(), (Throwable) null, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onNavigationEvent), getWrite.IAuthTabCallback("eventTime", Long.valueOf(eventTime.eventPlaybackPositionMs)), getWrite.IAuthTabCallback("eventType", "onLoadError"), getWrite.IAuthTabCallback("wasCanceled", Boolean.valueOf(z)), getWrite.IAuthTabCallback("useCache", Boolean.valueOf(this.IAuthTabCallback)), getWrite.IAuthTabCallback("userAgent", this.onExtraCallbackWithResult)), 4, (Object) null);
            AnalyticsListener analyticsListener = this.onWarmupCompleted;
            if (analyticsListener != null) {
                int i2 = IAuthTabCallbackDefault + 75;
                asInterface = i2 % 128;
                int i3 = i2 % 2;
                analyticsListener.onLoadError(eventTime, loadEventInfo, mediaLoadData, iOException, z);
                int i4 = IAuthTabCallbackDefault + 35;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
            }
            int i6 = IAuthTabCallbackDefault + 3;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
        }

        public void onAudioSinkError(AnalyticsListener.EventTime eventTime, Exception exc) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 59;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventTime, "");
            Intrinsics.checkNotNullParameter(exc, "");
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 53, 1}, true, null, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerError", exc.toString(), (Throwable) null, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onNavigationEvent), getWrite.IAuthTabCallback("eventTime", Long.valueOf(eventTime.eventPlaybackPositionMs)), getWrite.IAuthTabCallback("eventType", "onAudioSinkError"), getWrite.IAuthTabCallback("useCache", Boolean.valueOf(this.IAuthTabCallback)), getWrite.IAuthTabCallback("userAgent", this.onExtraCallbackWithResult)), 4, (Object) null);
            AnalyticsListener analyticsListener = this.onWarmupCompleted;
            if (analyticsListener != null) {
                int i4 = IAuthTabCallbackDefault + 95;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                analyticsListener.onAudioSinkError(eventTime, exc);
                if (i5 == 0) {
                    int i6 = 29 / 0;
                }
            }
        }

        public void onAudioCodecError(AnalyticsListener.EventTime eventTime, Exception exc) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 27;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventTime, "");
            Intrinsics.checkNotNullParameter(exc, "");
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 53, 1}, true, null, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerError", exc.toString(), (Throwable) null, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onNavigationEvent), getWrite.IAuthTabCallback("eventTime", Long.valueOf(eventTime.eventPlaybackPositionMs)), getWrite.IAuthTabCallback("eventType", "onAudioCodecError"), getWrite.IAuthTabCallback("useCache", Boolean.valueOf(this.IAuthTabCallback)), getWrite.IAuthTabCallback("userAgent", this.onExtraCallbackWithResult)), 4, (Object) null);
            AnalyticsListener analyticsListener = this.onWarmupCompleted;
            if (analyticsListener != null) {
                int i4 = IAuthTabCallbackDefault + 107;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                analyticsListener.onAudioCodecError(eventTime, exc);
                if (i5 == 0) {
                    throw null;
                }
            }
        }

        public void onVideoCodecError(AnalyticsListener.EventTime eventTime, Exception exc) throws Throwable {
            int i = 2 % 2;
            int i2 = asInterface + 71;
            IAuthTabCallbackDefault = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventTime, "");
            Intrinsics.checkNotNullParameter(exc, "");
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 53, 1}, true, null, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerError", exc.toString(), (Throwable) null, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onNavigationEvent), getWrite.IAuthTabCallback("eventTime", Long.valueOf(eventTime.eventPlaybackPositionMs)), getWrite.IAuthTabCallback("eventType", "onVideoCodecError"), getWrite.IAuthTabCallback("useCache", Boolean.valueOf(this.IAuthTabCallback)), getWrite.IAuthTabCallback("userAgent", this.onExtraCallbackWithResult)), 4, (Object) null);
            AnalyticsListener analyticsListener = this.onWarmupCompleted;
            if (analyticsListener != null) {
                int i4 = asInterface + 99;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                analyticsListener.onVideoCodecError(eventTime, exc);
            }
        }

        public void onDrmSessionManagerError(AnalyticsListener.EventTime eventTime, Exception exc) throws Throwable {
            int i = 2 % 2;
            int i2 = IAuthTabCallbackDefault + 81;
            asInterface = i2 % 128;
            int i3 = i2 % 2;
            Intrinsics.checkNotNullParameter(eventTime, "");
            Intrinsics.checkNotNullParameter(exc, "");
            Object[] objArr = new Object[1];
            a(new int[]{0, 3, 53, 1}, true, null, objArr);
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerError", exc.toString(), (Throwable) null, access8000.IAuthTabCallbackStub(getWrite.IAuthTabCallback(((String) objArr[0]).intern(), this.onNavigationEvent), getWrite.IAuthTabCallback("eventTime", Long.valueOf(eventTime.eventPlaybackPositionMs)), getWrite.IAuthTabCallback("eventType", "onDrmSessionManagerError"), getWrite.IAuthTabCallback("useCache", Boolean.valueOf(this.IAuthTabCallback)), getWrite.IAuthTabCallback("userAgent", this.onExtraCallbackWithResult)), 4, (Object) null);
            AnalyticsListener analyticsListener = this.onWarmupCompleted;
            if (analyticsListener != null) {
                int i4 = asInterface + 35;
                IAuthTabCallbackDefault = i4 % 128;
                int i5 = i4 % 2;
                analyticsListener.onDrmSessionManagerError(eventTime, exc);
                if (i5 != 0) {
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void IAuthTabCallback(@NotNull ExoPlayer exoPlayer, @NotNull Context context, @NotNull String str, boolean z, @Nullable AnalyticsListener analyticsListener) {
        CacheDataSource.Factory factoryOnExtraCallback;
        HlsMediaSource.Factory factory;
        int i = 2 % 2;
        int i2 = getInterfaceDescriptor + Imgproc.COLOR_YUV2RGB_YVYU;
        asInterface = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(exoPlayer, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        HttpUrl httpUrl = (HttpUrl) getTcfVendorConsentStatus.Companion.IAuthTabCallbackStub().onWarmupCompleted().invoke(HttpUrl.Companion.get(str));
        Uri uri = Uri.parse(httpUrl.toString());
        String strOnExtraCallbackWithResult = onExtraCallbackWithResult(context);
        if (z) {
            int i4 = asInterface + 71;
            getInterfaceDescriptor = i4 % 128;
            int i5 = i4 % 2;
            factoryOnExtraCallback = onNavigationEvent(context);
        } else {
            factoryOnExtraCallback = onExtraCallback(context);
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            int i6 = getInterfaceDescriptor + 125;
            asInterface = i6 % 128;
            int i7 = i6 % 2;
            if (StringsKt__StringsKt.contains((CharSequence) lastPathSegment, (CharSequence) ".m3u8", true)) {
                factory = new HlsMediaSource.Factory(factoryOnExtraCallback);
            } else {
                HlsMediaSource.Factory factory2 = new ProgressiveMediaSource.Factory(factoryOnExtraCallback);
                int i8 = asInterface + 47;
                getInterfaceDescriptor = i8 % 128;
                int i9 = i8 % 2;
                factory = factory2;
            }
        }
        MediaSource mediaSourceCreateMediaSource = factory.createMediaSource(MediaItem.fromUri(httpUrl.toString()));
        Intrinsics.checkNotNullExpressionValue(mediaSourceCreateMediaSource, "");
        exoPlayer.addAnalyticsListener(new onExtraCallback(uri, z, strOnExtraCallbackWithResult, analyticsListener));
        ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayer", "setMediaSourceUri=" + uri + ", useCache=" + z + ", userAgent=" + strOnExtraCallbackWithResult, (Map) null, (String) null, false, (String) null, 60, (Object) null);
        exoPlayer.setMediaSource(mediaSourceCreateMediaSource);
    }

    public static /* synthetic */ ExoPlayer IAuthTabCallback(CommonModule_setSecureScreen commonModule_setSecureScreen, Context context, String str, LoadControl loadControl, Function1 function1, Function1 function12, int i, Object obj) {
        String str2;
        Function1 function13;
        int i2 = 2 % 2;
        if ((i & 2) != 0) {
            int i3 = getInterfaceDescriptor + 89;
            asInterface = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            str2 = null;
        } else {
            str2 = str;
        }
        LoadControl loadControl2 = (i & 4) != 0 ? null : loadControl;
        Function1 function14 = (i & 8) != 0 ? null : function1;
        if ((i & 16) != 0) {
            int i4 = getInterfaceDescriptor + 61;
            asInterface = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            function13 = null;
        } else {
            function13 = function12;
        }
        ExoPlayer exoPlayerOnWarmupCompleted = commonModule_setSecureScreen.onWarmupCompleted(context, str2, loadControl2, function14, function13);
        int i5 = asInterface + 27;
        getInterfaceDescriptor = i5 % 128;
        int i6 = i5 % 2;
        return exoPlayerOnWarmupCompleted;
    }

    public final ExoPlayer onWarmupCompleted(@NotNull Context context, @Nullable String str, @Nullable LoadControl loadControl, @Nullable Function1<? super ExoPlayer.Builder, Unit> function1, @Nullable Function1<? super ExoPlayer, Unit> function12) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        onWarmupCompleted(context);
        ExoPlayer.Builder builder = new ExoPlayer.Builder(context);
        if (loadControl != null) {
            builder.setLoadControl(loadControl);
        }
        if (function1 != null) {
            function1.invoke(builder);
        }
        ExoPlayer exoPlayerBuild = builder.build();
        Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "");
        if (function12 != null) {
            int i2 = asInterface + 23;
            getInterfaceDescriptor = i2 % 128;
            int i3 = i2 % 2;
            function12.invoke(exoPlayerBuild);
        }
        if (str != null) {
            Object[] objArr = {onWarmupCompleted, exoPlayerBuild, context, str, false, null, 12, null};
            onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
            int i4 = getInterfaceDescriptor + 1;
            asInterface = i4 % 128;
            int i5 = i4 % 2;
        }
        return exoPlayerBuild;
    }

    private static /* synthetic */ Object onExtraCallback(Object[] objArr) {
        Context context = (Context) objArr[1];
        Intrinsics.checkNotNullParameter(context, "");
        try {
            synchronized (onExtraCallback) {
                try {
                    Cache cache = IAuthTabCallback;
                    if (cache != null) {
                        cache.release();
                    }
                } catch (Throwable unused) {
                }
                IAuthTabCallback = null;
                Unit unit = Unit.INSTANCE;
            }
            File file = new File(context.getCacheDir(), "media_cache");
            if (file.exists()) {
                FilesKt__UtilsKt.deleteRecursively(file);
            }
            ConvertFloatArrayToByteArray.onExtraCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerUtil", "media cache cleared", (Map) null, (String) null, false, (String) null, 60, (Object) null);
            return null;
        } catch (Throwable th) {
            ConvertFloatArrayToByteArray.IAuthTabCallback(ConvertFloatArrayToByteArray.onExtraCallbackWithResult, "ExoPlayerUtil", "failed to clear cache: " + th.getMessage(), (Throwable) null, (Map) null, 12, (Object) null);
            return null;
        }
    }

    public static /* synthetic */ void onNavigationEvent(CommonModule_setSecureScreen commonModule_setSecureScreen, ExoPlayer exoPlayer, Context context, String str, boolean z, AnalyticsListener analyticsListener, int i, Object obj) {
        Object[] objArr = {commonModule_setSecureScreen, exoPlayer, context, str, Boolean.valueOf(z), analyticsListener, Integer.valueOf(i), obj};
        onExtraCallbackWithResult(168652932, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), -168652931, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), objArr, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), SpannedDataExternalSyntheticLambda0.IAuthTabCallback());
    }

    public final void IAuthTabCallback(@NotNull Context context) {
        int iIAuthTabCallback = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        int iIAuthTabCallback2 = SpannedDataExternalSyntheticLambda0.IAuthTabCallback();
        onExtraCallbackWithResult(-216885552, iIAuthTabCallback, 216885552, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), new Object[]{this, context}, SpannedDataExternalSyntheticLambda0.IAuthTabCallback(), iIAuthTabCallback2);
    }
}
