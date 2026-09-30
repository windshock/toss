package com.tnkfactory.ad.rwd;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.source.rtsp.MediaDescription;
import com.tnkfactory.ad.Logger;
import com.tnkfactory.ad.rwd.VideoAdView;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda8;
import o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import o.TextContextMenuHelperApi28ExternalSyntheticLambda4;

/* loaded from: /tmp/toss_alldex/classes19.dex */
public class VideoPlayView extends SurfaceView implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallback = 1;
    private static int[] onExtraCallback = {-872707058, -2110751570, -294400693, 966198842, -1124998030, 274443943, 1535747279, 1123448973, -1229329368, -19894081, -1069324326, -473576043, 62765634, -118863621, -1666960766, -2137058763, -1823082864, -562950436};
    private static int onWarmupCompleted;
    public MediaPlayer a;
    public final AudioManager b;
    public boolean c;
    public boolean d;
    public boolean e;
    public float f;
    public Object g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f53i;
    public int j;
    public String k;
    public VideoAdView.VideoPlayListener l;

    public VideoPlayView(Context context) {
        super(context);
        this.a = null;
        this.b = null;
        this.c = false;
        this.d = false;
        this.e = true;
        this.f = 0.5f;
        this.g = null;
        this.h = 0;
        this.f53i = 0;
        this.j = 0;
        this.k = null;
        this.l = null;
        getHolder().addCallback(this);
        this.b = (AudioManager) getContext().getSystemService(MediaDescription.MEDIA_TYPE_AUDIO);
    }

    public boolean isVolumeOn() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted;
        int i4 = i3 + 13;
        IAuthTabCallback = i4 % 128;
        int i5 = i4 % 2;
        boolean z = this.e;
        int i6 = i3 + 97;
        IAuthTabCallback = i6 % 128;
        int i7 = i6 % 2;
        return z;
    }

    public void setLooping(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 15;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.c = z;
        if (i5 != 0) {
            int i6 = 17 / 0;
        }
        int i7 = i4 + 11;
        IAuthTabCallback = i7 % 128;
        int i8 = i7 % 2;
    }

    public void setMediaPath(String str) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 21;
        onWarmupCompleted = i3 % 128;
        int i4 = i3 % 2;
        this.k = str;
        if (i4 != 0) {
            int i5 = 83 / 0;
        }
    }

    public void setMute(boolean z) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 99;
        onWarmupCompleted = i4 % 128;
        int i5 = i4 % 2;
        Object obj = null;
        this.d = z;
        if (i5 != 0) {
            throw null;
        }
        int i6 = i3 + 47;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public void setVideoPlayListener(VideoAdView.VideoPlayListener videoPlayListener) {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback + 45;
        int i4 = i3 % 128;
        onWarmupCompleted = i4;
        int i5 = i3 % 2;
        this.l = videoPlayListener;
        if (i5 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i6 = i4 + 23;
        IAuthTabCallback = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 8 / 0;
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
        int i5 = 2 % 2;
        int i6 = IAuthTabCallback + 73;
        onWarmupCompleted = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00d6 A[Catch: IOException -> 0x00fe, all -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:31:0x00d6, B:43:0x00fa, B:44:0x00fd, B:39:0x00f1), top: B:52:0x0001 }] */
    @Override // android.view.SurfaceHolder.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        FileInputStream fileInputStream;
        Throwable th;
        synchronized (this) {
            if (this.k != null && this.a == null) {
                FileInputStream fileInputStream2 = null;
                try {
                    try {
                        try {
                            MediaPlayer mediaPlayer = new MediaPlayer();
                            this.a = mediaPlayer;
                            mediaPlayer.setDisplay(getHolder());
                            this.a.setScreenOnWhilePlaying(true);
                            if (this.d || !this.e) {
                                this.e = false;
                                this.f = 0.0f;
                                this.a.setVolume(0.0f, 0.0f);
                            } else {
                                this.e = true;
                                this.f = getCurrentVolume();
                            }
                            this.a.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build());
                            this.a.setOnBufferingUpdateListener(new z(this));
                            this.a.setOnPreparedListener(this);
                            this.a.setOnCompletionListener(this);
                            this.a.setOnVideoSizeChangedListener(this);
                            this.a.setOnBufferingUpdateListener(new a0(this));
                            if (this.k.startsWith("http://")) {
                                this.a.setDataSource(this.k);
                                this.a.prepareAsync();
                                this.h = 1;
                                if (fileInputStream2 != null) {
                                }
                            } else {
                                String str = this.k;
                                Object[] objArr = new Object[1];
                                m(new int[]{96566399, 1513488992, 1278183092, -686770189}, Color.red(0) + 8, objArr);
                                if (str.startsWith(((String) objArr[0]).intern())) {
                                    this.a.setDataSource(this.k);
                                    this.a.prepareAsync();
                                    this.h = 1;
                                    if (fileInputStream2 != null) {
                                        fileInputStream2.close();
                                    }
                                } else {
                                    fileInputStream = new FileInputStream(this.k);
                                    try {
                                        this.a.setDataSource(fileInputStream.getFD());
                                        fileInputStream2 = fileInputStream;
                                        this.a.prepareAsync();
                                        this.h = 1;
                                        if (fileInputStream2 != null) {
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        fileInputStream2 = fileInputStream;
                                        Logger.e("video_ad_media_player_failure" + e);
                                        if (fileInputStream2 != null) {
                                            fileInputStream2.close();
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileInputStream != null) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException unused) {
                                            }
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                    } catch (Throwable th3) {
                        fileInputStream = fileInputStream2;
                        th = th3;
                    }
                } catch (IOException unused2) {
                }
            }
        }
    }

    private float getCurrentVolume() {
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 63;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        float streamVolume = this.b.getStreamVolume(3) / this.b.getStreamMaxVolume(3);
        int i5 = onWarmupCompleted + 101;
        IAuthTabCallback = i5 % 128;
        if (i5 % 2 != 0) {
            return streamVolume;
        }
        throw null;
    }

    public int getPlaySeekTime() {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallback;
        int i4 = i3 + 63;
        onWarmupCompleted = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null) {
            return -1;
        }
        int i5 = i3 + 41;
        onWarmupCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            mediaPlayer.getCurrentPosition();
            obj.hashCode();
            throw null;
        }
        int currentPosition = mediaPlayer.getCurrentPosition();
        int i6 = IAuthTabCallback + 13;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
        return currentPosition;
    }

    public int getPlayTimeLeft() {
        int i2 = 2 % 2;
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer == null) {
            int i3 = IAuthTabCallback + 107;
            onWarmupCompleted = i3 % 128;
            int i4 = i3 % 2;
            return -1;
        }
        int i5 = onWarmupCompleted + 95;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
        int duration = mediaPlayer.getDuration();
        int currentPosition = this.a.getCurrentPosition();
        return i6 == 0 ? duration >> currentPosition : duration - currentPosition;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
        int i2 = 2 % 2;
        this.h = 2;
        this.a.seekTo(0);
        VideoAdView.VideoPlayListener videoPlayListener = this.l;
        if (videoPlayListener != null) {
            videoPlayListener.onPrepare();
            int i3 = onWarmupCompleted + 3;
            IAuthTabCallback = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = onWarmupCompleted + 79;
        IAuthTabCallback = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = IAuthTabCallback + 51;
        onWarmupCompleted = i5 % 128;
        int i6 = i5 % 2;
        this.f53i = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.j = videoHeight;
        if (this.f53i != 0) {
            int i7 = IAuthTabCallback + 103;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            int i9 = i7 % 2;
            if (videoHeight != 0) {
                int i10 = i8 + 85;
                IAuthTabCallback = i10 % 128;
                int i11 = i10 % 2;
                getHolder().setFixedSize(this.f53i, this.j);
                requestLayout();
                VideoAdView.VideoPlayListener videoPlayListener = this.l;
                if (videoPlayListener != null) {
                    videoPlayListener.onSize(this.f53i, this.j);
                    int i12 = onWarmupCompleted + 79;
                    IAuthTabCallback = i12 % 128;
                    int i13 = i12 % 2;
                }
            }
        }
    }

    public void pauseVideo() {
        int i2 = 2 % 2;
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            this.h = 4;
            if (mediaPlayer.isPlaying()) {
                this.a.pause();
                int i3 = IAuthTabCallback + 97;
                onWarmupCompleted = i3 % 128;
                int i4 = i3 % 2;
            }
            VideoAdView.VideoPlayListener videoPlayListener = this.l;
            if (videoPlayListener != null) {
                int i5 = IAuthTabCallback + 9;
                onWarmupCompleted = i5 % 128;
                int i6 = i5 % 2;
                int currentPosition = this.a.getCurrentPosition();
                if (i6 == 0) {
                    videoPlayListener.onPause(currentPosition);
                } else {
                    videoPlayListener.onPause(currentPosition);
                    throw null;
                }
            }
        }
    }

    public void setVolumeOn(boolean z) {
        int i2 = 2 % 2;
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null && !this.d) {
            int i3 = IAuthTabCallback;
            int i4 = i3 + 125;
            onWarmupCompleted = i4 % 128;
            Object obj = null;
            if (i4 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            if (this.e != z) {
                int i5 = i3 + 109;
                onWarmupCompleted = i5 % 128;
                if (i5 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                if (z) {
                    float f = this.f;
                    mediaPlayer.setVolume(f, f);
                    this.e = true;
                    return;
                } else {
                    this.f = getCurrentVolume();
                    this.a.setVolume(0.0f, 0.0f);
                    this.e = false;
                }
            }
        }
        int i6 = IAuthTabCallback + 115;
        onWarmupCompleted = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        int i2 = 2 % 2;
        Object obj = null;
        if (this.a != null) {
            int i3 = onWarmupCompleted + 33;
            IAuthTabCallback = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            VideoAdView.VideoPlayListener videoPlayListener = this.l;
            if (videoPlayListener != null) {
                videoPlayListener.onRelease();
            }
            this.a.reset();
            this.a.release();
            this.a = null;
        }
        if (this.d) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            int i4 = onWarmupCompleted;
            int i5 = i4 + 45;
            IAuthTabCallback = i5 % 128;
            if (i5 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            Object obj2 = this.g;
            if (obj2 != null) {
                int i6 = i4 + 65;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                this.b.abandonAudioFocusRequest(TextContextMenuHelperApi28ExternalSyntheticLambda4.nr_(obj2));
                return;
            }
        }
        this.b.abandonAudioFocus(null);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
        Object obj;
        int i2 = 2 % 2;
        int i3 = onWarmupCompleted + 31;
        IAuthTabCallback = i3 % 128;
        int i4 = i3 % 2;
        if (!this.d) {
            if (Build.VERSION.SDK_INT < 26 || (obj = this.g) == null) {
                this.b.abandonAudioFocus(null);
            } else {
                this.b.abandonAudioFocusRequest(TextContextMenuHelperApi28ExternalSyntheticLambda4.nr_(obj));
            }
        }
        this.h = 5;
        VideoAdView.VideoPlayListener videoPlayListener = this.l;
        if (videoPlayListener != null) {
            videoPlayListener.onCompletion();
            int i5 = onWarmupCompleted + 75;
            IAuthTabCallback = i5 % 128;
            int i6 = i5 % 2;
        }
        if (this.c) {
            int i7 = IAuthTabCallback + 11;
            int i8 = i7 % 128;
            onWarmupCompleted = i8;
            int i9 = i7 % 2;
            MediaPlayer mediaPlayer2 = this.a;
            if (mediaPlayer2 != null) {
                int i10 = i8 + 111;
                IAuthTabCallback = i10 % 128;
                if (i10 % 2 == 0) {
                    mediaPlayer2.start();
                } else {
                    mediaPlayer2.start();
                }
                this.a.seekTo(0);
            }
        }
    }

    public void startVideo() {
        int i2;
        int i3 = 2 % 2;
        if (this.a != null) {
            int i4 = onWarmupCompleted + 73;
            int i5 = i4 % 128;
            IAuthTabCallback = i5;
            if (i4 % 2 == 0) {
                i2 = this.h;
                int i6 = 1 / 0;
                if (i2 == 0) {
                    return;
                }
            } else {
                i2 = this.h;
                if (i2 == 0) {
                    return;
                }
            }
            if (i2 != 1) {
                this.h = 3;
                if (!this.d) {
                    int i7 = i5 + 39;
                    onWarmupCompleted = i7 % 128;
                    int i8 = i7 % 2;
                    if (Build.VERSION.SDK_INT >= 26) {
                        AudioFocusRequest audioFocusRequestBuild = CoreTextFieldSemanticsModifierNodeExternalSyntheticLambda8.nu_(1).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(3).build()).build();
                        this.g = audioFocusRequestBuild;
                        this.b.requestAudioFocus(audioFocusRequestBuild);
                    } else {
                        this.b.requestAudioFocus(null, 3, 1);
                    }
                }
                this.a.start();
                VideoAdView.VideoPlayListener videoPlayListener = this.l;
                if (videoPlayListener != null) {
                    videoPlayListener.onPlay(this.a.getDuration());
                }
            }
        }
    }

    private static void m(int[] iArr, int i2, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        SimpleBasePlayerPositionSupplierExternalSyntheticLambda0 simpleBasePlayerPositionSupplierExternalSyntheticLambda0 = new SimpleBasePlayerPositionSupplierExternalSyntheticLambda0();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = onExtraCallback;
        int i5 = -1469660336;
        long j = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                int i7 = $11 + 115;
                $10 = i7 % 128;
                if (i7 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                        Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback == null) {
                            objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AndroidCharacter.getMirror('0') - '0'), 73 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), 8847 - ExpandableListView.getPackedPositionChild(j), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objOnExtraCallback).invoke(null, objArr2)).intValue();
                        i6 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(iArr3[i6])};
                        Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1469660336);
                        if (objOnExtraCallback2 == null) {
                            objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (Color.rgb(0, 0, 0) + 16777216), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 71, 8848 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1725547072, false, "h", new Class[]{Integer.TYPE});
                        }
                        iArr4[i6] = ((Integer) ((Method) objOnExtraCallback2).invoke(null, objArr3)).intValue();
                        i6++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                j = 0;
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = onExtraCallback;
        if (iArr6 != null) {
            int i8 = $10 + 95;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 105;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                Object[] objArr4 = {Integer.valueOf(iArr6[i9])};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(i5);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 72 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.alpha(0) + 8848, -1725547072, false, "h", new Class[]{Integer.TYPE});
                }
                iArr2[i9] = ((Integer) ((Method) objOnExtraCallback3).invoke(null, objArr4)).intValue();
                i9++;
                i5 = -1469660336;
            }
            iArr6 = iArr2;
        }
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback < iArr.length) {
            int i12 = $11 + 73;
            $10 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback] >> 16);
            cArr[1] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback];
            cArr[2] = (char) (iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1] >> 16);
            cArr[3] = (char) iArr[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback + 1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = (cArr[0] << 16) + cArr[1];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = (cArr[2] << 16) + cArr[3];
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $10 + 69;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i14];
                    Object[] objArr5 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (22253 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getEdgeSlop() >> 16) + 39, 10300 - ExpandableListView.getPackedPositionChild(0L), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objOnExtraCallback4).invoke(null, objArr5)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue;
                    i14 += 117;
                } else {
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[i14];
                    Object[] objArr6 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, Integer.valueOf(SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.onExtraCallback(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent)), simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
                    Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1654430995);
                    if (objOnExtraCallback5 == null) {
                        objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (View.resolveSizeAndState(0, 0, 0) + 22252), 39 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 10301 - TextUtils.getOffsetBefore("", 0), -1406952323, false, "j", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objOnExtraCallback5).invoke(null, objArr6)).intValue();
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
                    simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = iIntValue2;
                    i14++;
                }
            }
            int i17 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted = i17;
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted ^= iArr5[16];
            simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent ^= iArr5[17];
            int i18 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            int i19 = simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            cArr[0] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent >>> 16);
            cArr[1] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onNavigationEvent;
            cArr[2] = (char) (simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted >>> 16);
            cArr[3] = (char) simpleBasePlayerPositionSupplierExternalSyntheticLambda0.onWarmupCompleted;
            SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback(iArr5);
            cArr2[simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2] = cArr[0];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 1] = cArr[1];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 2] = cArr[2];
            cArr2[(simpleBasePlayerPositionSupplierExternalSyntheticLambda0.IAuthTabCallback * 2) + 3] = cArr[3];
            Object[] objArr7 = {simpleBasePlayerPositionSupplierExternalSyntheticLambda0, simpleBasePlayerPositionSupplierExternalSyntheticLambda0};
            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1103701027);
            if (objOnExtraCallback6 == null) {
                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (4033 - ExpandableListView.getPackedPositionGroup(0L)), 79 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 7397, 1888082611, false, "f", new Class[]{Object.class, Object.class});
            }
            ((Method) objOnExtraCallback6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2, 0, i2);
    }
}
