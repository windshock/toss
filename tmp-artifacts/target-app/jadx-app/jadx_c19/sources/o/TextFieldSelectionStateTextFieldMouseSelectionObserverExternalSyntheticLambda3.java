package o;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import androidx.media3.database.DatabaseIOException;
import com.alibaba.ariver.kernel.RVParams;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: /tmp/toss_alldex/classes19.dex */
final class TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int IAuthTabCallbackDefault = 1;
    private static int IAuthTabCallbackStub = 1;
    private static int asInterface;
    private static long onExtraCallbackWithResult;
    private static final String[] onNavigationEvent;
    private static int onWarmupCompleted;
    private String IAuthTabCallback;
    private final TextLayoutStateExternalSyntheticLambda0 onExtraCallback;

    static {
        onWarmupCompleted();
        Object[] objArr = new Object[1];
        a(new char[]{12772, 29970, 47125, 65284}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17657, objArr);
        onNavigationEvent = new String[]{((String) objArr[0]).intern(), SessionDescription.ATTR_LENGTH, "last_touch_timestamp"};
        int i2 = IAuthTabCallbackDefault + 73;
        onWarmupCompleted = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0147  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(char[] cArr, int i2, Object[] objArr) throws Throwable {
        char c;
        Throwable cause;
        int i3 = 2 % 2;
        AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0 = new AudioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0();
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.onWarmupCompleted = i2;
        int length = cArr.length;
        long[] jArr = new long[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (true) {
            c = '0';
            if (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback >= cArr.length) {
                break;
            }
            int i4 = $11 + 61;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback]), audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(176603577);
                if (objOnExtraCallback == null) {
                    objOnExtraCallback = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19626 - TextUtils.lastIndexOf("", '0', 0), 1002848041, false, RVParams.URL, new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objOnExtraCallback).invoke(null, objArr2)).longValue() ^ (onExtraCallbackWithResult ^ 5407414049857832247L);
                Object[] objArr3 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback2 == null) {
                    objOnExtraCallback2 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) TextUtils.getOffsetBefore("", 0), (-16777157) - Color.rgb(0, 0, 0), 6383 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback2).invoke(null, objArr3);
            } catch (Throwable th) {
                cause = th.getCause();
                if (cause != null) {
                }
            }
            cause = th.getCause();
            if (cause != null) {
                throw th;
            }
            throw cause;
        }
        char[] cArr2 = new char[length];
        audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback = 0;
        while (audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback < cArr.length) {
            int i7 = $11 + 111;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                Object[] objArr4 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                Object objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                if (objOnExtraCallback3 == null) {
                    objOnExtraCallback3 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) ((-1) - TextUtils.indexOf("", c, 0, 0)), 60 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objOnExtraCallback3).invoke(null, objArr4);
                int i8 = 42 / 0;
            } else {
                cArr2[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback] = (char) jArr[audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0.IAuthTabCallback];
                try {
                    Object[] objArr5 = {audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0, audioFocusRequestCompatOnAudioFocusChangeListenerHandlerCompatExternalSyntheticLambda0};
                    Object objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.onExtraCallback(-2014642380);
                    if (objOnExtraCallback4 == null) {
                        objOnExtraCallback4 = BackgroundThreadStateHandlerExternalSyntheticLambda0.IAuthTabCallback((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 59, Color.alpha(0) + 6383, -1230372444, false, "D", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objOnExtraCallback4).invoke(null, objArr5);
                    c = '0';
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        objArr[0] = new String(cArr2);
    }

    public TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda3(TextLayoutStateExternalSyntheticLambda0 textLayoutStateExternalSyntheticLambda0) {
        this.onExtraCallback = textLayoutStateExternalSyntheticLambda0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003d, code lost:
    
        if (o.TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0.onExtraCallbackWithResult(r3.onExtraCallback.getReadableDatabase(), 2, r4) != 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onExtraCallbackWithResult(long j) throws DatabaseIOException {
        String hexString;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 85;
        asInterface = i3 % 128;
        try {
            if (i3 % 2 != 0) {
                hexString = Long.toHexString(j);
                this.IAuthTabCallback = onExtraCallbackWithResult(hexString);
                if (TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0.onExtraCallbackWithResult(this.onExtraCallback.getReadableDatabase(), 4, hexString) != 1) {
                    SQLiteDatabase writableDatabase = this.onExtraCallback.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        TextFieldMagnifierNodeImpl28ExternalSyntheticLambda0.IAuthTabCallback(writableDatabase, 2, hexString, 1);
                        onNavigationEvent(writableDatabase, this.IAuthTabCallback);
                        writableDatabase.execSQL("CREATE TABLE " + this.IAuthTabCallback + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                        return;
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                int i4 = IAuthTabCallbackStub + 21;
                asInterface = i4 % 128;
                int i5 = i4 % 2;
                return;
            }
            hexString = Long.toHexString(j);
            this.IAuthTabCallback = onExtraCallbackWithResult(hexString);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public Map<String, TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1> onNavigationEvent() throws DatabaseIOException {
        int i2 = 2 % 2;
        try {
            Cursor cursorOnExtraCallback = onExtraCallback();
            try {
                HashMap map = new HashMap(cursorOnExtraCallback.getCount());
                while (cursorOnExtraCallback.moveToNext()) {
                    map.put((String) RecordingInputConnection_androidKt.onExtraCallbackWithResult(cursorOnExtraCallback.getString(0)), new TextFieldSelectionStateTextFieldMouseSelectionObserverExternalSyntheticLambda1(cursorOnExtraCallback.getLong(1), cursorOnExtraCallback.getLong(2)));
                }
                cursorOnExtraCallback.close();
                int i3 = IAuthTabCallbackStub + 107;
                asInterface = i3 % 128;
                int i4 = i3 % 2;
                return map;
            } finally {
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void onExtraCallback(String str, long j, long j2) throws Throwable {
        int i2 = 2 % 2;
        try {
            SQLiteDatabase writableDatabase = this.onExtraCallback.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            Object[] objArr = new Object[1];
            a(new char[]{12772, 29970, 47125, 65284}, 17657 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
            contentValues.put(((String) objArr[0]).intern(), str);
            contentValues.put(SessionDescription.ATTR_LENGTH, Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.IAuthTabCallback, null, contentValues);
            int i3 = IAuthTabCallbackStub + 91;
            asInterface = i3 % 128;
            int i4 = i3 % 2;
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void onWarmupCompleted(String str) throws DatabaseIOException {
        int i2 = 2 % 2;
        int i3 = asInterface + 45;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        try {
            this.onExtraCallback.getWritableDatabase().delete(this.IAuthTabCallback, "name = ?", new String[]{str});
            int i5 = asInterface + 105;
            IAuthTabCallbackStub = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [android.database.sqlite.SQLiteDatabase, int] */
    public void onExtraCallback(Set<String> set) throws DatabaseIOException {
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 109;
        asInterface = i3 % 128;
        ?? r1 = i3 % 2;
        try {
            try {
                if (r1 == 0) {
                    SQLiteDatabase writableDatabase = this.onExtraCallback.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    Iterator<String> it = set.iterator();
                    while (!(!it.hasNext())) {
                        int i4 = asInterface + 55;
                        IAuthTabCallbackStub = i4 % 128;
                        int i5 = i4 % 2;
                        writableDatabase.delete(this.IAuthTabCallback, "name = ?", new String[]{it.next()});
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    return;
                }
                this.onExtraCallback.getWritableDatabase().beginTransactionNonExclusive();
                set.iterator();
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                r1.endTransaction();
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    private Cursor onExtraCallback() {
        Cursor cursorQuery;
        int i2 = 2 % 2;
        int i3 = IAuthTabCallbackStub + 37;
        asInterface = i3 % 128;
        if (i3 % 2 != 0) {
            cursorQuery = this.onExtraCallback.getReadableDatabase().query(this.IAuthTabCallback, onNavigationEvent, null, null, null, null, null);
            int i4 = 55 / 0;
        } else {
            cursorQuery = this.onExtraCallback.getReadableDatabase().query(this.IAuthTabCallback, onNavigationEvent, null, null, null, null, null);
        }
        int i5 = IAuthTabCallbackStub + 73;
        asInterface = i5 % 128;
        int i6 = i5 % 2;
        return cursorQuery;
    }

    private static void onNavigationEvent(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        int i2 = 2 % 2;
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        int i3 = asInterface + 81;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
    }

    private static String onExtraCallbackWithResult(String str) {
        int i2 = 2 % 2;
        String str2 = "ExoPlayerCacheFileMetadata" + str;
        int i3 = asInterface + 19;
        IAuthTabCallbackStub = i3 % 128;
        int i4 = i3 % 2;
        return str2;
    }

    static void onWarmupCompleted() {
        onExtraCallbackWithResult = 6955528441624245437L;
    }
}
