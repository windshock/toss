package im.toss.rn.toss.core.bridge.module.storage;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.AsyncTask;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o.BackgroundThreadStateHandlerExternalSyntheticLambda0;
import o.MaxFullscreenAdImplc;
import o.MaxFullscreenAdImpld;
import o.TimelineExternalSyntheticLambda1;
import o.TrackGroupExternalSyntheticLambda0;
import o.setLocalExtraParameter;
import o.setNativeAdListener;

@ReactModule(IAuthTabCallback = AsyncStorageModule.NAME)
/* loaded from: /tmp/toss_alldex/classes11.dex */
public final class AsyncStorageModule extends NativeAsyncStorageModuleSpec implements LifecycleEventListener {
    private static final int MAX_SQL_KEYS = 999;
    public static final String NAME = "RNCAsyncStorage";
    private static int onExtraCallbackWithResult = 0;
    private static int onNavigationEvent = 1;
    private final setLocalExtraParameter executor;
    private ReactDatabaseSupplier mReactDatabaseSupplier;
    private boolean mShuttingDown;

    /* renamed from: -$$Nest$fgetmReactDatabaseSupplier, reason: not valid java name */
    static /* synthetic */ ReactDatabaseSupplier m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule asyncStorageModule) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 5;
        int i3 = i2 % 128;
        onNavigationEvent = i3;
        int i4 = i2 % 2;
        ReactDatabaseSupplier reactDatabaseSupplier = asyncStorageModule.mReactDatabaseSupplier;
        int i5 = i3 + 105;
        onExtraCallbackWithResult = i5 % 128;
        int i6 = i5 % 2;
        return reactDatabaseSupplier;
    }

    /* renamed from: -$$Nest$mensureDatabase, reason: not valid java name */
    static /* synthetic */ boolean m8$$Nest$mensureDatabase(AsyncStorageModule asyncStorageModule) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 7;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return asyncStorageModule.ensureDatabase();
        }
        asyncStorageModule.ensureDatabase();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onHostPause() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 75;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onHostResume() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 123;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    public AsyncStorageModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, AsyncTask.THREAD_POOL_EXECUTOR);
    }

    AsyncStorageModule(ReactApplicationContext reactApplicationContext, Executor executor) throws Throwable {
        super(reactApplicationContext);
        this.mShuttingDown = false;
        setNativeAdListener.onExtraCallback((Context) reactApplicationContext);
        this.executor = new setLocalExtraParameter(executor);
        reactApplicationContext.addLifecycleEventListener(this);
        this.mReactDatabaseSupplier = ReactDatabaseSupplier.onNavigationEvent(reactApplicationContext);
    }

    public String getName() {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 15;
        onNavigationEvent = i2 % 128;
        if (i2 % 2 != 0) {
            return NAME;
        }
        int i3 = 61 / 0;
        return NAME;
    }

    public void initialize() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 99;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            super/*com.facebook.react.bridge.BaseJavaModule*/.initialize();
            this.mShuttingDown = true;
        } else {
            super/*com.facebook.react.bridge.BaseJavaModule*/.initialize();
            this.mShuttingDown = false;
        }
        int i3 = onExtraCallbackWithResult + 87;
        onNavigationEvent = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
    }

    public void onCatalystInstanceDestroy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 59;
        onExtraCallbackWithResult = i2 % 128;
        this.mShuttingDown = i2 % 2 == 0;
    }

    public void clearSensitiveData() throws RuntimeException {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 33;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        this.mReactDatabaseSupplier.IAuthTabCallback();
        int i4 = onNavigationEvent + 125;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onHostDestroy() {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 37;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        this.mReactDatabaseSupplier.onWarmupCompleted();
        int i4 = onNavigationEvent + 61;
        onExtraCallbackWithResult = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // im.toss.rn.toss.core.bridge.module.storage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiGet(final ReadableArray readableArray, final Callback callback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult;
        int i3 = i2 + 115;
        onNavigationEvent = i3 % 128;
        int i4 = i3 % 2;
        if (readableArray != null) {
            new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.4
                private static final byte[] $$a = {74, 75, -50, -9};
                private static final int $$b = 70;
                private static int $10 = 0;
                private static int $11 = 1;
                private static int asInterface = 0;
                private static int IAuthTabCallbackDefault = 1;
                private static char[] IAuthTabCallback = {25209, 20464, 14693, 61270, 49862, 46146, 26560, 22873};
                private static long onExtraCallback = 2414983551374704723L;

                /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private static String $$c(int i5, int i6, short s) {
                    int i7;
                    int i8;
                    int i9 = 1 - (s * 4);
                    int i10 = 3 - (i6 * 3);
                    byte[] bArr = $$a;
                    int i11 = (i5 * 2) + 97;
                    byte[] bArr2 = new byte[i9];
                    if (bArr == null) {
                        int i12 = i9;
                        i8 = 0;
                        i11 += i12;
                        i7 = i8;
                        i8 = i7 + 1;
                        bArr2[i7] = (byte) i11;
                        i10++;
                        if (i8 == i9) {
                            return new String(bArr2, 0);
                        }
                        i12 = bArr[i10];
                        i11 += i12;
                        i7 = i8;
                        i8 = i7 + 1;
                        bArr2[i7] = (byte) i11;
                        i10++;
                        if (i8 == i9) {
                        }
                    } else {
                        i7 = 0;
                        i8 = i7 + 1;
                        bArr2[i7] = (byte) i11;
                        i10++;
                        if (i8 == i9) {
                        }
                    }
                }

                private static void a(int i5, int i6, char c, Object[] objArr) throws Throwable {
                    int i7 = 2 % 2;
                    TimelineExternalSyntheticLambda1 timelineExternalSyntheticLambda1 = new TimelineExternalSyntheticLambda1();
                    long[] jArr = new long[i6];
                    timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                    while (timelineExternalSyntheticLambda1.IAuthTabCallback < i6) {
                        int i8 = $11 + 67;
                        $10 = i8 % 128;
                        if (i8 % 2 != 0) {
                            int i9 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                            try {
                                Object[] objArr2 = {Integer.valueOf(IAuthTabCallback[i5 * i9])};
                                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                                if (objOnExtraCallback == null) {
                                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (59697 - View.MeasureSpec.makeMeasureSpec(0, 0)), 17 - Gravity.getAbsoluteGravity(0, 0), Drawable.resolveOpacity(0, 0) + 10973, 919452672, false, "c", new Class[]{Integer.TYPE});
                                }
                                try {
                                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue()), Long.valueOf(i9), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                                    Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                                    if (objOnExtraCallback2 == null) {
                                        objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (46133 - TextUtils.lastIndexOf("", '0', 0, 0)), TextUtils.getCapsMode("", 0, 0) + 31, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                                    }
                                    jArr[i9] = ((Long) ((Method) objOnExtraCallback2).invoke(null, objArr3)).longValue();
                                    try {
                                        Object[] objArr4 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                                        Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                                        if (objOnExtraCallback3 == null) {
                                            byte b = (byte) 0;
                                            byte b2 = b;
                                            objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - KeyEvent.getDeadChar(0, 0)), 44 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 1493 - TextUtils.indexOf((CharSequence) "", '0'), -1657859959, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                                        }
                                        ((Method) objOnExtraCallback3).invoke(null, objArr4);
                                    } catch (Throwable th) {
                                        Throwable cause = th.getCause();
                                        if (cause == null) {
                                            throw th;
                                        }
                                        throw cause;
                                    }
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        } else {
                            int i10 = timelineExternalSyntheticLambda1.IAuthTabCallback;
                            Object[] objArr5 = {Integer.valueOf(IAuthTabCallback[i5 + i10])};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(126698128);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 59698), 17 - (ViewConfiguration.getJumpTapTimeout() >> 16), 10973 - (ViewConfiguration.getWindowTouchSlop() >> 8), 919452672, false, "c", new Class[]{Integer.TYPE});
                            }
                            Object[] objArr6 = {Long.valueOf(((Long) ((Method) objOnExtraCallback4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(onExtraCallback), Integer.valueOf(c)};
                            Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1261318896);
                            if (objOnExtraCallback5 == null) {
                                objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (ExpandableListView.getPackedPositionGroup(0L) + 46134), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 31, (KeyEvent.getMaxKeyCode() >> 16) + 20220, -2054081664, false, "b", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                            }
                            jArr[i10] = ((Long) ((Method) objOnExtraCallback5).invoke(null, objArr6)).longValue();
                            Object[] objArr7 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback6 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                objOnExtraCallback6 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.getCapsMode("", 0, 0)), Color.rgb(0, 0, 0) + 16777260, 1494 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1657859959, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback6).invoke(null, objArr7);
                        }
                        int i11 = $11 + 17;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                    }
                    char[] cArr = new char[i6];
                    timelineExternalSyntheticLambda1.IAuthTabCallback = 0;
                    while (timelineExternalSyntheticLambda1.IAuthTabCallback < i6) {
                        int i13 = $11 + 51;
                        $10 = i13 % 128;
                        if (i13 % 2 != 0) {
                            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                            Object[] objArr8 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback7 == null) {
                                byte b5 = (byte) 0;
                                byte b6 = b5;
                                objOnExtraCallback7 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - TextUtils.indexOf("", "", 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44, Color.blue(0) + 1494, -1657859959, false, $$c(b5, b6, b6), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback7).invoke(null, objArr8);
                            int i14 = 77 / 0;
                        } else {
                            cArr[timelineExternalSyntheticLambda1.IAuthTabCallback] = (char) jArr[timelineExternalSyntheticLambda1.IAuthTabCallback];
                            Object[] objArr9 = {timelineExternalSyntheticLambda1, timelineExternalSyntheticLambda1};
                            Object objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-1401950695);
                            if (objOnExtraCallback8 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = b7;
                                objOnExtraCallback8 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (49123 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 45 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 1494, -1657859959, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                            }
                            ((Method) objOnExtraCallback8).invoke(null, objArr9);
                        }
                    }
                    objArr[0] = new String(cArr);
                }

                public /* synthetic */ void doInBackgroundGuarded(Object[] objArr) throws Throwable {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallbackDefault + 113;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    IAuthTabCallback((Void[]) objArr);
                    int i8 = asInterface + 99;
                    IAuthTabCallbackDefault = i8 % 128;
                    if (i8 % 2 == 0) {
                        int i9 = 62 / 0;
                    }
                }

                protected void IAuthTabCallback(Void... voidArr) throws Throwable {
                    int i5 = 2 % 2;
                    int i6 = IAuthTabCallbackDefault + 77;
                    asInterface = i6 % 128;
                    int i7 = i6 % 2;
                    if (!AsyncStorageModule.m8$$Nest$mensureDatabase(AsyncStorageModule.this)) {
                        int i8 = asInterface + 31;
                        IAuthTabCallbackDefault = i8 % 128;
                        int i9 = i8 % 2;
                        callback.invoke(new Object[]{MaxFullscreenAdImplc.onWarmupCompleted((String) null), null});
                        return;
                    }
                    Object[] objArr = new Object[1];
                    a(ViewConfiguration.getLongPressTimeout() >> 16, 2 - TextUtils.lastIndexOf("", '0', 0, 0), (char) (36806 - TextUtils.getOffsetAfter("", 0)), objArr);
                    String strIntern = ((String) objArr[0]).intern();
                    Object[] objArr2 = new Object[1];
                    a((Process.myTid() >> 22) + 3, 6 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 756), objArr2);
                    String[] strArr = {strIntern, ((String) objArr2[0]).intern()};
                    HashSet hashSet = new HashSet();
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    int i10 = 0;
                    while (i10 < readableArray.size()) {
                        int i11 = IAuthTabCallbackDefault + 79;
                        asInterface = i11 % 128;
                        int i12 = i11 % 2;
                        int iMin = Math.min(readableArray.size() - i10, AsyncStorageModule.MAX_SQL_KEYS);
                        int i13 = i10;
                        Cursor cursorQuery = AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule.this).onExtraCallbackWithResult().query("catalystLocalStorage", strArr, MaxFullscreenAdImpld.onExtraCallbackWithResult(iMin), MaxFullscreenAdImpld.onExtraCallback(readableArray, i10, iMin), null, null, null);
                        hashSet.clear();
                        try {
                            try {
                                if (cursorQuery.getCount() != readableArray.size()) {
                                    int i14 = IAuthTabCallbackDefault + 61;
                                    asInterface = i14 % 128;
                                    int i15 = i14 % 2;
                                    for (int i16 = i13; i16 < i13 + iMin; i16++) {
                                        int i17 = IAuthTabCallbackDefault + 77;
                                        asInterface = i17 % 128;
                                        int i18 = i17 % 2;
                                        hashSet.add(readableArray.getString(i16));
                                    }
                                }
                                if (cursorQuery.moveToFirst()) {
                                    do {
                                        WritableArray writableArrayCreateArray2 = Arguments.createArray();
                                        writableArrayCreateArray2.pushString(cursorQuery.getString(0));
                                        writableArrayCreateArray2.pushString(cursorQuery.getString(1));
                                        writableArrayCreateArray.pushArray(writableArrayCreateArray2);
                                        hashSet.remove(cursorQuery.getString(0));
                                    } while (cursorQuery.moveToNext());
                                }
                                cursorQuery.close();
                                Iterator it = hashSet.iterator();
                                while (!(!it.hasNext())) {
                                    int i19 = asInterface + 105;
                                    IAuthTabCallbackDefault = i19 % 128;
                                    if (i19 % 2 == 0) {
                                        String str = (String) it.next();
                                        WritableArray writableArrayCreateArray3 = Arguments.createArray();
                                        writableArrayCreateArray3.pushString(str);
                                        writableArrayCreateArray3.pushNull();
                                        writableArrayCreateArray.pushArray(writableArrayCreateArray3);
                                        Object obj = null;
                                        obj.hashCode();
                                        throw null;
                                    }
                                    String str2 = (String) it.next();
                                    WritableArray writableArrayCreateArray4 = Arguments.createArray();
                                    writableArrayCreateArray4.pushString(str2);
                                    writableArrayCreateArray4.pushNull();
                                    writableArrayCreateArray.pushArray(writableArrayCreateArray4);
                                }
                                hashSet.clear();
                                i10 = i13 + AsyncStorageModule.MAX_SQL_KEYS;
                            } catch (Exception e) {
                                e.getMessage();
                                callback.invoke(new Object[]{MaxFullscreenAdImplc.onNavigationEvent((String) null, e.getMessage()), null});
                                cursorQuery.close();
                                int i20 = asInterface + 61;
                                IAuthTabCallbackDefault = i20 % 128;
                                int i21 = i20 % 2;
                                return;
                            }
                        } catch (Throwable th) {
                            cursorQuery.close();
                            throw th;
                        }
                    }
                    callback.invoke(new Object[]{null, writableArrayCreateArray});
                }
            }.executeOnExecutor(this.executor, new Void[0]);
            return;
        }
        int i5 = i2 + 51;
        onNavigationEvent = i5 % 128;
        if (i5 % 2 != 0) {
            callback.invoke(new Object[]{MaxFullscreenAdImplc.IAuthTabCallback((String) null), null});
            return;
        }
        Object[] objArr = new Object[2];
        objArr[1] = MaxFullscreenAdImplc.IAuthTabCallback((String) null);
        objArr[1] = null;
        callback.invoke(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        new im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass5(r4, getReactApplicationContext()).executeOnExecutor(r4.executor, new java.lang.Void[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r5.size() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r5.size() == 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r5 = im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.onExtraCallbackWithResult + 37;
        im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.onNavigationEvent = r5 % 128;
        r5 = r5 % 2;
        r6.invoke(new java.lang.Object[0]);
     */
    @Override // im.toss.rn.toss.core.bridge.module.storage.NativeAsyncStorageModuleSpec
    @ReactMethod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void multiSet(final ReadableArray readableArray, final Callback callback) {
        int i = 2 % 2;
        int i2 = onNavigationEvent + 107;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
    }

    @Override // im.toss.rn.toss.core.bridge.module.storage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiRemove(final ReadableArray readableArray, final Callback callback) {
        int i = 2 % 2;
        int i2 = onExtraCallbackWithResult + 17;
        onNavigationEvent = i2 % 128;
        int i3 = i2 % 2;
        if (readableArray.size() == 0) {
            int i4 = onExtraCallbackWithResult + 45;
            onNavigationEvent = i4 % 128;
            if (i4 % 2 == 0) {
                callback.invoke(new Object[1]);
                return;
            } else {
                callback.invoke(new Object[0]);
                return;
            }
        }
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.3
            private static int IAuthTabCallback = 0;
            private static int onExtraCallback = 1;

            public /* synthetic */ void doInBackgroundGuarded(Object[] objArr) {
                int i5 = 2 % 2;
                int i6 = onExtraCallback + 61;
                IAuthTabCallback = i6 % 128;
                int i7 = i6 % 2;
                onWarmupCompleted((Void[]) objArr);
                int i8 = onExtraCallback + 3;
                IAuthTabCallback = i8 % 128;
                int i9 = i8 % 2;
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void onWarmupCompleted(Void... voidArr) {
                String message;
                int i5 = 2 % 2;
                WritableMap writableMapOnNavigationEvent = null;
                if (!AsyncStorageModule.m8$$Nest$mensureDatabase(AsyncStorageModule.this)) {
                    int i6 = IAuthTabCallback + 71;
                    onExtraCallback = i6 % 128;
                    int i7 = i6 % 2;
                    callback.invoke(new Object[]{MaxFullscreenAdImplc.onWarmupCompleted((String) null)});
                    return;
                }
                try {
                    try {
                        AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule.this).onExtraCallbackWithResult().beginTransaction();
                        for (int i8 = 0; i8 < readableArray.size(); i8 += AsyncStorageModule.MAX_SQL_KEYS) {
                            int iMin = Math.min(readableArray.size() - i8, AsyncStorageModule.MAX_SQL_KEYS);
                            AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule.this).onExtraCallbackWithResult().delete("catalystLocalStorage", MaxFullscreenAdImpld.onExtraCallbackWithResult(iMin), MaxFullscreenAdImpld.onExtraCallback(readableArray, i8, iMin));
                        }
                        AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule.this).onExtraCallbackWithResult().setTransactionSuccessful();
                        try {
                            AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule.this).onExtraCallbackWithResult().endTransaction();
                        } catch (Exception e) {
                            e.getMessage();
                            message = e.getMessage();
                            writableMapOnNavigationEvent = MaxFullscreenAdImplc.onNavigationEvent((String) null, message);
                            if (writableMapOnNavigationEvent == null) {
                            }
                        }
                    } catch (Exception e2) {
                        e2.getMessage();
                        WritableMap writableMapOnNavigationEvent2 = MaxFullscreenAdImplc.onNavigationEvent((String) null, e2.getMessage());
                        try {
                            AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule.this).onExtraCallbackWithResult().endTransaction();
                        } catch (Exception e3) {
                            e3.getMessage();
                            if (writableMapOnNavigationEvent2 == null) {
                                message = e3.getMessage();
                                writableMapOnNavigationEvent = MaxFullscreenAdImplc.onNavigationEvent((String) null, message);
                                if (writableMapOnNavigationEvent == null) {
                                }
                            }
                        }
                        writableMapOnNavigationEvent = writableMapOnNavigationEvent2;
                    }
                    if (writableMapOnNavigationEvent == null) {
                        callback.invoke(new Object[0]);
                        return;
                    }
                    callback.invoke(new Object[]{writableMapOnNavigationEvent});
                    int i9 = IAuthTabCallback + 49;
                    onExtraCallback = i9 % 128;
                    int i10 = i9 % 2;
                } catch (Throwable th) {
                    try {
                        AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule.this).onExtraCallbackWithResult().endTransaction();
                    } catch (Exception e4) {
                        e4.getMessage();
                        MaxFullscreenAdImplc.onNavigationEvent((String) null, e4.getMessage());
                    }
                    throw th;
                }
            }
        }.executeOnExecutor(this.executor, new Void[0]);
    }

    @Override // im.toss.rn.toss.core.bridge.module.storage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void multiMerge(final ReadableArray readableArray, final Callback callback) {
        int i = 2 % 2;
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.1
            private static int IAuthTabCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ void doInBackgroundGuarded(Object[] objArr) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 29;
                IAuthTabCallback = i3 % 128;
                Void[] voidArr = (Void[]) objArr;
                if (i3 % 2 == 0) {
                    IAuthTabCallback(voidArr);
                } else {
                    IAuthTabCallback(voidArr);
                    int i4 = 78 / 0;
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:114:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:115:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:116:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:?, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
            
                if (r0 >= r4.size()) goto L111;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
            
                if (r4.getArray(r0).size() == 2) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
            
                r0 = im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.IAuthTabCallback + 19;
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.onExtraCallbackWithResult = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
            
                if ((r0 % 2) == 0) goto L21;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
            
                o.MaxFullscreenAdImplc.onNavigationEvent((java.lang.String) null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().endTransaction();
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                o.MaxFullscreenAdImplc.onNavigationEvent((java.lang.String) null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().endTransaction();
             */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
            
                throw null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
            
                r0.getMessage();
             */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
            
                if (2 != 0) goto L114;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
            
                if (r4.getArray(r0).getString(0) != null) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x008e, code lost:
            
                r8 = o.MaxFullscreenAdImplc.IAuthTabCallback((java.lang.String) null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0092, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().endTransaction();
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x009f, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x00a1, code lost:
            
                r0.getMessage();
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00a4, code lost:
            
                if (r8 != null) goto L115;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
            
                if (r4.getArray(r0).getString(1) != null) goto L48;
             */
            /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
            
                r0 = im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.onExtraCallbackWithResult + 73;
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.IAuthTabCallback = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x00bd, code lost:
            
                r8 = o.MaxFullscreenAdImplc.onNavigationEvent((java.lang.String) null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().endTransaction();
             */
            /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x00d0, code lost:
            
                r0.getMessage();
             */
            /* JADX WARN: Code restructure failed: missing block: B:46:0x00d3, code lost:
            
                if (r8 != null) goto L116;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x00f8, code lost:
            
                if (o.MaxFullscreenAdImpld.IAuthTabCallback(im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult(), r4.getArray(r0).getString(0), r4.getArray(r0).getString(1)) == false) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x00fa, code lost:
            
                r0 = r0 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:
            
                r0 = im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.onExtraCallbackWithResult + 25;
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.IAuthTabCallback = r0 % 128;
                r0 = r0 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:52:0x0107, code lost:
            
                r8 = o.MaxFullscreenAdImplc.onWarmupCompleted((java.lang.String) null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:53:0x010b, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().endTransaction();
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
            
                r0 = e;
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:0x011a, code lost:
            
                r0.getMessage();
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
            
                if (r8 != null) goto L117;
             */
            /* JADX WARN: Code restructure failed: missing block: B:58:0x011f, code lost:
            
                o.MaxFullscreenAdImplc.onNavigationEvent((java.lang.String) null, r0.getMessage());
             */
            /* JADX WARN: Code restructure failed: missing block: B:59:0x0126, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
            
                if (im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m8$$Nest$mensureDatabase(r7.onWarmupCompleted) == false) goto L87;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().setTransactionSuccessful();
             */
            /* JADX WARN: Code restructure failed: missing block: B:61:0x0134, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().endTransaction();
             */
            /* JADX WARN: Code restructure failed: missing block: B:63:0x0142, code lost:
            
                r8 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:64:0x0143, code lost:
            
                r8.getMessage();
                r8 = r8.getMessage();
             */
            /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
            
                r3 = o.MaxFullscreenAdImplc.onNavigationEvent((java.lang.String) null, r8);
             */
            /* JADX WARN: Code restructure failed: missing block: B:66:0x014f, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0151, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:69:0x0152, code lost:
            
                r0.getMessage();
                r8 = o.MaxFullscreenAdImplc.onNavigationEvent((java.lang.String) null, r0.getMessage());
             */
            /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().endTransaction();
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x016b, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x016c, code lost:
            
                r0.getMessage();
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x016f, code lost:
            
                if (r8 == null) goto L75;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x0171, code lost:
            
                r8 = r0.getMessage();
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0176, code lost:
            
                r3 = r8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x0177, code lost:
            
                if (r3 == null) goto L80;
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x0179, code lost:
            
                r3.invoke(new java.lang.Object[]{r3});
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x0182, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x0183, code lost:
            
                r3.invoke(new java.lang.Object[0]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x018a, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x018b, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().endTransaction();
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x0198, code lost:
            
                r1 = im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.onExtraCallbackWithResult + 23;
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.IAuthTabCallback = r1 % 128;
                r1 = r1 % 2;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x01a2, code lost:
            
                r8 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x01a3, code lost:
            
                r8.getMessage();
                o.MaxFullscreenAdImplc.onNavigationEvent((java.lang.String) null, r8.getMessage());
             */
            /* JADX WARN: Code restructure failed: missing block: B:86:0x01ad, code lost:
            
                throw r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x01ae, code lost:
            
                r0 = im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.onExtraCallbackWithResult + 113;
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass1.IAuthTabCallback = r0 % 128;
             */
            /* JADX WARN: Code restructure failed: missing block: B:88:0x01b7, code lost:
            
                if ((r0 % 2) == 0) goto L91;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x01b9, code lost:
            
                r8 = r3;
                r2 = new java.lang.Object[0];
                r2[1] = o.MaxFullscreenAdImplc.onWarmupCompleted((java.lang.String) null);
                r8.invoke(r2);
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
            
                if (im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m8$$Nest$mensureDatabase(r7.onWarmupCompleted) != false) goto L108;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x01c6, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x01c7, code lost:
            
                r3.invoke(new java.lang.Object[]{o.MaxFullscreenAdImplc.onWarmupCompleted((java.lang.String) null)});
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x01d4, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r7.onWarmupCompleted).onExtraCallbackWithResult().beginTransaction();
                r0 = 0;
             */
            /* JADX WARN: Removed duplicated region for block: B:78:0x0179  */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0183  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void IAuthTabCallback(Void... voidArr) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 117;
                IAuthTabCallback = i3 % 128;
                WritableMap writableMapOnNavigationEvent = null;
                if (i3 % 2 != 0) {
                    int i4 = 12 / 0;
                }
            }
        }.executeOnExecutor(this.executor, new Void[0]);
        int i2 = onNavigationEvent + 47;
        onExtraCallbackWithResult = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // im.toss.rn.toss.core.bridge.module.storage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void clear(final Callback callback) {
        int i = 2 % 2;
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.2
            private static int onExtraCallback = 0;
            private static int onExtraCallbackWithResult = 1;

            public /* synthetic */ void doInBackgroundGuarded(Object[] objArr) {
                int i2 = 2 % 2;
                int i3 = onExtraCallback + 9;
                onExtraCallbackWithResult = i3 % 128;
                int i4 = i3 % 2;
                onWarmupCompleted((Void[]) objArr);
                int i5 = onExtraCallbackWithResult + 65;
                onExtraCallback = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:
            
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r4.onWarmupCompleted).onNavigationEvent();
                r3.invoke(new java.lang.Object[0]);
             */
            /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
            
                r5 = move-exception;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0055, code lost:
            
                r5.getMessage();
                r3.invoke(new java.lang.Object[]{o.MaxFullscreenAdImplc.onNavigationEvent((java.lang.String) null, r5.getMessage())});
             */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
            
                return;
             */
            /* JADX WARN: Code restructure failed: missing block: B:5:0x001d, code lost:
            
                if (im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r4.onWarmupCompleted).onExtraCallback() == false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:
            
                if (im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(r4.onWarmupCompleted).onExtraCallback() == false) goto L9;
             */
            /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
            
                r3.invoke(new java.lang.Object[]{o.MaxFullscreenAdImplc.onWarmupCompleted((java.lang.String) null)});
                r0 = im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass2.onExtraCallbackWithResult + 69;
                im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.AnonymousClass2.onExtraCallback = r0 % 128;
                r0 = r0 % 2;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            protected void onWarmupCompleted(Void... voidArr) {
                int i2 = 2 % 2;
                int i3 = onExtraCallbackWithResult + 81;
                onExtraCallback = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 33 / 0;
                }
            }
        }.executeOnExecutor(this.executor, new Void[0]);
        int i2 = onNavigationEvent + 77;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // im.toss.rn.toss.core.bridge.module.storage.NativeAsyncStorageModuleSpec
    @ReactMethod
    public void getAllKeys(final Callback callback) {
        int i = 2 % 2;
        new GuardedAsyncTask<Void, Void>(getReactApplicationContext()) { // from class: im.toss.rn.toss.core.bridge.module.storage.AsyncStorageModule.8
            private static int $10 = 0;
            private static int $11 = 1;
            private static char[] IAuthTabCallback = {27259, 27196, 27169};
            private static int onExtraCallbackWithResult = 1;
            private static int onNavigationEvent;

            private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
                int i2;
                int i3 = 2 % 2;
                TrackGroupExternalSyntheticLambda0 trackGroupExternalSyntheticLambda0 = new TrackGroupExternalSyntheticLambda0();
                int i4 = iArr[0];
                int i5 = iArr[1];
                int i6 = iArr[2];
                int i7 = iArr[3];
                char[] cArr = IAuthTabCallback;
                if (cArr != null) {
                    int i8 = $11 + 3;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr[i10])};
                            Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-99816648);
                            if (objOnExtraCallback == null) {
                                objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (35283 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getTapTimeout() >> 16) + 35, 14239 - TextUtils.getOffsetAfter("", 0), -884206168, false, "t", new Class[]{Integer.TYPE});
                            }
                            cArr2[i10] = ((Character) ((Method) objOnExtraCallback).invoke(null, objArr2)).charValue();
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
                char[] cArr3 = new char[i5];
                System.arraycopy(cArr, i4, cArr3, 0, i5);
                if (bArr != null) {
                    int i11 = $11 + 83;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    char[] cArr4 = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    char c = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        int i13 = $11 + 113;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        if (bArr[trackGroupExternalSyntheticLambda0.onNavigationEvent] == 1) {
                            int i15 = $11 + 13;
                            $10 = i15 % 128;
                            if (i15 % 2 != 0) {
                                int i16 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                Object[] objArr3 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                if (objOnExtraCallback2 == null) {
                                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (10935 - (Process.myTid() >> 22)), AndroidCharacter.getMirror('0') + 17, 16719 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i16] = ((Character) ((Method) objOnExtraCallback2).invoke(null, objArr3)).charValue();
                                int i17 = 30 / 0;
                            } else {
                                int i18 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                                Object[] objArr4 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-54060114);
                                if (objOnExtraCallback3 == null) {
                                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (MotionEvent.axisFromString("") + 10936), 65 - View.getDefaultSize(0, 0), 16717 - MotionEvent.axisFromString(""), -846731970, false, "p", new Class[]{Integer.TYPE, Integer.TYPE});
                                }
                                cArr4[i18] = ((Character) ((Method) objOnExtraCallback3).invoke(null, objArr4)).charValue();
                            }
                            int i19 = $11 + 71;
                            $10 = i19 % 128;
                            int i20 = i19 % 2;
                        } else {
                            int i21 = trackGroupExternalSyntheticLambda0.onNavigationEvent;
                            Object[] objArr5 = {Integer.valueOf(cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent]), Integer.valueOf(c)};
                            Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1740912678);
                            if (objOnExtraCallback4 == null) {
                                objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ExpandableListView.getPackedPositionType(0L), 29 - (Process.myTid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 17657, 1451542198, false, "q", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr4[i21] = ((Character) ((Method) objOnExtraCallback4).invoke(null, objArr5)).charValue();
                        }
                        c = cArr4[trackGroupExternalSyntheticLambda0.onNavigationEvent];
                        Object[] objArr6 = {trackGroupExternalSyntheticLambda0, trackGroupExternalSyntheticLambda0};
                        Object objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(1200559197);
                        if (objOnExtraCallback5 == null) {
                            objOnExtraCallback5 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 49467), View.MeasureSpec.makeMeasureSpec(0, 0) + 70, TextUtils.indexOf("", "", 0, 0) + 12486, 1993337549, false, "w", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objOnExtraCallback5).invoke(null, objArr6);
                    }
                    cArr3 = cArr4;
                }
                if (i7 > 0) {
                    int i22 = $11 + 49;
                    $10 = i22 % 128;
                    if (i22 % 2 != 0) {
                        char[] cArr5 = new char[i5];
                        System.arraycopy(cArr3, 0, cArr5, 0, i5);
                        System.arraycopy(cArr5, 1, cArr3, i5 % i7, i7);
                        System.arraycopy(cArr5, i7, cArr3, 0, i5 - i7);
                    } else {
                        char[] cArr6 = new char[i5];
                        System.arraycopy(cArr3, 0, cArr6, 0, i5);
                        int i23 = i5 - i7;
                        System.arraycopy(cArr6, 0, cArr3, i23, i7);
                        System.arraycopy(cArr6, i7, cArr3, 0, i23);
                    }
                }
                if (z) {
                    char[] cArr7 = new char[i5];
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    int i24 = $10 + 77;
                    $11 = i24 % 128;
                    int i25 = i24 % 2;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        cArr7[trackGroupExternalSyntheticLambda0.onNavigationEvent] = cArr3[(i5 - trackGroupExternalSyntheticLambda0.onNavigationEvent) - 1];
                        trackGroupExternalSyntheticLambda0.onNavigationEvent++;
                    }
                    cArr3 = cArr7;
                }
                if (i6 > 0) {
                    int i26 = $11 + 29;
                    $10 = i26 % 128;
                    int i27 = i26 % 2;
                    trackGroupExternalSyntheticLambda0.onNavigationEvent = 0;
                    while (trackGroupExternalSyntheticLambda0.onNavigationEvent < i5) {
                        int i28 = $11 + 5;
                        $10 = i28 % 128;
                        if (i28 % 2 != 0) {
                            cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[4]);
                            i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent >> 1;
                        } else {
                            cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] = (char) (cArr3[trackGroupExternalSyntheticLambda0.onNavigationEvent] - iArr[2]);
                            i2 = trackGroupExternalSyntheticLambda0.onNavigationEvent + 1;
                        }
                        trackGroupExternalSyntheticLambda0.onNavigationEvent = i2;
                    }
                }
                objArr[0] = new String(cArr3);
            }

            public /* synthetic */ void doInBackgroundGuarded(Object[] objArr) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 7;
                onExtraCallbackWithResult = i3 % 128;
                Void[] voidArr = (Void[]) objArr;
                if (i3 % 2 == 0) {
                    onExtraCallbackWithResult(voidArr);
                    int i4 = 69 / 0;
                } else {
                    onExtraCallbackWithResult(voidArr);
                }
                int i5 = onExtraCallbackWithResult + 33;
                onNavigationEvent = i5 % 128;
                if (i5 % 2 != 0) {
                    throw null;
                }
            }

            protected void onExtraCallbackWithResult(Void... voidArr) throws Throwable {
                int i2 = 2 % 2;
                int i3 = onNavigationEvent + 119;
                onExtraCallbackWithResult = i3 % 128;
                if (i3 % 2 != 0) {
                    if (!AsyncStorageModule.m8$$Nest$mensureDatabase(AsyncStorageModule.this)) {
                        callback.invoke(new Object[]{MaxFullscreenAdImplc.onWarmupCompleted((String) null), null});
                        return;
                    }
                    WritableArray writableArrayCreateArray = Arguments.createArray();
                    Object[] objArr = new Object[1];
                    a(new int[]{0, 3, 0, 1}, true, new byte[]{1, 0, 0}, objArr);
                    Cursor cursorQuery = AsyncStorageModule.m7$$Nest$fgetmReactDatabaseSupplier(AsyncStorageModule.this).onExtraCallbackWithResult().query("catalystLocalStorage", new String[]{((String) objArr[0]).intern()}, null, null, null, null, null);
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                do {
                                    writableArrayCreateArray.pushString(cursorQuery.getString(0));
                                } while (cursorQuery.moveToNext());
                            }
                            cursorQuery.close();
                            callback.invoke(new Object[]{null, writableArrayCreateArray});
                            int i4 = onExtraCallbackWithResult + 21;
                            onNavigationEvent = i4 % 128;
                            if (i4 % 2 != 0) {
                                int i5 = 89 / 0;
                                return;
                            }
                            return;
                        } catch (Exception e) {
                            e.getMessage();
                            callback.invoke(new Object[]{MaxFullscreenAdImplc.onNavigationEvent((String) null, e.getMessage()), null});
                            cursorQuery.close();
                            return;
                        }
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                AsyncStorageModule.m8$$Nest$mensureDatabase(AsyncStorageModule.this);
                throw null;
            }
        }.executeOnExecutor(this.executor, new Void[0]);
        int i2 = onNavigationEvent + 103;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
    }

    private boolean ensureDatabase() {
        int i = 2 % 2;
        if (this.mShuttingDown) {
            return false;
        }
        int i2 = onNavigationEvent + 71;
        onExtraCallbackWithResult = i2 % 128;
        int i3 = i2 % 2;
        if (!this.mReactDatabaseSupplier.onExtraCallback()) {
            return false;
        }
        int i4 = onExtraCallbackWithResult + 71;
        onNavigationEvent = i4 % 128;
        if (i4 % 2 != 0) {
            return true;
        }
        throw null;
    }
}
